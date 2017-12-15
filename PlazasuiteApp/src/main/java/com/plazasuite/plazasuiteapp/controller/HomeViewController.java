/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plazasuite.plazasuiteapp.controller;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.plazasuite.plazasuiteapp.PlazaSuiteFxMain;
import com.plazasuite.plazasuiteapp.constants.routes.Routes;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author user
 */
public class HomeViewController implements Initializable {
    @FXML
    private JFXHamburger hamburger;
    @FXML
    private AnchorPane holderPane;
    @FXML
    private JFXDrawer drawer;
    @FXML
    private Label txtCurrentWindow;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         drawer.open();
//                HamburgerBackArrowBasicTransition transition = new HamburgerBackArrowBasicTransition(hamburger);
//        transition.setRate(-1);
//        hamburger.addEventHandler(MouseEvent.MOUSE_PRESSED, (MouseEvent e) -> {
//            transition.setRate(transition.getRate() * -1);
//            transition.play();
//
//            if (drawer.isShown()) {
//                drawer.close();
//            } else {
//                drawer.open();
//            }
//
//        });

        try {
            // TODO
            VBox sideMenu = FXMLLoader.load(PlazaSuiteFxMain.class.getResource(Routes.SIDE_MENU_VIEW));
            AnchorPane addavailableRoomsPane = FXMLLoader.load(PlazaSuiteFxMain.class.getResource(Routes.ROOM_MANAGEMENT_VIEW));
            AnchorPane addServicePane = FXMLLoader.load(PlazaSuiteFxMain.class.getResource(Routes.ADD_SERVICES_VIEW));
            AnchorPane addBookingPane = FXMLLoader.load(PlazaSuiteFxMain.class.getResource(Routes.NEW_BOOKING_VIEW));
          //  setNode(addavailableRoomsPane); 
              for (Node node : sideMenu.getChildren()) {
                if (node.getAccessibleText() != null) {
                    node.addEventHandler(MouseEvent.MOUSE_PRESSED, (MouseEvent ev) -> {
                        switch (node.getAccessibleText()) {
                            case "homeMenu":
                                drawer.close();
                                //setNode(welcome);
                                break;
                            case "addRoomMenu":
                                //drawer.close();                               
                                setNode(addavailableRoomsPane);
                                break;
                            case "addServicesMenu":
                                //drawer.close();                               
                                setNode(addServicePane);
                                break;
                            case "newBookingMenu":
                                setNode(addBookingPane);
                                break;
                              
                        }
                    });
                }

            }
            //AnchorPane newBookingPane = FXMLLoader.load(getClass().getClassLoader().getResource("PlazaSuiteFx/SideMenu.fxml"));
            drawer.setSidePane(sideMenu);     
        } catch (IOException ex) {
            Logger.getLogger(HomeViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
     private void setNode(Node node) {
        holderPane.getChildren().clear();
        holderPane.getChildren().add((Node) node);
    }
}
