package miniTwitter;




public interface ButtonVisitor {
    
    public void Counter_User (User us);

    public void Counter_Messages (User us);
    
    public void Counter_Group(Group gr);
    
    public void Counter_PositivePercentage(User us);

}