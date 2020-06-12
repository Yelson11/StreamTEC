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
public class DataBase {
    
    private ArrayList<User> userList;
    private ArrayList<IMediaStrategy> musicList;
    private ArrayList<IMediaStrategy> videoList;
    
    //---------------------------- Singleton Pattern ---------------------------
    private static DataBase database;
    
    private DataBase(){
        userList = new ArrayList<>();
        musicList= new ArrayList<>();
        videoList= new ArrayList<>();
    }
    
    public static DataBase getInstance(){
        if (database == null){
            database = new DataBase();
        }
        return database;
    }
    //---------------------------- Singleton Pattern ---------------------------

    public ArrayList<User> getUserList() {
        return userList;
    }

    public ArrayList<IMediaStrategy> getMusicList() {
        return musicList;
    }

    public ArrayList<IMediaStrategy> getVideoList() {
        return videoList;
    }
}
