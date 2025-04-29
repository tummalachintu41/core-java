package inheritance.Multilevel;

public class product {
  public String name;
   public int price;

   public product(String name,int price){
       this.name=name;
       this.price=price;

    }
    public void getDetails(){
       System.out.println("name"+name);
       System.out.println("price"+price);
    }

    public void getDetails(String currency){
       System.out.println("name"+name);
       System.out.println("price"+price+""+currency);
    }

}
