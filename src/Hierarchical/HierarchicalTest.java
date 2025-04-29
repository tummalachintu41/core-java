package Hierarchical;

public class HierarchicalTest {
    public static void main(String[] args) {
        Book book=new Book("java",2500,"Rohith");
        Mobile mobile=new Mobile("Iphone",100000,4300);
        Clothing clothing = new Clothing("shirt",1000,"M");

        book.BookDetails();
        mobile.MobileDetails();
        clothing.ClothingDetails();
    }
}
