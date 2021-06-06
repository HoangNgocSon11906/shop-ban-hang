package com.shop.holomen.presentation.sanPham;

import java.io.Serializable;

public class Pager implements Serializable{

    private int buttonsToShow = 5;

    private int startPage;

    private int endPage;

    public Pager(int totalPages, int currentPage) {
        this(totalPages, currentPage, 10);
    }

    public Pager(int totalPages, int currentPage, int buttonsToShow) {

        setButtonsToShow(buttonsToShow-1);

        int halfPagesToShow = getButtonsToShow() / 2;

        if (totalPages <= getButtonsToShow()) {
            setStartPage(1);
            setEndPage(totalPages);

        } else if (currentPage - halfPagesToShow <= 0) {
            setStartPage(1);
            setEndPage(getButtonsToShow());

        } else if (currentPage + halfPagesToShow == totalPages) {
            setStartPage(currentPage - halfPagesToShow);
            setEndPage(totalPages);

        } else if (currentPage + halfPagesToShow > totalPages) {
            setStartPage(totalPages - getButtonsToShow() + 1);
            setEndPage(totalPages);

        } else {
            setStartPage(currentPage - halfPagesToShow);
            setEndPage(currentPage + halfPagesToShow);
        }

    }

    public int getButtonsToShow() {
        return buttonsToShow;
    }

    public void setButtonsToShow(int buttonsToShow) {
        if (buttonsToShow % 2 != 0)  this.buttonsToShow = buttonsToShow;
        this.buttonsToShow = buttonsToShow + 1;
    }

    public int getStartPage() {
        return startPage;
    }

    public void setStartPage(int startPage) {
        this.startPage = startPage;
    }

    public int getEndPage() {
        return endPage;
    }

    public void setEndPage(int endPage) {
        this.endPage = endPage;
    }
}