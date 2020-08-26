/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysachtrongthuvien;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vutro
 */
public class quanlisachtrongthuvien {

    public static ArrayList<Book> thuviensach = new ArrayList<Book>();
    public static ArrayList<String> kindOf = new ArrayList<String>();
    public static ArrayList<File> fileBook = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Bookmanagement bookmanagement = new Bookmanagement();
//        while (true) {
//            System.out.println("1.Show");
//            System.out.println("2.Add");
//            System.out.println("3.Delete");
//            System.out.println("4.Update");
//            System.out.println("5.Show types book");
//            System.out.println("6.find of book");
//            System.out.println("0.Exit");
//            int Inputid = sc.nextInt();
//            sc.nextLine();
//        
//        switch (Inputid) {
//            case 1:
//                bookmanagement.show();
//                break;
//            case 2:
//                System.out.println("BookName:");
//                String bookname = sc.nextLine();
//                System.out.println("Origin:");
//                String origin = sc.nextLine();
//                System.out.println("kindOf:");
//                String kindOf = sc.nextLine();
//                System.out.println("Price:");
//                String Price = sc.nextLine();
//                System.out.println("NumberOfPage:");
//                int numberOfPage = sc.nextInt();
//                sc.nextLine();
//                Book book = new Book(bookname, Price, kindOf, origin, numberOfPage);
//                boolean returnadd = bookmanagement.add(book);
//                if (returnadd) {
//                    System.out.println("Success");
//                } else {
//                    System.out.println("Fail");
//                }
//                break;
//            case 3:
//                System.out.println("nhap tên sach can xoa");
//                String Bookname = sc.nextLine();
//                int delete = bookmanagement.Delete(Bookname);
//                if (delete == 1) {
//                    System.out.println("Success");
//                } else if (delete == 0) {
//                    System.out.println("Book not found");
//                } else {
//                    System.out.println("Fail");
//                }
//                break;
//            case 4:
//                System.out.println("nhap ten sach can cap nhap");
//                String updatebook = sc.nextLine();
//                for (int i = 0; i < thuviensach.size(); i++) {
//                    if (thuviensach.get(i).getBookName().equalsIgnoreCase(updatebook)) {
//                        System.out.println("BookName:");
//                        String updatename = sc.nextLine();
//                        System.out.println("Origin:");
//                        String updateorigin = sc.nextLine();
//                        System.out.println("kindOf:");
//                        String updatekindOf = sc.nextLine();
//                        System.out.println("Price:");
//                        String updatePrice = sc.nextLine();
//                        System.out.println("NumberOfPage:");
//                        int updatenumberOfPage = sc.nextInt();
//                        sc.nextLine();
//                        Book book1 = new Book(updatename, updatePrice, updatekindOf, updateorigin, updatenumberOfPage);
//                        bookmanagement.update(updatename, book1);
//                    }
//
//                }
//                break;
//            case 5:
//                ArrayList<String> kindof = bookmanagement.filterBook();
//                for (int i = 0; i < kindof.size(); i++) {
//                    System.out.println(kindof.get(i));
//                }
//                break;
//            case 6:
//                System.out.println("nhap ten sach tim kiem");
//                String nameFindofbook = sc.nextLine();
//              int index = bookmanagement.FindOfBook(nameFindofbook);
//              if(index>-1){
//                  System.out.println("sach ton tai ");
//                  thuviensach.get(index).showIn4();
//              }else{
//                  System.out.println("sach ko ton tai");
//              }
//               
//        }
//
//    }
        BookManagementFile bookmanagementfile = new BookManagementFile();
        String createfolder = bookmanagementfile.Createfolder();
        while (true) {

            System.out.println("1.Show");
            System.out.println("2.createfile");
            System.out.println("3.filewriter");
            System.out.println("4.filereader");
            System.out.println("5.filedelete");
            System.out.println("6.find of book");
            System.out.println("0.Exit");
            int Inputid = sc.nextInt();
            sc.nextLine();
            switch (Inputid) {
                case 1:
                    break;
                case 2:
                    System.out.println("BookName:");
                    String bookname = sc.nextLine();
                    bookmanagementfile.CreateFile(bookname, createfolder);
                    break ;
                case 3:
                    System.out.println("BookName:");
                    String bookname1 = sc.nextLine();
                    System.out.println("Origin:");
                    String origin = sc.nextLine();
                    System.out.println("kindOf:");
                    String kindOf = sc.nextLine();
                    System.out.println("Price:");
                    String Price = sc.nextLine();
                    System.out.println("NumberOfPage:");
                    int numberOfPage = sc.nextInt();
                    sc.nextLine();
                    Book book = new Book(bookname1, Price, kindOf, origin, numberOfPage);
                    int e = bookmanagementfile.ExistFile(bookname1);
                   boolean index =  bookmanagementfile.FileWrite(fileBook.get(e), book);
                    if (index) {
                        System.out.println("sucess");
                    } else {
                        System.out.println("fail");
                    }
 
                   break;
                case 4:
                    System.out.println("namefile");
                    String namefile = sc.nextLine();
                    int a = bookmanagementfile.ExistFile(namefile);
                    bookmanagementfile.FileRead(fileBook.get(a));
                    break ;
                case 5:
                    System.out.println("name file delete");
                    String namedelete = sc.nextLine();
                  boolean indexdelete =  bookmanagementfile.FileDelete(namedelete);
                    if (indexdelete) {
                        System.out.println("sucess");
                    } else {
                        System.out.println("fail");
                    }
            }
        }

    }
}
