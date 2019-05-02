import java.util.Scanner;

public class SecToTime2
{
    public static void main(String[] args)
    {
    int seconds, secs, minutes,hour, hours, total_seconds, remainSecs, lastSecs;
    Scanner scanmachine = new Scanner(System.in); 
    
    System.out.println(" Enter a time in seconds: ");
    secs = scanmachine.nextInt(); 
    
    hour = (secs / 3600);   // hours 
    remainSecs = secs % 3600; // how many secs left over'
 
    minutes= (remainSecs /60); // minutes total
    lastSecs= (remainSecs % 60); // FINAL SECONDS  
    
    System.out.println("The time is  " + hour + "hours" + minutes + "minutes" + lastSecs + "seconds");
    
  
   // total_seconds= (hours * A_HOURS_IN_SEC) + (minutes * A_MINUTE_IN_SEC) + seconds;
   //System.out.println("This is your total seconds:" + total_seconds);
   // total_seconds = scanmachine.nextInt();
    
    
   }
}
    