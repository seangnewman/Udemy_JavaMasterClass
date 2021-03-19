


public class exerciseChallenge {
    
    public static void main(String[] args) {
      
        //testPerfectNumber();
        testNumberToWords();
      
    } 
    public static void testNumberToWords(){
        // System.out.println(NumberToWords.getDigitCount(0));
        // System.out.println(NumberToWords.getDigitCount(123));
        // System.out.println(NumberToWords.getDigitCount(-12));
        // System.out.println(NumberToWords.getDigitCount(5200));
        // System.out.println( NumberToWords.reverse(-121));
        // System.out.println( NumberToWords.reverse(1212));
        // System.out.println( NumberToWords.reverse(1234));
        // System.out.println( NumberToWords.reverse(1));

        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);
    }
    public static void testPerfectNumber()
    {
        System.out.println(PerfectNumber.isPerfectNumber(6));
        System.out.println(PerfectNumber.isPerfectNumber(28));
        System.out.println(PerfectNumber.isPerfectNumber(5));
        System.out.println(PerfectNumber.isPerfectNumber(1));
    }
    public static void testFactorPrinter()
    {
        FactorPrinter.printFactors(6);
        FactorPrinter.printFactors(32);
        FactorPrinter.printFactors(10);
        FactorPrinter.printFactors(-1);
    }
    
    public static void testGreatestCommonDivisor()
    {
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(9, 18));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));
    }
    public static void testLastDigitChecker()
    {
        System.out.println( LastDigitChecker.hasSameLastDigit(41, 22, 71));
        System.out.println( LastDigitChecker.hasSameLastDigit(23, 32, 42));
        System.out.println( LastDigitChecker.hasSameLastDigit(9, 99, 999));
    }
    public static void testSharedDigit()
    {
        System.out.println( SharedDigit.hasSharedDigit(12, 23));
        System.out.println( SharedDigit.hasSharedDigit(9, 99));
        System.out.println( SharedDigit.hasSharedDigit(15, 55));
    }
    public static void testEventDigitSum()
    {
        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
        System.out.println(EvenDigitSum.getEvenDigitSum(252));
        System.out.println(EvenDigitSum.getEvenDigitSum(-22));
    }
    public static void testFirstAndLastDigitSum()
    {
        System.out.println( FirstAndLastDigitSum.sumFirstAndLastDigit(252));
        System.out.println( FirstAndLastDigitSum.sumFirstAndLastDigit(257));
        System.out.println( FirstAndLastDigitSum.sumFirstAndLastDigit(0));
        System.out.println( FirstAndLastDigitSum.sumFirstAndLastDigit(5));
        System.out.println( FirstAndLastDigitSum.sumFirstAndLastDigit(-10));
    }

    public static void testNumberPalindrome()
    {
        System.out.println(NumberPalindrome.isPalindrome(-1221));
        System.out.println(NumberPalindrome.isPalindrome(707));
        System.out.println(NumberPalindrome.isPalindrome(11212));
    }
    public static void testSumOdd(){
        System.out.println(SumOddRange.sumOdd(1, 100));
        System.out.println(SumOddRange.sumOdd(-1, 100));
        System.out.println(SumOddRange.sumOdd(100, 100));
        System.out.println(SumOddRange.sumOdd(13, 13));
        System.out.println(SumOddRange.sumOdd(100, -100));
        System.out.println(SumOddRange.sumOdd(100, 1000));
    }
    public static void testNumberOfDaysInMonth(){
        // System.out.println(NumberOfDaysInMonth.isLeapYear(-1600));
        // System.out.println(NumberOfDaysInMonth.isLeapYear(1600));
        // System.out.println(NumberOfDaysInMonth.isLeapYear(2017));
        // System.out.println(NumberOfDaysInMonth.isLeapYear(2000));

        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2020));
    }

    public static void testNumberInWord(){
        NumberInWord.printNumberInWord(5);
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
