package service;

import model.Product;
import java.util.*;

public class Inventory {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
        System.out.println("Product added: " + product.getName());
    }

    public void updateProduct(int id, int newQuantitiy, double newPrice){
        for(Product p:products){
            if(p.getId() == id){
                p.setQuantity(newQuantitiy);
                p.setPrice(newPrice);
                System.out.println("Product updated: " + p.getName());
                return;
            }
        }
        System.out.println("Product with ID " + id + " not found.");
    }

    public void deleteProduct(int id){
        products.removeIf(p->p.getId() == id);
        System.out.println("Product with ID " + id + " deleted.");
    }

    public void searchProduct(String name){
        for(Product p: products){
            if(p.getName().equalsIgnoreCase(name)){
                System.out.println("Product found: " + p);
                return;
            }
        }
        System.out.println("Product with name " + name + " not found.");
    }

    public void displayProducts(){
        if(products.isEmpty()){
            System.out.println("No products in inventory.");
            return;
        }
        for(Product p: products){
            System.out.println(p);
        }
    }
}
