package se.fifth.product;

import java.math.BigDecimal;

public class Laptop extends Product {
    private String cpuType;

    public Laptop(int id, BigDecimal price, String brand, String cpuType){
        super(id, price, brand);
        this.cpuType = cpuType;
    }
    @Override
    public void showProduct(){
        super.showProduct();
        System.out.println("CPU Type: " + cpuType);
    }

}
