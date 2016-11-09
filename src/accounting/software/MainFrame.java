/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounting.software;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Furkan
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        
        PersonnelPanel temp = new PersonnelPanel();
        PersonnelPanel temp2 = new PersonnelPanel();
        PersonnelPanel temp3 = new PersonnelPanel();
        
        this.jPanel4.add(temp);
        temp.setBounds(50, 30, 283, 60);
        this.jPanel4.add(temp2);
        temp2.setBounds(50, 110, 283, 60);
        this.jPanel4.add(temp3);
        temp3.setBounds(50, 190, 283, 60);
        this.add(persframe);
        persframe.setVisible(false);
        this.add(financeframe);
        financeframe.setVisible(false);
    }
    
    FinanceFrame financeframe = new FinanceFrame();
    personnelFrame persframe = new personnelFrame();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        sumTab = new javax.swing.JLabel();
        PersonnelTab = new javax.swing.JLabel();
        FInanceTab = new javax.swing.JLabel();
        sumPane = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        ReportBut = new javax.swing.JButton();
        DieselBut = new javax.swing.JButton();
        GasolineBut = new javax.swing.JButton();
        LpgBut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ManagePersonelBut = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ManageFinanceBut = new javax.swing.JButton();
        ExpensesBut = new javax.swing.JButton();
        IncomesBut = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Accounting Software");
        setResizable(false);

        jLayeredPane1.setBackground(new java.awt.Color(0, 0, 0));
        jLayeredPane1.setAlignmentX(0.0F);
        jLayeredPane1.setAlignmentY(0.0F);
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(1149, 70));
        jLayeredPane1.setLayout(new java.awt.GridLayout(1, 0));

        sumTab.setBackground(new java.awt.Color(51, 153, 0));
        sumTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/accounting/software/images/Asset 7.png"))); // NOI18N
        sumTab.setAlignmentY(0.0F);
        sumTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sumTab.setMaximumSize(new java.awt.Dimension(383, 72));
        sumTab.setMinimumSize(new java.awt.Dimension(383, 72));
        sumTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sumTabMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sumTabMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sumTabMouseEntered(evt);
            }
        });
        jLayeredPane1.add(sumTab);

        PersonnelTab.setBackground(new java.awt.Color(51, 153, 0));
        PersonnelTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/accounting/software/images/Asset 20.png"))); // NOI18N
        PersonnelTab.setAlignmentY(0.0F);
        PersonnelTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PersonnelTab.setMaximumSize(new java.awt.Dimension(383, 72));
        PersonnelTab.setMinimumSize(new java.awt.Dimension(383, 72));
        PersonnelTab.setPreferredSize(new java.awt.Dimension(383, 70));
        PersonnelTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PersonnelTabMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PersonnelTabMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PersonnelTabMouseEntered(evt);
            }
        });
        jLayeredPane1.add(PersonnelTab);

        FInanceTab.setBackground(new java.awt.Color(51, 153, 0));
        FInanceTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/accounting/software/images/Asset 8.png"))); // NOI18N
        FInanceTab.setAlignmentY(0.0F);
        FInanceTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FInanceTab.setMaximumSize(new java.awt.Dimension(383, 72));
        FInanceTab.setMinimumSize(new java.awt.Dimension(383, 72));
        FInanceTab.setPreferredSize(new java.awt.Dimension(383, 70));
        FInanceTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FInanceTabMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FInanceTabMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FInanceTabMouseEntered(evt);
            }
        });
        jLayeredPane1.add(FInanceTab);

        getContentPane().add(jLayeredPane1, java.awt.BorderLayout.PAGE_START);

        sumPane.setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(176, 190, 197));
        jPanel1.setPreferredSize(new java.awt.Dimension(383, 580));

        ReportBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/accounting/software/images/Asset 9.png"))); // NOI18N
        ReportBut.setBorderPainted(false);
        ReportBut.setContentAreaFilled(false);
        ReportBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReportBut.setPreferredSize(new java.awt.Dimension(245, 52));
        ReportBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReportButMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReportButMouseEntered(evt);
            }
        });

        DieselBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/accounting/software/images/Asset 12.png"))); // NOI18N
        DieselBut.setBorderPainted(false);
        DieselBut.setContentAreaFilled(false);
        DieselBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DieselBut.setPreferredSize(new java.awt.Dimension(122, 32));
        DieselBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DieselButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DieselButMouseExited(evt);
            }
        });

        GasolineBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/accounting/software/images/Asset 13.png"))); // NOI18N
        GasolineBut.setBorderPainted(false);
        GasolineBut.setContentAreaFilled(false);
        GasolineBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GasolineBut.setPreferredSize(new java.awt.Dimension(122, 32));
        GasolineBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GasolineButMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GasolineButMouseEntered(evt);
            }
        });

        LpgBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/accounting/software/images/Asset 14.png"))); // NOI18N
        LpgBut.setBorderPainted(false);
        LpgBut.setContentAreaFilled(false);
        LpgBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LpgBut.setPreferredSize(new java.awt.Dimension(122, 32));
        LpgBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LpgButMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LpgButMouseEntered(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/accounting/software/images/Asset 17.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/accounting/software/images/Asset 16.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/accounting/software/images/Asset 18.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GasolineBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DieselBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LpgBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ReportBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(DieselBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GasolineBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LpgBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(ReportBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        sumPane.add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(176, 190, 197));
        jPanel2.setPreferredSize(new java.awt.Dimension(383, 580));

        ManagePersonelBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/accounting/software/images/Asset 10.png"))); // NOI18N
        ManagePersonelBut.setBorderPainted(false);
        ManagePersonelBut.setContentAreaFilled(false);
        ManagePersonelBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManagePersonelBut.setPreferredSize(new java.awt.Dimension(245, 52));
        ManagePersonelBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManagePersonelButMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManagePersonelButMouseEntered(evt);
            }
        });

        jPanel4.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(ManagePersonelBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(ManagePersonelBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        sumPane.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(176, 190, 197));
        jPanel3.setPreferredSize(new java.awt.Dimension(383, 580));

        ManageFinanceBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/accounting/software/images/Asset 11.png"))); // NOI18N
        ManageFinanceBut.setBorderPainted(false);
        ManageFinanceBut.setContentAreaFilled(false);
        ManageFinanceBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageFinanceBut.setPreferredSize(new java.awt.Dimension(245, 52));
        ManageFinanceBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManageFinanceButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManageFinanceButMouseExited(evt);
            }
        });

        ExpensesBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/accounting/software/images/Asset 39.png"))); // NOI18N
        ExpensesBut.setBorderPainted(false);
        ExpensesBut.setContentAreaFilled(false);
        ExpensesBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExpensesBut.setPreferredSize(new java.awt.Dimension(122, 32));
        ExpensesBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExpensesButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExpensesButMouseExited(evt);
            }
        });

        IncomesBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/accounting/software/images/Asset 40.png"))); // NOI18N
        IncomesBut.setBorderPainted(false);
        IncomesBut.setContentAreaFilled(false);
        IncomesBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IncomesBut.setPreferredSize(new java.awt.Dimension(122, 32));
        IncomesBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IncomesButMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IncomesButMouseEntered(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/accounting/software/images/Asset 45.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/accounting/software/images/Asset 47.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IncomesBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExpensesBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(ManageFinanceBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(ExpensesBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addComponent(IncomesBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ManageFinanceBut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        sumPane.add(jPanel3);

        getContentPane().add(sumPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sumTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumTabMouseEntered
        Icon img = new ImageIcon(getClass().getResource("images/Asset 22.png"));
                sumTab.setIcon(img);
    }//GEN-LAST:event_sumTabMouseEntered

    private void sumTabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumTabMouseExited
        Icon img = new ImageIcon(getClass().getResource("images/Asset 7.png"));
                sumTab.setIcon(img);
    }//GEN-LAST:event_sumTabMouseExited

    private void PersonnelTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PersonnelTabMouseEntered
        Icon img = new ImageIcon(getClass().getResource("images/Asset 24.png"));
                PersonnelTab.setIcon(img);
    }//GEN-LAST:event_PersonnelTabMouseEntered

    private void PersonnelTabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PersonnelTabMouseExited
        Icon img = new ImageIcon(getClass().getResource("images/Asset 20.png"));
                PersonnelTab.setIcon(img);
    }//GEN-LAST:event_PersonnelTabMouseExited

    private void FInanceTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FInanceTabMouseEntered
        Icon img = new ImageIcon(getClass().getResource("images/Asset 27.png"));
                FInanceTab.setIcon(img);
    }//GEN-LAST:event_FInanceTabMouseEntered

    private void FInanceTabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FInanceTabMouseExited
        Icon img = new ImageIcon(getClass().getResource("images/Asset 8.png"));
                FInanceTab.setIcon(img);
    }//GEN-LAST:event_FInanceTabMouseExited

    private void ManagePersonelButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManagePersonelButMouseEntered
        Icon img = new ImageIcon(getClass().getResource("images/Asset 25.png"));
                ManagePersonelBut.setIcon(img);
    }//GEN-LAST:event_ManagePersonelButMouseEntered

    private void ManagePersonelButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManagePersonelButMouseExited
        Icon img = new ImageIcon(getClass().getResource("images/Asset 10.png"));
                ManagePersonelBut.setIcon(img);
    }//GEN-LAST:event_ManagePersonelButMouseExited

    private void ManageFinanceButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageFinanceButMouseEntered
        Icon img = new ImageIcon(getClass().getResource("images/Asset 28.png"));
                ManageFinanceBut.setIcon(img);
    }//GEN-LAST:event_ManageFinanceButMouseEntered

    private void ManageFinanceButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageFinanceButMouseExited
        Icon img = new ImageIcon(getClass().getResource("images/Asset 11.png"));
                ManageFinanceBut.setIcon(img);
    }//GEN-LAST:event_ManageFinanceButMouseExited

    private void ReportButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportButMouseEntered
        Icon img = new ImageIcon(getClass().getResource("images/Asset 29.png"));
                ReportBut.setIcon(img);
    }//GEN-LAST:event_ReportButMouseEntered

    private void ReportButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportButMouseExited
        Icon img = new ImageIcon(getClass().getResource("images/Asset 9.png"));
                ReportBut.setIcon(img);
    }//GEN-LAST:event_ReportButMouseExited

    private void DieselButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DieselButMouseEntered
        Icon img = new ImageIcon(getClass().getResource("images/Asset 30.png"));
                DieselBut.setIcon(img);
    }//GEN-LAST:event_DieselButMouseEntered

    private void DieselButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DieselButMouseExited
        Icon img = new ImageIcon(getClass().getResource("images/Asset 12.png"));
                DieselBut.setIcon(img);
    }//GEN-LAST:event_DieselButMouseExited

    private void GasolineButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GasolineButMouseEntered
        Icon img = new ImageIcon(getClass().getResource("images/Asset 32.png"));
                GasolineBut.setIcon(img);
    }//GEN-LAST:event_GasolineButMouseEntered

    private void GasolineButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GasolineButMouseExited
        Icon img = new ImageIcon(getClass().getResource("images/Asset 13.png"));
                GasolineBut.setIcon(img);
    }//GEN-LAST:event_GasolineButMouseExited

    private void LpgButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LpgButMouseEntered
        Icon img = new ImageIcon(getClass().getResource("images/Asset 33.png"));
                LpgBut.setIcon(img);
    }//GEN-LAST:event_LpgButMouseEntered

    private void LpgButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LpgButMouseExited
        Icon img = new ImageIcon(getClass().getResource("images/Asset 14.png"));
                LpgBut.setIcon(img);
    }//GEN-LAST:event_LpgButMouseExited

    private void ExpensesButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExpensesButMouseEntered
        Icon img = new ImageIcon(getClass().getResource("images/Asset 41.png"));
                ExpensesBut.setIcon(img);
    }//GEN-LAST:event_ExpensesButMouseEntered

    private void ExpensesButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExpensesButMouseExited
        Icon img = new ImageIcon(getClass().getResource("images/Asset 39.png"));
                ExpensesBut.setIcon(img);
    }//GEN-LAST:event_ExpensesButMouseExited

    private void IncomesButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IncomesButMouseEntered
        Icon img = new ImageIcon(getClass().getResource("images/Asset 42.png"));
                IncomesBut.setIcon(img);
    }//GEN-LAST:event_IncomesButMouseEntered

    private void IncomesButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IncomesButMouseExited
        Icon img = new ImageIcon(getClass().getResource("images/Asset 40.png"));
                IncomesBut.setIcon(img);
    }//GEN-LAST:event_IncomesButMouseExited

    private void PersonnelTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PersonnelTabMouseClicked
        if(!persframe.isVisible())
        {
            financeframe.setVisible(false);
            sumPane.setVisible(false);
            persframe.setVisible(true);
        }
    }//GEN-LAST:event_PersonnelTabMouseClicked

    private void sumTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumTabMouseClicked
        if(!sumPane.isVisible()){
            persframe.setVisible(false);
            financeframe.setVisible(false);
            sumPane.setVisible(true);
        }
    }//GEN-LAST:event_sumTabMouseClicked

    private void FInanceTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FInanceTabMouseClicked
       if(!financeframe.isVisible()){
            persframe.setVisible(false);
            sumPane.setVisible(false);
            financeframe.setVisible(true);   
        }
    }//GEN-LAST:event_FInanceTabMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DieselBut;
    private javax.swing.JButton ExpensesBut;
    private javax.swing.JLabel FInanceTab;
    private javax.swing.JButton GasolineBut;
    private javax.swing.JButton IncomesBut;
    private javax.swing.JButton LpgBut;
    private javax.swing.JButton ManageFinanceBut;
    private javax.swing.JButton ManagePersonelBut;
    private javax.swing.JLabel PersonnelTab;
    private javax.swing.JButton ReportBut;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLayeredPane sumPane;
    private javax.swing.JLabel sumTab;
    // End of variables declaration//GEN-END:variables
}
