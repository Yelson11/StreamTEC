/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamtec;

import controller.LoginController;
import model.DataBase;
import model.User;

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
        //------------- Usuario 1: Yelson - VIP -------------
        User user1 = new User("Yelson", "Monge", "yelsonmonge@gmail.com", "1234", null, null, null);
        DataBase database = DataBase.getInstance();
        database.getUserList().add(user1);
        
        //Creamos todos los objetos necesarios para ejecutar el programa
        LoginController controller = LoginController.getInstance();
        controller.startWindow();
    }
    
}
