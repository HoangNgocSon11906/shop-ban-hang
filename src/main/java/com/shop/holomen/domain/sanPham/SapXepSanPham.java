package com.shop.holomen.domain.sanPham;

public class SapXepSanPham {
    String value;

    public SapXepSanPham() {
    }

    public SapXepSanPham(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isTangDan() {
        return value.equals("tang dan");
    }
    public boolean isGiamDan() {
        return value.equals("giam dan");
    }
    public boolean isAToZ() {
        return value.equals("a-z");
    }
    public boolean isZToA() {
        return value.equals("z-a");
    }
    public boolean isCuNhat() {
        return value.equals("cu nhat");
    }
    public boolean isMoiNhat() {
        return value.equals("moi nhat");
    }

}
