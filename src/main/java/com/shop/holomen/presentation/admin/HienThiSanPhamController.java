package com.shop.holomen.presentation.admin;

import com.shop.holomen.application.admin.NhapSanPhamService;
import com.shop.holomen.domain.sanPham.SanPhamId;
import com.shop.holomen.domain.sanPhamDetail.SanPhamDetailId;
import com.shop.holomen.domain.sanPhamDetail.SanPhamDetailS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.websocket.server.PathParam;

@Controller
public class HienThiSanPhamController {

    @Autowired
    NhapSanPhamService nhapSanPhamService;

    @RequestMapping(value = "/hienthi")
    public String display(Model model) {
        SanPhamDetailS sanPhamDetails = nhapSanPhamService.findAll();
        model.addAttribute("sanPhamDetails", sanPhamDetails);
        return "admin/hienthisanPham";
    }

    @RequestMapping(value = "/remove/{sanPhamId}/{sanPhamDetailId}")
    public String remove(@PathVariable(value = "sanPhamId") String sanPhamId, @PathVariable(value = "sanPhamDetailId") String sanPhamDetailId, Model model) {
        nhapSanPhamService.remove(sanPhamId, sanPhamDetailId);
        return String.format("redirect:/hienthi");
    }
}
