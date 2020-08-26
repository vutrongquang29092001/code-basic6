/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysachtrongthuvien;

import java.util.ArrayList;
import java.util.Scanner;
import static quanlysachtrongthuvien.quanlisachtrongthuvien.kindOf;

/**
 *
 * @author vutro
 */
public class Bookmanagement {

    Scanner sc = new Scanner(System.in);

    public void show() {
        for (int i = 0; i < quanlisachtrongthuvien.thuviensach.size(); i++) {
            System.out.println(quanlisachtrongthuvien.thuviensach.get(i).getBookName());

        }
    }

    public boolean add(Book book) {
        try {
            quanlisachtrongthuvien.thuviensach.add(book);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public int Delete(String bookname) {
        Book book = new Book();
        boolean exist = false;
        for (int i = 0; i < quanlisachtrongthuvien.thuviensach.size(); i++) {
            if (quanlisachtrongthuvien.thuviensach.get(i).getBookName().equals(bookname)) {
                book = quanlisachtrongthuvien.thuviensach.get(i);
                exist = true;
            }
        }
        if (exist) { //co ton tai sach co ten la nameBook
            boolean response = quanlisachtrongthuvien.thuviensach.remove(book);

            if (response) {
                return 1; // ton tai sach, xoá thanh cong
            } else {
                return -1; // ton tai sach, xoa that
            }
        } else {
            return 0; // khong ton tai sach
        }
    }

    public boolean update(String bookname, Book book) {
        int indexOfBook = -1;
        for (int i = 0; i < quanlisachtrongthuvien.thuviensach.size(); i++) {
            if (quanlisachtrongthuvien.thuviensach.get(i).getBookName().equals(bookname)) {
                indexOfBook = i;
            }
        }
        if (indexOfBook == -1) {
            return false;
        } else {
            quanlisachtrongthuvien.thuviensach.set(indexOfBook, book);
            return true;
        }

    }

    public ArrayList<String> filterBook() {
        for (int i = 0; i < quanlisachtrongthuvien.thuviensach.size(); i++) {
            String currentBookType = quanlisachtrongthuvien.thuviensach.get(i).getKindOf();
            boolean isNewType = true;
            for (int j = 0; j < kindOf.size(); j++) {
                if (currentBookType.equals(kindOf.get(j))) {
                    isNewType = false;
                }
            }
            if (isNewType) {
                kindOf.add(currentBookType);
            }
        }
        return kindOf;
    }

    public int FindOfBook(String name) {
        Book book = new Book();
        int index = 1;
        for (int i = 0; i < quanlisachtrongthuvien.thuviensach.size(); i++) {
            if (quanlisachtrongthuvien.thuviensach.get(i).getBookName().equals(name)) {
                book = quanlisachtrongthuvien.thuviensach.get(i);
                index = i;
            } else {
                index = -1;
            }

        }

        return index;

    }

//    public int FindOfBook1(int price) {
//        Book book = new Book();
//        ArrayList<Book> library = new ArrayList<>();
//        int index = 1;
//        for (int i = 0; i < quanlisachtrongthuvien.thuviensach.size(); i++) {
//            if (quanlisachtrongthuvien.thuviensach.get(i).getPrice().equals(Integer.valueOf(price))) {
//                library.add(quanlisachtrongthuvien.thuviensach.get(i));
//
//            }
//
//        }
//    }
}
