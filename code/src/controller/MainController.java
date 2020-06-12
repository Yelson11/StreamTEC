/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.DataBase;
import model.IMediaStrategy;
import model.User;
import view.WindowPrincipal;

/**
 *
 * @author Yelson
 */
public class MainController implements ActionListener{
    private static MainController controller;
    private DataBase database;
    private WindowPrincipal window;
    private User currentUser;
    
    private MainController(){
        window = new WindowPrincipal();
        database = DataBase.getInstance();
        
        //Inicia los botones de la UI y les agregar el action listener
    }
    
    //---------------------- Singleton Pattern ----------------------
    public static MainController getInstance(){
        if (controller == null){
            controller = new MainController();
        }
        return controller;
    }
    
    public void startWindow(){
        window.show();
        printUserOptions();
    }
    
    // ---------------------- Métodos de UI ----------------------
    public void closeProgram(){
        System.exit(0);
    }
    
    public void printUserOptions(){
        ArrayList<IMediaStrategy> mediaList = new ArrayList<>();
        mediaList = currentUser.getService().getMediaFromDB();
        for(int i = 0; i < mediaList.size(); i++){
            System.out.println(mediaList.get(i).getName());
        }
    }

    
    //Invocamos el método de acuerdo al evento 
    @Override
    public void actionPerformed(ActionEvent e) {
    }
            
    //Getters And Setters

    public DataBase getDatabase() {
        return database;
    }

    public void setDatabase(DataBase database) {
        this.database = database;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
    
}