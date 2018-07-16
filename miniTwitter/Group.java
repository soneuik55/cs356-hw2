package miniTwitter;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.DefaultMutableTreeNode;


public class Group{
	
	private String uniqueID;
	private List<String> list_users = new ArrayList();
	private int number_users_group = 0;
	private static DefaultMutableTreeNode root;
	 
        
        
	 public Group() {
        root = new DefaultMutableTreeNode("Root");
         number_users_group++;
    }
         
         // when Id is given
	 public Group(String ID) {
             
         if (!list_users.contains(ID))
         root = new DefaultMutableTreeNode(ID);
         number_users_group++;
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
      
	
}