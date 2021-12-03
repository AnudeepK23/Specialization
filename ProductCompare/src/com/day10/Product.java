package com.day10;

import java.time.LocalDate;
import java.util.Objects;


class Product implements Comparable<Product> {
    private int prodId;
    private String prodName;
    private double price;
    private LocalDate manufactureDate;

    public Product(int prodId, String prodName, double price, LocalDate manufactureDate) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
        this.manufactureDate = manufactureDate;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    //    public Product(int prodId, String prodName, double price) {
//        this.prodId = prodId;
//        this.prodName = prodName;
//        this.price = price;
//    }
//
//    public int getProdId() {
//        return prodId;
//    }
//
//    public void setProdId(int prodId) {
//        this.prodId = prodId;
//    }
//
//    public String getProdName() {
//        return prodName;
//    }
//
//    public void setProdName(String prodName) {
//        this.prodName = prodName;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }


//            public Product(int id, String name, double salary) {
//                this.id = id;
//                this.name = name;
//                this.salary = salary;
//                this.joiningDate = joiningDate;
//            }

    //            public int getId() {
//                return id;
//            }
//
//            public void setId(int id) {
//                this.id = id;
//            }
//            public String getName() {
//                return name;
//            }
//            public void setName(String name) {
//                this.name = name;
//            }
//            public double getSalary() {
//                return salary;
//            }
//            public void setSalary(double salary) {
//                this.salary = salary;
//            }
//            public LocalDate getJoiningDate() {
//                return joiningDate;
//            }
//
//            public void setJoiningDate(LocalDate joiningDate) {
//                this.joiningDate = joiningDate;
//            }
    @Override
    public int compareTo(Product anotherProduct) {
        return this.getProdId() - anotherProduct.getProdId();
    }

    // Two employees are equal if their IDs are equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return prodId == product.prodId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodId);
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                ", manufactureDate=" + manufactureDate +
                '}';
    }
}



//    @Override
//    public String toString() {
//        return "Product{" +
//                "prodId=" + prodId +
//                ", prodName='" + prodName + '\'' +
//                ", price=" + price +
//                '}';
//    }




//            @Override
//            public String toString() {
//                return "Employee{" +
//                        "id=" + id +
//                        ", name='" + name + '\'' +
//                        ", salary=" + salary +
//                        ", joiningDate=" + joiningDate +
//                        '}';  }}

        // write your code here


