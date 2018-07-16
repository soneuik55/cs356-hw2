/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniTwitter;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.util.Observer;
import javax.swing.JTree;



/**
 *
 * @author soneu
 */
public class UserView extends javax.swing.JFrame implements Observer {

    DefaultListModel<String> following = new DefaultListModel<String>();
    DefaultListModel<String> newsfeed= new DefaultListModel<String>();
    private String user_ID;
    private User user;
    private ArrayList<User> list_users;
    private ArrayList<String> list_userID;
    private HashMap<String, UserView> userViews;
   
  public UserView(ArrayList<User> users, User us, ArrayList<String> IDs,  HashMap<String, UserView> uV) {
         
         list_users = users;
         user = us;
         user.addObserver(user);
         user_ID = user.get_UniqueID();
         list_userID = IDs; 
         userViews = uV;
 
          this.setTitle(user_ID + ": User View");
          initComponents();
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
        NewFeed_List = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        following_List = new javax.swing.JList<>();
        Follow_User_Button = new javax.swing.JButton();
        Post_Tweet_Button = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Post_Tweet_TextArea = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        followTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NewFeed_List.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "News Feed", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(NewFeed_List);

        following_List.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Current following", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(following_List);

        Follow_User_Button.setText("Follow User");
        Follow_User_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Follow_User_ButtonActionPerformed(evt);
            }
        });

        Post_Tweet_Button.setText("Post Tweet");
        Post_Tweet_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Post_Tweet_ButtonActionPerformed(evt);
            }
        });

        Post_Tweet_TextArea.setColumns(20);
        Post_Tweet_TextArea.setRows(5);
        jScrollPane4.setViewportView(Post_Tweet_TextArea);

        followTextArea.setColumns(20);
        followTextArea.setRows(5);
        jScrollPane5.setViewportView(followTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(Post_Tweet_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                            .addComponent(Follow_User_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Follow_User_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Post_Tweet_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Follow_User_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Follow_User_ButtonActionPerformed
        
        System.out.println("size"+ list_users.size());
        System.out.println(  list_users.get(0));
        if (!list_userID.contains(followTextArea.getText())) {
            JOptionPane.showMessageDialog(null, "No user Id", "Error", JOptionPane.INFORMATION_MESSAGE);
            followTextArea.setText("");
        
            
        } else if (user.get_following().contains(followTextArea.getText())) {
            JOptionPane.showMessageDialog(null, "You already followed this user.", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else if (user.get_UniqueID().equals(followTextArea.getText())) {
            JOptionPane.showMessageDialog(null, "Do not follow yourself", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            
            following.addElement(">> " + followTextArea.getText());
            following_List.setModel(following);
            user.following(followTextArea.getText());
            
            
            for (int i = 0; i < list_users.size(); i++) {
                if (list_users.get(i).get_UniqueID().equals(followTextArea.getText())) {
                    list_users.get(i).follower(user);
                }
            }
        }
        followTextArea.setText("");
        revalidate();
        repaint();
    }//GEN-LAST:event_Follow_User_ButtonActionPerformed

    private void Post_Tweet_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Post_Tweet_ButtonActionPerformed
          if (Post_Tweet_TextArea.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "It cannot be empty!!", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            user.posting(Post_Tweet_TextArea.getText());
            newsfeed.insertElementAt(user.get_newsFeed().get(0), 0);
            NewFeed_List.setModel(newsfeed);
            Post_Tweet_TextArea.setText("");

            // in order to update users' News Feed
            List<User> followers = user.get_followers();
            int size = followers.size();
            String message = user.get_newsFeed().get(0);
            
            
            for (int j = 0; j < size; j++) {
                User this_user = followers.get(j);
                
                UserView current_UserView = userViews.get(this_user.get_UniqueID());
                this_user.updateNewsFeed(message);
                update(this_user, message);

                current_UserView.newsfeed.insertElementAt(message, 0);
                current_UserView.NewFeed_List.setModel(newsfeed); 
                
                
                current_UserView.revalidate();
                current_UserView.repaint();
            }
            revalidate();
            repaint();
        }
    }//GEN-LAST:event_Post_Tweet_ButtonActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Follow_User_Button;
    private javax.swing.JList<String> NewFeed_List;
    private javax.swing.JButton Post_Tweet_Button;
    private javax.swing.JTextArea Post_Tweet_TextArea;
    private javax.swing.JTextArea followTextArea;
    private javax.swing.JList<String> following_List;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables

  @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof List) {
        }
    }
}
