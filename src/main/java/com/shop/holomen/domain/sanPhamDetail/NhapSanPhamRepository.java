package com.shop.holomen.domain.sanPhamDetail;

public interface NhapSanPhamRepository {
    void insertSanPham(SanPhamDetail sanPhamDetail);

    SanPhamDetailS findAll();

    void remove(String sanPhamId, String sanPhamDetailId);

}
