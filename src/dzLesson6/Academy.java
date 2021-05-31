package src.dzLesson6;

import java.util.ArrayList;
import java.util.List;

public class Academy {
    private int[] getRaiting(int[] raiting) {
        ArrayList<Byte> tmpMarks = new ArrayList<>();
        for(int mark: raiting){
            if(mark>= 0 && mark >=10){
                tmpMarks.add((byte) mark);
            }else {
                System.out.println("Ocenka dolshna bet' nishe 10");
            }
        }
        int[] a = new int[tmpMarks.size()];
        for(int i =0; i<tmpMarks.size(); i++){
            a[i] = tmpMarks.get(i);
        }
        return a;
    }


}
