package inheritance.Multilevel;

public class Mobile extends Electronic{
    public int butteryCapacity;

    public Mobile(String name, int price) {
        super(name, price);
        this.butteryCapacity=butteryCapacity;
    }
    @Override
    public void getDetails(){
        super.getDetails();
        System.out.println("butteryCapacity"+butteryCapacity);
    }
}
