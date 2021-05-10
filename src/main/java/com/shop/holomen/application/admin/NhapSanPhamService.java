package com.shop.holomen.application.admin;

import com.shop.holomen.domain.sanPhamDetail.NhapSanPhamRepository;
import com.shop.holomen.domain.sanPhamDetail.SanPhamDetail;
import com.shop.holomen.domain.sanPhamDetail.SanPhamDetailS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NhapSanPhamService {

    @Autowired
    NhapSanPhamRepository nhapSanPhamRepository;

    public void insertSanPham(SanPhamDetail sanPhamDetail) {
        nhapSanPhamRepository.insertSanPham(sanPhamDetail);
    }

    public SanPhamDetailS findAll() {
        return nhapSanPhamRepository.findAll();
    }
    public void remove(String sanPhamId, String sanPhamDetailId) {
        nhapSanPhamRepository.remove(sanPhamId, sanPhamDetailId);
    }
}
