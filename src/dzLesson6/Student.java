package src.dzLesson6;


import java.util.Arrays;


public class Student {

     private int id;
     private int[] raiting;
     private String name;
     private double avrMark;

     public Student(String name, int... raiting){
          this.name = name;
          this.raiting =raiting;
     }

     public double avrMark(int...raiting){
          if(avrMark!=0){
               return avrMark;
          }
          if(raiting.length==0){
               return 0;
          }
          long sum = 0;
          for(int mark: raiting){
               sum = mark;
          }
          return (double) sum/raiting.length;
     }

     @Override
     public String toString() {
          return "Student{" +
                  "raiting=" + Arrays.toString(raiting) +
                  ", name='" + name + '\'' +
                  ", avrMark=" + avrRat() +
                  '}';
     }

     public boolean isPass(){
          return avrMark() <= 4;
     }


     public double avrRat (){
          double avr = 0;
          if (raiting.length>0){
               int sum =0;
               for(int j=0; j< raiting.length; j++){
                    sum +=raiting[j];
               }avr = sum/raiting.length;
          }return avr;
     }
}
