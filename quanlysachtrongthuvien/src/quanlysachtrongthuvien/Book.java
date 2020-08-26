/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysachtrongthuvien;

/**
 *
 * @author vutro
 */
public class Book {
   private String BookName;
   private String Price ;
   private  String KindOf ;
   private int NumberOfPages ;
       private  String origin;


    public Book() {
    }

    public Book(String BookName, String Price, String KindOf,  String origin,int NumberOfPages) {
        this.BookName = BookName;
        this.Price = Price;
        this.KindOf = KindOf;
        this.origin = origin ;
        this.NumberOfPages = NumberOfPages;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getKindOf() {
        return KindOf;
    }

    public void setKindOf(String KindOf) {
        this.KindOf = KindOf;
    }

    public int getNumberOfPages() {
        return NumberOfPages;
    }

    public void setNumberOfPages(int NumberOfPages) {
        this.NumberOfPages = NumberOfPages;
    }
    public void showIn4 (){
        System.out.println("tên sách:" + this.BookName );
          System.out.println("giá sách:"+this.Price);  
          System.out.println("xuất xứ:"+  this.origin);
            System.out.println("loại:"+ this.KindOf);  
            System.out.println("số trang:"+this.NumberOfPages );
          
    }
    @Override
    public String toString() {
        return "Book{" + "BookName=" + BookName + ", Price=" + Price + ", KindOf=" + KindOf + ", NumberOfPages=" + NumberOfPages + ", origin=" + origin + '}';
    }
}
