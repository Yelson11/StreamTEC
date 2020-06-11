/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Yelson
 */
public class User {
    private String name;
    private String lastName;
    private String email;
    private String password;
    private Date birthDate;
    private IServiceStrategy service;
    private ArrayList<IMediaStrategy> playList;
    private PayCard card;

    public User(String pName, String pLastName, String pEmail, String pPassword, Date pBirthDate, IServiceStrategy pService, PayCard pCard) {
        name = pName;
        lastName = pLastName;
        email = pEmail;
        password = pPassword;
        birthDate = pBirthDate;
        service = pService;
        card = pCard;
        playList = new ArrayList<>();
    }
    
    public void addMediaFileToPlayList(IMediaStrategy pMedia){
        playList.add(pMedia);
    } 
    
}
