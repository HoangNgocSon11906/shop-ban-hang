package com.shop.holomen.presentation.sanPham;

import com.shop.holomen.application.TrangChuService;
import com.shop.holomen.application.admin.NhapSanPhamService;
import com.shop.holomen.domain.loaiSanPham.LoaiSanPhams;
import com.shop.holomen.domain.sanPhamDetail.SanPhamDetailS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AoThunController {
    @Autowired
    TrangChuService trangChuService;
    @Autowired
    NhapSanPhamService nhapSanPhamService;

    @RequestMapping(value = "/{tenMap}")
    public String sale(@PathVariable("tenMap") String tenMap,  Model model) {
        LoaiSanPhams loaiSanPhams = trangChuService.findLoaiSanPham();
        SanPhamDetailS sanPhamDetailS = nhapSanPhamService.findSanPhamBy(tenMap);
        model.addAttribute("loaiSanPham", loaiSanPhams);
        model.addAttribute("sanPhamDetailS", sanPhamDetailS);
        return "sanPham/aothun";
    }
}
