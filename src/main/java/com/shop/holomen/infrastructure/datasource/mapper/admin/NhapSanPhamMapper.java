package com.shop.holomen.infrastructure.datasource.mapper.admin;

import com.shop.holomen.domain.sanPham.SanPhamId;
import com.shop.holomen.domain.sanPhamDetail.Mau;
import com.shop.holomen.domain.sanPhamDetail.SanPhamDetail;
import com.shop.holomen.domain.sanPhamDetail.SanPhamDetailId;
import com.shop.holomen.domain.sanPhamDetail.Size;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface NhapSanPhamMapper {
    void insertSanPham(@Param("sanPhamDetail") SanPhamDetail sanPhamDetail);

    void insertSanPhamDetail(@Param("sanPhamDetail") SanPhamDetail sanPhamDetail);

    void insertMauSanPham(@Param("sanPhamDetailId") SanPhamDetailId sanPhamDetailId, @Param("mau") Mau mau);

    void insertSizeSanPham(@Param("sanPhamDetailId") SanPhamDetailId sanPhamDetailId, @Param("size") Size size);

    public List<SanPhamDetail> findAll();

    void removeSanPham(@Param("sanPhamId")String sanPhamId);

    void removeSanPhamDetail(@Param("sanPhamDetailId") String sanPhamDetailId);

    void removeMau(@Param("sanPhamDetailId") String sanPhamDetailId);

    void removeSize(@Param("sanPhamDetailId") String sanPhamDetailId);
}