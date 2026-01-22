package String;

import java.util.Scanner;

public class FindIndexInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char ch='a';
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                System.out.println(i);
                break;
            }
        }


    }
}
