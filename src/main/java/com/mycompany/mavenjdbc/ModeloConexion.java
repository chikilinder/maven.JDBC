/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenjdbc;

/**
 *
 * @author inter
 */
import java.sql.*;
public class ModeloConexion {
    
    public static Connection conectarse (String usuario, String password)throws Exception {
        
        String url="jdbc:derby://localhost:1527/sample";
        
       Connection con= DriverManager.getConnection(url,"user", "");
        // nos autefic
        System.out.println("Si te conectaste");
        
        
        return con;
        
        
        
        
    }
    
    
}
