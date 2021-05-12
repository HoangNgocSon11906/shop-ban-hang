package com.shop.holomen.application;

import com.shop.holomen.domain.loaiSanPham.LoaiSanPhamRepository;
import com.shop.holomen.domain.loaiSanPham.LoaiSanPhams;
import org.springframework.stereotype.Service;

@Service
public class TrangChuService {

    public TrangChuService(LoaiSanPhamRepository loaiSanPhamRepository) {
        this.loaiSanPhamRepository = loaiSanPhamRepository;
    }

    LoaiSanPhamRepository loaiSanPhamRepository;
    public LoaiSanPhams findLoaiSanPham() {
        return loaiSanPhamRepository.findLoaiSanPham();
    }

}
