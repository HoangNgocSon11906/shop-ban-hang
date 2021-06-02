package com.shop.holomen.presentation.thanhToan;

import com.shop.holomen.application.admin.ThanhToanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class ChonDiaChiController {
    @Autowired
    ThanhToanService thanhToanService;

    @ResponseBody
    @RequestMapping(value = "/chonThanhPho")
    public List<String> findQuan(@RequestBody String maTinh) {
        List<String> listThanhPho = thanhToanService.findThanhPho(maTinh);
        return listThanhPho;
    }
    @ResponseBody
    @RequestMapping(value = "/chonHuyen")
    public List<String> findHuyen(@RequestBody String maQuan) {
        List<String> listHuyen = thanhToanService.findQuan(maQuan);
        return listHuyen;
    }
}
