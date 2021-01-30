/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipsl.edu.sn.BasesDonnees;

import ipsl.edu.sn.Entites.Etudiant;

/**
 *
 * @author pc
 */
public interface InterfaceBase {
    
    public void sauvegarderEtudiant(Etudiant e) throws InvalideException;
   public void SupprimerEtudiant(Etudiant e);
   public void AjouterFiliere(Etudiant e);
   public void SupprimerFiliere(Etudiant e);
   public void ModifierFiliere(Etudiant e,Etudiant e1);
   
    
}
