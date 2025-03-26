package core;

public class Carcolor {
    private String color;


    //Instance method
    public void displayColor(){
        System.out.println("The color of the car is:" + color);
    }

    public static void main(String[] args){
        Carcolor myCarcolor = new Carcolor();
        myCarcolor.color = "yellow";
        myCarcolor.displayColor();
    }
}
