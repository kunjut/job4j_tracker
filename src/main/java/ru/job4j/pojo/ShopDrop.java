package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        int last = products.length - 1;
        for (int i = index; i < last; i++) {
            products[i] = products[i + 1];
        }
        products[last] = null;
        return products;
    }
}
