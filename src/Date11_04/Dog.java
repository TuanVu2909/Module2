package Date11_04;

public class Dog implements NotWing {
    public Dog() {
    }

    @Override
    public void notSwim() {
        System.out.println("hello");
    }

    @Override
    public void swim() {
        System.out.println("tôi là chó và tôi biết bơi");
    }
}
