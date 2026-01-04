package se.fifth.product;

import java.math.BigDecimal;

public class CellPhone extends Product {

    private int simCount;

    public int getSimCount(){
        return simCount;
    }
    public void setSimcount(int simCount){
        this.simCount = simCount;
    }

    public CellPhone(){
        
    }

    public CellPhone(int id, BigDecimal price, String name, int simCount) {
        super(id, price, name);
        this.simCount = simCount;
    }
    @Override
    public void showProduct() {
        super.showProduct();
        System.out.println("Sim Count: " + simCount);
    }
}
