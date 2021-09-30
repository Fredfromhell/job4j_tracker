package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                for (int j = i; j < products.length; j++) {
                    if (products[j] != null) {
                        Product temp = products[j];
                        products[j] = products[i];
                        products[i] = temp;
                        break;
                    }
                }
            }

        }
        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[4];
        products[0] = new Product("Bread", 4);
        products[1] = new Product("Egg", 10);
        products[2] = new Product("Milk", 2);
        products[3] = new Product("Fish", 3);
        Product[] result = ShopDrop.delete(products, 0);
        System.out.println(result[0].getName());
        System.out.println(result[1].getName());
        System.out.println(result[2].getName());

    }
}




