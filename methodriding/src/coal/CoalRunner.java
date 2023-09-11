package coal;

public class CoalRunner {
public static  void main(String[] info)
{
	NewCoal New =new NewCoal();
	New.Burn();
	Coal New1=new NewCoal();
	New1.Burn();
	
	NewCoal New3=(NewCoal)New1;
	New3.Burn();
	New3.Heat();
}
}
