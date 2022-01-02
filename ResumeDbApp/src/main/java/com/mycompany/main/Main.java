/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main;

import com.company.bean.User;
import com.mycompany.dao.inter.UserDaoInter;

/**
 *
 * @author Natiq
 */
public class Main {


    public static void main(String[] args) throws Exception {   
        UserDaoInter userDao = Context.instanceUserDao();
        User u = new User(0, "Sarkhan", "Rasullu", "sarkhanrasullu@gmail.com", "+9945555555");
        userDao.addUser(u);
        
    }
    
}
