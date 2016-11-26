/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounting.software;

import java.util.ArrayList;

/**
 *
 * @author Furkan
 */
public class PersonnelPanel extends javax.swing.JPanel {

    private int panelID;
    
    /**
     * Creates new form PersonnelPanel
     * @param personName
     * @param personSalary
     * @param personID
     */
    public PersonnelPanel(String personName, double personSalary, int personID) {
        initComponents();
        
        this.jButton1.setText(personName);
        this.jLabel1.setText("SALARY (TL) = " + personSalary);
        this.panelID = personID;

    }
    
    /**
     *
     * @return
     */
    public int getPersonnelPanelID(){
        return panelID;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(283, 60));
        setLayout(new java.awt.BorderLayout());

        jButton1.setBackground(new java.awt.Color(69, 90, 100));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("NAME SURNAME");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);
        jButton1.setPreferredSize(new java.awt.Dimension(283, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, java.awt.BorderLayout.CENTER);

        jLabel1.setBackground(new java.awt.Color(176, 190, 197));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SALARY (TL) = 20");
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(283, 30));
        add(jLabel1, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
