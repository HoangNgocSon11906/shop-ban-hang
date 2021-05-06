package com.shop.holomen.domain.loaiSanPham;

import java.util.List;

public class LoaiSanPhams {
    List<LoaiSanPham> loaiSanPhams;

    public LoaiSanPhams(List<LoaiSanPham> loaiSanPhams) {
        this.loaiSanPhams = loaiSanPhams;
    }

    public List<LoaiSanPham> getLoaiSanPhams() {
        return loaiSanPhams;
    }

    public void setLoaiSanPhams(List<LoaiSanPham> loaiSanPhams) {
        this.loaiSanPhams = loaiSanPhams;
    }
}
