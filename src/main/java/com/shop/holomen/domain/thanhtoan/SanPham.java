package com.shop.holomen.domain.thanhtoan;

import com.shop.holomen.domain.sanPham.TenSanPham;
import com.shop.holomen.domain.sanPhamDetail.SanPhamDetailId;

public class SanPham {
    String sanPhamDeTailId;
    String tenSanPham;
    String giaSp;
    String mau;
    String size;
    String soLuong;

    public SanPham(String sanPhamDeTailId, String tenSanPham, String giaSp, String mau, String size, String soLuong) {
        this.sanPhamDeTailId = sanPhamDeTailId;
        this.tenSanPham = tenSanPham;
        this.giaSp = giaSp;
        this.mau = mau;
        this.size = size;
        this.soLuong = soLuong;
    }

    public String getSanPhamDeTailId() {
        return sanPhamDeTailId;
    }

    public void setSanPhamDeTailId(String sanPhamDeTailId) {
        this.sanPhamDeTailId = sanPhamDeTailId;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getGiaSp() {
        return giaSp;
    }

    public void setGiaSp(String giaSp) {
        this.giaSp = giaSp;
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
}
