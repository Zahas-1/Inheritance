package OnlineShop;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> cart;
    ShoppingCart(){
        this.cart = new HashMap<>();
    }
    public void add(String product, int price) {
        if(cart.containsKey(product)){
            cart.get(product).increaseQuantity();
        } else cart.put(product, new Item(product, 1, price));
    }
    public int price(){
        int total = 0;
        for(Item cart : cart.values()){
            total += cart.price();
        } return total;
    }
    public void print(){
        for(Item names : cart.values()){
            System.out.println(names);
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.add("milk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("buttermilk", 2);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("milk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("milk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");
}
}

