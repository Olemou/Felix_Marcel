/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipsl.edu.sn.BasesDonnees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;

/**
 *
 * @author pc
 */
public class ConnectionBase {
    public static final SimpleDateFormat SQL_FORMAT=new SimpleDateFormat("yyyy-MM-dd");
    private static Connection connection;
    
    public static Connection  getConnection() throws Exception{
        if(connection==null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/universite?serverTimezone=UTC","root","passer");
        }return connection;
    }
       
    
    public static void disconnect() throws Exception{
        if(connection!=null){
            connection.close();
            connection=null;
        }
    }
    
    
    }
