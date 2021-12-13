/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.FinanceManager;

import business.DB4OUtil.DB4OUtil;
import business.Organization.OrganizationDirectory;
import business.EmployeeManagement;
import business.Organization.FinanceOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.BudgetWorkRequest;
import business.WorkQueue.WorkRequest;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ApoorvaShewale
 */
@SuppressWarnings("unchecked")
public class FinanceManagerWorkerPanel extends javax.swing.JPanel {

    /**
     * Creates new form MentalHealthWorkerjPanel
     */
    private EmployeeManagement system;
    private OrganizationDirectory directory;
    private Organization organization,org;
    private JPanel container,logincontainerJPanel;
    private UserAccount user;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private DefaultComboBoxModel days=new DefaultComboBoxModel();
    private DefaultComboBoxModel days1=new DefaultComboBoxModel();
    public FinanceManagerWorkerPanel(JPanel logincontainerJPanel,JPanel container,Organization organization, UserAccount user, EmployeeManagement system) {
        initComponents();
        this.system=system;
        this.container=container;
        this.logincontainerJPanel=logincontainerJPanel;
        this.directory=directory;
        this.organization=(FinanceOrganization)organization;
        this.user=user;
        this.loggedmhwjLabel.setText("Welcome, "+user.getEmployee());
        popBudgetBonusRequest();
        popBudgetAssetRequest();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loggedmhwjLabel = new javax.swing.JLabel();
        networknamejLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        messagejTextArea = new javax.swing.JTextArea();
        approveBonusjButton = new javax.swing.JButton();
        declineBonusjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        budgetbonusRequestsjTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        assetsbudgetTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        messagejTextArea1 = new javax.swing.JTextArea();
        approveAssetsjButton = new javax.swing.JButton();
        declineAssetsjButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(237, 226, 242));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        loggedmhwjLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        loggedmhwjLabel.setText("Logged Username");
        loggedmhwjLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        networknamejLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        networknamejLabel.setText("Finance Manager Dashboard");
        networknamejLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(networknamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loggedmhwjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loggedmhwjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(networknamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Budget for Bonus and Events", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Responce");

        messagejTextArea.setColumns(20);
        messagejTextArea.setRows(5);
        jScrollPane3.setViewportView(messagejTextArea);

        approveBonusjButton.setBackground(new java.awt.Color(175, 180, 209));
        approveBonusjButton.setText("Approve");
        approveBonusjButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        approveBonusjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveBonusjButtonActionPerformed(evt);
            }
        });

        declineBonusjButton.setBackground(new java.awt.Color(175, 180, 209));
        declineBonusjButton.setText("Decline");
        declineBonusjButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        declineBonusjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineBonusjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(declineBonusjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(approveBonusjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(approveBonusjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(declineBonusjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jScrollPane1.setBackground(new java.awt.Color(237, 226, 242));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Budget for Bonus and Events", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        budgetbonusRequestsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request", "Sender", "Receiver", "Budget", "Message", "Result", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        budgetbonusRequestsjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                budgetbonusRequestsjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(budgetbonusRequestsjTable);

        jScrollPane5.setBackground(new java.awt.Color(237, 226, 242));
        jScrollPane5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Budget for Assets", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        assetsbudgetTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request", "Sender", "Receiver", "Budget", "Message", "Result", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        assetsbudgetTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                assetsbudgetTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(assetsbudgetTable);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Budget for Assets", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("Response");

        messagejTextArea1.setColumns(20);
        messagejTextArea1.setRows(5);
        jScrollPane6.setViewportView(messagejTextArea1);

        approveAssetsjButton.setBackground(new java.awt.Color(175, 180, 209));
        approveAssetsjButton.setText("Approve");
        approveAssetsjButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        approveAssetsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveAssetsjButtonActionPerformed(evt);
            }
        });

        declineAssetsjButton1.setBackground(new java.awt.Color(175, 180, 209));
        declineAssetsjButton1.setText("Decline");
        declineAssetsjButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        declineAssetsjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineAssetsjButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(declineAssetsjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(approveAssetsjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(approveAssetsjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(declineAssetsjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void budgetbonusRequestsjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_budgetbonusRequestsjTableMouseClicked
        int selectedRow = budgetbonusRequestsjTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select Budget Request");
            messagejTextArea.setText("");
            return;
        }
        
        BudgetWorkRequest request = (BudgetWorkRequest)budgetbonusRequestsjTable.getValueAt(selectedRow, 0);
        
        messagejTextArea.setText(request.getRequesteResult());
    }//GEN-LAST:event_budgetbonusRequestsjTableMouseClicked

    private void approveBonusjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveBonusjButtonActionPerformed
        int selectedRow = budgetbonusRequestsjTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select Budget Request");
            return;
        }
        
        String message = messagejTextArea.getText();
        if(message.isEmpty()){
            JOptionPane.showMessageDialog(this, "Message is Required", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        BudgetWorkRequest request = (BudgetWorkRequest)budgetbonusRequestsjTable.getValueAt(selectedRow, 0);
        
        request.setReceiver(user);
        request.setStatus("Approved");
        request.setRequesteResult(message);
        messagejTextArea.setText("");
        JOptionPane.showMessageDialog(null, "Bonus and Events Budget Request Approved");
        dB4OUtil.storeSystem(system);
        popBudgetBonusRequest();
        
    }//GEN-LAST:event_approveBonusjButtonActionPerformed

    private void assetsbudgetTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assetsbudgetTableMouseClicked
        int selectedRow = assetsbudgetTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select Budget Request");
            messagejTextArea1.setText("");
            return;
        }
        
        BudgetWorkRequest request = (BudgetWorkRequest)assetsbudgetTable.getValueAt(selectedRow, 0);
        
        messagejTextArea1.setText(request.getRequesteResult());
    }//GEN-LAST:event_assetsbudgetTableMouseClicked

    private void approveAssetsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveAssetsjButtonActionPerformed
        int selectedRow = assetsbudgetTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select Budget Request");
            return;
        }
        
        String message = messagejTextArea1.getText();
        if(message.isEmpty()){
            JOptionPane.showMessageDialog(this, "Message is Required", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        BudgetWorkRequest request = (BudgetWorkRequest)assetsbudgetTable.getValueAt(selectedRow, 0);
        
        request.setReceiver(user);
        request.setStatus("Approved");
        request.setRequesteResult(message);
        messagejTextArea1.setText("");
        JOptionPane.showMessageDialog(null, "Asset Budget Request Approved");
        dB4OUtil.storeSystem(system);
        
        popBudgetAssetRequest();
    }//GEN-LAST:event_approveAssetsjButtonActionPerformed

    private void declineBonusjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineBonusjButtonActionPerformed
        int selectedRow = budgetbonusRequestsjTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select Budget Request");
            return;
        }
        
        String message = messagejTextArea.getText();
        if(message.isEmpty()){
            JOptionPane.showMessageDialog(this, "Message is Required", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        BudgetWorkRequest request = (BudgetWorkRequest)budgetbonusRequestsjTable.getValueAt(selectedRow, 0);
        
        request.setReceiver(user);
        request.setStatus("Declined");
        request.setRequesteResult(message);
        messagejTextArea.setText("");
        JOptionPane.showMessageDialog(null, "Bonus and Events Budget Request Declined");
        dB4OUtil.storeSystem(system);
        
        popBudgetBonusRequest();
    }//GEN-LAST:event_declineBonusjButtonActionPerformed

    private void declineAssetsjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineAssetsjButton1ActionPerformed
        int selectedRow = assetsbudgetTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select Budget Request");
            return;
        }
        
        String message = messagejTextArea1.getText();
        if(message.isEmpty()){
            JOptionPane.showMessageDialog(this, "Message is Required", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        BudgetWorkRequest request = (BudgetWorkRequest)assetsbudgetTable.getValueAt(selectedRow, 0);
        
        request.setReceiver(user);
        request.setStatus("Declined");
        request.setRequesteResult(message);
        messagejTextArea1.setText("");
        JOptionPane.showMessageDialog(null, "Asset Budget Request Declined");
        dB4OUtil.storeSystem(system);
        
        popBudgetAssetRequest();
    }//GEN-LAST:event_declineAssetsjButton1ActionPerformed

    public void popBudgetBonusRequest(){
        DefaultTableModel model = (DefaultTableModel) budgetbonusRequestsjTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            String budgetfor = ((BudgetWorkRequest) request).getBudgetfor();
            if(budgetfor.equalsIgnoreCase("Bonus and Events")){
                Object[] row = new Object[7];
                row[0] = request;
                row[1] = (request.getSender()!=null)?request.getSender():"";
                row[2] = (request.getReceiver()!=null)?request.getReceiver():"";
                row[3] =String.valueOf(((BudgetWorkRequest) request).getBudget());
                row[4] = request.getMessage();
                String result = ((BudgetWorkRequest) request).getRequesteResult();
                row[5] = result == null ? "Waiting" : result;
                row[6] = request.getStatus();
                model.addRow(row);
            }
        }
    }
    
    public void popBudgetAssetRequest(){
        DefaultTableModel model = (DefaultTableModel) assetsbudgetTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            String budgetfor = ((BudgetWorkRequest) request).getBudgetfor();
            if(budgetfor.equalsIgnoreCase("Assets")){
                Object[] row = new Object[7];
                row[0] = request;
                row[1] = (request.getSender()!=null)?request.getSender():"";
                row[2] = (request.getReceiver()!=null)?request.getReceiver():"";
                row[3] =String.valueOf(((BudgetWorkRequest) request).getBudget());
                row[4] = request.getMessage();
                String result = ((BudgetWorkRequest) request).getRequesteResult();
                row[5] = result == null ? "Waiting" : result;
                row[6] = request.getStatus();
                model.addRow(row);
            }
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveAssetsjButton;
    private javax.swing.JButton approveBonusjButton;
    private javax.swing.JTable assetsbudgetTable;
    private javax.swing.JTable budgetbonusRequestsjTable;
    private javax.swing.JButton declineAssetsjButton1;
    private javax.swing.JButton declineBonusjButton;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel loggedmhwjLabel;
    private javax.swing.JTextArea messagejTextArea;
    private javax.swing.JTextArea messagejTextArea1;
    private javax.swing.JLabel networknamejLabel;
    // End of variables declaration//GEN-END:variables
}
