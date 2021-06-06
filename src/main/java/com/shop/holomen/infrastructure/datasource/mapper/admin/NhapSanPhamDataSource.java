package com.shop.holomen.infrastructure.datasource.mapper.admin;

import com.shop.holomen.domain.sanPhamDetail.NhapSanPhamRepository;
import com.shop.holomen.domain.sanPhamDetail.SanPhamDetail;
import com.shop.holomen.domain.sanPhamDetail.SanPhamDetailS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NhapSanPhamDataSource implements NhapSanPhamRepository {

    @Autowired
    NhapSanPhamMapper nhapSanPhamMapper;

    @Override
    public void insertSanPham(SanPhamDetail sanPhamDetail) {
        nhapSanPhamMapper.insertSanPham(sanPhamDetail);
        nhapSanPhamMapper.insertSanPhamDetail(sanPhamDetail);
        sanPhamDetail.getMaus().getValues().forEach(mau -> nhapSanPhamMapper.insertMauSanPham(sanPhamDetail.getSanPhamDetailId(), mau));
        sanPhamDetail.getSizes().getSizes().forEach(size -> nhapSanPhamMapper.insertSizeSanPham(sanPhamDetail.getSanPhamDetailId(), size));
    }

    @Override
    public SanPhamDetailS findAll() {
        return new SanPhamDetailS(nhapSanPhamMapper.findAll());
    }

    @Override
    public void remove(String sanPhamId, Integer sanPhamDetailId) {
        nhapSanPhamMapper.removeSanPham(sanPhamId);
        nhapSanPhamMapper.removeMau(sanPhamDetailId);
        nhapSanPhamMapper.removeSize(sanPhamDetailId);
        nhapSanPhamMapper.removeSanPhamDetail(sanPhamDetailId);
    }

    @Override
    public SanPhamDetail findBy(String sanPhamDetailId) {
        return nhapSanPhamMapper.findBy(sanPhamDetailId);
    }

    @Override
    public void update(SanPhamDetail sanPhamDetail) {
        nhapSanPhamMapper.updateSanPham(sanPhamDetail);
        nhapSanPhamMapper.updateSanPhamDetail(sanPhamDetail);
        nhapSanPhamMapper.removeMau(sanPhamDetail.getSanPhamDetailId().getValue());
        sanPhamDetail.getMaus().getValues().forEach(mau -> nhapSanPhamMapper.insertMauSanPham(sanPhamDetail.getSanPhamDetailId(), mau));
        nhapSanPhamMapper.removeSize(sanPhamDetail.getSanPhamDetailId().getValue());
        sanPhamDetail.getSizes().getSizes().forEach(size -> nhapSanPhamMapper.insertSizeSanPham(sanPhamDetail.getSanPhamDetailId(), size));
    }

    @Override
    public Page<SanPhamDetail> findSanPhamBy(String tenMap, Pageable pageable) {
        List<SanPhamDetail> offsetList = nhapSanPhamMapper.findSanPhamBy(tenMap, pageable);
        Integer size = nhapSanPhamMapper.size(tenMap);
        Page<SanPhamDetail> page = new PageImpl(offsetList, pageable, size);
        return page;
    }
}

