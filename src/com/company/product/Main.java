package com.company.product;

import com.company.product.Bread;
import com.company.product.Milk;
import com.company.product.Product;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bread bread = new Bread("flour", "around", 10, "100 gr", true);
        bread.setDiscount();
        System.out.println(bread);
        Milk ml = new Milk("milky", "liquid", 20);
        Milk.Butter bt = new Milk.Butter();
        System.out.println(bt.resept());
        Milk.Tvorog tv = new Milk.Tvorog();
        System.out.println(tv.resept());
        Milk.Tvorog.Cheese chs = new Milk.Tvorog.Cheese();
        System.out.println(chs.resept3());


    }
}
