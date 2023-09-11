class CandleRunner{
public static void main(String[] info)
{
Candle candle=new Candle(4,2000);
System.out.println("The time for the candle to burn is="+candle.time);
System.out.println("The time for the candle to burn is="+candle.price);
System.out.println("The time for the candle to burn is="+Candle.Price);
System.out.println("The time for the candle to burn is="+Candle.brand);
Candle.Price="100000";
Candle.brand="tuborq";
System.out.println("The time for the candle to burn is="+Candle.Price);
System.out.println("The time for the candle to burn is="+Candle.brand);
}
}