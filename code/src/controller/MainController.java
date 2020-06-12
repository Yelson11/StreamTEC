/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.sun.corba.se.impl.logging.InterceptorsSystemException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.DataBase;
import model.IMediaStrategy;
import model.User;
import sun.security.jgss.LoginConfigImpl;
import view.WindowPrincipal;
import view.WindowQuestions;

/**
 *
 * @author Yelson
 */
public class MainController implements ActionListener{
    private static MainController controller;
    private DataBase database;
    private WindowPrincipal window;
    private User currentUser;
    private ArrayList<IMediaStrategy> mediaList;
    
    private MainController(){
        window = new WindowPrincipal();
        database = DataBase.getInstance();
        mediaList = new ArrayList<>();
        
        //Inicia los botones de la UI y les agregar el action listener
        window.btnExit.addActionListener(this);
        window.btnAdd.addActionListener(this);
        window.btnConfig.addActionListener(this);
        window.btnHelp.addActionListener(this);
        window.btnPlay.addActionListener(this);
        window.btnPlaylist.addActionListener(this);
        window.btnList.addActionListener(this);
        
        
        
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
        window.lblService.setText(currentUser.getService().getName());
        loadMediaListFromDB();
    }
    
    // ---------------------- Métodos de UI ----------------------
    public void closeProgram(){
        System.exit(0);
    }
    
    public void loadMediaListFromDB(){
        mediaList = currentUser.getService().getMediaFromDB();
        window.txtArea.append("CATÁLOGO");
        window.txtArea.append("\n");
        for(int i = 0; i < mediaList.size(); i++){
            window.txtArea.append("----------------------------------------------");
            window.txtArea.append("\n");
            window.txtArea.append(mediaList.get(i).getName());
            window.txtArea.append("\n");
            window.cmbMedia.addItem(mediaList.get(i).getName());
        }
    }
    
    public void printUserOptions(){
        for(int i = 0; i < mediaList.size(); i++){
            System.out.println(mediaList.get(i).getName());
        }
    }
    
    public void cleanWindow(){
        window.txtArea.setText("");
        window.cmbMedia.removeAllItems();
    }
    
    public void logOut(){
        currentUser = null;
        LoginController lc = LoginController.getInstance();
        lc.startWindow();
        cleanWindow();
        window.hide();
    }
    
    public void addToPlayList(){
        int index = window.cmbMedia.getSelectedIndex();
        if(currentUser.getService().getName().equals("Basic")){
            int answer = JOptionPane.showConfirmDialog(null, "Desea pagar " + mediaList.get(index).getPrice() + " por el producto", "", JOptionPane.YES_NO_OPTION);
            if(answer == 0){
                currentUser.addMediaFileToPlayList(mediaList.get(index));
                JOptionPane.showMessageDialog(null, mediaList.get(index).getName() + " Se Agregó a Mi Lista", "", JOptionPane.INFORMATION_MESSAGE);    
            }
        }else{
            currentUser.addMediaFileToPlayList(mediaList.get(index));
            JOptionPane.showMessageDialog(null, mediaList.get(index).getName() + " Se Agregó a Mi Lista", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void showPlaylist(){
        cleanWindow();
        window.txtArea.append("Mi Lista de Reproducción");
        window.txtArea.append("\n");
        for(int i = 0; i < currentUser.getPlayList().size(); i++){
            window.txtArea.append("----------------------------------------------");
            window.txtArea.append("\n");
            window.txtArea.append(currentUser.getPlayList().get(i).getName());
            window.txtArea.append("\n");
            window.cmbMedia.addItem(currentUser.getPlayList().get(i).getName());
        }
    }
    
    public void playMedia(){
        //Tomaríamos el object, pero por ahora como es prototipo, se toma el nombre
        //String mediaName = mediaList.get(window.cmbMedia.getSelectedIndex()).getName();
        window.lblService1.setText("Reproduciendo: " + window.cmbMedia.getSelectedItem().toString());
    }

    
    //Invocamos el método de acuerdo al evento 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(window.btnExit)){
            logOut();
        }
        if(e.getSource().equals(window.btnAdd)){
            addToPlayList();
        }
        if(e.getSource().equals(window.btnConfig)){
            JOptionPane.showMessageDialog(null, "Opción en Desarrollo", "", JOptionPane.INFORMATION_MESSAGE);
        }
        if(e.getSource().equals(window.btnHelp)){
            WindowQuestions wq = new WindowQuestions();
            wq.show();
        }
        if(e.getSource().equals(window.btnPlay)){
            playMedia();
        }
        if(e.getSource().equals(window.btnPlaylist)){
            showPlaylist();
            window.btnAdd.setVisible(false);
        }
        if(e.getSource().equals(window.btnList)){
            window.btnAdd.setVisible(true);
            cleanWindow();
            loadMediaListFromDB();
        }
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