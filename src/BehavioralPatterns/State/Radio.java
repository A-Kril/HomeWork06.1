package BehavioralPatterns.State;

class Radio {
    Station station;

    void setStation(Station station) {
        this.station = station;
    }

    void nextStation(){
        if (station instanceof EvropaPlus){
            setStation(new KissFM());
        }
        else if(station instanceof KissFM){
            setStation(new RadioRelax());
        }
        else if (station instanceof RadioRelax){
            setStation(new EvropaPlus());
        }
    }
    void play(){
        station.play();
    }
}
