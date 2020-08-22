/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quản.lí.sách.trong.thư.viện;

import java.util.ArrayList;
import java.util.Scanner;
import static quản.lí.sách.trong.thư.viện.QuảnLíSáchTrongThưViện.type;

/**
 *
 * @author vutro
 */
public class Bookmanagement {

    Scanner sc = new Scanner(System.in);

    public void show() {
        for (int i = 0; i < QuảnLíSáchTrongThưViện.thuviensach.size(); i++) {
            System.out.println(QuảnLíSáchTrongThưViện.thuviensach.get(i).getBookName());

        }
    }

    public boolean add(Book book) {
        try {
            QuảnLíSáchTrongThưViện.thuviensach.add(book);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public int Delete(String bookname) {
        Book book = new Book();
        boolean exist = false;
        for (int i = 0; i < QuảnLíSáchTrongThưViện.thuviensach.size(); i++) {
            if (QuảnLíSáchTrongThưViện.thuviensach.get(i).getBookName().equals(bookname)) {
                book = QuảnLíSáchTrongThưViện.thuviensach.get(i);
                exist = true;
            }
        }
        if (exist) { //co ton tai sach co ten la nameBook
            boolean response = QuảnLíSáchTrongThưViện.thuviensach.remove(book);

            if (response) {
                return 1; // ton tai sach, xoá thanh cong
            } else {
                return -1; // ton tai sach, xoa that
            }else {
            return 0; // khong ton tai sach
       
            }
        }
    }
    

    public boolean update(String bookname, Book book) {
  int indexOfBook = -1;
        for (int i = 0; i < QuảnLíSáchTrongThưViện.thuviensach.size(); i++) {
            if (QuảnLíSáchTrongThưViện.thuviensach.get(i).getBookName().equals(bookname)) {
                indexOfBook = i;
            }
        }
        if (indexOfBook == -1) {
            return false;
        } else {
            QuảnLíSáchTrongThưViện.thuviensach.set(indexOfBook, book);
            return true;
        }
    
 
    }
 public ArrayList<String> filterBook() {
        for (int i = 0; i < QuảnLíSáchTrongThưViện.thuviensach.size(); i++) {
            String currentBookType = QuảnLíSáchTrongThưViện.thuviensach.get(i).getKindOf();
            boolean isNewType = true;
            for (int j = 0; j < type.size(); j++) {
                if (currentBookType.equals(type.get(j))) {
                    isNewType = false;
                }
            }
            if (isNewType) {
                type.add(currentBookType);
            }
        }
        return type;
    }

}