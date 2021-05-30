package com.shop.holomen.infrastructure.datasource.mapper.thanhToan;

import com.shop.holomen.domain.thanhtoan.KhachHang;
import com.shop.holomen.domain.thanhtoan.SanPham;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ThanhToanMapper {
    void insertKhachHang(@Param("khachHang") KhachHang khachHang);

    void insertOrder(@Param("khachHang") KhachHang khachHang);

    void insertDonHang(@Param("id") Integer orderId, @Param("sanPham") SanPham sanPham);
}
