/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iodemo;


import java.awt.print.Book;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestDeserialization implements Serializable {
    private String title;
    private String author;
    private transient String isbn;

    public TestDeserialization(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
    public static void main(String[] args) {
        TestDeserialization book = new TestDeserialization("Java Core & Advanced book", "Black Book", "1234567890");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("book.ser"))) {
            outputStream.writeObject(book);
            System.out.println("Book serialized and saved to file.");
        } catch (IOException e) {
            
        }
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("book.ser"))) {
            TestDeserialization deserializedBook = (TestDeserialization) inputStream.readObject();
            System.out.println("Deserialized Book: ");
            System.out.println("Title: " + deserializedBook.getTitle());
            System.out.println("Author: " + deserializedBook.getAuthor());
            System.out.println("ISBN: " + deserializedBook.getIsbn());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }}}