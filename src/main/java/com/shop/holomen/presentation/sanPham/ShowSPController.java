package com.shop.holomen.presentation.sanPham;

import com.shop.holomen.application.TrangChuService;
import com.shop.holomen.application.admin.NhapSanPhamService;
import com.shop.holomen.domain.loaiSanPham.LoaiSanPhams;
import com.shop.holomen.domain.sanPhamDetail.SanPhamDetail;
import com.shop.holomen.domain.thanhtoan.FormThanhToan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowSPController {
    @Autowired
    NhapSanPhamService nhapSanPhamService;

    @Autowired
    TrangChuService trangChuService;

    @RequestMapping(value = "/products/{ten}/{sanPhamDetailId}")
    public String show(@PathVariable(value = "ten") String sanPhamId, @PathVariable(value = "sanPhamDetailId") String sanPhamDetailId, Model model) {

        SanPhamDetail sanPhamDetail = nhapSanPhamService.findBy(sanPhamDetailId);
        model.addAttribute("sanPhamDetail", sanPhamDetail);
        LoaiSanPhams loaiSanPhams = trangChuService.findLoaiSanPham();
        model.addAttribute("loaiSanPham", loaiSanPhams);
        FormThanhToan formThanhToan = new FormThanhToan();
        model.addAttribute("formThanhToan", formThanhToan);
        return "sanPham/showSanPham";
    }
}
