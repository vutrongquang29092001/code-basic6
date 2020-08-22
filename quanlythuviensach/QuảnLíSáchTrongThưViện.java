/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quản.lí.sách.trong.thư.viện;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vutro
 */
public class QuảnLíSáchTrongThưViện {

    public static ArrayList<Book> thuviensach = new ArrayList<Book>();
    public static ArrayList<String> type = new ArrayList<String>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bookmanagement bookmanagement = new Bookmanagement();
        while (true) {
            System.out.println("1.Show");
            System.out.println("2.Add");
            System.out.println("3.Delete");
            System.out.println("4.Update");
            System.out.println("5.Show types book");
            System.out.println("0.Exit");
            int Inputid = sc.nextInt();
            sc.nextLine();
        }
        switch (Inputid) {
            case 1:
                bookmanagement.show();
                break;
            case 2:
                System.out.println("BookName:");
                String bookname = sc.nextLine();
                System.out.println("Origin:");
                String origin = sc.nextLine();
                System.out.println("kindOf:");
                String kindOf = sc.nextLine();
                System.out.println("Price:");
                String Price = sc.nextLine();
                System.out.println("NumberOfPage:");
                int numberOfPage = sc.nextInt();
                sc.nextLine();
                Book book = new Book(bookname, Price, kindOf, origin, numberOfPage);
                boolean returnadd = bookmanagement.add(book);
                if (returnadd) {
                    System.out.println("Success");
                } else {
                    System.out.println("Fail");
                }
                break;
            case 3:
                System.out.println("nhap tên sach can xoa");
                String Bookname = sc.nextLine();
                int delete = bookmanagement.Delete(Bookname);
                if (delete == 1) {
                    System.out.println("Success");
                } else if (delete == 0) {
                    System.out.println("Book not found");
                } else {
                    System.out.println("Fail");
                }
                break;
            case 4:
                System.out.println("nhap ten sach can cap nhap");
                String updatebook = sc.nextLine();
                for (int i = 0; i < thuviensach.size(); i++) {
                    if(thuviensach.get(i).getBookName().equalsIgnoreCase(updatebook)){
                        System.out.println("BookName:");
                String updatename = sc.nextLine();
                System.out.println("Origin:");
                String updateorigin = sc.nextLine();
                System.out.println("kindOf:");
                String updatekindOf = sc.nextLine();
                System.out.println("Price:");
                String updatePrice = sc.nextLine();
                System.out.println("NumberOfPage:");
                int updatenumberOfPage = sc.nextInt();
                sc.nextLine();
                Book book1 = new Book(updatename, updatePrice, updatekindOf, updateorigin, updatenumberOfPage); 
                bookmanagement.update(updatename, book1);
                    }
                    
                }
                break;
  case 5:
                    ArrayList<String> types = bookmanagement.filterBook();
                    for (int i = 0; i < types.size(); i++) {
                        System.out.println(types.get(i));
                    }
                    break;
        }

    }
}
