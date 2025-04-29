package Hierarchical;

public class Mobile extends Product{
    public int Warranty;

    public Mobile(String name, int price,int Warranty) {
        super(name, price);
        this.Warranty=Warranty;
    }
    public void MobileDetails(){
        ProductDetails();
        System.out.println("Warranty:"+Warranty);
    }
}
