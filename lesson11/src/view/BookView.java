/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.BookController;
import java.util.ArrayList;
import java.util.Scanner;
import model.DTO.BookDTO;

/**
 *
 * @author vutro
 */
public class BookView {

    BookController bookController = BookController.GetInstance();
    Scanner sc = new Scanner(System.in);
    ArrayList<BookDTO> getallbook = bookController.getAllBook();

    public void execute() {
        while (true) {
            boolean response;
            System.out.println("1.Show");
            System.out.println("2.Add");
            System.out.println("3.Delete");
            System.out.println("4.Update");
            System.out.println("0.Exit");
            int input = sc.nextInt();
            switch (input) {
                case 1:

                    for (int i = 0; i < getallbook.size(); i++) {
                        System.out.println(getallbook.get(i).toString());
                    }
                    break;
                case 2:
                    System.out.println("nhap ten sach");
                    String name = sc.nextLine();
                    System.out.println("nhap id");
                    int id = sc.nextInt();
                    System.out.println("nhap gia");
                    int price = sc.nextInt();
                    BookDTO bookDTO = new BookDTO(name, price, id);
                    response = bookController.addBook(bookDTO);
                    if (response) {
                        System.out.println("success");
                    } else {
                        System.out.println("fail");
                    }
                    break;
                case 3:
                    System.out.println("nhap id");
                    int idDelete = sc.nextInt();
                    response = bookController.deleteBook(idDelete);
                    if (response) {
                        System.out.println("success");
                    } else {
                        System.out.println("fail");
                    }
                    break;

                case 4:
                    System.out.println("nhap id");
                    int idUpdate = sc.nextInt();
                    System.out.println("nhap ten sach moi");
                    String Updatename = sc.nextLine();

                    System.out.println("nhap gia moi ");
                    int priceUpdate = sc.nextInt();
                    BookDTO bookDTOUpdate = new BookDTO(Updatename, priceUpdate, idUpdate);
                    response = bookController.updateBook(bookDTOUpdate);
                    if (response) {
                        System.out.println("success");
                    } else {
                        System.out.println("fail");
                    }
                    break;
                case 0:
                    break;
            }

        }
    }
}
