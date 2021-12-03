package com.day10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparators {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(11,"Mobile",55000, LocalDate.of(2019,8,11)));
        products.add(new Product(1,"Laptop",75000, LocalDate.of(2018,5,1)));
        products.add(new Product(100,"TV",88000, LocalDate.of(2021,2,19)));
        products.add(new Product(55,"Watch",5000, LocalDate.of(2020,3,1)));
        System.out.println("Products :" +products);

        Comparator<Product> productNameComparator = new Comparator<Product>(){
            @Override
            public int compare(Product p1,Product p2){
                return p1.getProdName().compareTo(p2.getProdName());
            }
        };

        Collections.sort(products,productNameComparator);
        System.out.println("\nProducts (Sorted by Name) : "+products);

        Comparator<Product> productPriceComparator = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                if (p1.getPrice() < p2.getPrice()) {
                    return -1;
                } else if (p1.getPrice() > p2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        Collections.sort(products,productPriceComparator);
        System.out.println("\nProducts (Sorted by Price) : "+products);

        // Sort employees by JoiningDate
        Comparator<Product> productManufacturerDateComparator = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getManufactureDate().compareTo(p2.getManufactureDate());
            }
        };
        Collections.sort(products, productManufacturerDateComparator);
        System.out.println("\nProducts (Sorted by ManufacturerDate) : " + products);
    }}
