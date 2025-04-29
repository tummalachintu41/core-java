package Polymorphism;

public class Photopost extends post{
    public String upload;

    public Photopost(String poster) {
        super(poster);
    }

    @Override
    public void sendpost() {
        super.sendpost();
        System.out.println(poster + " is uploading a photo: " + upload);
    }
}
