package ml.place;

import java.util.ArrayList;
import ml.player.Player;

public class PlaceList {
    
    private final int size_place = 28;
    
    private ArrayList<Place> place;
    private ArrayList<LanMark> lanmark;
    
    public PlaceList(){
        place = new ArrayList();
        lanmark = new ArrayList();
        createPlace();
    }
    
    public void createPlace(){
        place.add( new Place("start", new double[]{2e3, 3e3, 5e3}));
        place.add( new Place("วัดเกfdfกี", new double[]{2e3, 3e3, 5e3}));
        place.add( new Place("วัดเdfdกกี", new double[]{2e3, 3e3, 5e3}));
        
        lanmark.add(new int[]{1,2},7e4);
    }
    
    public Place getPlace(int i) {
        return place.get(i);
    }
    
    public int size(){
        return size_place;
    }
}