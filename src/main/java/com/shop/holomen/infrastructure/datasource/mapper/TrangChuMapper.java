package com.shop.holomen.infrastructure.datasource.mapper;

import com.shop.holomen.domain.loaiSanPham.LoaiSanPham;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TrangChuMapper {
    List<LoaiSanPham> findLoaiSanPham();
}
