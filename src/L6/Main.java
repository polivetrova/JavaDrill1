package L6;

public class Main {

    public static void main(String[] args) {
         Cat cat1 = new Cat("Барсик");
         Cat cat2 = new Cat("Циклоп", 300,12);
         Cat cat3 = new Cat("Маруся");

         Dog dog1 = new Dog("Бобик", 1000, 20,30);
         Dog dog2 = new Dog("Бобик2");
         Dog dog3 = new Dog("Бобик3", 100,10,40);

         dog1.run(1000); //true
         dog1.jump(60); //false
         dog1.swim(20); //true
         System.out.println();

         dog2.run(400); //true
         dog2.jump(0.3); //true
         dog2.swim(11); // false
         System.out.println();

         dog3.run(90); //true
         dog3.jump(10); //true
         dog3.swim(20); //true
         System.out.println();


         cat1.run(300); //false
         cat1.jump(1); //true
         System.out.println();

         cat2.run(250); //true
         cat2.jump(10); //true
         cat2.swim(8); //false
         System.out.println();

         cat3.run(100); //false
         cat3.jump(0); //none
         cat3.swim(7); //false
         System.out.println();
    }
}
