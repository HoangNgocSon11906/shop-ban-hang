package com.shop.holomen.domain.loaiSanPham;

public class LoaiSanPham {
    MaLoai maLoai;
    TenLoai tenLoai;
    TenMap tenMap;

    public LoaiSanPham() {
    }

    public MaLoai getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(MaLoai maLoai) {
        this.maLoai = maLoai;
    }

    public TenLoai getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(TenLoai tenLoai) {
        this.tenLoai = tenLoai;
    }

    public TenMap getTenMap() {
        return tenMap;
    }

    public void setTenMap(TenMap tenMap) {
        this.tenMap = tenMap;
    }
}
