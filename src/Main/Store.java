package Main;

import product.Bread;
import product.Chocolate;
import product.Coke;
import product.ProductForSale;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("chocolate", 25,"milk of chocolate", "milka");
        products[1] = new Bread("bread",15, "normal", "wheat");
        products[2]= new Coke("coke", 24, "cookies", true);


        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        if (products != null) {
            for (ProductForSale product : products) {
                if (product != null) {
                    product.showDetails();
                    System.out.println("Sales Price: " + product.getSalesPrice(3));
                    System.out.println("---other product----");
                }
            }
        }
    }
}