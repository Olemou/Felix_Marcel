/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipsl.edu.sn.Metier;

import ipsl.edu.sn.BasesDonnees.InvalideException;
import ipsl.edu.sn.Entites.Etudiant;
import java.util.ArrayList;
import java.util.Set;

/**
 *
 * @author pc
 */
public interface InterfaceMetier {
    
    
    
    public void sauvegarderEtudiant(Etudiant e)throws InvalideException;
   public void SupprimerEtudiant(Etudiant e);
   public void AjouterFiliere (Etudiant e);
   public void SupprimerFiliere(Etudiant e); 
 public void ModifierFiliere(Etudiant e,Etudiant e1);
   
    
   
}
