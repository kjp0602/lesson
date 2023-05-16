package school;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("홍길동");
        s1.setSubjects(new SubjectMap());
        s1.getSubjects().put("국어", 90);
        s1.getSubjects().put("영어", 64);
        s1.getSubjects().put("수학", 81);
        s1.getSubjects().put("사회", 90);
        s1.getSubjects().put("과학", 100);
        Student s2 = new Student();
        s2.setName("김미나");
        s2.setSubjects(new SubjectMap());
        s2.getSubjects().put("국어", 85);
        s2.getSubjects().put("영어", 96);
        s2.getSubjects().put("수학", 98);
        s2.getSubjects().put("사회", 58);
        s2.getSubjects().put("과학", 70);
        Student s3 = new Student();
        s3.setName("이민호");
        s3.setSubjects(new SubjectMap());
        s3.getSubjects().put("국어", 76);
        s3.getSubjects().put("영어", 58);
        s3.getSubjects().put("수학", 74);
        s3.getSubjects().put("사회", 67);
        s3.getSubjects().put("과학", 75);
        Student s4 = new Student();
        s4.setName("박신동");
        s4.setSubjects(new SubjectMap());
        s4.getSubjects().put("국어", 100);
        s4.getSubjects().put("영어", 100);
        s4.getSubjects().put("수학", 100);
        s4.getSubjects().put("사회", 100);
        s4.getSubjects().put("과학", 100);
        StudentArray studentArray = new StudentArray();
        studentArray.add(s1);
        studentArray.add(s2);
        studentArray.add(s3);
        studentArray.add(s4);
        studentArray.sort();
        studentArray.println();
    }
}
