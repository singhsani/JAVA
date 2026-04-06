package FileHandling;

import java.io.*;
import java.util.Collections;

public class FileCreate {
    public static void main(String[] args) throws IOException {
//        File obj=new File("myText.txt");
//        if(obj.createNewFile()){
//            System.out.println("file is created !!");
//        }else{
//            System.out.println("file not create !!");
//        }
//        FileWriter writer=new FileWriter("myText.txt");
//        writer.write("The two main abstract classes for character streams are:\n" +
//                "\n" +
//                "Reader: Base class for all character-based input streams (reading).\n" +
//                "Writer: Base class for all character-based output streams (writing).\n" +
//                "Since abstract classes cannot be used directly, we use their implementation classes to perform actual I/O operations.\n" +
//                "\n" +
//                "FileReader: reads characters from a file.\n" +
//                "FileWriter: writes characters to a file.\n" +
//                "BufferedReader: reads text efficiently using buffering; also provides readLine() for reading lines.\n" +
//                "BufferedWriter: writes text efficiently using buffering.\n" +
//                "StringReader: reads characters from a string.\n" +
//                "StringWriter: writes characters into a string buffer.\n" +
//                "Use Byte Streams when working with binary data (images, audio, video, executable files) and use Character Streams when working with text data (characters, strings, text files).");
//        writer.close();
//
//
//        try(FileOutputStream fos=new FileOutputStream("output.txt")){
//            int data;
//            String str="Hello java";
//            fos.write(str.getBytes());
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }

        try(FileInputStream fis= new FileInputStream("D:\\\\JAVA\\\\src\\\\FileHandling\\\\pdf_1737626762211.pdf")){
            int data;
            while((data=fis.read())!=-1){
                System.out.print((char)data);
            }
        }catch (Exception ex){
            ex.printStackTrace();

        }
    }
}
