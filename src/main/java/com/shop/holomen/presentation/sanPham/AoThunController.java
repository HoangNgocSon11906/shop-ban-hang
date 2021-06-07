package com.shop.holomen.presentation.sanPham;

import com.shop.holomen.application.TrangChuService;
import com.shop.holomen.application.admin.NhapSanPhamService;
import com.shop.holomen.domain.loaiSanPham.LoaiSanPhams;
import com.shop.holomen.domain.sanPham.SapXepSanPham;
import com.shop.holomen.domain.sanPhamDetail.SanPhamDetail;
import com.shop.holomen.domain.sanPhamDetail.SanPhamDetailS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AoThunController {
    @Autowired
    TrangChuService trangChuService;
    @Autowired
    NhapSanPhamService nhapSanPhamService;

    @RequestMapping(value = "/aothun")
    public String sale(Model model, @PageableDefault(size = 15, direction = Sort.Direction.ASC) Pageable pageable,
                       @RequestParam(value = "sortParam" , required=false) String sortParam) {
        LoaiSanPhams loaiSanPhams = trangChuService.findLoaiSanPham();
        if (sortParam == null) {
            sortParam ="moi nhat";
        }
        Page<SanPhamDetail> page = nhapSanPhamService.findSanPhamBy("aothun", pageable, new SapXepSanPham(sortParam));
        model.addAttribute("sortParam1", sortParam);
        model.addAttribute("loaiSanPham", loaiSanPhams);
        model.addAttribute("sanPhamDetailS", page.getContent());
        model.addAttribute("page", page);
        model.addAttribute("pager", new Pager(page.getTotalPages(), page.getNumber(), 3));
        return "sanPham/aothun";
    }
}
