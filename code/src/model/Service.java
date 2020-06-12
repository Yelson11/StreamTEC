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
public abstract class Service implements IServiceStrategy{
    protected String name;
    protected double price;
    
    @Override
    public String getName(){
        return name;
    };
    
    @Override
    public double getPrice(){
        return price;
    }
}
