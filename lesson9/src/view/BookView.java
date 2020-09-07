/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Bookcontroller;


import java.util.ArrayList;
import java.util.Scanner;
import model.DTO.Book;

/**
 *
 * @author vutro
 */
public class BookView {
    Scanner sc = new Scanner(System.in);
    Bookcontroller bookcontroller = new Bookcontroller();

    public void execute() {
        while (true) {
            System.out.println("1.Show");
            System.out.println("2.Add");
            System.out.println("3.Delete");
            System.out.println("4.Update");
            System.out.println("0.Exit");
            int Inputid = sc.nextInt();
            sc.nextLine();
            switch (Inputid) {
                case 1:
                    ArrayList<Book> allBooks = bookcontroller.getAllBooks();
                    for (int i = 0; i < allBooks.size(); i++) {
                        System.out.println(allBooks.get(i).toString());

                    }
                    break;
                case 2:
                    System.out.println("nhap ten sach");
                    String name = sc.nextLine();
                    System.out.println("nhap gia");
                    int price = sc.nextInt();
                    sc.nextLine();
                    Book book = new Book(name, price);
                    boolean returnadd = bookcontroller.addBook(book);
                    if (returnadd) {
                        System.out.println("Success");
                    } else {
                        System.out.println("Fail");
                    }
                    break;

                case 3:
                    System.out.println("nhap ten xoa");
                    String deletename = sc.nextLine();
                    int delete = bookcontroller.deleteBook(deletename);
                    if (delete == 1) {
                        System.out.println("Success");
                    } else if (delete == 0) {
                        System.out.println("Book not found");
                    } else {
                        System.out.println("Fail");
                    }
                    break;
                case 4:
                    System.out.println("nhap ten can update");
                    String updatename = sc.nextLine();
                    String newname = sc.nextLine();
                    int newprice = sc.nextInt();
                    sc.nextLine();
                    Book book1 = new Book(newname, newprice);
                    boolean index = bookcontroller.updateBook(updatename, book1);
                    if (index) {
                        System.out.println("sucess");
                    } else {
                        System.out.println("fail");
                    }
                case 0:
                    // exist
                    break;
            }
        }
    }
}
