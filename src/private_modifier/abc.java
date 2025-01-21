package private_modifier;

public class abc extends finalkeyword {  // final class cant be extended in subclass

    public static void main(String args[]){
        abc a1=new abc();
        a=234; //finalvaribale cant be overriddden in java
        System.out.println(a1.a);
System.out.println(a1.print());//final method cante be overridden and may not be modified in java
    }


}
