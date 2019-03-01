package com.axity.exam;

public class Main {

    public static void main(String[] args) {
        Observable disquera = new Observable();
        String song = "cancion 1";

        Spotify spotify = new Spotify();
        AppleMusic appleMusic = new AppleMusic();

        disquera.addStreamingService(spotify);
        disquera.addStreamingService(appleMusic);

        disquera.setPayState(true, song);
    }
}
