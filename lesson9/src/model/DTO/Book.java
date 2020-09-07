/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DTO;

/**
 *
 * @author vutro
 */
public class Book {

    String name;
    int price;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", price=" + price + '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Book() {
    }

}
