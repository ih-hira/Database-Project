
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anonymous
 */
public class EmployeeInformation extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeInformation
     */
    DatabaseHandler databaseHandler;
    public EmployeeInformation() {
        initComponents();
    }
    public EmployeeInformation(DatabaseHandler ob) {
        initComponents();
        databaseHandler = ob;
        ResultSet rs = databaseHandler.fetchTableData("employee");
        employeeTable.setModel(DbUtils.resultSetToTableModel(rs));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        eSexMale = new javax.swing.JRadioButton();
        eSexFemale = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        eID = new javax.swing.JTextField();
        eName = new javax.swing.JTextField();
        eAge = new javax.swing.JTextField();
        eQuali = new javax.swing.JTextField();
        eExp = new javax.swing.JTextField();
        eSalary = new javax.swing.JTextField();
        eContactNo = new javax.swing.JTextField();
        addRec = new javax.swing.JButton();
        updateRec = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        backBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 700));

        jLabel1.setText("Employee ID:");

        jLabel2.setText("Employee Name:");

        jLabel3.setText("Age:");

        jLabel4.setText("Sex:");

        buttonGroup1.add(eSexMale);
        eSexMale.setText("MALE");

        buttonGroup1.add(eSexFemale);
        eSexFemale.setText("FEMALE");

        jLabel5.setText("Qualification:");

        jLabel6.setText("Experience:");

        jLabel7.setText("Salary:");

        jLabel8.setText("Contact No. :");

        addRec.setText("Add New Record");
        addRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecActionPerformed(evt);
            }
        });

        updateRec.setText("Update Record");
        updateRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRecActionPerformed(evt);
            }
        });

        Refresh.setText("Refresh Record");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employeeTable);

        jLabel9.setText("Employee Information");

        backBTN.setText("Back");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(eID, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(eSexMale))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(addRec)
                            .addComponent(Refresh))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eQuali)
                                    .addComponent(eExp)
                                    .addComponent(eSalary)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(eSexFemale)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(eContactNo)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(backBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(updateRec))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eName)
                            .addComponent(eAge))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(284, 284, 284))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(eID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(eName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(eAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(eSexMale)
                                .addComponent(jLabel4))
                            .addComponent(eSexFemale))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(eQuali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(eExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(eSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(eContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addRec)
                            .addComponent(updateRec))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Refresh)
                            .addComponent(backBTN)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecActionPerformed
        // TODO add your handling code here:
        String id = eID.getText().toString();
        String name = eName.getText().toString();
        int age = Integer.parseInt( eAge.getText().toString());
        eSexMale.setActionCommand("MALE");
        eSexFemale.setActionCommand("FEMALE");
        String sex = buttonGroup1.getSelection().getActionCommand();
        String qual = eQuali.getText().toString();
        String exp = eExp.getText().toString();
        int salary = Integer.parseInt( eSalary.getText().toString());
        String cont = eContactNo.getText().toString();
        if(id.isEmpty() || name.isEmpty()||sex.isEmpty()||qual.isEmpty()||exp.isEmpty()||cont.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Fill all the field");
        }
        else if(databaseHandler.insertDataIntoEmployee(id, name,age, sex,qual, exp,salary, cont))
        {
            JOptionPane.showMessageDialog(null,"New Record Inserted");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Data Already Inserted For This ID");
        }
        
    }//GEN-LAST:event_addRecActionPerformed

    private void employeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeTableMouseClicked
        // TODO add your handling code here:
        int i = employeeTable.getSelectedRow();
        TableModel tbModel = employeeTable.getModel();
        eID.setText(tbModel.getValueAt(i, 0).toString());
        eName.setText(tbModel.getValueAt(i, 1).toString());
        eAge.setText(tbModel.getValueAt(i, 2).toString());
        String sex = tbModel.getValueAt(i, 3).toString();
        if (sex.equals("MALE")) 
        {
            eSexMale.setSelected(true); 
        } else 
        {
            eSexFemale.setSelected(true); 
        } 
        eQuali.setText(tbModel.getValueAt(i, 4).toString());
        eExp.setText(tbModel.getValueAt(i, 5).toString());
        eSalary.setText(tbModel.getValueAt(i, 6).toString());
        eContactNo.setText(tbModel.getValueAt(i, 7).toString());
    }//GEN-LAST:event_employeeTableMouseClicked

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MainDashboard(databaseHandler).setVisible(true);
    }//GEN-LAST:event_backBTNActionPerformed

    private void updateRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRecActionPerformed
        // TODO add your handling code here:
        String id = eID.getText().toString();
        String name = eName.getText().toString();
        int age = Integer.parseInt( eAge.getText().toString());
        eSexMale.setActionCommand("MALE");
        eSexFemale.setActionCommand("FEMALE");
        String sex = buttonGroup1.getSelection().getActionCommand();
        String qual = eQuali.getText().toString();
        String exp = eExp.getText().toString();
        int salary = Integer.parseInt( eSalary.getText().toString());
        String contNo = eContactNo.getText().toString();
        if(databaseHandler.updateDataIntoEmployee(id, name, age, sex, qual, exp, salary, contNo))
        {
            JOptionPane.showMessageDialog(null,"Update Successfully");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Failed Update");
        }
    }//GEN-LAST:event_updateRecActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        ResultSet rs = databaseHandler.fetchTableData("employee");
        employeeTable.setModel(DbUtils.resultSetToTableModel(rs));
    }//GEN-LAST:event_RefreshActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Refresh;
    private javax.swing.JButton addRec;
    private javax.swing.JButton backBTN;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField eAge;
    private javax.swing.JTextField eContactNo;
    private javax.swing.JTextField eExp;
    private javax.swing.JTextField eID;
    private javax.swing.JTextField eName;
    private javax.swing.JTextField eQuali;
    private javax.swing.JTextField eSalary;
    private javax.swing.JRadioButton eSexFemale;
    private javax.swing.JRadioButton eSexMale;
    private javax.swing.JTable employeeTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updateRec;
    // End of variables declaration//GEN-END:variables
}
