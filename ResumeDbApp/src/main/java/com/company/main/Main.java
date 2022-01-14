/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main;

import com.company.dao.inter.SkillDaoInter;

/**
 *
 * @author Natiq
 */
public class Main {


    public static void main(String[] args) throws Exception {   
        SkillDaoInter dao = Context.instanceSkillDao();
        System.out.println(dao.getAll());
        
    }
    
}
