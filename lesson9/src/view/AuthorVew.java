package view;

import controller.AuthorController;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import model.DTO.Author;

public class AuthorVew {
      AuthorController authorController = new AuthorController();
    Scanner sc = new Scanner(System.in);

    public void execute() {
        while (true) {
            System.out.println("1.Show Author");
            System.out.println("2.Add Author");
            System.out.println("3.Delete Author");
            System.out.println("4.Update Author");
            System.out.println("0.Exit");
            int inputUser = sc.nextInt();
            sc.nextLine();
            boolean response;
            switch (inputUser) {
                case 1:
                    ArrayList<Author> allBooks = authorController.getAllAuthor();
                    for (int i = 0; i < allBooks.size(); i++) {
                        System.out.println(
                                "STT " + i + ":"
                                + allBooks.get(i).toString());
                    }
                    break;
                case 2:
                    System.out.println("Nhap ten");
                    String name = sc.nextLine();
                    System.out.println("Nhap tuoi:");
                    int age = sc.nextInt();
                    System.out.println("Nhap ngay sinh:");
                    int date = sc.nextInt();
                    System.out.println("Nhap thang sinh:");
                    int month = sc.nextInt();
                    System.out.println("Nhap nam sinh:");
                    int year = sc.nextInt();
                    sc.nextLine();
                    Date birthday = new Date(year - 1900, month - 1, date);

                    Author author = new Author();
                    author.setName(name);
                    author.setAge(age);
                    author.setBirthday(birthday);
                    response = authorController.addAuthor(author);
                    if (response) {
                        System.out.println("success");
                    } else {
                        System.out.println("fail");
                    }
                    break;
                case 3:
                    System.out.println("Nhap vao STT muon xoa: ");
                    try {
                        int stt = sc.nextInt();
                        response = authorController.deleteAuthorBySTT(stt);
                    } catch (Exception e) {
                        System.out.println("STT phai la so nguyen");
                    } finally {

                    }
                    break;
                case 4:
                    System.out.println("nhap stt muon update");
                    try {
                        int stt = sc.nextInt();
                        System.out.println("Nhap ten");
                        String updatename = sc.nextLine();
                        System.out.println("Nhap tuoi:");
                        int updateage = sc.nextInt();
                        System.out.println("Nhap ngay sinh:");
                        int updatedate = sc.nextInt();
                        System.out.println("Nhap thang sinh:");
                        int updatemonth = sc.nextInt();
                        System.out.println("Nhap nam sinh:");
                        int updateyear = sc.nextInt();
                        sc.nextLine();
                        Date updatebirthday = new Date( updateyear - 1900,  updatemonth - 1,  updatedate);

                        Author updateauthor = new Author();
                        updateauthor.setName(updatename);
                        updateauthor.setAge(updateage);
                        updateauthor.setBirthday(updatebirthday);
                        response = authorController.updateAuthorBySTT(stt, updateauthor);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                default:
                    return;
            }
        }

    }
}
