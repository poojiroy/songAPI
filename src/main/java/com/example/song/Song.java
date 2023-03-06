// Write your code here
package com.example.song;
public class Song{
private int intsongId;
private String songName	;
private String lyricist;
private String singer;
private String musicDirector;
Song(int intsongId, String songName, String lyricist, String singer, String musicDirector){
    this.intsongId=intsongId;
    this.lyricist=lyricist;
    this.singer=singer;
    this.musicDirector=musicDirector;
}
public void setIntsongId(int intsongId){
    this.intsongId=intsongId;
}
public int getIntsongId(){
    return intsongId;
}	
public void setSongName(String songName){
    this.songName=songName;
}
public String getSongName(){
    return songName;
}
public void setLyricist(String lyricist){
    this.lyricist=lyricist;
}
public String getLyricist(){
    return lyricist;
}
public void setMusicDirector(String musicDirector){
    this.musicDirector=musicDirector;
}
public String getMusicDirector(){
    return musicDirector;

}
public void setSinger(String singer){
    this.singer=singer;
}
public String getSinger(){
    return singer;

}
}