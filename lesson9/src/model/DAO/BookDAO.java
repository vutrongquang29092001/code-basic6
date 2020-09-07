/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.util.ArrayList;
import model.DTO.Book;

/**
 *
 * @author vutro
 */
public class BookDAO {

    ArrayList<Book> library = new ArrayList<>();

    public ArrayList<Book> getAllBooks() {
        return library;
    }

    public boolean addbook(final Book book) {
        try {
            library.add(book);
            return true;
        } catch (final Exception e) {
            return false;
        }
    }

    public int deletebook(final String bookname) {
        Book book = new Book();
        boolean exist = false;
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getName().equals(bookname)) {
                exist = true;
                book = library.get(i);
            }
        }
        if (exist) { // co ton tai sach co ten la nameBook
            final boolean response = library.remove(book);

            if (response) {
                return 1; // ton tai sach, xoá thanh cong
            } else {
                return -1; // ton tai sach, xoa that
            }

        } else {
            return 0;
        }

    }
    public boolean updatebook(final String bookname,final Book book) {

        int index = -1 ;
        for(int i = 0;i<library.size();i++){
            if(library.get(i).getName().equals(bookname)){
        index = i;
            }
        
        }
        if(index == -1){
            return false ;
        }else{
            library.set(index,book);
            return true ;
        }
            }

    
}
