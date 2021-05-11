package com.shop.holomen.domain.sanPhamDetail;

public interface NhapSanPhamRepository {
    void insertSanPham(SanPhamDetail sanPhamDetail);

    SanPhamDetailS findAll();

    void remove(String sanPhamId, Integer sanPhamDetailId);

    SanPhamDetail findBy(String sanPhamDetailId);

    void update(SanPhamDetail sanPhamDetail);

}
