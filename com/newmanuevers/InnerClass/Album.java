package InnerClass;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String albumName, String artistName){
        name = albumName;
        artist = artistName;
        songs = new SongList();

    }

    public boolean addSong(String songTitle, double songDuration){
        return this.songs.add(new Song(songTitle, songDuration));
    }

    public boolean addToPlayList(int trackNo, LinkedList<Song> playlist){
        Song songToLocate = this.songs.findSong(trackNo);

        if(songToLocate != null){
            playlist.add(songToLocate);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist){
        Song songToLocate = this.songs.findSong(songTitle);

        if(songToLocate != null){
            playlist.add(songToLocate);
            return true;
        }

        return false;
    }

    // Create inner class
    public static class SongList{
        private ArrayList<Song> songs;

        private SongList(){
            this.songs = new ArrayList<Song>();
        }

        private boolean add(Song song){
            if(songs.contains(song)){
                return false;
            }
            this.songs.add(song);
            return true;

        }

        private Song findSong(String songTitle){
            for( Song song: songs){
                if( songTitle.equals(song.getTitle())){
                    return song;
                }
            }
    
            return null;
        }

        private Song findSong(int trackNumber){
            int index = trackNumber - 1;
            if((index > 0) && (index < songs.size())){
                return songs.get(index);
            }

            return null;
        }
    }

}
