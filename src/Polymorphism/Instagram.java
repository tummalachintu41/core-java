package Polymorphism;

public class Instagram {
    public static void main(String[] args){

        post post1 = new post("Selfie:");
        post1.poster = "A person";
        post1.sendpost();

        Storypost post2 = new Storypost("Bob");
        post2.storyposting = "Sunset at the beach ";
        post2.sendpost();

        Videopost post3 = new Videopost("reel");
        post3.videoupload = "Dansing in the pub";
        post3.sendpost();

        Photopost post4 = new Photopost("rohith");
        post4.upload = "A photo";
        post4.sendpost();
    }
}
