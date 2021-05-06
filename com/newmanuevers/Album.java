import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String albumName, String artistName){
        name = albumName;
        artist = artistName;
        songs = new ArrayList<Song>();

    }

    private Song findSong(String songTitle){
        for( Song song: songs){
            if( songTitle.equals(song.getTitle())){
                return song;
            }
        }

        return null;
    }

    public boolean addSong(String songTitle, double songDuration){
        Song foundSong = findSong(songTitle);
        
        if(foundSong == null){
            Song newSong = new Song(songTitle, songDuration);
            songs.add(newSong);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNo, LinkedList<Song> playlist){
        if(((trackNo -1) >= 0) && (trackNo -1) <= songs.size()){
            playlist.add(songs.get(trackNo - 1));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist){
        Song foundSong = findSong(songTitle);
        if(foundSong != null){
            playlist.add(foundSong);
            return true;
        }

        return false;
    }

}
