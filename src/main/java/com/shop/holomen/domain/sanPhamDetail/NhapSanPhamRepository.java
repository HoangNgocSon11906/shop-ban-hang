package com.shop.holomen.domain.sanPhamDetail;

import com.shop.holomen.domain.sanPham.SapXepSanPham;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface NhapSanPhamRepository {
    void insertSanPham(SanPhamDetail sanPhamDetail);

    SanPhamDetailS findAll();

    void remove(String sanPhamId, Integer sanPhamDetailId);

    SanPhamDetail findBy(String sanPhamDetailId);

    void update(SanPhamDetail sanPhamDetail);

    Page<SanPhamDetail> findSanPhamBy(String tenMap, Pageable pageable, SapXepSanPham sapXepSanPham);

}
