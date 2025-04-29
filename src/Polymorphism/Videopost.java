package Polymorphism;

public class Videopost extends post{
    public String videoupload;

    public Videopost(String poster) {
        super(poster);
    }

    @Override
    public void sendpost() {
        super.sendpost();
        System.out.println(poster+"posting a reel:"+videoupload);
    }
}
