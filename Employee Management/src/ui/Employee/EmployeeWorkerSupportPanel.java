/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Employee;

import business.DB4OUtil.DB4OUtil;
import business.Organization.OrganizationDirectory;
import business.EmployeeManagement;
import business.Organization.HROrganization;
import business.Organization.Organization;
import business.Organization.SupportOrganization;
import business.UserAccount.UserAccount;
import business.WorkQueue.AssetWorkRequest;
import business.WorkQueue.ITHelpDeskWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author herikahareshkoshti
 */
@SuppressWarnings("unchecked")
public class EmployeeWorkerSupportPanel extends javax.swing.JPanel {

    /**
     * Creates new form MentalHealthWorkerjPanel
     */
    private EmployeeManagement system;
    private OrganizationDirectory directory;
    private JPanel container,logincontainerJPanel;
    private UserAccount user;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private Organization org=null;
    public EmployeeWorkerSupportPanel(JPanel logincontainerJPanel,JPanel container,OrganizationDirectory directory, UserAccount user, EmployeeManagement system) {
        initComponents();
        this.system=system;
        this.container=container;
        this.logincontainerJPanel=logincontainerJPanel;
        this.directory=directory;
        this.user=user;
        this.loggedmhwjLabel.setText("Welcome, "+user.getEmployee());
        
        popITHelpRequest();
        popAssetRequest();
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
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ithelpRequestsjTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        requestITHelptjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        messagejTextArea = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        requestAssetsjButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        messagejTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        assetsRequestsjTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(237, 226, 242));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        loggedmhwjLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        loggedmhwjLabel.setText("Logged Username");
        loggedmhwjLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        networknamejLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        networknamejLabel.setText("IT Help And Asset Request");
        networknamejLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButton4.setBackground(new java.awt.Color(175, 180, 209));
        jButton4.setText("<< Back");
        jButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(networknamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loggedmhwjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loggedmhwjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(networknamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setBackground(new java.awt.Color(237, 226, 242));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IT Help Desk Support Requests", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        ithelpRequestsjTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ithelpRequestsjTable.setGridColor(java.awt.SystemColor.window);
        ithelpRequestsjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ithelpRequestsjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ithelpRequestsjTable);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IT Help Desk Request", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        requestITHelptjButton.setBackground(new java.awt.Color(175, 180, 209));
        requestITHelptjButton.setText("Request");
        requestITHelptjButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        requestITHelptjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestITHelptjButtonActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Message");

        messagejTextArea.setColumns(20);
        messagejTextArea.setRows(5);
        jScrollPane2.setViewportView(messagejTextArea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(requestITHelptjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(requestITHelptjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Assets Request", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        requestAssetsjButton1.setBackground(new java.awt.Color(175, 180, 209));
        requestAssetsjButton1.setText("Request");
        requestAssetsjButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        requestAssetsjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestAssetsjButton1ActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Message");

        messagejTextArea1.setColumns(20);
        messagejTextArea1.setRows(5);
        jScrollPane4.setViewportView(messagejTextArea1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(requestAssetsjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(requestAssetsjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setBackground(new java.awt.Color(237, 226, 242));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Asset Requests", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        assetsRequestsjTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        assetsRequestsjTable1.setGridColor(java.awt.SystemColor.window);
        assetsRequestsjTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                assetsRequestsjTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(assetsRequestsjTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ithelpRequestsjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ithelpRequestsjTableMouseClicked
        int selectedRow = ithelpRequestsjTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select Budget");
            return;
        }
    }//GEN-LAST:event_ithelpRequestsjTableMouseClicked

    private void requestITHelptjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestITHelptjButtonActionPerformed
        String message = messagejTextArea.getText();
        if(message.isEmpty()){
            JOptionPane.showMessageDialog(this, "Message is Required", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        ITHelpDeskWorkRequest itHelp = new ITHelpDeskWorkRequest();
        itHelp.setMessage(message);
        itHelp.setSender(user);
        itHelp.setStatus("Requested");

        Organization supOrg=null;
        for(Organization orgs : system.getOrganizationDirectory().getOrganizationList()){
            if (orgs instanceof SupportOrganization){
                supOrg = orgs;
                break;
            }
        }

        if (supOrg!=null){
            supOrg.getWorkQueue().getWorkRequestList().add(itHelp);
            user.getWorkQueue().getWorkRequestList().add(itHelp);
            messagejTextArea.setText("");
            JOptionPane.showMessageDialog(null, "IT Help Request Sent");
        }

        dB4OUtil.storeSystem(system);
        popITHelpRequest();
    }//GEN-LAST:event_requestITHelptjButtonActionPerformed

    private void requestAssetsjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestAssetsjButton1ActionPerformed
        String message = messagejTextArea1.getText();
        if(message.isEmpty()){
            JOptionPane.showMessageDialog(this, "Message is Required", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        AssetWorkRequest assetR = new AssetWorkRequest();
        assetR.setMessage(message);
        assetR.setSender(user);
        assetR.setStatus("Requested");

        Organization supOrg=null;
        for(Organization orgs : system.getOrganizationDirectory().getOrganizationList()){
            if (orgs instanceof SupportOrganization){
                supOrg = orgs;
                break;
            }
        }

        if (supOrg!=null){
            supOrg.getWorkQueue().getWorkRequestList().add(assetR);
            user.getWorkQueue().getWorkRequestList().add(assetR);
            messagejTextArea1.setText("");
            JOptionPane.showMessageDialog(null, "Asset Request Sent");
        }

        dB4OUtil.storeSystem(system);
        popAssetRequest();
    }//GEN-LAST:event_requestAssetsjButton1ActionPerformed

    private void assetsRequestsjTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assetsRequestsjTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_assetsRequestsjTable1MouseClicked

    public void popITHelpRequest(){
        DefaultTableModel model = (DefaultTableModel) ithelpRequestsjTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : user.getWorkQueue().getWorkRequestList()){
            String type=String.valueOf(request);
            if(type.contains("business.WorkQueue.ITHelpDeskWorkRequest")){
                Object[] row = new Object[7];
                row[0] = request;
                row[1] = (request.getSender()!=null)?request.getSender():"";
                row[2] = (request.getReceiver()!=null)?request.getReceiver():"";
                row[3] = request.getMessage();
                String result = ((ITHelpDeskWorkRequest) request).getRequesteResult();
                row[4] = result == null ? "Waiting" : result;
                row[5] = request.getStatus();
                model.addRow(row);
            }
        }
    }
    
    public void popAssetRequest(){
        DefaultTableModel model = (DefaultTableModel) assetsRequestsjTable1.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : user.getWorkQueue().getWorkRequestList()){
            String type=String.valueOf(request);
            if(type.contains("business.WorkQueue.AssetWorkRequest")){
                Object[] row = new Object[7];
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
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable assetsRequestsjTable1;
    private javax.swing.JTable ithelpRequestsjTable;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel loggedmhwjLabel;
    private javax.swing.JTextArea messagejTextArea;
    private javax.swing.JTextArea messagejTextArea1;
    private javax.swing.JLabel networknamejLabel;
    private javax.swing.JButton requestAssetsjButton1;
    private javax.swing.JButton requestITHelptjButton;
    // End of variables declaration//GEN-END:variables
}
