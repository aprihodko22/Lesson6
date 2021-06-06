package dzLesson10;

public class Runner {
    public static void main(String[] args){
//        Dog dog = new Dog();
//        dog.move();
//        dog.run();

        try {
            method();
        } catch (AllWentWrong e) {
            e.printStackTrace();
        }finally {
            System.out.println("трай кэтч блок заночен");
        }

    }

    public static void method() throws AllWentWrong{
        double i = 1;
        i = Math.random() *100;
        if(i > 50){
            throw  new AllWentWrong();
        }else {
            System.out.println("Cifra men'she 50");
        }
    }
}
