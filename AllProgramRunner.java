class AllProgramRunner{
	public static void main(String[] info)
	{
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		//Carrom carrom=new Carrom();
		Carrom carrom=new Carrom(1);
		Carrom carrom1=new Carrom(1,"lose");
		Carrom carrom2=new Carrom(1,"lose",21);
		Carrom carrom3=new Carrom(1,"lose",21,45);
		Carrom carrom4=new Carrom(1,"lose",21,45,"another team win");
		System.out.println(carrom.player);
		System.out.println(carrom.gameType);
		System.out.println(carrom.panes);
		System.out.println(carrom.gameTime);
		System.out.println(carrom.winningTeam);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		//System.out.println(carrom1);
		System.out.println(carrom1.player);
		System.out.println(carrom1.gameType);
		System.out.println(carrom1.panes);
		System.out.println(carrom1.gameTime);
		System.out.println(carrom1.winningTeam);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		//System.out.println(carrom2);
		System.out.println(carrom2.player);
		System.out.println(carrom2.gameType);
		System.out.println(carrom2.panes);
		System.out.println(carrom2.gameTime);
		System.out.println(carrom2.winningTeam);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		//System.out.println(carrom3);
		System.out.println(carrom3.player);
		System.out.println(carrom3.gameType);
		System.out.println(carrom3.panes);
		System.out.println(carrom3.gameTime);
		System.out.println(carrom3.winningTeam);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		//System.out.println(carrom4);
		System.out.println(carrom4.player);
		System.out.println(carrom4.gameType);
		System.out.println(carrom4.panes);
		System.out.println(carrom4.gameTime);
		System.out.println(carrom4.winningTeam);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		DoorBell doorBell=new DoorBell("Ring type");
		System.out.println(doorBell.typeOfBell);
		System.out.println(doorBell.frequency);
		System.out.println(doorBell.cost);
		System.out.println(doorBell.brand);
		System.out.println(doorBell.sound);
		System.out.println(doorBell.size);
		System.out.println(doorBell.song);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		DoorBell doorBell1=new DoorBell("Ring type",100);
		System.out.println(doorBell1.typeOfBell);
		System.out.println(doorBell1.frequency);
		System.out.println(doorBell1.cost);
		System.out.println(doorBell1.brand);
		System.out.println(doorBell1.sound);
		System.out.println(doorBell1.size);
		System.out.println(doorBell1.song);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		DoorBell doorBell2=new DoorBell("Ring type",100,4500);
		System.out.println(doorBell2.typeOfBell);
		System.out.println(doorBell2.frequency);
		System.out.println(doorBell2.cost);
		System.out.println(doorBell2.brand);
		System.out.println(doorBell2.sound);
		System.out.println(doorBell2.size);
		System.out.println(doorBell2.song);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		DoorBell doorBell3=new DoorBell("Ring type",100,4500,"Ring brand");
		System.out.println(doorBell3.typeOfBell);
		System.out.println(doorBell3.frequency);
		System.out.println(doorBell3.cost);
		System.out.println(doorBell3.brand);
		System.out.println(doorBell3.sound);
		System.out.println(doorBell3.size);
		System.out.println(doorBell3.song);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		DoorBell doorBell4=new DoorBell("Ring type",100,4500,"Ring brand",500);
		System.out.println(doorBell4.typeOfBell);
		System.out.println(doorBell4.frequency);
		System.out.println(doorBell4.cost);
		System.out.println(doorBell4.brand);
		System.out.println(doorBell4.sound);
		System.out.println(doorBell4.size);
		System.out.println(doorBell4.song);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		DoorBell doorBell5=new DoorBell("Ring type",100,4500,"Ring brand",500,75);
		System.out.println(doorBell5.typeOfBell);
		System.out.println(doorBell5.frequency);
		System.out.println(doorBell5.cost);
		System.out.println(doorBell5.brand);
		System.out.println(doorBell5.sound);
		System.out.println(doorBell5.size);
		System.out.println(doorBell5.song);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		DoorBell doorBell6=new DoorBell("Ring type",100,4500,"Ring brand",500,75,"nen ade na");
		System.out.println(doorBell6.typeOfBell);
		System.out.println(doorBell6.frequency);
		System.out.println(doorBell6.cost);
		System.out.println(doorBell6.brand);
		System.out.println(doorBell6.sound);
		System.out.println(doorBell6.size);
		System.out.println(doorBell6.song);
		Logo logo=new Logo("Event");
		System.out.println(logo.type);
		System.out.println(logo.cost);
		System.out.println(logo.weidth);
		System.out.println(logo.length);
		System.out.println(logo.height);
		System.out.println(logo.design);
		System.out.println(logo.format);
		System.out.println(logo.weight);
		System.out.println(logo.materialRequired);
		Logo logo1=new Logo("Event",4679);
		System.out.println(logo1.type);
		System.out.println(logo1.cost);
		System.out.println(logo1.weidth);
		System.out.println(logo1.length);
		System.out.println(logo1.height);
		System.out.println(logo1.design);
		System.out.println(logo1.format);
		System.out.println(logo1.weight);
		System.out.println(logo1.materialRequired);
		Logo logo2=new Logo("Event",4679,54);
		System.out.println(logo2.type);
		System.out.println(logo2.cost);
		System.out.println(logo2.weidth);
		System.out.println(logo2.length);
		System.out.println(logo2.height);
		System.out.println(logo2.design);
		System.out.println(logo2.format);
		System.out.println(logo2.weight);
		System.out.println(logo2.materialRequired);
		Logo logo3=new Logo("Event",4679,54,35);
		System.out.println(logo3.type);
		System.out.println(logo3.cost);
		System.out.println(logo3.weidth);
		System.out.println(logo3.length);
		System.out.println(logo3.height);
		System.out.println(logo3.design);
		System.out.println(logo3.format);
		System.out.println(logo3.weight);
		System.out.println(logo3.materialRequired);
		Logo logo4=new Logo("Event",4679,54,35,65);
		System.out.println(logo4.type);
		System.out.println(logo4.cost);
		System.out.println(logo4.weidth);
		System.out.println(logo4.length);
		System.out.println(logo4.height);
		System.out.println(logo4.design);
		System.out.println(logo4.format);
		System.out.println(logo4.weight);
		System.out.println(logo4.materialRequired);
		Logo logo5=new Logo("Event",4679,54,35,65,"long");
		System.out.println(logo5.type);
		System.out.println(logo5.cost);
		System.out.println(logo5.weidth);
		System.out.println(logo5.length);
		System.out.println(logo5.height);
		System.out.println(logo5.design);
		System.out.println(logo5.format);
		System.out.println(logo5.weight);
		System.out.println(logo5.materialRequired);
		Logo logo6=new Logo("Event",4679,54,35,65,"long","highlight");
		System.out.println(logo6.type);
		System.out.println(logo6.cost);
		System.out.println(logo6.weidth);
		System.out.println(logo6.length);
		System.out.println(logo6.height);
		System.out.println(logo6.design);
		System.out.println(logo6.format);
		System.out.println(logo6.weight);
		System.out.println(logo6.materialRequired);
		Logo logo7=new Logo("Event",4679,54,35,65,"long","highlight","2kg");
		System.out.println(logo7.type);
		System.out.println(logo7.cost);
		System.out.println(logo7.weidth);
		System.out.println(logo7.length);
		System.out.println(logo7.height);
		System.out.println(logo7.design);
		System.out.println(logo7.format);
		System.out.println(logo7.weight);
		System.out.println(logo7.materialRequired);
		Logo logo8=new Logo("Event",4679,54,35,65,"long","highlight","2kg","Any thing");
		System.out.println(logo8.type);
		System.out.println(logo8.cost);
		System.out.println(logo8.weidth);
		System.out.println(logo8.length);
		System.out.println(logo8.height);
		System.out.println(logo8.design);
		System.out.println(logo8.format);
		System.out.println(logo8.weight);
		System.out.println(logo8.materialRequired);
		Chariot chariot=new Chariot();
		System.out.println(chariot.Wheeled);
		System.out.println(chariot.Axle);
        System.out.println(chariot.Platform);
	    System.out.println(chariot.Reinforced);
		System.out.println(chariot.Harness);
		System.out.println(chariot.Wheels);
		System.out.println(chariot.Decorative);
		System.out.println(chariot.Driverseat);
		System.out.println(chariot.Ramps);
		System.out.println(chariot.Spoked);
		System.out.println(chariot.Racing);


		Chariot chariot1=new Chariot("f");
		System.out.println(chariot1.Wheeled);
		System.out.println(chariot1.Axle);
        System.out.println(chariot1.Platform);
	    System.out.println(chariot1.Reinforced);
		System.out.println(chariot1.Wheels);
		System.out.println(chariot1.Decorative);
		System.out.println(chariot1.Driverseat);
		System.out.println(chariot1.Ramps);
		System.out.println(chariot1.Spoked);
		System.out.println(chariot1.Racing);
		Chariot chariot2=new Chariot("f","d");
		System.out.println(chariot2.Wheeled);
		System.out.println(chariot2.Axle);
        System.out.println(chariot2.Platform);
	    System.out.println(chariot2.Reinforced);
		System.out.println(chariot2.Harness);
		System.out.println(chariot2.Wheels);
		System.out.println(chariot2.Decorative);
		System.out.println(chariot2.Driverseat);
		System.out.println(chariot2.Ramps);
		System.out.println(chariot2.Spoked);
		System.out.println(chariot2.Racing);
		Chariot chariot3=new Chariot("d","d","j");
		System.out.println(chariot3.Wheeled);
		System.out.println(chariot3.Axle);
        System.out.println(chariot3.Platform);
	    System.out.println(chariot3.Reinforced);
		System.out.println(chariot3.Harness);
		System.out.println(chariot3.Wheels);
		System.out.println(chariot3.Decorative);
		System.out.println(chariot3.Driverseat);
		System.out.println(chariot3.Ramps);
		System.out.println(chariot3.Spoked);
		System.out.println(chariot3.Racing);
		Chariot chariot4=new Chariot("d","d","j","h");
		System.out.println(chariot4.Wheeled);
		System.out.println(chariot4.Axle);
        System.out.println(chariot4.Platform);
	    System.out.println(chariot4.Reinforced);
		System.out.println(chariot4.Harness);
		System.out.println(chariot4.Wheels);
		System.out.println(chariot4.Decorative);
		System.out.println(chariot4.Driverseat);
		System.out.println(chariot4.Ramps);
		System.out.println(chariot4.Spoked);
		System.out.println(chariot4.Racing);
		Chariot chariot5=new Chariot("d","d","j","h","g");
		System.out.println(chariot5.Wheeled);
		System.out.println(chariot5.Axle);
        System.out.println(chariot5.Platform);
	    System.out.println(chariot5.Reinforced);
		System.out.println(chariot5.Harness);
		System.out.println(chariot5.Wheels);
		System.out.println(chariot5.Decorative);
		System.out.println(chariot5.Driverseat);
		System.out.println(chariot5.Ramps);
		System.out.println(chariot5.Spoked);
		System.out.println(chariot5.Racing);
		Chariot chariot6=new Chariot("d","d","j","h","g","d");
		System.out.println(chariot6.Wheeled);
		System.out.println(chariot6.Axle);
        System.out.println(chariot6.Platform);
	    System.out.println(chariot6.Reinforced);
		System.out.println(chariot6.Harness);
		System.out.println(chariot6.Wheels);
		System.out.println(chariot6.Decorative);
		System.out.println(chariot6.Driverseat);
		System.out.println(chariot6.Ramps);
		System.out.println(chariot6.Spoked);
		System.out.println(chariot6.Racing);
		Chariot chariot7=new Chariot("d","d","j","h","g","d","a");
		System.out.println(chariot7.Wheeled);
		System.out.println(chariot7.Axle);
        System.out.println(chariot7.Platform);
	    System.out.println(chariot7.Reinforced);
		System.out.println(chariot7.Harness);
		System.out.println(chariot7.Wheels);
		System.out.println(chariot7.Decorative);
		System.out.println(chariot7.Driverseat);
		System.out.println(chariot7.Ramps);
		System.out.println(chariot7.Spoked);
		System.out.println(chariot7.Racing);
		Chariot chariot8=new Chariot("d","d","j","h","g","d","a","w");
		System.out.println(chariot8.Wheeled);
		System.out.println(chariot8.Axle);
        System.out.println(chariot8.Platform);
	    System.out.println(chariot8.Reinforced);
		System.out.println(chariot8.Harness);
		System.out.println(chariot8.Wheels);
		System.out.println(chariot8.Decorative);
		System.out.println(chariot8.Driverseat);
		System.out.println(chariot8.Ramps);
		System.out.println(chariot8.Spoked);
		System.out.println(chariot8.Racing);
		Chariot chariot9=new Chariot("d","d","j","h","g","d","a","w","s");
		System.out.println(chariot9.Wheeled);
		System.out.println(chariot9.Axle);
        System.out.println(chariot9.Platform);
	    System.out.println(chariot9.Reinforced);
		System.out.println(chariot9.Harness);
		System.out.println(chariot9.Wheels);
		System.out.println(chariot9.Decorative);
		System.out.println(chariot9.Driverseat);
		System.out.println(chariot9.Ramps);
		System.out.println(chariot9.Spoked);
		System.out.println(chariot9.Racing);
		Chariot chariot10=new Chariot("d","d","j","h","g","d","a","w","s","p");
		System.out.println(chariot10.Wheeled);
		System.out.println(chariot10.Axle);
        System.out.println(chariot10.Platform);
	    System.out.println(chariot10.Reinforced);
		System.out.println(chariot10.Harness);
		System.out.println(chariot10.Wheels);
		System.out.println(chariot10.Decorative);
		System.out.println(chariot10.Driverseat);
		System.out.println(chariot10.Ramps);
		System.out.println(chariot10.Spoked);
		System.out.println(chariot10.Racing);
		
		
}
}