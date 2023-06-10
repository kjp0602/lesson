package Studygroup;



//소수...
public class Qa1 {


    public static void main(String[] args) {

        for(int i=2;i<=100; i++){
            int count=0;
            for(int j=2; j<i; j++) {
                if (i % j != 0) {
                    count++;
                }
            }
                if((i-2)==count){
                    System.out.println(i);
                }

        }

    }

}