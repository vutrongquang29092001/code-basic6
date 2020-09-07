package controller;

import java.util.ArrayList;
import model.DAO.AuthorDAO;
import model.DTO.Author;

public class AuthorController {
      AuthorDAO dao;

    public AuthorController() {
        dao = new AuthorDAO();
    }

    public ArrayList<Author> getAllAuthor() {
        return dao.getAllAuthor();
    }
    public boolean addAuthor(Author author){
        return dao.addAuthor(author);
    }

    public boolean deleteAuthorBySTT(int stt) {
        return dao.deleteAuthorBySTT(stt);
    }
    public  boolean updateAuthorBySTT(int stt,Author author){
        return dao.updateBookBySTT(stt, author);
    }
}
