/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniTwitter;
 

import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellRenderer;

/**
 *
 * @author soneu
 */
public class AdminControlPanel extends javax.swing.JFrame {
 
 
    protected static AdminControlPanel instance;
    private ArrayList<User> list_Number_User;
    private ArrayList<Group> list_Number_Group;
    public ArrayList<String> list_Unique_UserId;
    public ArrayList<String> list_Unique_GroupId;
    Group group = new Group();
    private DefaultMutableTreeNode root = new DefaultMutableTreeNode(group.getRoot());
    private DefaultTreeModel model = new DefaultTreeModel(root);
    private String user_Selected;
    private HashMap<String, UserView> map_userViews = new HashMap<String, UserView>();
  
//    private DefaultTreeModel model = new DefaultTreeModel(root);


     public AdminControlPanel() {
    
        list_Unique_UserId = new ArrayList();
        list_Unique_GroupId = new ArrayList();
        list_Number_User = new ArrayList();
        list_Number_Group = new ArrayList();
 
        initComponents(); 
    }

    public static AdminControlPanel getInstance() {
        if (instance == null) {
            synchronized (AdminControlPanel.class) {
                if (instance == null) {
                    instance = new AdminControlPanel();
                }
            }
        }
        return instance;
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        UserTextArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        GroupTextArea = new javax.swing.JTextArea();
        user_Add_Button = new javax.swing.JButton();
        Group_Add_Button = new javax.swing.JButton();
        UserView_Button = new javax.swing.JButton();
        User_Total_Button = new javax.swing.JButton();
        Group_Total_Button = new javax.swing.JButton();
        message_Total_Button = new javax.swing.JButton();
        positive_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree1);

        UserTextArea.setColumns(20);
        UserTextArea.setRows(5);
        jScrollPane2.setViewportView(UserTextArea);

        GroupTextArea.setColumns(20);
        GroupTextArea.setRows(5);
        jScrollPane3.setViewportView(GroupTextArea);

        user_Add_Button.setText("Add Button");
        user_Add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_Add_ButtonActionPerformed(evt);
            }
        });

        Group_Add_Button.setText("Add Group");
        Group_Add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Group_Add_ButtonActionPerformed(evt);
            }
        });

        UserView_Button.setText("Open User View");
        UserView_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserView_ButtonActionPerformed(evt);
            }
        });

        User_Total_Button.setText("User Total");
        User_Total_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_Total_ButtonActionPerformed(evt);
            }
        });

        Group_Total_Button.setText("Group Total");
        Group_Total_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Group_Total_ButtonActionPerformed(evt);
            }
        });

        message_Total_Button.setText("Message Total");
        message_Total_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                message_Total_ButtonActionPerformed(evt);
            }
        });

        positive_button.setText("Positive %");
        positive_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positive_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Group_Add_Button)
                            .addComponent(user_Add_Button)))
                    .addComponent(UserView_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(message_Total_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(User_Total_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Group_Total_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(positive_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user_Add_Button))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Group_Add_Button))
                        .addGap(18, 18, 18)
                        .addComponent(UserView_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(User_Total_Button)
                            .addComponent(Group_Total_Button))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(message_Total_Button)
                            .addComponent(positive_button))
                        .addContainerGap(75, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void user_Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_Add_ButtonActionPerformed
        
        
       if (UserTextArea.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "It is Empty !!!!!!!!!!! type a user ID", "Error", JOptionPane.INFORMATION_MESSAGE);
       
        } else { //if any id was typed
        
           
            if (!list_Unique_UserId.contains(UserTextArea.getText())) {// typed id is not the same with other id stored in the id list
                
                 if (jTree1.getSelectionPath() == null) {  //  any node is not selected by a User (default)
            
                  User user = new User(UserTextArea.getText());
                  list_Number_User.add(user);
                  
                  DefaultMutableTreeNode userNode = new DefaultMutableTreeNode(user, false);  
                 
                  list_Unique_UserId.add(UserTextArea.getText());
                  map_userViews.put(user.get_UniqueID(), new UserView(list_Number_User, user, list_Unique_UserId,  map_userViews));
              
                  model = (DefaultTreeModel)jTree1.getModel();
                  root = (DefaultMutableTreeNode)model.getRoot();
                  root.add(userNode);
                }
           // a User or a Group has been selected by a User
           else{
            
               
                  DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree1.getSelectionPath().getLastPathComponent();  // this represents which node is selected by a User
                  
                  // a User id has been selected
                  if(selectedNode.getUserObject() instanceof User){
                  
                        User user = new User(UserTextArea.getText());
                        list_Number_User.add(user);
                        
                        DefaultMutableTreeNode userNode = new DefaultMutableTreeNode(user, false);              //Creates a tree node with no parent, no children, initialized with the specified user object, and that allows children only if specified.
                        DefaultMutableTreeNode parentNode = (DefaultMutableTreeNode) selectedNode.getParent();
                        
                        list_Unique_UserId.add(UserTextArea.getText());          
                         model = (DefaultTreeModel)jTree1.getModel();
                         parentNode = (DefaultMutableTreeNode)model.getRoot();
                         parentNode.add(userNode);
                         map_userViews.put(user.get_UniqueID(), new UserView(list_Number_User, user, list_Unique_UserId,  map_userViews));
               
                  }
                  // a Group  has been selected
                   else if(selectedNode.getUserObject() instanceof Group){
                       
                        JOptionPane.showMessageDialog(null, UserTextArea.getText() + " has joined the group ", "Notice", JOptionPane.INFORMATION_MESSAGE);
                        User user = new User(UserTextArea.getText());
                        list_Number_User.add(user);
                        
                        DefaultMutableTreeNode userNode = new DefaultMutableTreeNode(user, false);
                        
                        list_Unique_UserId.add(UserTextArea.getText());                        
                        model = (DefaultTreeModel)jTree1.getModel();                        
                        selectedNode.add(userNode);
                        map_userViews.put(user.get_UniqueID(), new UserView(list_Number_User, user, list_Unique_UserId,  map_userViews));
                      }
           }
     
            }else{
            JOptionPane.showMessageDialog(null, "This user ID already exists on the list", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
            
            }
     model.reload(root); // This shows the updated Tree
     expandAllNodes(jTree1, 0, jTree1.getRowCount());
    
 
    }//GEN-LAST:event_user_Add_ButtonActionPerformed

    private void Group_Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Group_Add_ButtonActionPerformed
        
        
        if (GroupTextArea.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty!!!!!!!!! Type a Group ID!!!!!!!!", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (!list_Unique_GroupId.contains(GroupTextArea.getText())) {
                if (jTree1.getSelectionPath() == null) {
                    Group group = new Group(GroupTextArea.getText());
                    DefaultMutableTreeNode groupNode = new DefaultMutableTreeNode(group, true);
                    list_Number_Group.add(group);
                    list_Unique_GroupId.add(GroupTextArea.getText());
                    model = (DefaultTreeModel)jTree1.getModel();
                    root = (DefaultMutableTreeNode)model.getRoot();
                    root.add(groupNode);
                } else {
                    DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree1.getSelectionPath().getLastPathComponent();
                    
                     if (list_Unique_GroupId.contains(selectedNode.getUserObject().toString())) {
                        Group group = new Group(GroupTextArea.getText());
                        DefaultMutableTreeNode groupNode = new DefaultMutableTreeNode(group, true);
                        list_Number_Group.add(group);
                        list_Unique_GroupId.add(GroupTextArea.getText());
                        selectedNode.add(groupNode);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "This group exists on the list.", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
      model.reload(root);
     expandAllNodes(jTree1, 0, jTree1.getRowCount());
    }//GEN-LAST:event_Group_Add_ButtonActionPerformed

    private void UserView_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserView_ButtonActionPerformed
        if (jTree1.getSelectionPath() == null) {
            JOptionPane.showMessageDialog(null, "Select a user.", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree1.getSelectionPath().getLastPathComponent();
            if (selectedNode.getUserObject() instanceof Group) {
                JOptionPane.showMessageDialog(null, "Select a user, but not a group.", "Error", JOptionPane.INFORMATION_MESSAGE);
            } else if (selectedNode.getUserObject() instanceof User) {
                user_Selected = selectedNode.getUserObject().toString();    // convert user to string in order to use as a key in hash map. 
                User user = new User(user_Selected);
                UserView userView = map_userViews.get(user_Selected);   // find the user from the hash maps by using user_Selected as a key. 
                System.out.println(user_Selected);
                userView.setVisible(true);
           
            }
        }
    }//GEN-LAST:event_UserView_ButtonActionPerformed

    private void User_Total_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_Total_ButtonActionPerformed
          
        JOptionPane.showMessageDialog(null, " There are " + list_Number_User.size() + " user on the Mini Tweet.", "Total User", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_User_Total_ButtonActionPerformed

    private void Group_Total_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Group_Total_ButtonActionPerformed
      
        int numTotal_Number_Group = list_Number_Group.size();
        
        
        JOptionPane.showMessageDialog(null, "There are " + numTotal_Number_Group + " groups on the Mini Tweet.", "Total Group", JOptionPane.INFORMATION_MESSAGE);     
    }//GEN-LAST:event_Group_Total_ButtonActionPerformed

    private void message_Total_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_message_Total_ButtonActionPerformed
      JOptionPane.showMessageDialog(null, "Total number of messages: " + (int)getMessageCount() + "  ", "Show Message Total", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_message_Total_ButtonActionPerformed

    private void positive_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positive_buttonActionPerformed
            if (getMessageCount() == 0) {
            JOptionPane.showMessageDialog(null, "There are no messages to calculate the percentage.", "Show Positive Percentage Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,   getPositivePercentage() + "% of message(s) are positive.", "Show Positive Percentage", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_positive_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea GroupTextArea;
    private javax.swing.JButton Group_Add_Button;
    private javax.swing.JButton Group_Total_Button;
    private javax.swing.JTextArea UserTextArea;
    private javax.swing.JButton UserView_Button;
    private javax.swing.JButton User_Total_Button;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTree jTree1;
    private javax.swing.JButton message_Total_Button;
    private javax.swing.JButton positive_button;
    private javax.swing.JButton user_Add_Button;
    // End of variables declaration//GEN-END:variables





 private void expandAllNodes(JTree tree, int startingIndex, int rowCount) {
        for (int i = startingIndex; i < rowCount; ++i) {
            tree.expandRow(i);
        }

        if (tree.getRowCount() != rowCount) {
            expandAllNodes(tree, rowCount, tree.getRowCount());

        }
    }

 
 
 
 
     public double getMessageCount() {
        double totalMessageCount = 0.0;
        
        for (User user : list_Number_User) {
            totalMessageCount += user.getMessageCount();
        }
        
        
        return totalMessageCount;
    }
 
     public double getPositivePercentage() {
        double positiveCount = 0.0;
        
        
        for (User user : list_Number_User) {
            positiveCount += user.getPositiveCount();
        }
        
        
        return ((positiveCount / getMessageCount()) * 100.0);
    }

}