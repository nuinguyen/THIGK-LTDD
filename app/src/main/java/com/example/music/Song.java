package com.example.music;

public class Song {
    public String idSong;
    public String nameSong;
    public Integer fileSong;

    public Song() {
    }

    public Song(String idSong, String nameSong, Integer fileSong) {
        this.idSong = idSong;
        this.nameSong = nameSong;
        this.fileSong = fileSong;
    }

    public String getIdSong() {
        return idSong;
    }

    public void setIdSong(String idSong) {
        this.idSong = idSong;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public Integer getFileSong() {
        return fileSong;
    }

    public void setFileSong(Integer fileSong) {
        this.fileSong = fileSong;
    }
}
