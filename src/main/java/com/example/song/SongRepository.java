// Write your code here
package com.example.song;
import com.example.song.Song;
import java.util.*;
public interface SongRepository{
    ArrayList<Song> getsongs();
    Song addsong(Song song);
    Song getsong(int songId);
    Song updatesong(int songId, Song song);
    void deletesong(int songId);
}

