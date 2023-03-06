/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.song;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.song.Song;
import com.example.song.SongService;
import java.util.*;
@RestController
public class SongController{
    SongService songservice = new SongService();
    @GetMapping("/songs")
    public ArrayList<Song> getsongs(){
        
        return  songservice.getsongs();
    }
    @PostMapping("/songs")
    public Song addsong(@RequestBody Song song){
        return songservice.addsong(song);
    }
    @GetMapping("/songs/{songId}")
    public Song getsong(@PathVariable("songId") int songId){
        return songservice.getsong(songId);
    }
    @PutMapping("/songs/songId")
    public Song updatesong(@PathVariable("songId") int songId, @RequestBody Song song){
        return songservice.updatesong(songId, song);

    }
    @DeleteMapping("/songs/{songId}")
    public void deletesong(@PathVariable("songId") int songId){
        songservice.deletesong(songId);
    }

}