package com.shop.holomen.domain.thanhtoan;

import com.shop.holomen.domain.sanPham.TenSanPham;
import com.shop.holomen.domain.sanPhamDetail.GiaThuong;
import com.shop.holomen.domain.sanPhamDetail.Mau;
import com.shop.holomen.domain.sanPhamDetail.SanPhamDetailId;
import com.shop.holomen.domain.sanPhamDetail.Size;

public class FormThanhToan {
    SanPhamDetailId sanPhamDetailId;
    TenSanPham tenSanPham;
    Mau mau;
    Size size;
    SoLuong soLuong;
    GiaThuong giaThuong;
    ThanhTien thanhTien;

    public FormThanhToan() {
    }

    public FormThanhToan(SanPhamDetailId sanPhamDetailId, TenSanPham tenSanPham, Mau mau, Size size, SoLuong soLuong, GiaThuong giaThuong, ThanhTien thanhTien) {
        this.sanPhamDetailId = sanPhamDetailId;
        this.tenSanPham = tenSanPham;
        this.mau = mau;
        this.size = size;
        this.soLuong = soLuong;
        this.giaThuong = giaThuong;
        this.thanhTien = thanhTien;
    }

    public SanPhamDetailId getSanPhamDetailId() {
        return sanPhamDetailId;
    }

    public void setSanPhamDetailId(SanPhamDetailId sanPhamDetailId) {
        this.sanPhamDetailId = sanPhamDetailId;
    }

    public TenSanPham getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(TenSanPham tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public Mau getMau() {
        return mau;
    }

    public void setMau(Mau mau) {
        this.mau = mau;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public SoLuong getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(SoLuong soLuong) {
        this.soLuong = soLuong;
    }

    public GiaThuong getGiaThuong() {
        return giaThuong;
    }

    public void setGiaThuong(GiaThuong giaThuong) {
        this.giaThuong = giaThuong;
    }

    public ThanhTien getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(ThanhTien thanhTien) {
        this.thanhTien = thanhTien;
    }
}
