package Hierarchical;

  public class Book extends Product{
    public String Aurthor;


    public Book(String name, int price) {
        super(name,price);
        this.Aurthor=Aurthor;
    }

    public void BookDetails(){
        System.out.println("Aurthor:" + Aurthor);
    }
}

