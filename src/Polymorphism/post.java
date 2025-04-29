package Polymorphism;

public class post {
    public String poster;

    public post(String poster){
        this.poster=poster;
    }

    public void sendpost(){
        System.out.println(poster+"is sending a generic post");
    }
}
