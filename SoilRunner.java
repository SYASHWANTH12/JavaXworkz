class SoilRunner{
	public static void main(String[] info)
	{
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Soil soil=new Soil("black",21908808);
		System.out.println("The colour of the soil is="+soil.soilColour);
		System.out.println("The colour of the soil is="+soil.howManyStone);
		System.out.println("The colour of the soil is="+Soil.howMnayYear);
		System.out.println("The colour of the soil is="+Soil.soilType);
		Soil.howMnayYear=10;
		Soil.soilType="sand";
		System.out.println("The colour of the soil is="+soil.soilColour);
		System.out.println("The colour of the soil is="+soil.howManyStone);
		System.out.println("The colour of the soil is="+Soil.howMnayYear);
		System.out.println("The colour of the soil is="+Soil.soilType);
		
		
		
	}
}