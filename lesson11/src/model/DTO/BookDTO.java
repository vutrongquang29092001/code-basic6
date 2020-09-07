/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DTO;

import java.util.UUID;

/**
 *
 * @author vutro
 */
public class BookDTO {

    String name;
    int price;
    int  id ;

    @Override
    public String toString() {
        return "BookDTO{" + "name=" + name + ", price=" + price + ", id=" + id + '}';
    }

    public String getName() {
        return name;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BookDTO(String name, int price,int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public BookDTO() {
    }
}
