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
public class VideoService extends Service{

    public VideoService() {
        name = "Video";
        price = 13;
    }
    
    
        
    @Override
    public ArrayList<IMediaStrategy> getMediaFromDB() {
        ArrayList<IMediaStrategy> videoList = DataBase.getInstance().getVideoList();
        return videoList;
    }
    
}
