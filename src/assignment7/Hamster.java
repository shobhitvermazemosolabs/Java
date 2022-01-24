package assignment7;

public class Hamster extends Rodent{
    public Hamster(){
        System.out.println("this is the example for the Hamster class");
    }
    @Override
    public void rodentColor() {
        System.out.println("Hamster are brown in color");
    }

    @Override
    public int lifeSpan() {
        System.out.print("this is the lifeSpan of a Hamster  ");
        return 3;
    }
}
