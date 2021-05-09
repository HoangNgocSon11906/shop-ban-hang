package com.shop.holomen.infrastructure.datasource.mapper.admin;

import com.shop.holomen.domain.sanPhamDetail.NhapSanPhamRepository;
import com.shop.holomen.domain.sanPhamDetail.SanPhamDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NhapSanPhamDataSource implements NhapSanPhamRepository {

    @Autowired
    NhapSanPhamMapper nhapSanPhamMapper;

    @Override
    public void insertSanPham(SanPhamDetail sanPhamDetail) {
        nhapSanPhamMapper.insertSanPham(sanPhamDetail);
        nhapSanPhamMapper.insertSanPhamDetail(sanPhamDetail);
        sanPhamDetail.getMaus().getValues().forEach(mau -> nhapSanPhamMapper.insertMauSanPham(sanPhamDetail.getSanPhamDetailId(), mau));
        sanPhamDetail.getSizes().getSizes().forEach(size -> nhapSanPhamMapper.insertSizeSanPham(sanPhamDetail.getSanPhamDetailId(), size));
    }
}

