package home.work5;

public class Test {
    public static void main(String[] args) {

      Parrot parrot = new Parrot("Polly", 2, 1.1,true, "Blue", true);
      parrot.printInfo();
      System.out.println("------------");

      System.out.println("This parrot can talk: " + parrot.canTalk());
      System.out.println("This parrot can fly: " + parrot.isFlying());
      System.out.println("This parrot color is: " + parrot.getColor());
      System.out.println("------------");

      parrot.fly();
      parrot.stopFlying();
      parrot.beg();
      parrot.eat();
    }
}
