package com.plazasuite.plazasuiteapp.config.springbeans;


import com.plazasuite.plazasuiteapp.services.LoginService;
import com.plazasuite.plazasuiteapp.services.PlazasuiteServicesService;
import com.plazasuite.plazasuiteapp.services.RoomManagementService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SUJIKUMAR
 */

@Configuration
public class BeanConfig{
    @Bean
    public LoginService loginService() {
        return new LoginService();
    }
    @Bean
    public RoomManagementService roomManagementService() {
        return new RoomManagementService();
    }
    @Bean
    public PlazasuiteServicesService plazasuiteServicesService() {
        return new PlazasuiteServicesService();
    }
           
}
