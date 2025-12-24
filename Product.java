package se.fifth.product;

import java.math.BigDecimal;

public class Product {
    private int id;
    private BigDecimal price;
    private String brand;

    public Product(){
    }

    public Product(int id, BigDecimal price, String brand){
        this.id = id;
        this.price = price;
        this.brand = brand;
    }

    public int setId(){
        return id;
    }

    public void getId(int id){
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price){
        this.price = price;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void showProduct(){
        System.out.println("Product ID: " + id + ", Price: " + price + ", Brand: " + brand);
    }

}
