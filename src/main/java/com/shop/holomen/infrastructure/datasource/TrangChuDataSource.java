package com.shop.holomen.infrastructure.datasource;

import com.shop.holomen.domain.loaiSanPham.LoaiSanPham;
import com.shop.holomen.domain.loaiSanPham.LoaiSanPhamRepository;
import com.shop.holomen.domain.loaiSanPham.LoaiSanPhams;
import com.shop.holomen.infrastructure.datasource.mapper.TrangChuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TrangChuDataSource implements LoaiSanPhamRepository {


@Autowired
    TrangChuMapper trangChuMapper;

    @Override
    public LoaiSanPhams findLoaiSanPham() {
        return new LoaiSanPhams(trangChuMapper.findLoaiSanPham());
    }
}
