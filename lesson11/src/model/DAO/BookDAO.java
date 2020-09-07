/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import helper.DatabaseUtil.DatabaseUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.DTO.BookDTO;

/**
 *
 * @author vutro
 */
public class BookDAO {
    DatabaseUtil dbUtil = new DatabaseUtil();
    public ArrayList<BookDTO> getAllBook() throws SQLException {
        String sql ="Select * from Book";
        ArrayList<BookDTO> bookList = new ArrayList<>();
        ResultSet rs = dbUtil.executeQuery(sql);
        while(rs.next()){
            BookDTO temp = new BookDTO();
            temp.setId(rs.getInt("id"));
            temp.setName(rs.getString("name"));
            temp.setPrice(rs.getInt("price"));
            bookList.add(temp);
        }
     return bookList ;
    }
    public boolean addBook(BookDTO bookDTO)throws SQLException{
        String sql = "Insert into BookDTO values('"+ bookDTO.getName()+"','"+ bookDTO.getPrice() + "')";
        try {
            dbUtil.updateQuery(sql);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
        
    } 
    public boolean updateBook(BookDTO bookDTO)throws SQLException{
        String sql = "Update BookDTO"
                + " set name = "+bookDTO.getName()+", price = "+bookDTO.getPrice()
                +"Where id = " + bookDTO.getId() ;
        try {
            dbUtil.updateQuery(sql);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    public boolean deleteBook(int id)throws SQLException{
        String sql = "Delate from BookDTO"
                + "where id = "+ id;
        try {
            dbUtil.executeQuery(sql);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
   
    
}
