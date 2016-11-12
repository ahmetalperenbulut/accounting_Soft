/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounting.software;

import java.util.ArrayList;

/**
 *
 * @author emre
 */
public class FinanceFrame extends javax.swing.JPanel {
    
    //Dialogs
    AddFinanceDialog addDialog = new AddFinanceDialog(MainFrame.mainFrame, true);
    EditFinanceDialog editDialog  = new EditFinanceDialog(MainFrame.mainFrame, true);
    DeleteFinanceDialog deleteDialog = new DeleteFinanceDialog(MainFrame.mainFrame, true);
    
    /**
     * Creates new form FinanceFrame
     */
    
    private int freeIncomeX = 0;
    private int freeIncomeY = 0;
    private int freeOutcomeX = 0;
    private int freeOutcomeY = 0;
    
    public FinanceFrame() {
        initComponents();
        /*        for (gider elem : giderler) {
            elem.setBounds(0, 0, 500 , 50);
            outcomePanel.add(elem);
        }
        for (gelir elem : gelirler) {
            elem.setBounds(0, 0, 500 , 50);
            incomePanel.add(elem);
        }
*/
    }
   
    private ArrayList<gider> giderler = new ArrayList<gider>();
    private ArrayList<gelir> gelirler = new ArrayList<gelir>();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AddIncomeBut = new javax.swing.JButton();
        EditIncomeBut = new javax.swing.JButton();
        DeleteIncomeBut = new javax.swing.JButton();
        AddOutcomeBut = new javax.swing.JButton();
        EditOutcomeBut = new javax.swing.JButton();
        DeleteOutcomeBut = new javax.swing.JButton();
        leftPane = new javax.swing.JScrollPane();
        incomePanel = new javax.swing.JPanel();
        rightPane = new javax.swing.JScrollPane();
        outcomePanel = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1149, 580));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("INCOMES");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("OUTCOMES");

        AddIncomeBut.setText("Add");
        AddIncomeBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddIncomeButActionPerformed(evt);
            }
        });

        EditIncomeBut.setText("Edit");
        EditIncomeBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditIncomeButActionPerformed(evt);
            }
        });

        DeleteIncomeBut.setText("Delete");

        AddOutcomeBut.setText("Add");

        EditOutcomeBut.setText("Edit");

        DeleteOutcomeBut.setText("Delete");

        incomePanel.setPreferredSize(new java.awt.Dimension(530, 435));

        javax.swing.GroupLayout incomePanelLayout = new javax.swing.GroupLayout(incomePanel);
        incomePanel.setLayout(incomePanelLayout);
        incomePanelLayout.setHorizontalGroup(
            incomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        incomePanelLayout.setVerticalGroup(
            incomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );

        leftPane.setViewportView(incomePanel);

        outcomePanel.setPreferredSize(new java.awt.Dimension(530, 435));

        javax.swing.GroupLayout outcomePanelLayout = new javax.swing.GroupLayout(outcomePanel);
        outcomePanel.setLayout(outcomePanelLayout);
        outcomePanelLayout.setHorizontalGroup(
            outcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );
        outcomePanelLayout.setVerticalGroup(
            outcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );

        rightPane.setViewportView(outcomePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(269, 269, 269))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(leftPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rightPane, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(AddIncomeBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditIncomeBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteIncomeBut)
                        .addGap(334, 334, 334)
                        .addComponent(AddOutcomeBut)
                        .addGap(18, 18, 18)
                        .addComponent(EditOutcomeBut)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteOutcomeBut)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(leftPane)
                    .addComponent(rightPane))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddIncomeBut)
                    .addComponent(EditIncomeBut)
                    .addComponent(DeleteIncomeBut)
                    .addComponent(AddOutcomeBut)
                    .addComponent(EditOutcomeBut)
                    .addComponent(DeleteOutcomeBut))
                .addGap(0, 20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddIncomeButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddIncomeButActionPerformed
        addDialog.setVisible(true);
        
        if(addDialog.getReturnStatus() == AddFinanceDialog.RET_OK){
            String[] s = new String[3];
            s = addDialog.GetValues();
            gelir g = new gelir();
            g.setTextName(s[0]);
            g.setDesc(s[1]);
            g.setAmount(s[2]);
            updateIncome(0, g);
        }
    }//GEN-LAST:event_AddIncomeButActionPerformed

    private void EditIncomeButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditIncomeButActionPerformed
        editDialog.setVisible(true);
        
        if(editDialog.getReturnStatus() == EditFinanceDialog.RET_OK){
            
        }
    }//GEN-LAST:event_EditIncomeButActionPerformed
    private void updateIncome(int op,gelir g){
        if(op == 0)
        {
            g.setBounds(freeIncomeX, freeIncomeY, 530, 50);
            incomePanel.add(g);
            gelirler.add(g);
            freeIncomeY += 50;   
        }
        else if(op == 1){
            //edit
        }
        else {
/*            String inp = deleteDialog.getSelecteditem();
            for(int i = 0; i < gelirler.size(); ++i){
                gelirler.get(i)
            }*/
        }
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddIncomeBut;
    private javax.swing.JButton AddOutcomeBut;
    private javax.swing.JButton DeleteIncomeBut;
    private javax.swing.JButton DeleteOutcomeBut;
    private javax.swing.JButton EditIncomeBut;
    private javax.swing.JButton EditOutcomeBut;
    private javax.swing.JPanel incomePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane leftPane;
    private javax.swing.JPanel outcomePanel;
    private javax.swing.JScrollPane rightPane;
    // End of variables declaration//GEN-END:variables
}
