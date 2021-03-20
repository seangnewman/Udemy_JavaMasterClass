public class

FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if( bigCount < 0 || smallCount < 0 || goal < 0)
          return false;
        
        int bigFlourBag = bigCount * 5;
        int smallFlourBag = smallCount;
        int numKilos = goal;

              
        if(bigFlourBag + smallFlourBag < numKilos)
            return false;

        if(bigFlourBag > 0){
          if(numKilos%5 == 0)
            return true;
          else if(smallFlourBag < numKilos % 5)
            return false;
        }else{
            if(smallFlourBag < numKilos)
            return false; 
        }
        
       return true;
    }
    
}
