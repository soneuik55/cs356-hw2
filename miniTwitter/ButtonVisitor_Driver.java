package miniTwitter;

 
import java.util.ArrayList;
import java.util.List;


 

public class ButtonVisitor_Driver implements ButtonVisitor {
    
	private int number_Users = 0;
	private int number_Messages = 0;
	private int number_Groups = 0;
	private int positiveCounter = 0;
	private double positivePercentage = 0.0;
	
	@Override
	public void Counter_User(User user) {
		setTotalUsers(user.get_number_users());
		
	}

	@Override
	public void Counter_Messages(User user) {
		setMessagesTotal(user);
		
	}

	@Override
	public void Counter_Group(Group gr) {
		setTotalGroups(gr);
		
	}

	@Override
	public void Counter_PositivePercentage(User user) {
		List<User> users = new ArrayList();
                List<String> tweets = user.get_newsFeed();
	}


	  public void setTotalUsers(int num_user) {
		  number_Users = num_user;
	    }
	    
	    public void setMessagesTotal(User us) {
	        number_Messages= us.get_newsFeed().size();
	    }
	    
	    public void setTotalGroups(Group gr) {
	        number_Groups = gr.get_number_users_group();
	    }
	    
	    public double getPositivePercentage() {
	        return ( (positiveCounter / number_Messages) * 100.0);
	    }
	    
	    public void setPositivePercentage(double percentage) {
	        this.positivePercentage = 0.0;
	    }
	
}
