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
import view.WindowLogin;
import model.User;

/**
 *
 * @author Yelson
 */
public class LoginController implements ActionListener{
    private static LoginController controller;
    private DataBase database;
    private WindowLogin windowLogin;
    
    private LoginController(){
        windowLogin = new WindowLogin();
        database = DataBase.getInstance();
        
        //Inicia los botones de la UI y les agregar el action listener
        windowLogin.btnExit.addActionListener(this);
        windowLogin.btnLogin.addActionListener(this);
        windowLogin.btnRegister.addActionListener(this);
    }
    
    //---------------------- Singleton Pattern ----------------------
    public static LoginController getInstance(){
        if (controller == null){
            controller = new LoginController();
        }
        return controller;
    }
    
    public void startWindow(){
        windowLogin.show();
    }
    
    // ---------------------- Métodos de UI ----------------------
    public void closeProgram(){
        System.exit(0);
    }
    
    public void logIn(){
        if(validateTextAreas() == true){
            if(validateUser(windowLogin.txtEmail.getText(), windowLogin.txtPassword.getText())){
                MainController  mainControl = MainController.getInstance();
                mainControl.setCurrentUser(getUserFromDB(windowLogin.txtEmail.getText(), windowLogin.txtPassword.getText()));
                mainControl.startWindow();
                windowLogin.hide();
            }
            else{
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña Equivocada", "", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Por Favor Ingrese Todos Los Datos", "", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void register(){
        RegisterController registerControl = RegisterController.getInstance();
        registerControl.startWindow();
        windowLogin.hide();
    }
    
    public boolean validateTextAreas(){
        if(windowLogin.txtEmail.getText().equals("") || windowLogin.txtPassword.getText().equals("")){
            return false;
        }
        return true;
    }
    
    public boolean validateUser(String pEmail, String pPassword){
        ArrayList<User> userList = database.getUserList();
        for (int i = 0; i < userList.size(); i++){
            User user = userList.get(i);
            if(user.getEmail().equals(pEmail) && user.getPassword().equals(pPassword)){
                return true;
            }
        }
        return false;
    }
    
    public User getUserFromDB(String pEmail, String pPassword){
        ArrayList<User> userList = database.getUserList();
        for (int i = 0; i < userList.size(); i++){
            User user = userList.get(i);
            if(user.getEmail().equals(pEmail) && user.getPassword().equals(pPassword)){
                return user;
            }
        }
        return null;
    }
    public void cleanWindow(){
        windowLogin.txtEmail.setText("");
        windowLogin.txtPassword.setText("");
    }

    
    //Invocamos el método de acuerdo al evento 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(windowLogin.btnExit)){
            closeProgram();
        }
        if(e.getSource().equals(windowLogin.btnLogin)){
            logIn();
            cleanWindow();
        }
        if(e.getSource().equals(windowLogin.btnRegister)){
            register();
            cleanWindow();
        }
    }
            
}
