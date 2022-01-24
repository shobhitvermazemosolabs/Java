package assignment7;

public class Gerbils extends Rodent{
    public Gerbils(){
        System.out.println("this is the example for gerbils class");
    }
    @Override
    public void rodentColor() {
        System.out.println("Gerbils are white in color");
    }

    @Override
    public int lifeSpan() {
        System.out.print("this is the lifeSpan of a Gerbils  ");
        return 4;
    }
}
