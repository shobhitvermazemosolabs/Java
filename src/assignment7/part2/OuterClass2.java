package assignment7.part2;

public class OuterClass2 {
    public class InnerClass2 extends OuterClass1.InnerClass1{
        public InnerClass2(OuterClass1 outerClassObject){
            outerClassObject.super(2,3);
        }
    }

    public static void main(String[] args) {
        OuterClass1 outerClass1Obj=new OuterClass1();
        OuterClass2 outerClass2Obj=new OuterClass2();
        InnerClass2 innerClass2Obj=outerClass2Obj.new InnerClass2(outerClass1Obj);
    }
}
