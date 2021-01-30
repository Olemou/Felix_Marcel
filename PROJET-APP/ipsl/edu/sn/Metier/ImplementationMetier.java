/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipsl.edu.sn.Metier;

import ipsl.edu.sn.BasesDonnees.ConnectionBase;
import ipsl.edu.sn.Entites.Etudiant;
import java.util.Set;
import ipsl.edu.sn.BasesDonnees.ImplementationBase;
import ipsl.edu.sn.BasesDonnees.InvalideException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/**
 *
 * @author pc
 */


public class ImplementationMetier implements InterfaceMetier {

    ImplementationBase Etudiant = new ImplementationBase();
    
    @Override
    public void sauvegarderEtudiant(Etudiant e) throws InvalideException {
       Etudiant.sauvegarderEtudiant(e);
    }

    public void SupprimerEtudiant(Etudiant e) {
        Etudiant.SupprimerEtudiant(e);
       
    }

    @Override
    public void AjouterFiliere(Etudiant e) {
    Etudiant.AjouterFiliere(e);
    }

    public void SupprimerFiliere(Etudiant e) {
      Etudiant.SupprimerFiliere(e);
    }

    public void ModifierFiliere(Etudiant e,Etudiant e1) {
    Etudiant.ModifierFiliere(e,e1);
    }

   
}
   
    

