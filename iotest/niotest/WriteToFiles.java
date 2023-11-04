package iotest.niotest;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteToFiles {
    public static void main(String[] args) {
        try{
            Path path=Paths.get("C:\\Users\\hp\\Desktop\\pu\\pu.txt");
            
            String content="Soft Polynomials Pvt Ltd,Nagpur";
            //for(int i=0;i<10;i++)
                Files.write(path,content.getBytes(),StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Completed");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}