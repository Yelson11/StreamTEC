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
public class VIPService extends Service{

    public VIPService() {
        price = 15;
    }

    @Override
    public ArrayList<IMediaStrategy> getMediaFromDB() {
        ArrayList<IMediaStrategy> mediaList = new ArrayList<>();
        ArrayList<IMediaStrategy> musicList = DataBase.getInstance().getMusicList();
        ArrayList<IMediaStrategy> videoList = DataBase.getInstance().getVideoList();
        for(int i = 0; i < musicList.size(); i++){
            mediaList.add(musicList.get(i));
        }
        
        for(int i = 0; i < videoList.size(); i++){
            mediaList.add(videoList.get(i));
        }
        
        return mediaList;
    }
    
}
