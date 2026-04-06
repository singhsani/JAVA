package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreams {
    public static void main(String[] args)  {
        try(FileOutputStream fos= new FileOutputStream("outputs.txt")){
            String str="Welcome to java";
            fos.write(str.getBytes());
            String s="\nnew Data";
            fos.write(s.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(FileInputStream fis=new FileInputStream("outputs.txt")){
            int data;
            while((data=fis.read()) !=-1){
                System.out.println();
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
