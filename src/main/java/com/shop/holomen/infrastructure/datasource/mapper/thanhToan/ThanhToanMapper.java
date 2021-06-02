package com.shop.holomen.infrastructure.datasource.mapper.thanhToan;

import com.shop.holomen.domain.thanhtoan.FormThanhToan;
import com.shop.holomen.domain.thanhtoan.KhachHang;
import com.shop.holomen.domain.thanhtoan.SanPham;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ThanhToanMapper {
    void insertKhachHang(@Param("khachHang") KhachHang khachHang);

    void insertOrder(@Param("khachHang") KhachHang khachHang);

    void insertDonHang(@Param("id") Integer orderId, @Param("sanPham") SanPham sanPham);

    KhachHang findBy(@Param("id") String khachId);

    List<SanPham> findSanPham(@Param("id") Integer khachId);

    List<String> findThanhPho(@Param("maTinh") String maTinh);

    List<String> findQuan(@Param("maQuan") String maQuan);

    List<String> findTinh();
}
