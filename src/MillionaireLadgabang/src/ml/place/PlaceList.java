package ml.place;

import java.util.ArrayList;
import ml.player.Player;

public class PlaceList {

    public static int amount_side = 4;
    public static int amount_place = 28;

    private ArrayList<Place> place;
    private ArrayList<LandMark> lanmark;

    public PlaceList() {
        place = new ArrayList();
        lanmark = new ArrayList();
        createPlace();
    }

    public void createPlace() {
        place.add(new Place("start", false, new double[]{}, new double[]{}));

        place.add(new Place("ครัวบะช่อ", true, new double[]{2e6, 3e3, 5e3}, new double[]{2e3, 3e3, 5e3}));
        place.add(new Place("จุด 3 จุด", true, new double[]{27e5, 3e3, 5e3}, new double[]{2e3, 3e3, 5e3}));
        place.add(new Place("มินิเกมส์", false, new double[]{}, new double[]{}));
        place.add(new Place("โคเคชิ", true, new double[]{4e6, 3e3, 5e3}, new double[]{2e3, 3e3, 5e3}));
        place.add(new Place("โคมริมน้ำ", true, new double[]{37e5, 3e3, 5e3}, new double[]{2e3, 3e3, 5e3}));
        place.add(new Place("Old Scool", true, new double[]{46e5, 3e3, 5e3}, new double[]{2e3, 3e3, 5e3}));

        place.add(new Place("งานทะเบียน", false, new double[]{2e3}, new double[]{}));

        place.add(new Place("โกอิน ชาชัก", true, new double[]{42e5, 3e3, 5e3}, new double[]{2e3, 3e3, 5e3}));
        place.add(new Place("ลาวา", true, new double[]{47e5, 3e3, 5e3}, new double[]{2e3, 3e3, 5e3}));
        place.add(new Place("นมมหาลัย", true, new double[]{55e5, 3e3, 5e3}, new double[]{2e3, 3e3, 5e3}));
        place.add(new Place("การ์ด", false, new double[]{}, new double[]{}));
        place.add(new Place("นมหวาน", true, new double[]{6e6, 3e3, 5e3}, new double[]{2e3, 3e3, 5e3}));
        place.add(new Place("Butter Beer", true, new double[]{68e5, 3e3, 5e3}, new double[]{2e3, 3e3, 5e3}));

        place.add(new Place("วัดปลูกศรัทธา", false, new double[]{}, new double[]{}));

        place.add(new Place("อาทโฮมเพลส", true, new double[]{71e5, 3e3, 5e3}, new double[]{2e3, 3e3, 5e3}));
        place.add(new Place("หอดำ", true, new double[]{77e5, 3e3, 5e3}, new double[]{2e3, 3e3, 5e3}));
        place.add(new Place("U-Place", true, new double[]{83e5, 3e3, 5e3}, new double[]{2e3, 3e3, 5e3}));
        place.add(new Place("หอจรัญ", true, new double[]{96e5, 3e3, 5e3}, new double[]{2e3, 3e3, 5e3}));
        place.add(new Place("ดีนาเพลส", true, new double[]{1e7, 3e3, 5e3}, new double[]{2e3, 3e3, 5e3}));
        place.add(new Place("RNP Place", true, new double[]{96e5, 3e3, 5e3}, new double[]{2e3, 3e3, 5e3}));

        place.add(new Place("วินเกกี 4", false, new double[]{}, new double[]{}));

        place.add(new Place("E-bar", true, new double[]{11e6, 3e3, 5e3}, new double[]{2e3, 3e3, 5e3}));
        place.add(new Place("Boom Beer Bar", true, new double[]{11e6, 3e3, 5e3}, new double[]{2e3, 3e3, 5e3}));
        place.add(new Place("Chic", true, new double[]{12e6, 3e3, 5e3}, new double[]{2e3, 3e3, 5e3}));
        place.add(new Place("การ์ด", false, new double[]{}, new double[]{}));
        place.add(new Place("Coma", true, new double[]{13e6, 3e3, 5e3}, new double[]{2e3, 3e3, 5e3}));
        place.add(new Place("Bridge Bar", true, new double[]{14e6, 3e3, 5e3}, new double[]{2e3, 3e3, 5e3}));

        lanmark.add(new LandMark(new int[]{1, 2}, 7e4));
        lanmark.add(new LandMark(new int[]{8, 9}, 7e4));
        lanmark.add(new LandMark(new int[]{15, 16}, 7e4));
        lanmark.add(new LandMark(new int[]{21, 22}, 7e4));
    }

    public Place getPlace(int i) {
        return place.get(i);
    }

    public Place getPlace(Player player) {
        return place.get(player.getId());
    }

    public int size() {
        return amount_place;
    }
}
