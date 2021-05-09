package com.shop.holomen.domain.sanPhamDetail;

import com.shop.holomen.domain.hinhSanPham.*;
import com.shop.holomen.domain.loaiSanPham.MaLoai;
import com.shop.holomen.domain.sanPham.Mota;
import com.shop.holomen.domain.sanPham.SanPhamId;
import com.shop.holomen.domain.sanPham.TenSanPham;

public class SanPhamDetail {
    SanPhamId sanPhamId;
    SanPhamDetailId sanPhamDetailId;
    MaLoai maLoai;
    TenSanPham tenSanPham;
    Mota mota;
    Maus maus;
    Sizes sizes;
    GiaThuong giaThuong;
    GiaKM giaKM;
    MainImage mainImage;
    Image1 image1;
    Image2 image2;
    Image3 image3;
    Image4 image4;

    public SanPhamDetail() {
    }

    public SanPhamDetail(SanPhamId sanPhamId, SanPhamDetailId sanPhamDetailId, MaLoai maLoai, TenSanPham tenSanPham, Mota mota, Maus maus, Sizes sizes, GiaThuong giaThuong, GiaKM giaKM, MainImage mainImage, Image1 image1, Image2 image2, Image3 image3, Image4 image4) {
        this.sanPhamId = sanPhamId;
        this.sanPhamDetailId = sanPhamDetailId;
        this.maLoai = maLoai;
        this.tenSanPham = tenSanPham;
        this.mota = mota;
        this.maus = maus;
        this.sizes = sizes;
        this.giaThuong = giaThuong;
        this.giaKM = giaKM;
        this.mainImage = mainImage;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.image4 = image4;
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

    public SanPhamId getSanPhamId() {
        return sanPhamId;
    }

    public void setSanPhamId(SanPhamId sanPhamId) {
        this.sanPhamId = sanPhamId;
    }

    public MainImage getMainImage() {
        return mainImage;
    }

    public void setMainImage(MainImage mainImage) {
        this.mainImage = mainImage;
    }

    public Image1 getImage1() {
        return image1;
    }

    public void setImage1(Image1 image1) {
        this.image1 = image1;
    }

    public Image2 getImage2() {
        return image2;
    }

    public void setImage2(Image2 image2) {
        this.image2 = image2;
    }

    public Image3 getImage3() {
        return image3;
    }

    public void setImage3(Image3 image3) {
        this.image3 = image3;
    }

    public Image4 getImage4() {
        return image4;
    }

    public void setImage4(Image4 image4) {
        this.image4 = image4;
    }
}
