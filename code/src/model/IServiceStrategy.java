/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Yelson
 */
public interface IServiceStrategy {
    public ArrayList<IMediaStrategy> getMediaFromDB();
    public String getName();
    public double getPrice();
}
