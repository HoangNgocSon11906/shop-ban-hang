package com.shop.holomen.domain.hinhSanPham;

import org.springframework.web.multipart.MultipartFile;

public class FormUpLoadImages1 {
    private MultipartFile anh1;

    public FormUpLoadImages1() {
    }

    public MultipartFile getAnh1() {
        return anh1;
    }

    public void setAnh1(MultipartFile multipartFiles1) {
        this.anh1 = multipartFiles1;
    }
}
