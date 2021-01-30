/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipsl.edu.sn.BasesDonnees;
import static ipsl.edu.sn.BasesDonnees.ConnectionBase.SQL_FORMAT;
import ipsl.edu.sn.Entites.Etudiant;
import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author pc
 */
public class ImplementationBase implements InterfaceBase {

    
    
    @Override
    public void sauvegarderEtudiant(Etudiant e) throws InvalideException {
     String prenom=e.getPrenomEtudiant();
      String  nom=e.getNomEtudiant();
       String Id=e.getID();
       Date date=e.getDateNaissance();
       
       if(prenom.isBlank()|| prenom==null){
           throw new InvalideException("Remplir la case");
       }
       if((nom.isBlank()||nom==null)||(Id.isBlank()|| Id==null)){
           throw new InvalideException("Remplir la case");
       }
      
 
 String dateNaissance=SQL_FORMAT.format(date);
       String requete="INSERT INTO etudiant(Identifiant,Prenom,Nom,DateNaissance) VALUES(  '"+Id+"','"+prenom+"','"+nom+"','"+dateNaissance+"')";
        try{
            Connection connection=ConnectionBase.getConnection();
            Statement statement=connection.createStatement();
           statement.executeUpdate(requete);
            statement.close();
            ConnectionBase.disconnect();
        }catch(Exception ex){
            ex.printStackTrace();
            
        }
       
    }
    public void SupprimerEtudiant(Etudiant e) {
      
      String id=e.getID();
      String c;
      
        System.out.println(""+id);
        try{
            
             String requete="DELETE FROM etudiant WHERE Identifiant="+id+"";
            Connection connection=ConnectionBase.getConnection();
            Statement statement=connection.createStatement();
            
         statement.executeUpdate(requete);
           
            statement.close();
            ConnectionBase.disconnect();
            
        }catch(Exception ex){
            ex.printStackTrace();
            
        }
       
       
    }

    @Override
    public void AjouterFiliere(Etudiant e) {
     String filiere=e.getFiliere();
     String niveau=e.getNiveau();
   String id=e.getID();
     
      String requete="INSERT INTO filiere(NomFiliere,Niveau,Identifiant) VALUES('"+filiere+"','"+niveau+"','"+id+"')";
        try{
            Connection connection=ConnectionBase.getConnection();
            Statement statement=connection.createStatement();
           statement.executeUpdate(requete);
            statement.close();
            ConnectionBase.disconnect();
        }catch(Exception ex){
            ex.printStackTrace();
            
        }
       
     
        
     
    }

    @Override
    public void SupprimerFiliere(Etudiant e) {
   String filiere=e.getFiliere();
  
        
     
     String requete="DELETE FROM  filiere WHERE NomFiliere='"+filiere+"'";
        try{
            Connection connection=ConnectionBase.getConnection();
            Statement statement=connection.createStatement();
           statement.executeUpdate(requete);
            statement.close();
            ConnectionBase.disconnect();
        }catch(Exception ex){
            ex.printStackTrace();
            
        }
    }

    public void ModifierFiliere(Etudiant e,Etudiant e1) {
        String ancfiliere=e1.getFiliere();
        String novfiliere=e.getFiliere();
        
        
      String requete  ="UPDATE filiere SET NomFiliere='"+novfiliere+"' WHERE NomFiliere='"+ancfiliere+"'";
      try{
            Connection connection=ConnectionBase.getConnection();
            Statement statement=connection.createStatement();
           statement.executeUpdate(requete);
            statement.close();
            ConnectionBase.disconnect();
        }catch(Exception ex){
            ex.printStackTrace();
            
        }
      
      
      
      
    }

    
    

    

    

   
}
