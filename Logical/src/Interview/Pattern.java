package Interview;

public class Pattern {  
    public static void pyramidPattern(int n) 
    {  
    for(int i=0;i<n;i++)
    {
    	System.out.print("*");
    	
    }
    for(int i=0;i<n;i++)
    {
    	System.out.print("*");
    	
    }
    for(int j=0;j<n;j++)
    {
    	System.out.println("+");
    }
    }
  
    public static void main(String args[]) //driver function
    { 
        int n = 5; 
        pyramidPattern(n); 
    } 
}