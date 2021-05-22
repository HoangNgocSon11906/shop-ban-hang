package com.shop.holomen.presentation.admin;

import com.shop.holomen.application.admin.NhapSanPhamService;
import com.shop.holomen.domain.sanPhamDetail.SanPhamDetail;
import com.shop.holomen.domain.sanPhamDetail.SanPhamDetailS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String remove(@PathVariable(value = "sanPhamId") String sanPhamId, @PathVariable(value = "sanPhamDetailId") Integer sanPhamDetailId, Model model) {
        nhapSanPhamService.remove(sanPhamId, sanPhamDetailId);
        return String.format("redirect:/hienthi");
    }

    @RequestMapping(value = "/edit/{sanPhamId}/{sanPhamDetailId}")
    public String edit(@PathVariable(value = "sanPhamId") String sanPhamId, @PathVariable(value = "sanPhamDetailId") String sanPhamDetailId, Model model) {
        SanPhamDetail sanPhamDetail = nhapSanPhamService.findBy(sanPhamDetailId);
        model.addAttribute("sanPhamDetail", sanPhamDetail);
        int sizeListMau = sanPhamDetail.getMaus().getValues().toArray().length - 1;
        int sizeListSize = sanPhamDetail.getSizes().getSizes().toArray().length - 1;
        model.addAttribute("listMau", sizeListMau);
        model.addAttribute("listSize", sizeListSize);
        return "admin/edit";
    }

    @RequestMapping(value = "/update")
    public  String update(@ModelAttribute("sanPhamDetail") SanPhamDetail sanPhamDetail){
        nhapSanPhamService.update(sanPhamDetail);
        return String.format("redirect:/hienthi");
    }
}
