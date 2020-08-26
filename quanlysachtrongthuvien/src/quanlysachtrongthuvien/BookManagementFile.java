/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysachtrongthuvien;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author vutro
 */
public class BookManagementFile {

    public String Createfolder() {
        File folder = new File("quanlisachtrongthuvien");
        folder.mkdir();
        return folder.getPath();

    }

    public boolean CreateFile(String name, String URL) {
        boolean isCreat = false;
        try {

            File file = new File(URL + "\\" + name);
            isCreat = file.createNewFile();
            if (isCreat) {
                quanlisachtrongthuvien.fileBook.add(file);
                System.out.print("Da tao file thanh cong!");
            } else {
                System.out.print("Tao file that bai");
            }

        } catch (Exception e) {
            System.out.print(e);
        } 
        return isCreat;
    }

    public int ExistFile(String namefile) {
        boolean EInA = true;
        boolean EInF = true;
        int e = 0;
        for (int i = 0; i < quanlisachtrongthuvien.fileBook.size(); i++) {
            EInA = quanlisachtrongthuvien.fileBook.get(i).getName().equals(namefile);
            EInF = quanlisachtrongthuvien.fileBook.get(i).exists();
            if (EInA && EInF) {
                System.out.println("file exist");
                e = i;

            } else {
                System.out.println("file not exist");
            }
            if (EInA == true && EInF == false) {
                System.out.println("file not exist in Array");
            } else {
                System.out.println("file not exist in Computer");
            }
        }

        return e;
    }

    public boolean FileWrite(File file, Book book) throws IOException {
        try {

            FileWriter fw = new FileWriter(file);
            fw.write(book.toString());
            fw.close();
            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean FileRead(File file) throws FileNotFoundException {
        boolean b = false;
        try {

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while ((br.readLine()) != null) {
                b = true;
            }
            fr.close();
            br.close();
        } catch (Exception e) {
            System.out.println(e);

        }
        return b;
    }

    public boolean FileDelete(String filedeletename) {
        boolean EInA = true;
        boolean EInF = true;
        boolean filedelete = false;
        for (int i = 0; i < quanlisachtrongthuvien.fileBook.size(); i++) {
            EInA = quanlisachtrongthuvien.fileBook.get(i).getName().equals(filedeletename);
            EInF = quanlisachtrongthuvien.fileBook.get(i).exists();
            if (EInA && EInF) {
                quanlisachtrongthuvien.fileBook.remove(i);
                quanlisachtrongthuvien.fileBook.get(i).delete();
                filedelete = true;

            }

        }
        return filedelete;
    }

}
