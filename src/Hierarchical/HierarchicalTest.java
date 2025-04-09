package Hierarchical;
public class HierarchicalTest {
    public static void main(String[] args) {
        Book book=new Book("java",2500);
        Mobile mobile=new Mobile("Iphone",100000);
        Clothing clothing = new Clothing("shirt",1000);

        book.BookDetails();
        mobile.MobileDetails();
        clothing.ClothingDetails();
    }
}

