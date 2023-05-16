package school;

import java.util.Map;

public class Student implements Comparable<Student>{

    private String name;
    private SubjectMap subjects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubjectMap getSubjects() {
        return subjects;
    }

    public void setSubjects(SubjectMap subjects) {
        this.subjects = subjects;
    }

    @Override
    public int compareTo(Student o) {

        if(o.getSubjects().getTotalScore() > subjects.getTotalScore()) {
            return 1;
        } else {
            return -1;
        }
    }
}
