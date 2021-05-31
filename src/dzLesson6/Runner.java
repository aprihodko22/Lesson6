package src.dzLesson6;


import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        ArrayList<src.dzLesson6.Student> students = new ArrayList<>();

        src.dzLesson6.Student anton = new src.dzLesson6.Student("Anton", 3,5,8,10,8);
        src.dzLesson6.Student dima = new src.dzLesson6.Student("Dima", 3,5,8,10,8);
        src.dzLesson6.Student andrey = new src.dzLesson6.Student("Adnrey", 3,5,8,10,8);
        src.dzLesson6.Student victor = new src.dzLesson6.Student("Victor", 3,12,8,10,8);
        students.add(anton);
        students.add(dima);
        students.add(andrey);
        students.add(victor);
        if(anton.isPass()==false){
            students.remove(anton);
        }
        if(andrey.isPass()==false){
            students.remove(andrey);
        }
        if(dima.isPass()==false){
            students.remove(dima);
        }
        if(victor.isPass()==false){
            students.remove(victor);
        }
        printList(students);

    }
    private static void printList(){

    }


    public static void printList(ArrayList<src.dzLesson6.Student>list){
        for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }

}




