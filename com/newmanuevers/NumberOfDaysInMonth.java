import org.graalvm.compiler.hotspot.word.HotSpotWordTypes;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
        
       return (year < 1 || year > 9999) ? false : LeapYear.isLeapYear(year);
    }

    public static int getDaysInMonth(int month, int year){
        if(year < 1 || year > 9999) 
           return -1;
        switch(month){
            case 4:
            case 6:
            case 9:
            case 11:
              return 30;
            case 2:
              return isLeapYear((year)) ? 29 : 28;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
              return 31;
            default:
              return -1;

        }
    }
    
}
