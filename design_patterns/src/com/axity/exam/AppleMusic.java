package com.axity.exam;

public class AppleMusic extends  StreamingService{
    @Override
    public void update(String song) {
        if (isAlreadyPay()){
            addSong(song);
            System.out.println("Se agrego la cancion " +song);
        }
    }
}
