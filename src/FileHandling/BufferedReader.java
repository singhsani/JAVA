package FileHandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedReader {
    public static void main(String[] args) throws IOException {
        FileInputStream bfs=new FileInputStream("D:\\JAVA\\src\\FileHandling\\pdf_1737626762211.pdf");
        byte[] buffer = new byte[8192]; // 8KB buffer
        int bytesRead;
        while((bytesRead=bfs.read(buffer))!=-1){
            String str=new String(buffer,0,bytesRead);
            System.out.println(str);
        }
    }
}
