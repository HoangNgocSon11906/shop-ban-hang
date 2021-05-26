package com.shop.holomen.domain.thanhtoan;

public class FormThanhToan {
    SanPhamS gioHang;
    KhachHang khachHang;

    public FormThanhToan() {
    }

    public SanPhamS getGioHang() {
        return gioHang;
    }

    public void setGioHang(SanPhamS gioHang) {
        this.gioHang = gioHang;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }
}