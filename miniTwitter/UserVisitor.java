public interface UserVisitor{

 	//set methods
	 public void following(String user);
	 
	 public void follower(User user);
	 
	 public void newsFeed(String text);
	 
	  
	 //get methods
	 public int get_number_users();
	 public List<String> get_following();
	 
	 public List<User> get_followers();
	 
	 public List<String> get_newsFeed();
	 
	 public String get_UniqueID();

         public int getMessageCount();
         
         public int getPositiveCount();

}