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
public class ServiceFactory {
    public static IServiceStrategy getService(String pType){
        switch(pType){
            case "Music":
                return new MusicService();
            case "Video":
                return new VideoService();
            case "Premium":
                return new PremiumService();
            case "Basic":
                return new BasicService();
            default:
                return new BasicService();
        }
    }
}
