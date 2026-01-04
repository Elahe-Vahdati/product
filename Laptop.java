package se.fifth.product;

import java.math.BigDecimal;

public class Laptop extends Product {
    private String cpuType;

     public Laptop(){
         
     }

    public Laptop(int id, BigDecimal price, String brand, String cpuType){
        super(id, price, brand);
        this.cpuType = cpuType;
    }
    
        public String getCpuType(){
        return cpuType;
    }

    public void setCputype(String cpuType){
        this.cpuType = cputype;
    }
  
    @Override
    public void showProduct(){
        super.showProduct();
        System.out.println("CPU Type: " + cpuType);
    }

}
