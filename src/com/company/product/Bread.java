package com.company.product;

import java.util.Scanner;

public class Bread extends Product{
    private String size;
    private boolean fresh;


    public Bread(String type, String model, int quantity, String size, boolean fresh) {
        super(type, model, quantity);
        this.size = size;
        this.fresh = fresh;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isFresh() {
        return fresh;
    }

    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "size='" + size + '\'' +
                ", fresh=" + fresh +
                "} " + super.toString();
    }
}
