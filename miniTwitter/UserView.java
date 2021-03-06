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
    DefaultListModel<String> postfeed= new DefaultListModel<String>();
    
    private String user_ID;
    private User user;
    private ArrayList<User> list_users;
    private ArrayList<String> list_userID;
    private HashMap<String, UserView> userViews;
    private long last_posting ;
    private final static String newline = "\n";
    
    private String last_poster_ID;
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
        lastUpdate_time = new java.awt.TextField();

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

        lastUpdate_time.setText("last posting time");
        lastUpdate_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastUpdate_timeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Follow_User_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Post_Tweet_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lastUpdate_time, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Follow_User_Button)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Post_Tweet_Button)
                        .addGap(2, 2, 2)
                        .addComponent(lastUpdate_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
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
            
            last_posting = System.currentTimeMillis();
            
           
          
            
            for (int j = 0; j < size; j++) {
                User this_user = followers.get(j);
                
                UserView current_UserView = userViews.get(this_user.get_UniqueID());
               
                this_user.updateNewsFeed(message);
                update(this_user, message);

                current_UserView.newsfeed.insertElementAt(message, 0);
                current_UserView.NewFeed_List.setModel(newsfeed); 
                
                
           
                 Lastupdate lastTime = new Lastupdate(user_ID) ;
             
                 lastTime.get_lastTime_list().add(lastTime.get_lastTime());
            
                  long max= 0;
                
                
                  for(int i=0; i< lastTime.get_lastTime_list().size(); i++){
                
                if( max < lastTime.get_lastTime_list().get(i))
                        max = lastTime.get_lastTime_list().get(i);
                
            }
                  
                  System.out.println("The lastest time is: " + max);
                String text =  String.valueOf(max); 
                
                 update(this_user, text);
                 current_UserView.postfeed.insertElementAt(text, 0);
                 
                 lastUpdate_time.setColumns(1);
                 current_UserView.lastUpdate_time.setText(text);
                 lastUpdate_time.setText(text);
                
                
                current_UserView.revalidate();
                current_UserView.repaint();
                 
                
            }
               
            
            revalidate();
            repaint();
        }
    }//GEN-LAST:event_Post_Tweet_ButtonActionPerformed

    private void lastUpdate_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastUpdate_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastUpdate_timeActionPerformed

  
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
    private java.awt.TextField lastUpdate_time;
    // End of variables declaration//GEN-END:variables

  @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof List) {
        }
    }
}
