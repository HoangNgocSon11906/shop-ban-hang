package com.shop.holomen.application.admin;

import com.shop.holomen.domain.sanPhamDetail.NhapSanPhamRepository;
import com.shop.holomen.domain.sanPhamDetail.SanPhamDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NhapSanPhamService {

    @Autowired
    NhapSanPhamRepository nhapSanPhamRepository;

    public void insertSanPham(SanPhamDetail sanPhamDetail) {
        nhapSanPhamRepository.insertSanPham(sanPhamDetail);
    }
}
