/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.ProjectManager;

import business.DB4OUtil.DB4OUtil;
import business.Organization.OrganizationDirectory;
import business.EmployeeManagement;
import business.Projects.Projects;
import business.Role.EmployeeLogin;
import business.Teams.Teams;
import business.Trainees.Trainees;
import business.Trainings.Trainings;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author herikahareshkoshti
 */
@SuppressWarnings("unchecked")
public class ProjectManagerWorkerTraineesPanel extends javax.swing.JPanel {

    /**
     * Creates new form MentalHealthWorkerjPanel
     */
    private EmployeeManagement system;
    private OrganizationDirectory directory;
    private JPanel container,logincontainerJPanel;
    private UserAccount user;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private Projects project;
    private Trainings training;
    public ProjectManagerWorkerTraineesPanel(JPanel logincontainerJPanel,JPanel container,OrganizationDirectory directory, UserAccount user, EmployeeManagement system,Projects project,Trainings training) {
        initComponents();
        this.system=system;
        this.container=container;
        this.logincontainerJPanel=logincontainerJPanel;
        this.directory=directory;
        this.user=user;
        this.training=training;
        this.project=project;
        this.loggedmhwjLabel.setText("Welcome, "+user.getEmployee());
        
        removeProjectManagerjButton.setVisible(true);
        assignProjectManagerjButton.setVisible(true);
        popProjectMemberComboBox();
        DisplayTrainees();
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
        jPanel2 = new javax.swing.JPanel();
        assignProjectManagerjButton = new javax.swing.JButton();
        removeProjectManagerjButton = new javax.swing.JButton();
        traineejComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        traineesjTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(237, 226, 242));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        loggedmhwjLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        loggedmhwjLabel.setText("Logged Username");
        loggedmhwjLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        networknamejLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        networknamejLabel.setText("Training Trainees Members");
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
                .addComponent(networknamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loggedmhwjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loggedmhwjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(networknamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create / Update Projects", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        assignProjectManagerjButton.setBackground(new java.awt.Color(175, 180, 209));
        assignProjectManagerjButton.setText("Assign");
        assignProjectManagerjButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        assignProjectManagerjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignProjectManagerjButtonActionPerformed(evt);
            }
        });

        removeProjectManagerjButton.setBackground(new java.awt.Color(175, 180, 209));
        removeProjectManagerjButton.setText("Remove");
        removeProjectManagerjButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        removeProjectManagerjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeProjectManagerjButtonActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Trainee");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(116, Short.MAX_VALUE)
                        .addComponent(removeProjectManagerjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addComponent(assignProjectManagerjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(traineejComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(traineejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(removeProjectManagerjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignProjectManagerjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(215, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(237, 226, 242));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Projects", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        traineesjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Training", "Project", "Trainee", "Assigned On", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        traineesjTable.setGridColor(java.awt.SystemColor.window);
        traineesjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                traineesjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(traineesjTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void assignProjectManagerjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignProjectManagerjButtonActionPerformed
        UserAccount trainee = (UserAccount) traineejComboBox.getSelectedItem();
        if(trainee==null) {
            JOptionPane.showMessageDialog(this, "Choose Training Trainee", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        boolean unique=system.getTraineesDirectory().checkIfTraineeIsUnique(training, trainee);
        if(!unique){
            JOptionPane.showMessageDialog(this, "This Trainee is Already Assigned to Training", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        system.getTraineesDirectory().createTrainees(project, training, trainee, "Enrolled");
        JOptionPane.showMessageDialog(null, "New Training Trainee Assigned");
        
        dB4OUtil.storeSystem(system);
        DisplayTrainees();
        popProjectMemberComboBox();
    }//GEN-LAST:event_assignProjectManagerjButtonActionPerformed

    private void removeProjectManagerjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeProjectManagerjButtonActionPerformed
        int selectedRow = traineesjTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select Trainee to Remove Training Trainee.");
            return;
        }
        Trainees trainee = (Trainees)traineesjTable.getValueAt(selectedRow, 2);
        system.getTraineesDirectory().getTraineesList().remove(trainee);
        dB4OUtil.storeSystem(system);
        DisplayTrainees();
        popProjectMemberComboBox();
    }//GEN-LAST:event_removeProjectManagerjButtonActionPerformed

    private void traineesjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_traineesjTableMouseClicked
        int selectedRow = traineesjTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select Training Trainee");
            return;
        }
    }//GEN-LAST:event_traineesjTableMouseClicked

    private void DisplayTrainees() {
        DefaultTableModel model = (DefaultTableModel) traineesjTable.getModel();
        
        model.setRowCount(0);
        for (Trainees trainess : system.getTraineesDirectory().getTraineesList()) {
            if(trainess.getProject().equals(project)){
                Object[] row = new Object[5];
                row[0] = trainess.getTraining();
                row[1] = trainess.getProject();
                row[2] = trainess;
                row[3] = trainess.getAssignedOn();
                row[4] = trainess.getStatus();
                model.addRow(row);
            }
        }
    }
    
    public void popProjectMemberComboBox(){
        traineejComboBox.removeAllItems();
        for (Teams teams : system.getTeamsDirectory().getTeamsList()){
            if(teams.getProject().equals(project)){
                traineejComboBox.addItem(teams.getTeam());
            }
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignProjectManagerjButton;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loggedmhwjLabel;
    private javax.swing.JLabel networknamejLabel;
    private javax.swing.JButton removeProjectManagerjButton;
    private javax.swing.JComboBox traineejComboBox;
    private javax.swing.JTable traineesjTable;
    // End of variables declaration//GEN-END:variables
}
