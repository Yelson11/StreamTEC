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
public class BasicService extends Service{

    public BasicService() {
        price = 0;
    }
    
 
    @Override
    public ArrayList<IMediaStrategy> getMediaFromDB() {
        ArrayList<IMediaStrategy> mediaList = new ArrayList<>();
        ArrayList<IMediaStrategy> musicList = DataBase.getInstance().getMusicList();
        ArrayList<IMediaStrategy> videoList = DataBase.getInstance().getVideoList();
        musicList.stream().forEach((musicList1) -> {
            mediaList.add(musicList1);
        });
        videoList.stream().forEach((videoList1) -> {
            mediaList.add(videoList1);
        });
        return mediaList;
    }
}
