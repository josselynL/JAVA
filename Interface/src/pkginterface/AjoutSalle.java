/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import java.sql.SQLException;
import java.sql.*;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Thomas
 */
public class AjoutSalle extends javax.swing.JFrame {
    
    

    /**
     * Creates new form AjoutSalle
     */
    public AjoutSalle() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabelAddLocal = new javax.swing.JLabel();
        jLabelNom = new javax.swing.JLabel();
        jTextFieldNom = new javax.swing.JTextField();
        jLabelDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jToggleButtonValider = new javax.swing.JToggleButton();
        jLabelAddSalle = new javax.swing.JLabel();
        AjoutSalle_ButtonValider = new javax.swing.JToggleButton();
        jLabelNomLocalSalle = new javax.swing.JLabel();
        jLabelDescriptionSalle = new javax.swing.JLabel();
        jLabelNomSalle = new javax.swing.JLabel();
        AjoutSalle_TextNom = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        AjoutSalle_TextDescription = new javax.swing.JTextArea();
        AjoutSalle_ListLocal = new javax.swing.JComboBox();
        AjoutSalle_ButtonQuitter = new javax.swing.JButton();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelAddLocal.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelAddLocal.setText("Ajout Local");

        jLabelNom.setText("Nom :");

        jLabelDescription.setText("Description :");

        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescription);

        jLabel1.setText("Lieu :");

        jToggleButtonValider.setText("Valider");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNom)
                            .addComponent(jLabelDescription)
                            .addComponent(jLabel1))
                        .addGap(22, 22, 22)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButtonValider, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelAddLocal))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAddLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNom)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescription)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jToggleButtonValider)
                .addGap(9, 9, 9))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelAddSalle.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelAddSalle.setText("Ajout d'une salle");

        AjoutSalle_ButtonValider.setText("Valider");
        AjoutSalle_ButtonValider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AjoutSalle_ButtonValiderMouseClicked(evt);
            }
        });
        AjoutSalle_ButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutSalle_ButtonValiderActionPerformed(evt);
            }
        });

        jLabelNomLocalSalle.setText("Local");

        jLabelDescriptionSalle.setText("Description :");

        jLabelNomSalle.setText("Nom :");

        AjoutSalle_TextNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutSalle_TextNomActionPerformed(evt);
            }
        });

        AjoutSalle_TextDescription.setColumns(20);
        AjoutSalle_TextDescription.setRows(5);
        jScrollPane2.setViewportView(AjoutSalle_TextDescription);

        AjoutSalle_ListLocal.setModel(new DefaultComboBoxModel());
        DefaultComboBoxModel dcbmAjoutSallesLocaux = (DefaultComboBoxModel)AjoutSalle_ListLocal.getModel();
        try {
            Connexion co = new Connexion();
            Statement statement = co.connect();
            String req = "SELECT nom FROM locaux";
            ResultSet rst = statement.executeQuery(req);

            while(rst.next())
            {
                dcbmAjoutSallesLocaux.addElement(rst.getString("nom"));
            }

        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        AjoutSalle_ButtonQuitter.setText("Annuler");
        AjoutSalle_ButtonQuitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AjoutSalle_ButtonQuitterMouseClicked(evt);
            }
        });
        AjoutSalle_ButtonQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutSalle_ButtonQuitterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNomSalle)
                                    .addComponent(jLabelDescriptionSalle)
                                    .addComponent(jLabelNomLocalSalle))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2)
                                    .addComponent(AjoutSalle_TextNom)
                                    .addComponent(AjoutSalle_ButtonValider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AjoutSalle_ListLocal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabelAddSalle)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AjoutSalle_ButtonQuitter)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAddSalle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomSalle)
                    .addComponent(AjoutSalle_TextNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescriptionSalle)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AjoutSalle_ListLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomLocalSalle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AjoutSalle_ButtonValider)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AjoutSalle_ButtonQuitter)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AjoutSalle_ButtonValiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjoutSalle_ButtonValiderMouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_AjoutSalle_ButtonValiderMouseClicked

    private void AjoutSalle_ButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutSalle_ButtonValiderActionPerformed
        // TODO add your handling code here:
        /*
        try{
            Connexion co = new Connexion();
            Statement statement = co.connect();
            ResultSet resultat;
            int IdLocal=0;
            resultat=statement.executeQuery("SELECT idlocal FROM locaux WHERE nom="+AjoutSalle_ListLocal.getSelectedItem()+"");
            while(resultat.next()){
                IdLocal=resultat.getInt("Idlocal");
            }
            System.out.println(IdLocal);
            //String result = (String) AjoutSalle_ListLocal.getSelectedItem();
            //String Query = ("INSERT INTO salles (nom, description, idlocal) VALUES ('"+AjoutSalle_TextNom.getText()+"','"+AjoutSalle_TextDescription.getText()+"','SELECT idlocal FROM locaux WHERE nom = \'"+(String) AjoutSalle_ListLocal.getSelectedItem()+"\')'");
            String Query1 = "insert into salles (nom) values ('"+AjoutSalle_TextNom.getText()+"'";
            String Query2 = ("insert into salles (description) values ('"+AjoutSalle_TextDescription.getText()+"'");
            String Query3 = ("insert into salles (idlocal) values (SELECT idlocal FROM locaux WHERE nom = ('"+(String) AjoutSalle_ListLocal.getSelectedItem()+"')");
            
            JOptionPane.showMessageDialog(null, Query1);
            JOptionPane.showMessageDialog(null, Query2);
            JOptionPane.showMessageDialog(null, Query3);
            statement.execute(Query3);
            
            JOptionPane.showMessageDialog(null, "Salle ajoutée");
            
             }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());}
    */ 
        try{
            Connexion co = new Connexion();
            Statement statement = co.connect();
            String req = "SELECT idlocal FROM locaux WHERE nom = \'"+AjoutSalle_ListLocal.getSelectedItem()+"\'";
            ResultSet rst = statement.executeQuery(req);
            rst.next();
            String Query = "INSERT INTO salles (nom, description, idlocal) VALUES ('"+AjoutSalle_TextNom.getText()+"','"+AjoutSalle_TextDescription.getText()+"','"+rst.getInt("idlocal")+"')";
            
            statement.execute(Query);
            
            JOptionPane.showMessageDialog(null, "Salle ajoutée");
            
             }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());}
    }//GEN-LAST:event_AjoutSalle_ButtonValiderActionPerformed

    private void AjoutSalle_ButtonQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutSalle_ButtonQuitterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AjoutSalle_ButtonQuitterActionPerformed

    private void AjoutSalle_TextNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutSalle_TextNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AjoutSalle_TextNomActionPerformed

    private void AjoutSalle_ButtonQuitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjoutSalle_ButtonQuitterMouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_AjoutSalle_ButtonQuitterMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AjoutSalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutSalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutSalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutSalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutSalle().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjoutSalle_ButtonQuitter;
    private javax.swing.JToggleButton AjoutSalle_ButtonValider;
    private javax.swing.JComboBox AjoutSalle_ListLocal;
    private javax.swing.JTextArea AjoutSalle_TextDescription;
    private javax.swing.JTextField AjoutSalle_TextNom;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAddLocal;
    private javax.swing.JLabel jLabelAddSalle;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelDescriptionSalle;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelNomLocalSalle;
    private javax.swing.JLabel jLabelNomSalle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JToggleButton jToggleButtonValider;
    // End of variables declaration//GEN-END:variables
}
