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
public class MusicService extends Service{

    public MusicService() {
        name = "Music";
        price = 10;
    }
    
    

    @Override
    public ArrayList<IMediaStrategy> getMediaFromDB() {
        ArrayList<IMediaStrategy> musicList = DataBase.getInstance().getMusicList();
        return musicList;
    }
}
