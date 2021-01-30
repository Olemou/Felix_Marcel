/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipsl.edu.sn.InterfaceGraphique;

import ipsl.edu.sn.BasesDonnees.ConnectionBase;
import ipsl.edu.sn.Entites.Etudiant;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class ListeNiveau extends javax.swing.JPanel {

    /**
     * Creates new form ListeNiveau
     */
    public ListeNiveau() {
        initComponents();
        
    }
    Etudiant e = new Etudiant();
    public ArrayList<Etudiant> liste(Etudiant e){
    ArrayList<Etudiant> liste2=new ArrayList();
    
   String niveau= e.getNiveau();
    System.out.println(""+e);
    
         try{
             
             String requete= "SELECT Niveau,Nom ,Prenom FROM Filiere ,Etudiant  WHERE Etudiant.Identifiant=Filiere.Identifiant AND Niveau='"+niveau+"'";
            Connection connection=ConnectionBase.getConnection();
            Statement statement=connection.createStatement();
       ResultSet res=  statement.executeQuery(requete);

         while (res.next()) {
      Etudiant e1=new Etudiant();
     
             e1.setNiveau(res.getString("Niveau"));
             e1.setNomEtudiant(res.getString("Nom"));
            e1.setPrenomEtudiant( res.getString("Prenom"));
             liste2.add(e1);
             
         }   
            
        }catch(Exception ex){
            ex.printStackTrace();
    }
        
         
        
     return  liste2;     
    
}
public void Showliste(){
    ArrayList<Etudiant> liste1=liste(e);
    
    DefaultTableModel model= new DefaultTableModel();
    model=(DefaultTableModel) jTableNiveau.getModel();
    Object[] row =new Object[3];
    for(int i =0; i<liste1.size();i++){
        row[0]=liste1.get(i).getPrenomEtudiant();
        row[1]=liste1.get(i).getNomEtudiant();
        row[2]=liste1.get(i).getNiveau();
        model.addRow(row);
    }
    
    
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNiveau = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        NiveauTextField = new javax.swing.JTextField();
        SaveButton2 = new javax.swing.JButton();
        DeleteButton3 = new javax.swing.JButton();

        jTableNiveau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRENOM", "NOM", "NIVEAU"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableNiveau);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("NIVEAU");

        SaveButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SaveButton2.setText(" ENREGISTRER");
        SaveButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButton2ActionPerformed(evt);
            }
        });

        DeleteButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DeleteButton3.setText("ANNULER");
        DeleteButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                        .addComponent(NiveauTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(DeleteButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SaveButton2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NiveauTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton2)
                    .addComponent(DeleteButton3))
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButton3ActionPerformed
      NiveauTextField.setText("");
       DefaultTableModel model= new DefaultTableModel();
    model=(DefaultTableModel) jTableNiveau.getModel();
   model.setRowCount(0);
    }//GEN-LAST:event_DeleteButton3ActionPerformed

    private void SaveButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButton2ActionPerformed
        String niveau=NiveauTextField.getText();
       e.setNiveau(niveau);
       Showliste();
       NiveauTextField.setText("");
                
    }//GEN-LAST:event_SaveButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton3;
    private javax.swing.JTextField NiveauTextField;
    private javax.swing.JButton SaveButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableNiveau;
    // End of variables declaration//GEN-END:variables
}