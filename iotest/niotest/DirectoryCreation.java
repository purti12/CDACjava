package iotest.niotest;
import java.nio.*;
import java.nio.file.*;
public class DirectoryCreation {
    public static void main(String[] args) {
        try{
            Path p=Paths.get("C:\\Users\\hp\\Desktop\\pu");
//            Path p1=Files.createDirectories(p);
            Path p1=Files.createFile(p);
            System.out.println("File created");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
