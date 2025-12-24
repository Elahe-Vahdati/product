package se.fifth.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductApp {

    ArrayList<Product> products = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public ProductApp() {
        menu();
    }
    void menu(){
        productBreak:
        while(true){
            System.out.println("""
                
                1 Add Mobile
                2 Add Laptop
                3 Remove Product by ID
                4 Show All Products
                5 Exit
                                
                """);
            int choice = sc.nextInt();
            switch (choice){
                case 1 ->{
                    System.out.println("Enter Product ID");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Brand Name");
                    String brand = sc.nextLine();
                    System.out.println("Enter Product Price");
                    BigDecimal price = sc.nextBigDecimal();
                    sc.nextLine();
                    System.out.println("Enter sim count");
                    int simCount = sc.nextInt();
                    products.add(new CellPhone(id, price, brand, simCount));
                    System.out.println("Product added successfully");
                }

                case 2 ->{
                    System.out.println("Enter Product ID");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Brand Name");
                    String brand = sc.nextLine();
                    System.out.println("Enter Product Price");
                    BigDecimal price = sc.nextBigDecimal();
                    sc.nextLine();
                    System.out.println("Enter cpu type");
                    String cpuType = sc.nextLine();
                    products.add(new Laptop(id, price, brand, cpuType));
                    System.out.println("Product added successfully");
                }

                case 3 ->{
                    System.out.println("Enter Product ID to remove");
                    int id = sc.nextInt();
                    sc.nextLine();
                    products.remove(id);
                    System.out.println("Product removed successfully");
                }

                case 4 ->{
                    if (products.isEmpty()){
                        System.out.println("There are no products to remove");
                    }else  {
                        System.out.println("Enter Product ID to remove");
                    }
                }

                case 5 ->{
                    System.out.println("Enter exit");
                    break productBreak;
                }

                default ->  System.out.println("Invalid choice");

            }
        }
    }
}
