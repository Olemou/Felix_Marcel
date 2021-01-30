/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipsl.edu.sn.InterfaceGraphique;

import ipsl.edu.sn.Entites.Etudiant;
import ipsl.edu.sn.Metier.ImplementationMetier;
import java.util.ArrayList;
import java.util.Set;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author pc
 */
public class EtudiantTableModel extends AbstractTableModel {

    public static ArrayList<Etudiant> liste;

    public EtudiantTableModel() {
        ImplementationMetier Etudiant = new ImplementationMetier();
       
       
    }

    @Override
    public int getRowCount() {
        return liste.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Etudiant e1 = liste.get(rowIndex);

        Object res ;
        switch (columnIndex) {

            case 0:
              res=  e1.getFiliere();
                break;
            case 1:
               res= e1.getNomEtudiant();
                break;
            default:
                res = "erreur";

        }
        return res;
    }
}
