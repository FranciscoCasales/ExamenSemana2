package com.axity.exam;

import java.util.ArrayList;

public abstract class StreamingService {
    public ArrayList<String> songs= new ArrayList<String>();
    private boolean alreadyPay;
    protected Observable observable;
    public abstract void update(String song);
    public void addSong(String name){
        songs.add(name);
    }

    public void setAlreadyPay(boolean alreadyPay) {
        this.alreadyPay = alreadyPay;
    }

    public boolean isAlreadyPay() {
        return alreadyPay;
    }
}