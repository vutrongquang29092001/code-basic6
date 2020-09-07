/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.DAO.BookDAO;
import model.DTO.Book;

/**
 *
 * @author vutro
 */
public class Bookcontroller {
    BookDAO bookDAO = new BookDAO();
    

      
   
    public ArrayList<Book> getAllBooks(){
       return bookDAO.getAllBooks();
    }
public boolean addBook(Book book){
   
    return bookDAO.addbook(book);
}
    public int deleteBook(String bookname){
        return bookDAO.deletebook(bookname);
    }
    public boolean updateBook(String bookname,Book book){
        return bookDAO.updatebook(bookname, book);
    }
}
