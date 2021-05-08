package com.shop.holomen.domain.sanPhamDetail;

import com.shop.holomen.domain.loaiSanPham.MaLoai;
import com.shop.holomen.domain.sanPham.Mota;
import com.shop.holomen.domain.sanPham.TenSanPham;

public class SanPhamDetail {
    SanPhamDetailId sanPhamDetailId;
    MaLoai maLoai;
    TenSanPham tenSanPham;
    Mota mota;
    Maus maus;
    Sizes sizes;
    GiaThuong giaThuong;
    GiaKM giaKM;

    public SanPhamDetail() {
    }

    public SanPhamDetail(SanPhamDetailId sanPhamDetailId, MaLoai maLoai, TenSanPham tenSanPham, Mota mota, Maus maus, Sizes sizes, GiaThuong giaThuong, GiaKM giaKM) {
        this.sanPhamDetailId = sanPhamDetailId;
        this.maLoai = maLoai;
        this.tenSanPham = tenSanPham;
        this.mota = mota;
        this.maus = maus;
        this.sizes = sizes;
        this.giaThuong = giaThuong;
        this.giaKM = giaKM;
    }

    public SanPhamDetailId getSanPhamDetailId() {
        return sanPhamDetailId;
    }

    public void setSanPhamDetailId(SanPhamDetailId sanPhamDetailId) {
        this.sanPhamDetailId = sanPhamDetailId;
    }

    public MaLoai getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(MaLoai maLoai) {
        this.maLoai = maLoai;
    }

    public TenSanPham getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(TenSanPham tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public Mota getMota() {
        return mota;
    }

    public void setMota(Mota mota) {
        this.mota = mota;
    }

    public Maus getMaus() {
        return maus;
    }

    public void setMaus(Maus maus) {
        this.maus = maus;
    }

    public Sizes getSizes() {
        return sizes;
    }

    public void setSizes(Sizes sizes) {
        this.sizes = sizes;
    }

    public GiaThuong getGiaThuong() {
        return giaThuong;
    }

    public void setGiaThuong(GiaThuong giaThuong) {
        this.giaThuong = giaThuong;
    }

    public GiaKM getGiaKM() {
        return giaKM;
    }

    public void setGiaKM(GiaKM giaKM) {
        this.giaKM = giaKM;
    }

}
