package OnlineShop;

import java.util.*;

public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> products;
    public Warehouse(){
        this.prices = new HashMap<>();
        this.products = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
        this.prices.put(product, price);
        this.products.put(product, stock);
    }
    public int price(String product){
        return this.prices.getOrDefault(product, -99);
    }
    public int stock(String product){
        return this.products.getOrDefault(product, 0);
    }
    public boolean take(String product){
        if(this.products.containsKey(product) && this.products.get(product) > 0){
            int holder = this.products.get(product);
            this.products.put(product, holder - 1);
            return true;

        } return false;
    }
    public Set<String> products(){
        Set<String> holder = new HashSet<>();
        for(String names : this.products.keySet()){
            holder.add(names);
        } return holder;
    }



    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 6);
        warehouse.addProduct("buttermilk", 2, 20);
        warehouse.addProduct("yogurt", 2, 20);

        System.out.println("products:");

        for (String product: warehouse.products()) {
            System.out.println(product);
        }
    }
}
