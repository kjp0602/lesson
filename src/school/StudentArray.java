package school;

import javax.security.auth.Subject;
import java.util.*;

public class StudentArray extends ArrayList<Student>{
    public void sort(){
        Collections.sort(this);
    }

    public void println() {
        System.out.print("이 름\t");
        for(int i = 0; i < SubjectMap.KEYS.length;i++) {
            System.out.print(SubjectMap.KEYS[i]+"\t");
        }
        System.out.println("합계");

        for(int i = 0; i<this.size(); i++) {
            String name = this.get(i).getName();
            int score = this.get(i).getSubjects().getTotalScore();
            System.out.print(name+"\t");
            SubjectMap map = this.get(i).getSubjects();
            for(int j = 0; j < SubjectMap.KEYS.length;j++) {
                System.out.print(map.get(SubjectMap.KEYS[j])+"\t");
            }
            System.out.println(score);
        }
    }
}
