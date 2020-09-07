/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.print.Book;
import java.util.ArrayList;
import model.DAO.BookDAO;
import model.DTO.BookDTO;

/**
 *
 * @author vutro
 */
public class BookController {
    private static final BookController INSTANCE 
             = new BookController();
    BookDAO bookDAO = new BookDAO();
    private BookController(){
        
    }
    public static BookController GetInstance(){
        return INSTANCE;
    }
    public ArrayList<BookDTO> getAllBook(){
        ArrayList<BookDTO> ListBook = new ArrayList<>();
        try {
            ListBook = bookDAO.getAllBook();
            
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            return ListBook;
        }
    }
    public boolean addBook(BookDTO bookDTO){
        try {
            return bookDAO.addBook(bookDTO);
        } catch (Exception e) {
            System.out.println(e);
        }
        return false ;
    }
    public boolean updateBook(BookDTO bookDTO){
        try {
            return bookDAO.updateBook(bookDTO);
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    public boolean deleteBook(int id){
        try {
            return bookDAO.deleteBook(id);
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
