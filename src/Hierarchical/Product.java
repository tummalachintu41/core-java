package Hierarchical;

public class Product {
    public String name;
    public int price;

    public Product(String name, int price){
        this.name=name;
        this.price=price;
    }

    public void ProductDetails(){
        System.out.println("Product Name:"+name);
        System.out.println("Product Price:"+price);
    }
}
