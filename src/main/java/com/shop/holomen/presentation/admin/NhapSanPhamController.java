package com.shop.holomen.presentation.admin;

import com.shop.holomen.application.TrangChuService;
import com.shop.holomen.domain.loaiSanPham.LoaiSanPhams;
import com.shop.holomen.domain.sanPhamDetail.Mau;
import com.shop.holomen.domain.sanPhamDetail.Maus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NhapSanPhamController {
    @Autowired
    TrangChuService trangChuService;

    @RequestMapping(value = "/nhap")
    String nhapSanPham(Model model) {
        List<Mau> mauInnit = new ArrayList<Mau>();
        mauInnit.add(new Mau(""));
        Maus maus = new Maus(mauInnit);
        LoaiSanPhams loaiSanPham = trangChuService.findLoaiSanPham();
        model.addAttribute("loaiSanPham", loaiSanPham);
        model.addAttribute("maus", maus);
        return "admin/nhapSanPham";
    }
    @RequestMapping(value = "/layGiaTri")
    String layGiaTri (@ModelAttribute("maus") Maus maus){

        return "_menu";
    }
}
