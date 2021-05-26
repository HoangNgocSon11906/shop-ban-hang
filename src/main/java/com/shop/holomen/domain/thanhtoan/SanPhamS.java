package com.shop.holomen.domain.thanhtoan;

import java.util.List;

public class SanPhamS {
    List<SanPham> gioHang;

    public SanPhamS() {
    }

    public SanPhamS(List<SanPham> gioHang) {
        this.gioHang = gioHang;
    }

    public List<SanPham> getGioHang() {
        return gioHang;
    }

    public void setGioHang(List<SanPham> gioHang) {
        this.gioHang = gioHang;
    }
}
