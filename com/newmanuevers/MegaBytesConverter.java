package newmanuevers;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
      if( kiloBytes < 0 ){
        System.out.println("Invalid Value");
      }
      else{
        int Mb = kiloBytes / 1024;
        int Kb = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + Mb + " MB and " + Kb + " KB");
  
      }

    }
}
