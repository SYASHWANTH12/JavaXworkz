class Carrom{
	int player;
	String gameType;
	int panes;
	int gameTime;
	String winningTeam;
	
	Carrom(){
		System.out.println("Running no argument value");
		System.out.println("The number of player="      + this.player     );//0
		System.out.println("The game is of the type="    +this.gameType   );//null
		System.out.println("The number of the panes="    +this.panes      );//0
		System.out.println("The game timming is="        +this.gameTime   );//0
		System.out.println("The winner of the team is=" + this.winningTeam);//null
		this.player     =4;    
	    this.gameType   ="GAME"; 
        this.panes      =19;
        this.gameTime   =45;  
        this.winningTeam="A one team wins";
	}
	Carrom(int player)
	{
		System.out.println("Running the int player ");
		this.player=player;
	}
	Carrom(int player,String gameType)
	{
		System.out.println("Running the int player and String gametype");
		this.player=player;
		this.gameType=gameType;
	}
	Carrom(int player,String gameType,int panes)
	{
		System.out.println("Running the int player,String gameType int panes");
		this.player=player;
		this.gameType=gameType;
		this.panes=panes;
	}
	Carrom(int player,String gameType,int panes,int gameTime)
	{
		System.out.println("Running the int player,String gameType,int panes,int gameTime");
		this.player =player;    
		this.gameType   =gameType;
	    this.panes      =panes;
        this.gameTime   =gameTime;
	}
	Carrom(int player,String gameType,int panes,int gameTime,String winningTeam)
	{
		System.out.println("Running the int player,String gameType,int panes,int gameTime,String winningTeam");
		this.player  =player;   
	    this.gameType   =gameType;
        this.panes      =panes;
        this.gameTime   =gameTime;
        this.winningTeam=winningTeam;
	}
}
class DoorBell extends Carrom{
	String typeOfBell;
	int frequency;
	int cost;
	String brand;
	int sound;
	int size;
	String song;
	DoorBell()
	{
		System.out.println("Running the no argument value");
		System.out.println("The type of the bell is="+this.typeOfBell);
		System.out.println("The frequency of the bell is="+this.frequency);
		System.out.println("The cost of the bell is="+this.cost);
		System.out.println("The brand of the bell is="+this. brand);
		System.out.println("The sound of the bell is="+this.sound);
		System.out.println("The size of the bell is="+this.size);
		System.out.println("The song of the bell  is="+this.song);
		String typeOfBell;
	    int frequency=50;
	    int cost=450;
	    String brand="AmiciSmart Wireless Doorbell";
	    int sound=500;
	    int size=3;
	    String song="Silent song";
	    System.out.println("Running the no argument value");
		System.out.println("The type of the bell is="+this.typeOfBell);
		System.out.println("The frequency of the bell is="+this.frequency);
		System.out.println("The cost of the bell is="+this.cost);
		System.out.println("The brand of the bell is="+this. brand);
		System.out.println("The sound of the bell is="+this.sound);
		System.out.println("The size of the bell is="+this.size);
		System.out.println("The song of the bell  is="+this.song);
	}
	DoorBell(String typeOfBell)
	{
		System.out.println("Running the String typeOfBell");
		this.typeOfBell=typeOfBell;
	}
	DoorBell(String typeOfBell,int frequency)
	{
		System.out.println("Running the String typeOfBell int frequency");
		this.typeOfBell=typeOfBell;
		this.frequency=frequency;
	}
	DoorBell(String typeOfBell,int frequency,int cost)
	{
		System.out.println("Running the String typeOfBell int frequency int cost");
		this.typeOfBell=typeOfBell;
		this.frequency=frequency;
		this.cost=cost;
	}
		DoorBell(String typeOfBell,int frequency,int cost,String brand)
		{
		System.out.println("Running the String typeOfBell int frequency int cost String brand");
		this.typeOfBell=typeOfBell;
		this.frequency=frequency;
		this.cost=cost;
        this.brand=brand;		
		}
        DoorBell(String typeOfBell,int frequency,int cost,String brand,int sound)
		{
		System.out.println("Running the String typeOfBell int frequency int cost String brand int sound");
		this.typeOfBell=typeOfBell;
		this.frequency=frequency;
		this.cost=cost;
        this.brand=brand;	
        this.sound=sound;		
		}
        DoorBell(String typeOfBell,int frequency,int cost,String brand,int sound,int size)
		{
		System.out.println("Running the String typeOfBell int frequency int cost String brand int sound int size");
		this.typeOfBell=typeOfBell;
		this.frequency=frequency;
		this.cost=cost;
        this.brand=brand;
		this.sound=sound;
        this.size=size;		
		}
         DoorBell(String typeOfBell,int frequency,int cost,String brand,int sound,int size,String song)
		{
		System.out.println("Running the String typeOfBell int frequency int cost String brand int sound int size");
		this.typeOfBell=typeOfBell;
		this.frequency=frequency;
		this.cost=cost;
        this.brand=brand;
		this.sound=sound;
        this.size=size;	
        this.song=song;		
		}
}
class Logo{
	String type;
	int cost;
	int weidth;
	int length;
	int height;
	String design;
	String format;
	String weight;
	String materialRequired;
	Logo()
	{
		System.out.println("Running the no argument value");
		System.out.println("Type of the logo="+this.type);
		System.out.println("cost of the logo="+this.cost);
		System.out.println("weidth of the logo="+this.weidth);
		System.out.println("length of the logo="+this.length);
		System.out.println("height of the logo="+this.height);
		System.out.println("design of the logo="+this.design);
		System.out.println("format of the logo="+this.format);
		System.out.println("weight of the logo="+this.weight);
		System.out.println("Material requied for it="+this.materialRequired);
	}
	Logo(String type)
	{
		System.out.println("Running the String type");
		this.type=type;
	}
	Logo(String type,int cost)
	{
		System.out.println("Running the String type int cost");
		this.type=type;
		this.cost=cost;
	}
	
	Logo(String type,int cost,int weidth)
	{
		System.out.println("Running the String type int cost int weidth");
		this.type=type;
		this.cost=cost;
		this.weidth=weidth;
	}
	Logo(String type,int cost,int weidth,int lenght)
	{
		System.out.println("Running the String type int cost int weidth");
		this.type=type;
		this.cost=cost;
		this.weidth=weidth;
		this.length=length;
	}
	Logo(String type,int cost,int weidth,int lenght,int height)
	{
		System.out.println("Running the String type int cost int weidth int lenght int height");
		this.type=type;
		this.cost=cost;
		this.weidth=weidth;
		this.length=length;
		this.height=height;
	}
	Logo(String type,int cost,int weidth,int lenght,int height,String design)
	{
		System.out.println("Running the String type int cost int weidth int lenght int height String design");
		this.type=type;
		this.cost=cost;
		this.weidth=weidth;
		this.length=length;
		this.height=height;
		this.design=design;
	}
	Logo(String type,int cost,int weidth,int lenght,int height,String design,String format)
	{
		System.out.println("Running the String type int cost int weidth int lenght int height String design String format");
		this.type=type;
		this.cost=cost;
		this.weidth=weidth;
		this.length=length;
		this.height=height;
		this.design=design;
		this.format=format;
	}
	Logo(String type,int cost,int weidth,int lenght,int height,String design,String format,String weight)
	{
		System.out.println("Running the String type int cost int weidth int lenght int height String design String format String weight");
		this.type=type;
		this.cost=cost;
		this.weidth=weidth;
		this.length=length;
		this.height=height;
		this.design=design;
		this.format=format;
		this.weight=weight;
	}
	Logo(String type,int cost,int weidth,int lenght,int height,String design,String format,String weight,String materialRequired)
	{
		System.out.println("Running the String type int cost int weidth int lenght int height String design String format String weight String materialRequired");
		this.type=type;
		this.cost=cost;
		this.weidth=weidth;
		this.length=length;
		this.height=height;
		this.design=design;
		this.format=format;
		this.weight=weight;
		this.materialRequired=materialRequired;
	}
}
class Chariot{
	String Wheeled;
    String Axle;
    String Platform;
    String Reinforced;
    String Harness;
    String Wheels;
    String Decorative;
    String Driverseat;
    String Ramps;
    String Spoked;
    String Racing;
Chariot()
{
	System.out.println("Running the no argument program");
	System.out.println("Wheeled type="+this.Wheeled);
	System.out.println("Axle type="+this.Axle);
	System.out.println("Platform type="+this.Platform);
	System.out.println("Reinforced type="+this.Reinforced);
	System.out.println("Harness type="+this.Harness);
	System.out.println("Wheels type="+this.Wheels);
	System.out.println("Decorative type="+this.Decorative);
	System.out.println("Driverseat type="+this.Driverseat);
	System.out.println("Ramps type="+this.Ramps);
	System.out.println("Spoked type="+this.Spoked);
	System.out.println("Racing type="+this.Racing);
	String Wheeled="round";
    String Axle="long";
    String Platform="any";
    String Reinforced="sasgj";
    String Harness="sjsg";
    String Wheels="jehjsh";
    String Decorative="yasgjh";
    String Driverseat="jshhjshk";
    String Ramps="smskan";
    String Spoked="jsjka";
    String Racing="kwksk";
	System.out.println("Running the no argument program");
	System.out.println("Wheeled type="+this.Wheeled);
	System.out.println("Axle type="+this.Axle);
	System.out.println("Platform type="+this.Platform);
	System.out.println("Reinforced type="+this.Reinforced);
	System.out.println("Harness type="+this.Harness);
	System.out.println("Wheels type="+this.Wheels);
	System.out.println("Decorative type="+this.Decorative);
	System.out.println("Driverseat type="+this.Driverseat);
	System.out.println("Ramps type="+this.Ramps);
	System.out.println("Spoked type="+this.Spoked);
	System.out.println("Racing type="+this.Racing);
}
Chariot(String Wheeled)
{
	System.out.println("Running the String Wheeled");
	this.Wheeled=Wheeled;
}
Chariot(String Wheeled,String Axle)
{
	System.out.println("Running the String Wheeled String Axle");
	this.Wheeled=Wheeled;
	this.Axle=Axle;
}
Chariot(String Wheeled,String Axle,String Platform)
{
	System.out.println("Running the String Wheeled String Platform");
	this.Wheeled=Wheeled;
	this.Axle=Axle;
	this.Platform=Platform;
}
Chariot(String Wheeled,String Axle,String Platform,String Reinforced)
{
	System.out.println("Running the String Wheeled String Platform String Reinforced");
	this.Wheeled=Wheeled;
	this.Axle=Axle;
	this.Platform=Platform;
	this.Reinforced=Reinforced;
	
}
Chariot(String Wheeled,String Axle,String Platform,String Reinforced, String Harness)
{
	System.out.println("Running the String Wheeled String Platform String Reinforced  String Harness");
	this.Wheeled=Wheeled;
	this.Axle=Axle;
	this.Platform=Platform;
	this.Reinforced=Reinforced;
	this.Harness=Harness;
	
}
Chariot(String Wheeled,String Axle,String Platform,String Reinforced, String Harness,String Wheels)
{
	System.out.println("Running the String Wheeled String Platform String Reinforced  String Harness String Wheels");
	this.Wheeled=Wheeled;
	this.Axle=Axle;
	this.Platform=Platform;
	this.Reinforced=Reinforced;
	this.Harness=Harness;
	this.Wheels=Wheels;
	
}
Chariot(String Wheeled,String Axle,String Platform,String Reinforced, String Harness,String Wheels, String Decorative)
{
	System.out.println("Running the String Wheeled String Platform String Reinforced  String Harness String Wheels  String Decorative");
	this.Wheeled=Wheeled;
	this.Axle=Axle;
	this.Platform=Platform;
	this.Reinforced=Reinforced;
	this.Harness=Harness;
	this.Wheels=Wheels;
	this.Decorative=Decorative;
	
}
Chariot(String Wheeled,String Axle,String Platform,String Reinforced, String Harness,String Wheels, String Decorative,String Driverseat)
{
	System.out.println("Running the String Wheeled String Platform String Reinforced  String Harness String Wheels  String Decorative Driverseat");
	this.Wheeled=Wheeled;
	this.Axle=Axle;
	this.Platform=Platform;
	this.Reinforced=Reinforced;
	this.Harness=Harness;
	this.Wheels=Wheels;
	this.Decorative=Decorative;
	this.Driverseat=Driverseat;
	
}
Chariot(String Wheeled,String Axle,String Platform,String Reinforced, String Harness,String Wheels, String Decorative,String Driverseat,String Ramps)
{
	System.out.println("Running the String Wheeled String Platform String Reinforced  String Harness String Wheels  String Decorative Driverseat String Ramps");
	this.Wheeled=Wheeled;
	this.Axle=Axle;
	this.Platform=Platform;
	this.Reinforced=Reinforced;
	this.Harness=Harness;
	this.Wheels=Wheels;
	this.Decorative=Decorative;
	this.Driverseat=Driverseat;
	this.Ramps=Ramps;
	
}
Chariot(String Wheeled,String Axle,String Platform,String Reinforced, String Harness,String Wheels, String Decorative,String Driverseat,String Ramps, String Spoked)
{
	System.out.println("Running the String Wheeled String Platform String Reinforced  String Harness String Wheels  String Decorative Driverseat String Ramps  String Spoked");
	this.Wheeled=Wheeled;
	this.Axle=Axle;
	this.Platform=Platform;
	this.Reinforced=Reinforced;
	this.Harness=Harness;
	this.Wheels=Wheels;
	this.Decorative=Decorative;
	this.Driverseat=Driverseat;
	this.Ramps=Ramps;
	this.Spoked=Spoked;
	
}
Chariot(String Wheeled,String Axle,String Platform,String Reinforced, String Harness,String Wheels, String Decorative,String Driverseat,String Ramps, String Spoked,String Racing)
{
	System.out.println("Running the String Wheeled String Platform String Reinforced  String Harness String Wheels  String Decorative Driverseat String Ramps  String Spoked String Racing");
	this.Wheeled=Wheeled;
	this.Axle=Axle;
	this.Platform=Platform;
	this.Reinforced=Reinforced;
	this.Harness=Harness;
	this.Wheels=Wheels;
	this.Decorative=Decorative;
	this.Driverseat=Driverseat;
	this.Ramps=Ramps;
	this.Spoked=Spoked;
	this.Racing=Racing;
	
}
}