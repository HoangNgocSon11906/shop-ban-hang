package com.shop.holomen.presentation.admin;

import com.shop.holomen.application.TrangChuService;
import com.shop.holomen.domain.hinhSanPham.*;
import com.shop.holomen.domain.loaiSanPham.LoaiSanPhams;
import com.shop.holomen.domain.sanPhamDetail.*;
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
import java.util.List;

@Controller
public class NhapSanPhamController {
    private static String UPLOADED_FOLDER = "/Users/tranminhphuong/Documents/image/";
    @Autowired
    TrangChuService trangChuService;

    @ModelAttribute("sanPhamDetail")
    public SanPhamDetail sanPhamDetail(){
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
    @RequestMapping(value = "/layGiaTri")
    String layGiaTri (@ModelAttribute("sanPhamDetail") SanPhamDetail sanPhamDetail, @ModelAttribute("multiPartFile") FormUpLoadImages file,
                      @ModelAttribute("multiPartFile1") FormUpLoadImages1 file1,
                      @ModelAttribute("multiPartFile2") FormUpLoadImages2 file2,
                      @ModelAttribute("multiPartFile3") FormUpLoadImages3 file3,
                      @ModelAttribute("multiPartFile4") FormUpLoadImages4 file4,
                      RedirectAttributes redirectAttributes ){


//        if (file.getAnh2().isEmpty()) {
//            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
//            return "redirect:uploadStatus";
//        }

        try {

            // Get the file and save it somewhere
            byte[] bytes = file.getMultipartFiles().getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + file.getMultipartFiles().getOriginalFilename());
            byte[] bytes1 = file1.getAnh1().getBytes();
            Path path1 = Paths.get(UPLOADED_FOLDER + file1.getAnh1().getOriginalFilename());
            byte[] bytes2 = file2.getAnh2().getBytes();
            Path path2 = Paths.get(UPLOADED_FOLDER + file2.getAnh2().getOriginalFilename());
            byte[] bytes3 = file3.getAnh3().getBytes();
            Path path3 = Paths.get(UPLOADED_FOLDER + file3.getAnh3().getOriginalFilename());
            byte[] bytes4 = file4.getAnh4().getBytes();
            Path path4 = Paths.get(UPLOADED_FOLDER + file4.getAnh4().getOriginalFilename());
            Files.write(path, bytes);
            Files.write(path1, bytes1);
            Files.write(path2, bytes2);
            Files.write(path3, bytes3);
            Files.write(path4, bytes4);

            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getMultipartFiles().getOriginalFilename() + "'");

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "admin/nhapSanPham";
    }
}
