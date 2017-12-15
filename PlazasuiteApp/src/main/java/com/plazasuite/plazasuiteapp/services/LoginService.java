/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plazasuite.plazasuiteapp.services;

import com.plazasuite.plazasuiteapp.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author SUJIKUMAR
 */
public class LoginService {
    @Autowired
    private RoomRepository roomRepository;
    public boolean isAuth(String userName,String password){
        System.out.println("roomRepository=="+roomRepository);
        boolean isAuth  = false;
        if("admin".equals(userName) && "admin".equals(password)){
            isAuth = true;
        }
        return isAuth;
    }
    
}
