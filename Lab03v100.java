// Lab03vst.java
// Student starting version of the Lab03 assignment.
// Resave this program as Lab03v80 for the 80 point version.
// Resave this program as Lab03v100 for the 100 point version.


public class Lab03v100
{
	public static void main(String[] args)
	{
      System.out.println("Lab03, 100 Point Version\n");
      int milli = 10000123;
      int hours = milli/3600000;
      int rem_hours = milli%3600000;
      int minutes = rem_hours/60000;
      int rem_minutes = rem_hours%60000;
      int seconds = rem_minutes/1000;
      int rem_seconds = rem_minutes%1000;
      int real_milli = rem_seconds;
      
      System.out.println("Starting milli-seconds: " +milli);
      System.out.println("Hours: " +hours);
      System.out.println("Minutes: " +minutes);
      System.out.println("Seconds: " +seconds);
      System.out.println("Milliseconds: " +real_milli);
    
      
      
  
      
      
      
      
	}
}

