package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * Anagram
 * both string are same length
 * and match all characters in string
 */

public class Anagram {
    int x=256;
    public boolean checkAnagram(){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1=sc.next();
        char[] ch=str.toCharArray();
        char[] ch1=str1.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        if(str.length() != str1.length()){
            return false;
        }
        for(int i=0;i<ch.length;i++){
            if(ch[i]!=ch1[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkAnangramApproch2(){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1=sc.next();
        int[] countStr=new int[x];
        Arrays.fill(countStr,0);
        int[] countStr1=new int[x];
        Arrays.fill(countStr1,0);
        if(str.length()!=str1.length()){
            return false;
        }
        for(int i=0;i<str.length();i++){
            countStr1[str1.charAt(i)]++;
            countStr[str.charAt(i)]++;
        }
        for(int i=0;i<x;i++){
            if(countStr1[i]!=countStr[i])
                 return false;
        }
        return true;
    }

    public boolean checkAnagramApproch3(){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1=sc.next();
        HashMap<Character,Integer> map=new HashMap<>();
        if(str.length()!=str1.length()){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        for(int i=0;i<str1.length();i++){
            if(map.containsKey(str1.charAt(i))){
                map.put(str1.charAt(i),map.get(str1.charAt(i))-1);
            }else{
                return false;
            }
        }
        Set<Character> keys=map.keySet();
        for(Character key:keys){
            if(map.get(key)!=0)
                return false;
        }
        return true;
    }



    public static void main(String[] args) {
        Anagram anagram=new Anagram();
        if(anagram.checkAnagramApproch3()){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
