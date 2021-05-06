import java.util.ArrayList;
import java.util.LinkedList;

import Composition.Hamburger;

public class exerciseChallenge {
    
    public static void main(String[] args) {
     
        
        //testMobilePhone();
        //testBank();
        testAlbum();
      
    } 
    public static void testAlbum(){
         ArrayList<Album> albums = new ArrayList<>();
         
         Album album = new Album("Stormbringer", "Deep Purple");
         album.addSong("Stormbringer", 4.6);
         album.addSong("Love don't mean a thing", 4.22);
         album.addSong("Holy man", 4.3);
         album.addSong("Hold on", 5.6);
         album.addSong("Lady double dealer", 3.21);
         album.addSong("You can't do it right", 6.23);
         album.addSong("High ball shooter", 4.27);
         album.addSong("The gypsy", 4.2);
         album.addSong("Soldier of fortune", 3.13);
         albums.add(album);

         album = new Album("For those about to rock", "AC/DC");
         album.addSong("For those about to rock", 5.44);
         album.addSong("I put the finger on you", 3.25);
         album.addSong("Let's go", 3.45);
         album.addSong("Inject the venom", 3.33);
         album.addSong("Snowballed", 4.51);
         album.addSong("Evil walks", 3.45);
         album.addSong("C.O.D", 5.25);
         album.addSong("Breaking the rules", 5.33);
         album.addSong("Night of the long knives", 5.12);
         albums.add(album);

         LinkedList<Song> playlist = new LinkedList<>();

         albums.get(0).AddToPlayList("You can't do it right", playlist);
         albums.get(0).AddToPlayList("Holy man", playlist);
         albums.get(0).AddToPlayList("Speed king", playlist);
         albums.get(0).AddToPlayList(9, playlist);
         albums.get(1).AddToPlayList(3, playlist);
         albums.get(1).AddToPlayList(2, playlist);
         albums.get(1).AddToPlayList(24, playlist);


         for(Song song: playlist){
             System.out.println("Now playing " + song.toString());
         }















    }
    public static void testBank(){
        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);
       
        System.out.println( bank.addCustomer("Tempe", "Sean", 50.05));

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Percy", 1.65);


        bank.listCustomers("Adelaide", true);
    }
    public static void testMobilePhone(){
        MobilePhone newPhone = new MobilePhone("6239103564");
        newPhone.printContacts();
        newPhone.addNewContact(Contact.createContact("Sean", "602.916.7967"));
        newPhone.printContacts();
        Contact findContact = newPhone.queryContact("Sean");
        System.out.println(findContact.getName());
        newPhone.addNewContact(Contact.createContact("Jerry", "602.916.7967"));
        newPhone.printContacts();
        newPhone.removeContact(newPhone.queryContact("Jerry"));
        newPhone.printContacts();
        newPhone.updateContact(newPhone.queryContact("Sean"), Contact.createContact("Cody", "6232380586"));
        newPhone.printContacts();
        
      

    }
    public static void testReverseArray(){
        int[] rArray = {5,4,3,2,1};
        ReverseArray.reverse(rArray);
    }

    public static void testMinimumElement(){
        
        // int size = MinimumElement.readInteger();
          

        // int[] newArray = MinimumElement.readElements(size);
        // int minValue = MinimumElement.FindMin(newArray);
         

    }
    public static void testSortedArray(){
        SortedArray sortedArray = new SortedArray();
        int[] unsortedArray = sortedArray.getIntegers(5);
        sortedArray.printArray(unsortedArray);
        int[] newSortedArray = sortedArray.sortIntegers(unsortedArray);
        sortedArray.printArray(newSortedArray);

    }
    public static void testHamburger(){
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizehamburger());

        DeluxBurger db = new DeluxBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Delux Burger price is " + db.itemizehamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHamburgerAddition2("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizehamburger());


    }
    public static void testCar(){
        Polymorphism.Car car = new Polymorphism.Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Polymorphism.Mitsubishi mitsubishi = new Polymorphism.Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Polymorphism.Holden holden = new Polymorphism.Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        Polymorphism.Ford ford = new Polymorphism.Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        


    }
    public static void testPrinter(){
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());

        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        

    }
    public static void testComposition(){
        Composition.Wall wall1 = new Composition.Wall("West");
        Composition.Wall wall2 = new Composition.Wall("East");
        Composition.Wall wall3 = new Composition.Wall("South");
        Composition.Wall wall4 = new Composition.Wall("North");

        Composition.Ceiling ceiling = new Composition.Ceiling(12, 55);

        Composition.Bed bed = new Composition.Bed("Modern", 4,3,2,1);
        Composition.Lamp lamp = new Composition.Lamp("Classic", false, 75);
        Composition.BedRoom bedRoom = new Composition.BedRoom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();



    }
    public static void testPoolArea(){
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());



    }
    public static void testCylinder(){
        Circle circle = new Circle(3.75);
        System.out.println("cirecle.radius= " + circle.getRadius());
        System.out.println("cirecle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

    }
    public static void testComplexNumber(){
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1, 1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
        




    }
    public static void testCarpetCost(){
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total=" + calculator.getTotalCost());

        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total=" + calculator.getTotalCost());

    }
    public static void testPoint(){
        Point first = new Point(6,5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second= " + first.distance(second));
        System.out.println("distance(2,1)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
    public static void testWall(){
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area" + wall.getArea());
    }
    public static void testPerson(){
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        System.out.println(person.getFullName());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");
        System.out.println(person.getFullName()); 
    }

    public static void testSimpleCalculator(){
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide=" + calculator.getDivisionResult());
    }

    public static void testPaintJob(){
        // System.out.println(PaintJob.getBucketCount(0.0, 2.1, 1.5, 7));
        // System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2));
        // System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
        // System.out.println(PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));
        // System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5));
        // System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5));
        // System.out.println(PaintJob.getBucketCount(7.25,4.3, 2.35));
        // System.out.println(PaintJob.getBucketCount(3.4, 1.5));
        // System.out.println(PaintJob.getBucketCount(6.26, 2.2));
        // System.out.println(PaintJob.getBucketCount(3.26, 0.75));
        
        
    }
    public static void testDiagonalStar(){
        DiagonalStar.printSquareStar(2);
    }
    public static void testLargestPrime(){
        System.out.println(LargestPrime.getLargestPrime(0));
        System.out.println(LargestPrime.getLargestPrime(21));
        System.out.println(LargestPrime.getLargestPrime(217));
        System.out.println(LargestPrime.getLargestPrime(45));
        System.out.println(LargestPrime.getLargestPrime(-1));
        System.out.println(LargestPrime.getLargestPrime(2));
    }
    public static void testFlourPacker(){
        System.out.println(FlourPacker.canPack(1, 0, 4));
        System.out.println(FlourPacker.canPack(1, 0, 5));
        System.out.println(FlourPacker.canPack(0, 5, 4));
        System.out.println(FlourPacker.canPack(2, 2, 11));
        System.out.println(FlourPacker.canPack(-3, 2, 12));
        System.out.println(FlourPacker.canPack(2, 1, 5));
        System.out.println(FlourPacker.canPack(4, 18, 19));
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
