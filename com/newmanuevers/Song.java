public class Song {
    private String title;
    private double duration;

    public Song(String songTitle, double songDuration){
        title = songTitle;
        duration = songDuration;
    }

    public String getTitle(){
        return title;
    }

    @Override
    public String toString(){
        return title + ": " + duration;
    }
}
