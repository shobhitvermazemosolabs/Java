package assignment7;

public class Mouse extends Rodent{
    public Mouse(){
        System.out.println("this is the mouse class");
    }
    @Override
    public void rodentColor() {
        System.out.println("Mouse is black in color");
    }

    @Override
    public int  lifeSpan() {
        System.out.print("this is the lifeSpan of a mouse  ");
        return 7;
    }
}
