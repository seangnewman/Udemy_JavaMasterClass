package newmanuevers;

public class CatPlaying {
    public static boolean isCatPlaying(boolean summer, int temperature){
       return (summer && temperature >= 25 && temperature <= 45)? true:
                (temperature >= 25 && temperature <= 35) ? true : false;
        
    }
}
