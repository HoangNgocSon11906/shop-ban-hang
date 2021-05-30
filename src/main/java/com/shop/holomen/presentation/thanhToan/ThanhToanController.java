package com.shop.holomen.presentation.thanhToan;

import com.shop.holomen.application.admin.ThanhToanService;
import com.shop.holomen.domain.thanhtoan.FormThanhToan;
import com.shop.holomen.domain.thanhtoan.KhachHang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ThanhToanController {
    @Autowired
    ThanhToanService thanhToanService;

    @RequestMapping(value = "/checkout")
    public String show() {
        return "thanhToan/thanhToan";
    }

    @ResponseBody
    @RequestMapping(value = "/hoanThanh")
    public String hoanThanh(@RequestBody FormThanhToan formThanhToan, Model model) {
        thanhToanService.insertThanhToan(formThanhToan);
        model.addAttribute("khachHang", formThanhToan.getKhachHang());
        return formThanhToan.getKhachHang().getKhachId().toString();
    }
    @RequestMapping(value = "/ok/{id}")
    public String ok(@PathVariable(value = "id") String sanPhamId) {
        return "thanhToan/ok";
    }
}
