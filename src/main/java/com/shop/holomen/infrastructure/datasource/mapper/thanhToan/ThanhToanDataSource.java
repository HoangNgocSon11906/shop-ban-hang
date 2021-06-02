package com.shop.holomen.infrastructure.datasource.mapper.thanhToan;

import com.shop.holomen.domain.sanPhamDetail.NhapSanPhamRepository;
import com.shop.holomen.domain.sanPhamDetail.SanPhamDetail;
import com.shop.holomen.domain.sanPhamDetail.SanPhamDetailS;
import com.shop.holomen.domain.thanhtoan.FormThanhToan;
import com.shop.holomen.domain.thanhtoan.KhachHang;
import com.shop.holomen.domain.thanhtoan.SanPham;
import com.shop.holomen.domain.thanhtoan.ThanhToanRepository;
import com.shop.holomen.infrastructure.datasource.mapper.admin.NhapSanPhamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ThanhToanDataSource implements ThanhToanRepository {

    @Autowired
    ThanhToanMapper thanhToanMapper;

    @Override
    public void insertThanhToan(FormThanhToan formThanhToan) {
        thanhToanMapper.insertKhachHang(formThanhToan.getKhachHang());
        thanhToanMapper.insertOrder(formThanhToan.getKhachHang());
        formThanhToan.getSanPhams().forEach(sanPham -> thanhToanMapper.insertDonHang(formThanhToan.getKhachHang().getOrderId(), sanPham));
    }

    @Override
    public FormThanhToan findBy(String khachId) {
        KhachHang khachHang = thanhToanMapper.findBy(khachId);
        List<SanPham> sanPhams = thanhToanMapper.findSanPham(khachHang.getOrderId());
        return new FormThanhToan(sanPhams, khachHang);
    }

    @Override
    public List<String> findThanhPho(String maTinh) {
        return thanhToanMapper.findThanhPho(maTinh);
    }

    @Override
    public List<String> findQuan(String maQuan) {
        return thanhToanMapper.findQuan(maQuan);
    }

    @Override
    public List<String> findTinh() {
        return thanhToanMapper.findTinh();
    }

}


