package main;

/**
 * Menu class which will hold the products to be displayed to customers
 */
public class Menu {
    private Product[] products;

    public Menu(){
        products = new Product[10];
        populateProducts();
    }

    public Product[] getProducts(){
        return this.products;
    }

    public Product getProductByIndex(int index){
        if(index > products.length - 1){
            throw new IllegalArgumentException("Index is exceeding the Product's array length");
        }
        return products[index];
    }

    public Product getProductByName(String name){
        if(name.isBlank()){
            throw new IllegalArgumentException("Name of a product can not be blank");
        }
        for(Product product : products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        return null;
    }

    private void populateProducts(){
        products[0] = new Product("Coke",1.25f,150);
        products[1] = new Product("Beef Stew",4.70f,22);
        products[2] = new Product("Chicken Soup",3.65f,35);
        products[3] = new Product("Orange Juice",1.90f,110);
        products[4] = new Product("Feta Cheese Pastries",2,8);
        products[5] = new Product("Shopska Salad",3.80f,15);
        products[6] = new Product("Lamb with Rice",6.50f,18);
        products[7] = new Product("Beef steak",12.50f,11);
        products[8] = new Product("Caffe Late",2.20f,320);
        products[9] = new Product("Bottle of water",1.20f,140);
    }
}
