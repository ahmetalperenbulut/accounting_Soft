/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounting.software;

/**
 *
 * @author Furkan
 */
public class ExpensePanel extends javax.swing.JPanel {

    private int expenseID;
    /**
     * Creates new form expensePanel
     */
    public ExpensePanel(String expense, int newID) {
        initComponents();
        
        jLabel1.setText(expense);
        expenseID = newID;
    }
    
    public int getExpensePanelID(){
        return expenseID;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(300, 60));
        setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(176, 190, 197));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rent (Tl) = 50000");
        jLabel1.setOpaque(true);
        add(jLabel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
