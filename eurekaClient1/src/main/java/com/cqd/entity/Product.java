package com.cqd.entity;

public class Product {
    private Integer id;
    private String name;
    private Double price;
    private String data;
    private String unit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }


    public Product(Integer id, String name, Double price, String data, String unit) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.data = data;
        this.unit = unit;
    }

    public Product() {
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", data='" + data + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }
}

