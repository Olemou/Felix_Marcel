/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipsl.edu.sn.BasesDonnees;

import ipsl.edu.sn.Entites.Etudiant;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class Test {
   static String c,g;
   
    public static void main(String[] args) throws SQLException, Exception {
        
    ArrayList<Etudiant> liste= new ArrayList();

      String requete="Select Identifiant From Etudiant";
            Connection connection=ConnectionBase.getConnection();
            Statement statement=connection.createStatement();
       ResultSet res=  statement.executeQuery(requete);

         while (res.next()) {
      Etudiant e1=new Etudiant();
     
             e1.setID(res.getString("Identifiant"));
            
            
             liste.add(e1);
             
         }  c="5";
       
                
     for(int i=0; i<liste.size();i++){
         
  System.out.println(""+liste.get(0).getID());
if(c=="+liste.get(0).getID())+"){
    System.out.println("hi");
         
     }
  
     };
         }
    
}