package com.axity.exam;

public class Spotify extends StreamingService{

    @Override
    public void update(String song) {
        if (isAlreadyPay()){
            addSong(song);
            System.out.println("Se agrego la cancion " +song);
        }
    }
}
