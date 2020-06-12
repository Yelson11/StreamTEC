/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import model.DataBase;
import model.IServiceStrategy;
import model.PayCard;
import model.ServiceFactory;
import model.User;
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
        window.btnLogin.addActionListener(this);
        window.btnQuestions.addActionListener(this);
        window.btnContinue1.addActionListener(this);
        window.rdBtnBasic.addActionListener(this);
        window.rdBtnPremium.addActionListener(this);
        window.rdBtnMusic.addActionListener(this);
        window.rdBtnVideo.addActionListener(this);
        window.btnBack2.addActionListener(this);
        window.btnContinue2.addActionListener(this);
        window.btnBack3.addActionListener(this);
        window.btnContinue3.addActionListener(this);
        
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
    
    public void frequentQuestions(){
        WindowQuestions wq = new WindowQuestions();
        wq.show();
    }
    
    //Métodos para validar todos los campos de la UI
    
    //Valida que la contraseña y su confirmación sean lo mismo
    public boolean validatePassword(){
        if(window.txtPassword.getText().equals(window.txtConfirmPassword.getText())){
            return true;
        }
        return false;
    }
    public boolean validateStepOne(){
        if(window.txtName.getText().equals("") || window.txtLastName.getText().equals("") || window.txtEmail.getText().equals("") || window.txtPassword.getText().equals("") || window.txtConfirmPassword.getText().equals("") || window.jDateChooser.getDate() == null){
            return false;
        }
        return true;
    }    
    
    public boolean validateStepThree(){
        if(window.txtCardNumber.getText().equals("") || window.txtCVV.getText().equals("")){
            return false;
        }
        try {
            Integer.parseInt(window.txtCardNumber.getText());
            Integer.parseInt(window.txtCVV.getText());
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    //Metodos de los botones de continuar
    public void continueStepOne(){
        if(validateStepOne()){
            if (validatePassword()){
                window.jTabbedPane.setSelectedIndex(1);
                window.jTabbedPane.setEnabledAt(0, false);
                window.jTabbedPane.setEnabledAt(1, true);
            }else{
                JOptionPane.showMessageDialog(null, "Las contraseñas deben coincidir", "", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Por Favor Ingrese Todos Los Datos", "", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void continueStepTwo(){
        window.jTabbedPane.setSelectedIndex(2);
        window.jTabbedPane.setEnabledAt(1, false);
        window.jTabbedPane.setEnabledAt(2, true);
    }
    
    public void continueStepThree(){
        if(validateStepThree()){
            User user = createUser();
            database.getUserList().add(user);
            JOptionPane.showMessageDialog(null, "Usuario Registrado Correctamente", "StreamTEC", JOptionPane.INFORMATION_MESSAGE);
            LoginController w = LoginController.getInstance();
            w.startWindow();
            window.hide();
        }
        else{
            JOptionPane.showMessageDialog(null, "Favor Ingrese Los Datos Correctamente", "", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Metodos de creacion
    public IServiceStrategy createService(){
        if(window.rdBtnBasic.isSelected()){
                return ServiceFactory.getService("Basic");
            }
        else if(window.rdBtnMusic.isSelected()){
                return ServiceFactory.getService("Music");
        }
        else if(window.rdBtnVideo.isSelected()){
            return ServiceFactory.getService("Video");
        }
        else{
            return ServiceFactory.getService("Premium");
        }
    }
    
    public PayCard createCard(){
        int number = Integer.parseInt(window.txtCardNumber.getText());
        String date = ""; 
        date += window.jMonthChooser1.getMonth();
        date += "/";
        date += window.jYearChooser1.getYear();
        int cvv = Integer.parseInt(window.txtCVV.getText());
        PayCard card = new PayCard(number, date, cvv);
        return card;
    }
    
    public User createUser(){
        String name = window.txtName.getText();
        String last = window.txtLastName.getText();
        String email = window.txtEmail.getText();
        String pass = window.txtPassword.getText();
        String confirm = window.txtConfirmPassword.getText();
        Date date = window.jDateChooser.getDate();
        IServiceStrategy service = createService();
        PayCard card = createCard();
        return new User(name, last, email, pass, date, service, card);
    }
    
    //Metodos de los radioButtons
    public void selectPremium(){
        window.rdBtnPremium.setSelected(true);
        window.rdBtnVideo.setSelected(false);
        window.rdBtnMusic.setSelected(false);
        window.rdBtnBasic.setSelected(false);
    }
    public void selectVideo(){
        window.rdBtnPremium.setSelected(false);
        window.rdBtnVideo.setSelected(true);
        window.rdBtnMusic.setSelected(false);
        window.rdBtnBasic.setSelected(false);
    }
    public void selectMusic(){
        window.rdBtnPremium.setSelected(false);
        window.rdBtnVideo.setSelected(false);
        window.rdBtnMusic.setSelected(true);
        window.rdBtnBasic.setSelected(false);
    }
    public void selectBasic(){
        window.rdBtnPremium.setSelected(false);
        window.rdBtnVideo.setSelected(false);
        window.rdBtnMusic.setSelected(false);
        window.rdBtnBasic.setSelected(true);
    }
    
    //Metodos de los botones de regresar
    public void backToStepOne(){
        window.jTabbedPane.setSelectedIndex(0);
        window.jTabbedPane.setEnabledAt(0, true);
        window.jTabbedPane.setEnabledAt(1, false);
    }
    
    public void backToStepTwo(){
        window.jTabbedPane.setSelectedIndex(1);
        window.jTabbedPane.setEnabledAt(1, true);
        window.jTabbedPane.setEnabledAt(2, false);
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
            frequentQuestions();
        }
        if(e.getSource().equals(window.btnContinue1)){
            continueStepOne();
        }
        if(e.getSource().equals(window.btnBack2)){
            backToStepOne();
        }
        if(e.getSource().equals(window.btnContinue2)){
            continueStepTwo();
        }
        if(e.getSource().equals(window.btnBack3)){
            backToStepTwo();
        }
        if(e.getSource().equals(window.btnContinue3)){
            continueStepThree();
        }
        if(e.getSource().equals(window.rdBtnBasic)){
            selectBasic();
        }
        if(e.getSource().equals(window.rdBtnPremium)){
            selectPremium();
        }
        if(e.getSource().equals(window.rdBtnMusic)){
            selectMusic();
        }
        if(e.getSource().equals(window.rdBtnVideo)){
            selectVideo();
        }
    }
            
}