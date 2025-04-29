package Polymorphism;

public class Storypost extends post{
    public String storyposting;

    public Storypost(String poster) {
        super(poster);
    }

    @Override
    public void sendpost() {
        super.sendpost();
        System.out.println(poster+"posting a story:"+storyposting);
    }
}
