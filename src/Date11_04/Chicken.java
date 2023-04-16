package Date11_04;

public class Chicken implements HaveWing{
    public Chicken() {
    }

    @Override
    public void fly() {
        System.out.println("hello world");
    }

    @Override
    public void notFly() {
        System.out.println("tôi là gà và không biêt bay");
    }
}
