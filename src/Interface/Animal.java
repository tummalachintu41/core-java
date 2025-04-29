package Interface;

public interface Animal {
        public void animalSound();
        public void sleep();
        public void eat();
    }

    class Pig implements Animal {
        public void animalSound() {
            System.out.println("The pig says: wee wee");
        }
        public void sleep() {
            System.out.println("Zzz");
        }
        public void eat(){
            System.out.println("pig is eating food");
        }
    }
