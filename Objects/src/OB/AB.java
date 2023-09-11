package OB;

import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.chrono.Chronology;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;

public class AB {
	public static <R> void main(String[] info)
	{
		StringBuffer buffer=new StringBuffer();
		StringBuffer ref=buffer.append(false);
		System.out.println(ref);
		StringBuffer ref1=buffer.append(ref);
		System.out.println(ref1);
		StringBuffer ref2=buffer.append(ref1);
		System.out.println(ref2);
		StringBuffer ref3=buffer.append(0);
		System.out.println(ref3);
		StringBuffer ref4=buffer.append(ref3);
		System.out.println(ref4);
		int ref5=buffer.indexOf("yashu");
		System.out.println(ref5);
		StringBuilder builder=new StringBuilder(ref4);
		StringBuilder A1=builder.append('e');
		System.out.println(A1);
	    StringBuilder A2=builder.append(false);
	    System.out.println(A2);
	    StringBuilder A3= builder.insert(12, 5);
	    System.out.println(A3);
	    StringBuilder A4=builder.reverse();
	    System.out.println(A4);
	    String A5=builder.substring(5, 5);
	    System.out.println(A5);
	    
	    ChronoLocalDate date=new ChronoLocalDate() {
			
			@Override
			public long getLong(TemporalField field) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public long until(Temporal endExclusive, TemporalUnit unit) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public ChronoPeriod until(ChronoLocalDate endDateExclusive) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int lengthOfMonth() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Chronology getChronology() {
				// TODO Auto-generated method stub
				return null;
			}
		}; 
	    
	    Chronology D1=date.getChronology();
	    System.out.println(D1);
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
