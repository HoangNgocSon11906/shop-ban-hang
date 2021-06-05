package com.shop.holomen.domain.thanhtoan;

import java.text.NumberFormat;

public class SanPham {
    String sanPhamDetailId;
    String tenSanPham;
    String giaSP;
    String mau;
    String size;
    String soLuong;

    public SanPham(String sanPhamDetailId, String tenSanPham, String giaSP, String mau, String size, String soLuong) {
        this.sanPhamDetailId = sanPhamDetailId;
        this.tenSanPham = tenSanPham;
        this.giaSP = giaSP;
        this.mau = mau;
        this.size = size;
        this.soLuong = soLuong;
    }

    public String getSanPhamDetailId() {
        return sanPhamDetailId;
    }

    public void setSanPhamDetailId(String sanPhamDetailId) {
        this.sanPhamDetailId = sanPhamDetailId;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(String giaSP) {
        this.giaSP = giaSP;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }
    public String formattedValueGiaSp() {
        int giaSPInt = Integer.parseInt(giaSP);
        NumberFormat currency = NumberFormat.getNumberInstance();
        return currency.format(giaSPInt);
    }
    public String formattedValueThanhTien() {
        int thanhTien = Integer.parseInt(giaSP)*Integer.parseInt(soLuong);
        NumberFormat currency = NumberFormat.getNumberInstance();
        return currency.format(thanhTien);
    }
}
