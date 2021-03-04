package newmanuevers;

public class exerciseChallenge {
    
    public static void main(String[] args) {
        
        //testSpeedConverter();
        //testMegaBytesConverter();
        //testBarkingDog();
        //testLeapYear();
        //testDecimalComparer();
        //testEqualSumChecker();
        //testTeenNumberChecker();
        //testAreaCalculator();
        //testMinutesToYearsDayCalculator();
        //testIntEqualityPrinter();
        testCatPlayingJava();
        

    } 
    public static void testCatPlayingJava(){
        System.out.println(CatPlaying.isCatPlaying(true, 10));
        System.out.println(CatPlaying.isCatPlaying(false, 36));
        System.out.println(CatPlaying.isCatPlaying(false, 35));
    }
    public static void testIntEqualityPrinter(){
        IntEqualityPrinter.printEqual(1, 1, 1);
        IntEqualityPrinter.printEqual(1, 1, 2);
        IntEqualityPrinter.printEqual(-1, -1, -1);
        IntEqualityPrinter.printEqual(1, 2, 3);
    }
    public static void testMinutesToYearsDayCalculator(){
        MinutesToYearsDaysCalculator.printYearsAndDays(-525600);
        //MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        //MinutesToYearsDaysCalculator.printYearsAndDays(561600);
    }

    public static void testAreaCalculator(){
        System.out.println(AreaCalculator.area(5.0));
        System.out.println(AreaCalculator.area(-1));
        System.out.println(AreaCalculator.area(5.0, 4.0));
        System.out.println(AreaCalculator.area(-1.0,4.0));
    }
    public static void testTeenNumberChecker(){
      System.out.println(TeenNumberChecker.hasTeen(9, 99, 19));
      System.out.println(TeenNumberChecker.hasTeen(23, 15, 42));
      System.out.println(TeenNumberChecker.hasTeen(22, 23, 34));
    }
    public static void testEqualSumChecker(){
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 1));
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 2));
        System.out.println(EqualSumChecker.hasEqualSum(1, -1, 0));
    }
    public static void testDecimalComparer(){
        System.out.println(DecimalComparer.AreEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(DecimalComparer.AreEqualByThreeDecimalPlaces(3.1756, 3.176));
        System.out.println(DecimalComparer.AreEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(DecimalComparer.AreEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
    public static void testLeapYear(){
        System.out.println(LeapYear.isLeapYear(-1600));
        System.out.println(LeapYear.isLeapYear(1600));
        System.out.println(LeapYear.isLeapYear(2017));
        System.out.println(LeapYear.isLeapYear(2000));
    }

    public static void testSpeedConverter(){
        SpeedConverter.printConversion(1.5);
        SpeedConverter.printConversion(10.25);
        SpeedConverter.printConversion(-5.6);
        SpeedConverter.printConversion(25.42);
        SpeedConverter.printConversion(75.114);
    }  

    public static void testMegaBytesConverter(){
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);

    }
    public static void testBarkingDog(){
       System.out.println(BarkingDog.shouldWakeUp(true, 1));
       System.out.println(BarkingDog.shouldWakeUp(false, 2));
       System.out.println(BarkingDog.shouldWakeUp(true, 8));
       System.out.println(BarkingDog.shouldWakeUp(true, -1));
    }

    
}