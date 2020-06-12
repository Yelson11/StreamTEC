/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Yelson
 */
public abstract class MediaFile implements IMediaStrategy{
    String name;
    double price;
    String file;

    public MediaFile(String name, double price, String file) {
        this.name = name;
        this.price = price;
        this.file = file;
    }

    public String getName() {
        return name;
    }
    
    public double getPrice(){
        return price;
    }
    
}
