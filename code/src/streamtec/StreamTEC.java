/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamtec;

import controller.LoginController;
import model.DataBase;
import model.Music;
import model.ServiceFactory;
import model.User;
import model.Video;

/**
 *
 * @author Yelson
 */
public class StreamTEC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Primero creamos datos en memoria
        //Iniciamos la base de datos
        DataBase database = DataBase.getInstance();
        
        //Vamos a crear unas canciones
        Music song1 = new Music("Lose Yourself - Eminem", 5.2, "");
        Music song2 = new Music("Mockingbird - Eminem", 4.2, "");
        Music song3 = new Music("Bohemian Rapsody - Queen", 7, "");
        Music song4 = new Music("La Cosa Nostra - Blon", 3, "");
        Music song5 = new Music("Don't Stop Me Now - Queen", 8, "");
        Music song6 = new Music("Mentiras y Azar - Walls", 2, "");
        
        //Y ahora unos videos
        Video video1 = new Video("Chuty vs Nitro", 5.5, "UB");
        Video video2 = new Video("GOAT Messi", 10, "MagicalMessi");
        Video video3 = new Video("SpaceX Launch", 15, "NASA");
        Video video4 = new Video("Draw My Life - Lebron James", 5, "DML");
        Video video5 = new Video("Athletistics Trailer", 1, "YM");
        
        //Los insertamos en la base de datos
        database.getMusicList().add(song1);
        database.getMusicList().add(song2);
        database.getMusicList().add(song3);
        database.getMusicList().add(song4);
        database.getMusicList().add(song5);
        database.getMusicList().add(song6);
        
        database.getVideoList().add(video1);
        database.getVideoList().add(video2);
        database.getVideoList().add(video3);
        database.getVideoList().add(video4);
        database.getVideoList().add(video5);
        
        /*
        System.out.println("Música:");
        for(int i = 0; i < database.getMusicList().size(); i++){
            System.out.println(database.getMusicList().get(i).getName());
        }
        
        System.out.println("Videos:");
        for(int i = 0; i < database.getVideoList().size(); i++){
            System.out.println(database.getVideoList().get(i).getName());
        }
        */
        
        //------------- Usuario 1: Yelson - VIP -------------
        User user = new User("Mario", "Mendez", "musica@gmail.com", "1234", null, ServiceFactory.getService("Music"), null);
        User user2 = new User("Victor", "Viquez", "video@gmail.com", "1234", null, ServiceFactory.getService("Video"), null);
        User user3 = new User("Brenda", "Borges", "basic@gmail.com", "1234", null, ServiceFactory.getService("Basic"), null);
        User user1 = new User("Yelson", "Monge", "yelsonmonge@gmail.com", "1234", null, ServiceFactory.getService("Premium"), null);
        database.getUserList().add(user);
        database.getUserList().add(user1);
        database.getUserList().add(user2);
        database.getUserList().add(user3);
        
        
        //Creamos todos los objetos necesarios para ejecutar el programa
        LoginController controller = LoginController.getInstance();
        controller.startWindow();
    }
    
}
