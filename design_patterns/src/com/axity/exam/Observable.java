package com.axity.exam;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<StreamingService> streamingServices = new ArrayList<StreamingService>();
    private boolean payState;

    public boolean getPayState() {
        return payState;
    }

    public void setPayState(boolean payState, String song) {
        this.payState = payState;
        notifyObservers(song);
    }

    private void notifyObservers(String song) {
        streamingServices.forEach(x -> {
            x.setAlreadyPay(payState);
            x.update(song);
        });
    }

    public void addStreamingService(StreamingService observer) {
        streamingServices.add(observer);
    }
}
