package com.shop.holomen.presentation.admin;

import com.shop.holomen.application.TrangChuService;
import com.shop.holomen.application.admin.NhapSanPhamService;
import com.shop.holomen.domain.hinhSanPham.FormUpLoadImages;
import com.shop.holomen.domain.hinhSanPham.FormUpLoadImages1;
import com.shop.holomen.domain.hinhSanPham.FormUpLoadImages2;
import com.shop.holomen.domain.hinhSanPham.FormUpLoadImages3;
import com.shop.holomen.domain.hinhSanPham.FormUpLoadImages4;
import com.shop.holomen.domain.hinhSanPham.Image1;
import com.shop.holomen.domain.hinhSanPham.Image2;
import com.shop.holomen.domain.hinhSanPham.Image3;
import com.shop.holomen.domain.hinhSanPham.Image4;
import com.shop.holomen.domain.hinhSanPham.LinkHinh;
import com.shop.holomen.domain.hinhSanPham.MainImage;
import com.shop.holomen.domain.loaiSanPham.LoaiSanPhams;
import com.shop.holomen.domain.sanPhamDetail.Mau;
import com.shop.holomen.domain.sanPhamDetail.Maus;
import com.shop.holomen.domain.sanPhamDetail.SanPhamDetail;
import com.shop.holomen.domain.sanPhamDetail.Size;
import com.shop.holomen.domain.sanPhamDetail.Sizes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Controller
public class NhapSanPhamController {

    @Autowired
    TrangChuService trangChuService;

    @Autowired
    NhapSanPhamService nhapSanPhamService;

    @ModelAttribute("sanPhamDetail")
    public SanPhamDetail sanPhamDetail() {
        List<Mau> mauInnit = new ArrayList<Mau>();
        mauInnit.add(new Mau(""));
        Maus maus = new Maus(mauInnit);
        List<Size> sizeInnit = new ArrayList<Size>();
        sizeInnit.add(new Size(""));
        Sizes sizes = new Sizes(sizeInnit);
        SanPhamDetail sanPhamDetail = new SanPhamDetail();
        sanPhamDetail.setSizes(sizes);
        sanPhamDetail.setMaus(maus);
        return sanPhamDetail;
    }

    @RequestMapping(value = "/nhap")
    String nhapSanPham(@ModelAttribute("sanPhamDetail") SanPhamDetail sanPhamDetail, @ModelAttribute("multiPartFile") FormUpLoadImages file,
                       @ModelAttribute("multiPartFile1") FormUpLoadImages1 file1,
                       @ModelAttribute("multiPartFile2") FormUpLoadImages2 file2,
                       @ModelAttribute("multiPartFile3") FormUpLoadImages3 file3,
                       @ModelAttribute("multiPartFile4") FormUpLoadImages4 file4,
                       Model model) {

        LoaiSanPhams loaiSanPham = trangChuService.findLoaiSanPham();
        model.addAttribute("loaiSanPham", loaiSanPham);

        return "admin/nhapSanPham";
    }

    @RequestMapping(value = "/layGiaTri", params = "save")
    String layGiaTri(@ModelAttribute("sanPhamDetail") SanPhamDetail sanPhamDetail, @ModelAttribute("multiPartFile") FormUpLoadImages file,
                     @ModelAttribute("multiPartFile1") FormUpLoadImages1 file1,
                     @ModelAttribute("multiPartFile2") FormUpLoadImages2 file2,
                     @ModelAttribute("multiPartFile3") FormUpLoadImages3 file3,
                     @ModelAttribute("multiPartFile4") FormUpLoadImages4 file4,
                     RedirectAttributes redirectAttributes) throws IOException {


        String path = Base64.getEncoder().encodeToString(file.getMultipartFiles().getBytes());
        String path1 = Base64.getEncoder().encodeToString(file1.getAnh1().getBytes());
        String path2 = Base64.getEncoder().encodeToString(file2.getAnh2().getBytes());
        String path3 = Base64.getEncoder().encodeToString(file3.getAnh3().getBytes());
        String path4 = Base64.getEncoder().encodeToString(file4.getAnh4().getBytes());
        sanPhamDetail.setMainImage(new MainImage(new LinkHinh(path)));
        sanPhamDetail.setImage1(new Image1(new LinkHinh(path1)));
        sanPhamDetail.setImage2(new Image2(new LinkHinh(path2)));
        sanPhamDetail.setImage3(new Image3(new LinkHinh(path3)));
        sanPhamDetail.setImage4(new Image4(new LinkHinh(path4)));

        nhapSanPhamService.insertSanPham(sanPhamDetail);

        redirectAttributes.addFlashAttribute("message",
                "You successfully uploaded '");

        return String.format("redirect:/hienthi");
    }

    @RequestMapping(value = "/layGiaTri", params = "saveAndContinue")
    String tieptuc(@ModelAttribute("sanPhamDetail") SanPhamDetail sanPhamDetail, @ModelAttribute("multiPartFile") FormUpLoadImages file,
                   @ModelAttribute("multiPartFile1") FormUpLoadImages1 file1,
                   @ModelAttribute("multiPartFile2") FormUpLoadImages2 file2,
                   @ModelAttribute("multiPartFile3") FormUpLoadImages3 file3,
                   @ModelAttribute("multiPartFile4") FormUpLoadImages4 file4,
                   RedirectAttributes redirectAttributes) throws IOException {

        String path = Base64.getEncoder().encodeToString(file.getMultipartFiles().getBytes());
        String path1 = Base64.getEncoder().encodeToString(file1.getAnh1().getBytes());
        String path2 = Base64.getEncoder().encodeToString(file2.getAnh2().getBytes());
        String path3 = Base64.getEncoder().encodeToString(file3.getAnh3().getBytes());
        String path4 = Base64.getEncoder().encodeToString(file4.getAnh4().getBytes());
        sanPhamDetail.setMainImage(new MainImage(new LinkHinh(path)));
        sanPhamDetail.setImage1(new Image1(new LinkHinh(path1)));
        sanPhamDetail.setImage2(new Image2(new LinkHinh(path2)));
        sanPhamDetail.setImage3(new Image3(new LinkHinh(path3)));
        sanPhamDetail.setImage4(new Image4(new LinkHinh(path4)));
        sanPhamDetail.setMainImage(new MainImage(new LinkHinh(path)));
        sanPhamDetail.setImage1(new Image1(new LinkHinh(path1)));
        sanPhamDetail.setImage2(new Image2(new LinkHinh(path2)));
        sanPhamDetail.setImage3(new Image3(new LinkHinh(path3)));
        sanPhamDetail.setImage4(new Image4(new LinkHinh(path4)));

        nhapSanPhamService.insertSanPham(sanPhamDetail);

        redirectAttributes.addFlashAttribute("message",
                "You successfully uploaded '");

        return String.format("redirect:/nhap");
    }
}
