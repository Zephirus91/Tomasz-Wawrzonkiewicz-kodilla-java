package com.kodilla;

import java.util.*;
import java.lang.*;
import java.io.*;

class Products {
    private Integer productNumber;

    public Products (int productNumber) {
        this.productNumber = productNumber;
    }

    public boolean equals(Object o) {
        Products e = (Products) o;
        return productNumber.equals(e.productNumber);
    }

    public int hashCode() {
        return productNumber;
    }
    public String toString() {
        return "number of product: " + productNumber;
    }
}

class NetShop {
    public static void main (String[] args) {

        Products p1 = new Products (11111);
        Products p2 = new Products (22222);
        Products p3 = new Products (98765);
        Products p4 = new Products (44444);
        Products p5 = new Products (22222);
        Products p6 = new Products (12345);
        Products p7 = new Products (44444);
        Products p8 = new Products (55555);

        HashSet<Products> verify = new HashSet<Products>();
        verify.add(p1);
        verify.add(p2);
        verify.add(p3);
        verify.add(p4);
        verify.add(p5);
        verify.add(p6);
        verify.add(p7);
        verify.add(p8);

        for (Products noDouble: verify) {
            System.out.println(noDouble);
        }
        System.out.println("Number of products without doubles: " + verify.size());
    }
}