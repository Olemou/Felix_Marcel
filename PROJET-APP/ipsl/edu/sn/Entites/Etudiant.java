/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipsl.edu.sn.Entites;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author pc
 */
public class Etudiant {
Date DateNaissance;
    String ID;
    String NomEtudiant;
    String PrenomEtudiant;
    String niveau;
    String filiere;

    

    

    public void setDateNaissance(Date DateNaissance) {
        this.DateNaissance = DateNaissance;
    }

    public Date getDateNaissance() {
        return DateNaissance;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public String getFiliere() {
        return filiere;
    }

    public Etudiant() {
    }

    public Etudiant(Date DateNaissance, String ID, String NomEtudiant, String PrenomEtudiant, String niveau, String filiere) {
        this.DateNaissance = DateNaissance;
        this.ID = ID;
        this.NomEtudiant = NomEtudiant;
        this.PrenomEtudiant = PrenomEtudiant;
        this.niveau = niveau;
        this.filiere = filiere;
        
    }

    

   

    public String getID() {
        return ID;
    }

    public String getNomEtudiant() {
        return NomEtudiant;
    }

    public String getPrenomEtudiant() {
        return PrenomEtudiant;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNomEtudiant(String NomEtudiant) {
        this.NomEtudiant = NomEtudiant;
    }

    public void setPrenomEtudiant(String PrenomEtudiant) {
        this.PrenomEtudiant = PrenomEtudiant;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

   
    

    @Override
    public String toString() {
        return "Etudiant{" + "DateNaissance=" + DateNaissance + ", ID=" + ID + ", NomEtudiant=" + NomEtudiant + ", PrenomEtudiant=" + PrenomEtudiant + ", niveau=" + niveau + ", filiere=" + filiere + '}';
    }

    

    
    
}
