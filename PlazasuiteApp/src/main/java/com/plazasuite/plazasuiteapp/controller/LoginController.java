/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plazasuite.plazasuiteapp.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDecorator;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXSpinner;
import com.jfoenix.controls.JFXTextField;
import com.plazasuite.plazasuiteapp.PlazaSuiteFxMain;
import com.plazasuite.plazasuiteapp.constants.routes.Routes;
import com.plazasuite.plazasuiteapp.services.LoginService;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import org.springframework.beans.factory.annotation.Autowired;




/**
 * FXML Controller class
 *
 * @author user
 */

public class LoginController implements Initializable {
    @FXML
    private JFXButton btnLogin;
    @FXML
    private JFXSpinner loggingProgress;
    @FXML
    private JFXTextField txtUsername;
    @FXML
    private JFXPasswordField txtPassword;
    
    
    private LoginService loginService = null;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         loggingProgress.setVisible(false);
         
    }
    
    @FXML
    public void loginAction(ActionEvent event) throws IOException{
        //Showing the progress bar
         System.out.println("PlazaSuiteFxMain.springAppcontext=="+PlazaSuiteFxMain.springAppcontext);
        loginService = PlazaSuiteFxMain.springAppcontext.getBean(LoginService.class);
       
        loggingProgress.setVisible(true);
        PauseTransition pauseTransition = new PauseTransition();
        pauseTransition.setDuration(Duration.seconds(10));
        pauseTransition.setOnFinished(ev ->{
            System.out.println("Login Process Started");
            completeLogin();
            System.out.println("Login Proccess Ended");
            
        });
        pauseTransition.play();
        
    }
    //Validates the entered username and password if valids navigates the user to the home page.
    private void completeLogin() {
        loggingProgress.setVisible(false);
        if(isValidInput())
        {
            try {
                Stage stage = new Stage();
                
                Parent root = FXMLLoader.load(PlazaSuiteFxMain.class.getResource(Routes.HOME_VIEW));
                JFXDecorator decorator = new JFXDecorator(stage,root,false,false,true);
                decorator.setCustomMaximize(false);
                decorator.setBorder(Border.EMPTY);
                
                //adding decorator to the newly created scene
                Scene scene = new Scene(decorator);
                //adding the style sheet to the scene
                scene.getStylesheets().add(PlazaSuiteFxMain.class.getResource("/styles/Styles.css").toExternalForm());
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(scene);
                
                stage.setIconified(false);
                stage.show();
                
                //Hide login window
                btnLogin.getScene().getWindow().hide();
             
            } catch (IOException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    

    private boolean isValidInput(){ 
      boolean is_valid  = false;
      String userName = txtUsername.getText()!=  null ? txtUsername.getText():"";
      String password = txtPassword.getText()!=  null ? txtPassword.getText():"";
      if  ( (userName.trim().length() > 0) && (password.trim().length() > 0)){          
            is_valid =  loginService.isAuth(userName, password);
      }
     return is_valid;
    }

    
}
