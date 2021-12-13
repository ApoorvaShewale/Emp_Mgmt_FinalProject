/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AssetManager;

import business.DB4OUtil.DB4OUtil;
import business.Organization.OrganizationDirectory;
import business.EmployeeManagement;
import business.Organization.FinanceOrganization;
import business.Organization.HROrganization;
import business.Organization.Organization;
import business.Organization.SupportOrganization;
import business.UserAccount.UserAccount;
import business.WorkQueue.AssetWorkRequest;
import business.WorkQueue.BudgetWorkRequest;
import business.WorkQueue.WorkRequest;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Apoorva Shewale
 */
@SuppressWarnings("unchecked")
public class AssetManagerWorkerPanel extends javax.swing.JPanel {

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
    public AssetManagerWorkerPanel(JPanel logincontainerJPanel,JPanel container,Organization organization, UserAccount user, EmployeeManagement system) {
        initComponents();
        this.system=system;
        this.container=container;
        this.logincontainerJPanel=logincontainerJPanel;
        this.directory=directory;
        this.organization=(SupportOrganization)organization;
        this.user=user;
        this.loggedmhwjLabel.setText("Welcome, "+user.getEmployee());
        popAssetManagerRequest();
        popBudgetRequest();
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
        approveAssetjButton = new javax.swing.JButton();
        declineAssetjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        assetRequestsjTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        budgetjTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        requestBudgetjButton = new javax.swing.JButton();
        budgetjTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        messagejTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(237, 226, 242));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        loggedmhwjLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        loggedmhwjLabel.setText("Logged Username");
        loggedmhwjLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        networknamejLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        networknamejLabel.setText("Asset Manager Dashboard");
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
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Asset Response", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Responce");

        messagejTextArea.setColumns(20);
        messagejTextArea.setRows(5);
        jScrollPane3.setViewportView(messagejTextArea);

        approveAssetjButton.setBackground(new java.awt.Color(175, 180, 209));
        approveAssetjButton.setText("Approve");
        approveAssetjButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        approveAssetjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveAssetjButtonActionPerformed(evt);
            }
        });

        declineAssetjButton.setBackground(new java.awt.Color(175, 180, 209));
        declineAssetjButton.setText("Decline");
        declineAssetjButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        declineAssetjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineAssetjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(declineAssetjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(approveAssetjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3)))
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
                    .addComponent(approveAssetjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(declineAssetjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jScrollPane1.setBackground(new java.awt.Color(237, 226, 242));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Asset Requests", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        assetRequestsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request", "Sender", "Receiver", "Message", "Result", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        assetRequestsjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                assetRequestsjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(assetRequestsjTable);

        jScrollPane2.setBackground(new java.awt.Color(237, 226, 242));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Budget Request forAssets", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        budgetjTable.setModel(new javax.swing.table.DefaultTableModel(
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
        budgetjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                budgetjTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(budgetjTable);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create Asset Budget Request", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        requestBudgetjButton.setBackground(new java.awt.Color(175, 180, 209));
        requestBudgetjButton.setText("Request");
        requestBudgetjButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        requestBudgetjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestBudgetjButtonActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Budget");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Message");

        messagejTextArea1.setColumns(20);
        messagejTextArea1.setRows(5);
        jScrollPane4.setViewportView(messagejTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(budgetjTextField))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(requestBudgetjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(budgetjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(requestBudgetjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assetRequestsjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assetRequestsjTableMouseClicked
        int selectedRow = assetRequestsjTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select Asset Request");
            messagejTextArea.setText("");
            return;
        }
        
        AssetWorkRequest request = (AssetWorkRequest)assetRequestsjTable.getValueAt(selectedRow, 0);
        
        messagejTextArea.setText(request.getRequesteResult());
    }//GEN-LAST:event_assetRequestsjTableMouseClicked

    private void approveAssetjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveAssetjButtonActionPerformed
        int selectedRow = assetRequestsjTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select Asset Request");
            return;
        }
        
        String message = messagejTextArea.getText();
        
        if(message.isEmpty()){
            JOptionPane.showMessageDialog(this, "Message is Required", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        AssetWorkRequest request = (AssetWorkRequest)assetRequestsjTable.getValueAt(selectedRow, 0);
        
        request.setReceiver(user);
        request.setStatus("Approved");
        request.setRequesteResult(message);
        messagejTextArea.setText("");
        JOptionPane.showMessageDialog(null, "Asset Request Approved");
        dB4OUtil.storeSystem(system);
        popAssetManagerRequest();
        
    }//GEN-LAST:event_approveAssetjButtonActionPerformed

    private void declineAssetjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineAssetjButtonActionPerformed
        int selectedRow = assetRequestsjTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select Asset Request");
            return;
        }
        
        String message = messagejTextArea.getText();
        
        if(message.isEmpty()){
            JOptionPane.showMessageDialog(this, "Message is Required", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        AssetWorkRequest request = (AssetWorkRequest)assetRequestsjTable.getValueAt(selectedRow, 0);
        
        request.setReceiver(user);
        request.setStatus("Declined");
        request.setRequesteResult(message);
        messagejTextArea.setText("");
        JOptionPane.showMessageDialog(null, "Asset Request Decline");
        dB4OUtil.storeSystem(system);
        popAssetManagerRequest();
    }//GEN-LAST:event_declineAssetjButtonActionPerformed

    private void budgetjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_budgetjTableMouseClicked
        int selectedRow = budgetjTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select Budget");
            return;
        }
    }//GEN-LAST:event_budgetjTableMouseClicked

    private void requestBudgetjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestBudgetjButtonActionPerformed
        String message = messagejTextArea1.getText();
        String budget = budgetjTextField.getText();
        double budgetCost;
        if(message.isEmpty()){
            JOptionPane.showMessageDialog(this, "Message is Required", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try{

            budgetCost=Double.parseDouble(budget);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Enter Valid Cost.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        BudgetWorkRequest budgetRequest = new BudgetWorkRequest();
        budgetRequest.setMessage(message);
        budgetRequest.setSender(user);
        budgetRequest.setStatus("Requested");
        budgetRequest.setBudget(budgetCost);
        budgetRequest.setBudgetfor("Assets");

        Organization finOrg=null;
        for(Organization orgs : system.getOrganizationDirectory().getOrganizationList()){
            if (orgs instanceof FinanceOrganization){
                finOrg = orgs;
                break;
            }
        }

        if (finOrg!=null){
            finOrg.getWorkQueue().getWorkRequestList().add(budgetRequest);
            user.getWorkQueue().getWorkRequestList().add(budgetRequest);
            messagejTextArea1.setText("");
            budgetjTextField.setText("");
            JOptionPane.showMessageDialog(null, "Budget Request Sent");
        }

        dB4OUtil.storeSystem(system);
        popBudgetRequest();
    }//GEN-LAST:event_requestBudgetjButtonActionPerformed

    public void popAssetManagerRequest(){
        DefaultTableModel model = (DefaultTableModel) assetRequestsjTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            String type=String.valueOf(request);
            if(type.contains("business.WorkQueue.AssetWorkRequest")){
                Object[] row = new Object[6];
                row[0] = request;
                row[1] = (request.getSender()!=null)?request.getSender():"";
                row[2] = (request.getReceiver()!=null)?request.getReceiver():"";
                row[3] = request.getMessage();
                String result = ((AssetWorkRequest) request).getRequesteResult();
                row[4] = result == null ? "Waiting" : result;
                row[5] = request.getStatus();
                model.addRow(row);
            }
        }
    }
    public void popBudgetRequest(){
        DefaultTableModel model = (DefaultTableModel) budgetjTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : user.getWorkQueue().getWorkRequestList()){
            String type=String.valueOf(request);
            if(type.contains("business.WorkQueue.BudgetWorkRequest")){
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
    private javax.swing.JButton approveAssetjButton;
    private javax.swing.JTable assetRequestsjTable;
    private javax.swing.JTable budgetjTable;
    private javax.swing.JTextField budgetjTextField;
    private javax.swing.JButton declineAssetjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel loggedmhwjLabel;
    private javax.swing.JTextArea messagejTextArea;
    private javax.swing.JTextArea messagejTextArea1;
    private javax.swing.JLabel networknamejLabel;
    private javax.swing.JButton requestBudgetjButton;
    // End of variables declaration//GEN-END:variables
}
