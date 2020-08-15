/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeword.lesson6;

import java.util.Scanner;

/**
 *
 * @author vutro
 */
public class HomewordLesson6 {
public static Scanner sc = new Scanner(System.in);
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float a ,b ,c;
        System.out.println("nhap tọa dộ");
         a = sc.nextFloat();
         b = sc.nextFloat();
         c = sc.nextFloat();
        point toado = new point();
        point toado1 = new point(a,b,c);
        toado.setX(a);
        toado.setY(b);
        toado.setZ(c);
        System.out.println( toado.getX() +","+ toado.getY() + "," +toado.getX());
         toado1.infor();
    }
    
}
