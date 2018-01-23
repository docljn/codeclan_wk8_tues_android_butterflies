package example.docljn.com.butterflies;

import java.util.ArrayList;

/**
 * Created by lornanoble on 23/01/2018.
 */

public class ButterflyList {

    public ArrayList<Butterfly> butterflies;

    public ButterflyList(){
        butterflies = new ArrayList<>();
        butterflies.add(new Butterfly("Duke of Burgundy", "Hamearis lucina", 1));
        butterflies.add(new Butterfly("Pearl-bordered fritillary", "Boloria euphrosyne", 1));
        butterflies.add(new Butterfly("Large blue", "Phengaris arion", 1));
        butterflies.add(new Butterfly("Swallowtail", "Papilio machaon", 1));
        butterflies.add(new Butterfly("White admiral", "Limenitis camilla", 1));
        butterflies.add(new Butterfly("High brown fritillary", "Argynnis adippe", 1));
        butterflies.add(new Butterfly("Purple emperor", "Apatura iris", 1));
        butterflies.add(new Butterfly("Mountain ringlet", "Erebia epiphron", 1));
        butterflies.add(new Butterfly("Adonis blue", "Polyommatus bellargus", 1));
        butterflies.add(new Butterfly("Brown hairstreak", "Thecla betulae", 1));
    }


}
