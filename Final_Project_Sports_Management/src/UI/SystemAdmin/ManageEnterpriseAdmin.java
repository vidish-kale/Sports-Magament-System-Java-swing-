/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdmin;
;
import Project.MainSystem;
import Project.Person.Person;
import Project.Enterprise.Enterprise;
import Project.Network.Network;
import Project.Role.CommunityAdminRole;
import Project.Role.PhysicianAdminRole;
import Project.Role.SelectorAdminRole;
import Project.Role.SchedulerAdminRole;
import Project.Role.CoachAdminRole;
import Project.Role.ProviderAdminRole;
import Project.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Project.MainSystem;
import Project.Person.Person;
import Project.Enterprise.Enterprise;
import Project.Network.Network;
import Project.Role.CommunityAdminRole;
import Project.Role.PhysicianAdminRole;
import Project.Role.SelectorAdminRole;
import Project.Role.SchedulerAdminRole;
import Project.Role.CoachAdminRole;
import Project.Role.ProviderAdminRole;
import Project.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vedant
 */
public class ManageEnterpriseAdmin extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseAdmin
     */
    private JPanel panelWorkArea;
    private MainSystem system;
    
    public ManageEnterpriseAdmin(JPanel userProcessContainer,MainSystem system) {
        initComponents();
        this.panelWorkArea=userProcessContainer;
        this.system=system;
        populateTableEnterpriseAdmin();
        populateComboBoxNetwork();
    }
    //populate admins
    private void populateTableEnterpriseAdmin() {
        DefaultTableModel model = (DefaultTableModel) tblEnterprise.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getNetworkName();
                    row[2] = userAccount;

                    model.addRow(row);
                }
            }
        }
    }
    //populate user admins
    private void populateComboBoxNetwork() {
        comboNetwork.removeAllItems();

        for (Network network : system.getNetworkList()) {
            comboNetwork.addItem(network);
        }
    }
    //populate enterprise - employee combo
    private void populateComboBoxEnterprise(Network network) {
        comboType.removeAllItems();

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            comboType.addItem(enterprise);
        }

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblT = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnterprise = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        txtAdmin = new javax.swing.JTextField();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        comboNetwork = new javax.swing.JComboBox();
        comboType = new javax.swing.JComboBox();
        lbl4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lbl5 = new javax.swing.JLabel();
        txtPasword = new javax.swing.JPasswordField();
        btnBack = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(243, 235, 255));

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));

        lblT.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblT.setForeground(new java.awt.Color(255, 255, 255));
        lblT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblT.setText("Manage Enterprise Admin");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblT)
                .addGap(0, 0, 0))
        );

        tblEnterprise.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tblEnterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Country", "Enterpirse", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEnterprise);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Add User", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 24), new java.awt.Color(153, 0, 153))); // NOI18N
        jPanel4.setOpaque(false);

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAdd.setText("Add Admin");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDelete.setText("Delete Admin");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lbl1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl1.setText("Enterprise ");

        txtAdmin.setForeground(new java.awt.Color(153, 0, 153));

        lbl2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl2.setText("Admin Name");

        lbl3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl3.setText("Organisation Type");

        comboNetwork.setForeground(new java.awt.Color(153, 0, 153));
        comboNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNetworkActionPerformed(evt);
            }
        });

        comboType.setForeground(new java.awt.Color(153, 0, 153));

        lbl4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl4.setText("Username");

        txtUsername.setForeground(new java.awt.Color(153, 0, 153));

        lbl5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl5.setText("Password");

        txtPasword.setForeground(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdmin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboNetwork, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPasword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboType, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPasword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/CommunityEnterprise/back.png"))); // NOI18N
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(433, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );

        jPanel4.getAccessibleContext().setAccessibleName("Add User\n");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    //populate network combo
    private void comboNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNetworkActionPerformed
        // TODO add your handling code here:
        Network network = (Network)comboNetwork.getSelectedItem();
        if (network != null) {
            populateComboBoxEnterprise(network);
        }
    }//GEN-LAST:event_comboNetworkActionPerformed
    //go to previoys page
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        panelWorkArea.remove(this);
        Component[] componentArray = panelWorkArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkArea sysAdminwjp = (SystemAdminWorkArea) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) panelWorkArea.getLayout();
        layout.previous(panelWorkArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        Enterprise enterprise = (Enterprise) comboType.getSelectedItem();

        String username = txtUsername.getText();
        String password = String.valueOf(txtPasword.getPassword());
        String name = txtAdmin.getText();

        Person person = enterprise.getEmployeeDirectory().createPerson(name);
        if (MainSystem.checkUsernameIsUnique(username)) {
            UserAccount account = null;
            if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Community) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password,person, new CommunityAdminRole());
            } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.scheduler) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, person, new SchedulerAdminRole());
            
            } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Provider) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, person, new ProviderAdminRole());
            } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Coach) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, person, new CoachAdminRole());
            } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Physician) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, person, new PhysicianAdminRole());
            }else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Selector) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, person, new SelectorAdminRole());
            }

            populateTableEnterpriseAdmin();
            txtUsername.setText("");
            txtPasword.setText("");
            txtAdmin.setText("");
        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter unique username", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEnterprise.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            UserAccount p = (UserAccount) tblEnterprise.getValueAt(selectedRow, 2);

            for (Network network : system.getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                        if (p == userAccount) {
                            enterprise.getUserAccountDirectory().getUserAccountList().remove(p);
                            break;
                        }

                    }
                }
            }

            JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
            populateTableEnterpriseAdmin();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox comboNetwork;
    private javax.swing.JComboBox comboType;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lblT;
    private javax.swing.JTable tblEnterprise;
    private javax.swing.JTextField txtAdmin;
    private javax.swing.JPasswordField txtPasword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
