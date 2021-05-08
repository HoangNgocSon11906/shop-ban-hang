package com.shop.holomen.domain.hinhSanPham;

import org.springframework.web.multipart.MultipartFile;

public class FormUpLoadImages {
    private MultipartFile multipartFiles;

    public FormUpLoadImages() {
    }

    public MultipartFile getMultipartFiles() {
        return multipartFiles;
    }

    public void setMultipartFiles(MultipartFile multipartFiles) {
        this.multipartFiles = multipartFiles;
    }
}
