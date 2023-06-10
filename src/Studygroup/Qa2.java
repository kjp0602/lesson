package Studygroup;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
//피보나치..
public class Qa2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("숫자를 입력하세요");

        int[] a = new int[number];
        a[0] = 1;
       a[1] = 1;
//a3= a2+a1

        for(int i=0; i<a.length-2; i++ ){
           a[i+2]=a[i+1]+a[i];

        }

        for(int j=0; j<a.length; j++){
            System.out.printf("%5d", a[j]);
        }

    }


}
