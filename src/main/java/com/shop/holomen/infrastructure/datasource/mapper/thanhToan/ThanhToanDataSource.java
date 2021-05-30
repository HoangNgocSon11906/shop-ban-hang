package com.shop.holomen.infrastructure.datasource.mapper.thanhToan;

import com.shop.holomen.domain.sanPhamDetail.NhapSanPhamRepository;
import com.shop.holomen.domain.sanPhamDetail.SanPhamDetail;
import com.shop.holomen.domain.sanPhamDetail.SanPhamDetailS;
import com.shop.holomen.domain.thanhtoan.FormThanhToan;
import com.shop.holomen.domain.thanhtoan.SanPham;
import com.shop.holomen.domain.thanhtoan.ThanhToanRepository;
import com.shop.holomen.infrastructure.datasource.mapper.admin.NhapSanPhamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ThanhToanDataSource implements ThanhToanRepository {

    @Autowired
    ThanhToanMapper thanhToanMapper;

    @Override
    public void insertThanhToan(FormThanhToan formThanhToan) {
        thanhToanMapper.insertKhachHang(formThanhToan.getKhachHang());
        thanhToanMapper.insertOrder(formThanhToan.getKhachHang());
        formThanhToan.getSanPhams().forEach(sanPham -> thanhToanMapper.insertDonHang(formThanhToan.getKhachHang().getOrderId(),sanPham));
    }
}

