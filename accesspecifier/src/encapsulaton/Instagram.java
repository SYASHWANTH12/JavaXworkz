package encapsulaton;

public class Instagram {
private String userId;
private int members;

public  void Reels(String userId)
{
	System.out.println("RUnning the reels of the instagram");
	this.userId=userId;	
   System.out.println(this.userId);
}
public String getUserId() {
	userId="banks_user";
    System.out.println("RUnning the user type ="+this.userId);
	return userId;
}
private  void setUserId(String userId) {
	this.userId = userId;
	userId="bank_user";
	System.out.println("RUnning the user type ="+this.userId);
}
public int getMembers() {
	return members;
}
public void setMembers(int members) {
	this.members = members;
	System.out.println(this.members);
}
}
