/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniTwitter;

import java.util.ArrayList;

/**
 *
 * @author soneu
 */
public class Lastupdate {
      private long last_Posting_time =0; 
      private static String userID;
       private static ArrayList<Long> list_update = new ArrayList();
    
    
        Lastupdate( ) {
   
    }
    Lastupdate(String id) {
       userID = id;
      last_Posting_time = System.currentTimeMillis(); ;
    }
  
  public long get_lastTime() {
      return last_Posting_time;
  }
  
  public String get_userID() {
      return userID;
  }
    
    
    public ArrayList<Long> get_lastTime_list() {
        
        return list_update;
    }
}
