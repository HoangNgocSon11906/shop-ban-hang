package com.shop.holomen.presentation;

import com.shop.holomen.application.TrangChuService;
import com.shop.holomen.domain.loaiSanPham.LoaiSanPhams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TrangChuController {
    @Autowired
    TrangChuService trangChuService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String trangchu(Model model) {
        LoaiSanPhams loaiSanPhams = trangChuService.findLoaiSanPham();
        model.addAttribute("loaiSanPham", loaiSanPhams);
        return "/trangchu";
    }
}
