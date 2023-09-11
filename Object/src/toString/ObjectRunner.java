package toString;

public class ObjectRunner {
public static void main(String[] info)
{
	Flag flag=new Flag("Orange",2999,"15 aug 1947");
	Flag flag1=new Flag("White",2999,"15 aug 1947");
	Flag flag2=new Flag("Green",2999,"15 aug 1947");
	System.out.println(flag.toString());
	System.out.println(flag1.toString());
	System.out.println(flag2.toString());
	System.out.println("------------------------------------");
	
	
	Logo logo =new Logo("Powertron",260,false,24,15);
	Logo logo1 =new Logo("Birthday",1000,true,34,25);
	Logo logo2 =new Logo("Wdding aniversary",1999,false,12,8);
	System.out.println(logo.toString());
	System.out.println(logo1.toString());
	System.out.println(logo2.toString());
	System.out.println("______________________________________");
	
	Karchief karchief=new Karchief(10,"madhu",true,"white",'M',12,34);
	Karchief karchief1=new Karchief(20,"ranjith",false,"pink",'S',14,14);
	Karchief karchief2=new Karchief(30,"yashu",true,"purplle",'L',22,39);
	System.out.println(karchief.toString());
	System.out.println(karchief1.toString());
	System.out.println(karchief2.toString());
	System.out.println("-------------------------------------");
	
	Cave cave=new Cave("Tent",2999,24.77f,17,19,4,true,6,"Shelter","She");
	Cave cave1=new Cave("Tent",3999,24.87f,15,13,2,false,9,"Winter","She");
	Cave cave2=new Cave("Tent",4999,24.97f,62,13,6,true,10,"Cold","She");
	System.out.println(cave.toString());
	System.out.println(cave1.toString());
	System.out.println(cave2.toString());
	System.out.println("_--------------------------------");
	
	Pendent pendent=new Pendent(null, null, null, null, null, null, null, null, null, null, null, null);
	Pendent pendent1=new Pendent(null, null, null, null, null, null, null, null, null, null, null, null);
	Pendent pendent2=new Pendent(null, null, null, null, null, null, null, null, null, null, null, null);
	System.out.println(pendent.toString());
	System.out.println(pendent1.toString());
	System.out.println(pendent2.toString());
	
}
}
