package Ue11;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("ue11 starting up...");

        ArrayList<Product>products= new ArrayList<>();

        ProductManager productManager= new ProductManager();

        Product p1= new Product("Chest",50.00,"Armor");
        Product p2= new Product("Boots",37.75,"Armor");
        Product p3= new Product("Pants",66.66,"Armor");
        Product p4= new Product("Braces",24.65,"Armor");
        Product p5= new Product("Sword",15.50,"Weapon");
        Product p6= new Product("Dagger",7.50,"Weapon");
        Product p7= new Product("Pickaxe",3.50,"Tool");

        productManager.add(p1);
        productManager.add(p2);
        productManager.add(p3);
        productManager.add(p4);
        productManager.add(p5);
        productManager.add(p6);
        productManager.add(p7);

        productManager.saveToFile("C:\\Users\\s53037\\IdeaProjects\\products.txt");
productManager.readFromFile("C:\\Users\\s53037\\IdeaProjects\\products.txt");
    }
}
