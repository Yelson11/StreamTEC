/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Yelson
 */
public class PayCard {
    private int number;
    private String expiryDate;
    private int cvv;

    public PayCard(int number, String expiryDate, int cvv) {
        this.number = number;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }
    
    
}
