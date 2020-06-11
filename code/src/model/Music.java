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
public class Music extends MediaFile{

    public Music(String name, double price, String file) {
        super(name, price, file);
    }

    @Override
    public void play() {
        //Aquí mostramos todo
    }
    
}
