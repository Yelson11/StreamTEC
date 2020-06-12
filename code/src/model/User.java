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

    //-------------------------- Getters and Setters --------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public IServiceStrategy getService() {
        return service;
    }

    public void setService(IServiceStrategy service) {
        this.service = service;
    }

    public ArrayList<IMediaStrategy> getPlayList() {
        return playList;
    }

    public void setPlayList(ArrayList<IMediaStrategy> playList) {
        this.playList = playList;
    }

    public PayCard getCard() {
        return card;
    }

    public void setCard(PayCard card) {
        this.card = card;
    }
    
    @Override
    public String toString(){
        String user = "";
        user += this.name + "\n";
        user += this.lastName;
        return user;
    }
    
}
