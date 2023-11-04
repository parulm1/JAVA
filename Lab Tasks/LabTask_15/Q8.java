//8.Implement the Serializable interface for the Book class, customizing the serialization
//process. Ensure that the isbn(International Standard Book Number)( attribute is
//encrypted when serialized and decrypted when deserialized.

package LabTask_15;

import java.io.*;

public class Q8 implements Serializable 
{
    private String title;
    private String author;
    private transient String isbn;

    public Q8(String title, String author, String isbn) 
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor() 
    {
        return author;
    }
    public String getIsbn()
    {
        return isbn;
    }
    public static void main(String[] args)
    {
        Q8 book = new Q8("Java Core & Advanced book", "Black Book", "1234567890");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("book.ser")))
        {
            outputStream.writeObject(book);
            System.out.println("Book serialized and saved to file.");
        } 
        catch (IOException e){}
        
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("book.ser"))) 
        {
            Q8 deserializedBook = (Q8) inputStream.readObject();
            System.out.println("Deserialized Book: ");
            System.out.println("Title: " + deserializedBook.getTitle());
            System.out.println("Author: " + deserializedBook.getAuthor());
            System.out.println("ISBN: " + deserializedBook.getIsbn());
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
}