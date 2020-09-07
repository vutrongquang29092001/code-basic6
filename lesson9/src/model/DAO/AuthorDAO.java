package model.DAO;

import java.util.ArrayList;
import model.DTO.Author;

public class AuthorDAO {
    ArrayList<Author> listAuthors = new ArrayList<>();

    public AuthorDAO() {

    }

    public ArrayList<Author> getAllAuthor() {
        return listAuthors;
    }

    public boolean addAuthor(Author author) {
        return listAuthors.add(author);
    }

    public boolean deleteAuthorBySTT(int stt) {
        try {
            listAuthors.remove(stt);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }
    public boolean updateBookBySTT(int stt,Author author){
        try {
            listAuthors.set(stt, author);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

}
