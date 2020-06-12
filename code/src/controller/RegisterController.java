/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.DataBase;
import view.WindowLogin;
import view.WindowQuestions;
import view.WindowRegister;

/**
 *
 * @author Yelson
 */
public class RegisterController implements ActionListener{
    private static RegisterController controller;
    private DataBase database;
    private WindowRegister window;
    
    private RegisterController(){
        window = new WindowRegister();
        database = DataBase.getInstance();
        
        //Inicia los botones de la UI y les agregar el action listener
        window.btnExit.addActionListener(this);
        window.btnQuestions.addActionListener(this);
        window.btnLogin.addActionListener(this);
        window.btnContinue1.addActionListener(this);
        window.rdBtnBasic.addActionListener(this);
        
    }
    
    //---------------------- Singleton Pattern ----------------------
    public static RegisterController getInstance(){
        if (controller == null){
            controller = new RegisterController();
        }
        return controller;
    }
    
    public void startWindow(){
        window.show();
    }
    
    // ---------------------- Métodos de UI ----------------------
    public void closeProgram(){
        System.exit(0);
    }
    
    public void logIn(){
        LoginController mainController = LoginController.getInstance();
        mainController.startWindow();
        window.hide();
    }
    
    public void register(){
    }
    
    public boolean validateTextAreas(){
        return true;
    }
    
    public void seeFrecuentQuestions(){
        WindowQuestions questions = new WindowQuestions();
        questions.show();
        window.hide();
    }

    //Invocamos el método de acuerdo al evento 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(window.btnExit)){
            closeProgram();
        }
        if(e.getSource().equals(window.btnLogin)){
            logIn();
        }
        if(e.getSource().equals(window.btnQuestions)){
            seeFrecuentQuestions();
        }
    }
            
}