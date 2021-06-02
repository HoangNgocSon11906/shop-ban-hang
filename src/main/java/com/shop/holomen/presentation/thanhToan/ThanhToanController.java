package com.shop.holomen.presentation.thanhToan;

import com.shop.holomen.application.admin.ThanhToanService;
import com.shop.holomen.domain.thanhtoan.FormThanhToan;
import com.shop.holomen.domain.thanhtoan.KhachHang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ThanhToanController {
    @Autowired
    ThanhToanService thanhToanService;

    @RequestMapping(value = "/checkout")
    public String show(Model model) {
        List<String> tinh = thanhToanService.findTinh();
        model.addAttribute("tinh",tinh);
        return "thanhToan/thanhToan";
    }

    @ResponseBody
    @RequestMapping(value = "/hoanThanh")
    public String hoanThanh(@RequestBody FormThanhToan formThanhToan) {
        thanhToanService.insertThanhToan(formThanhToan);
        return formThanhToan.getKhachHang().getKhachId().toString();
    }
    @RequestMapping(value = "/success/{id}")
    public String ok(@PathVariable(value = "id") String khachId, Model model) {
        FormThanhToan formThanhToan = thanhToanService.findBy(khachId);
        model.addAttribute("khachHang", formThanhToan);
        return "thanhToan/ok";
    }
}
