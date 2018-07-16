package miniTwitter;



import java.util.ArrayList;
import java.util.List;
import java.util.*;

 

public class User extends Observable implements Observer  {
	
	private String uniqueID;
	private List<String> list_following;
	private List<User> list_follower;
	private List<String> list_newsFeed;
	private List<String> list_Msg ;
	private int positiveCount = 0;
        private int messageCount = 0;
  
	private int number_list_following = 0;
	private int number_list_followed = 0;
	private int number_list_newsFeed = 0;
        
	
	private String[] positiveWords = {"good", "great", "excellent" , "nice", "thank you", "Thank you" , "love", "best", "appreciate"};
        private int number_Users = 0;
        
        
	public User(String id) {
		
        uniqueID = id; 
	number_Users++;
        list_following = new ArrayList();
	list_follower = new ArrayList();
	list_newsFeed = new ArrayList();
        list_Msg = new ArrayList();
     
	
		
		
	}
	 
	 //set methods
	 public void following(String user) {
		 
		 list_following.add(user);
	 }
	 
	 public void follower(User user) {
		 
		 list_follower.add(user);
	 }
	 
	 public void newsFeed(String text) {
		 
		 list_newsFeed.add(text);
	 }
	 
	  
	 //get methods
	 public int get_number_users() {
		 return number_Users;
	 }
	 
	 public List<String> get_following() {
		 return list_following;
	 }
	 
	 public List<User> get_followers() {
		 return list_follower;
	 }
	 
	 public List<String> get_newsFeed() {
		 return list_newsFeed;
	 }
	 
	 public String get_UniqueID() {
		 return uniqueID;
	 }

         public int getMessageCount() {
        return messageCount;
        } 
         
         public int getPositiveCount() {
        return positiveCount;
        }

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
        @Override
         public String toString() {
         return uniqueID;
    }
	 	
        public void posting(String message) {
        list_Msg.add(message);
        setChanged(); 
        notifyObservers(message);
        
        list_newsFeed.add(0, ">> " + uniqueID + ": " + message);
        setChanged();
        notifyObservers(list_newsFeed);
        
   
        for (String text : positiveWords) {
            if (message.toUpperCase().contains(text)) {
                positiveCount++;
            }
        }
   
        messageCount++;
    }
	 
        public void  updateNewsFeed(String msg) {
		list_newsFeed.add(msg);
	}
	 
}