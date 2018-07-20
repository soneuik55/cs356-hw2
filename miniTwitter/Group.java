package miniTwitter;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.DefaultMutableTreeNode;


public class Group implements Visitor {
	
	private String uniqueID;
	private List<String> list_users = new ArrayList();
	private int number_users_group = 0;
	private static DefaultMutableTreeNode root;
	private long creationTime;
        private long lastUpdateTime ;
    
        
        
	 public Group() {
        root = new DefaultMutableTreeNode("Root");
         number_users_group++;
    }
         
         // when Id is given
	 public Group(String ID) {
             uniqueID = ID;
             
         if (!list_users.contains(ID))
         root = new DefaultMutableTreeNode(ID);
         number_users_group++;
         creationTime =  System.currentTimeMillis();
    }
      
	 public String get_UniqueID() {
		 return uniqueID;
	 }
	
	 public int get_number_users_group() {
            return number_users_group;
	}
	 
	 
	 public DefaultMutableTreeNode getRoot() {
	      return root;
	   }
      
         public List<String >get_GroupIDs(){
             return list_users;
         }
         
         @Override
         public String toString() {
         return uniqueID;
    }
         
         
  
      public long get_time() {
              return creationTime;
      }
	
}