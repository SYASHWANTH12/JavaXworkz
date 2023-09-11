package encapsulaton;

public class InstagramRunner {
	public static void main(String[] info)
	{
		Instagram I1=new Instagram();
		I1.Reels("yashuprethu90");
		I1.Reels("bindu");
		//I1.setUserId("trouble shooter");
		I1.getUserId();
		I1.setMembers(10);
		I1.getMembers(); 
		I1.setMembers(20);
		I1.getMembers(); 
	}
}
