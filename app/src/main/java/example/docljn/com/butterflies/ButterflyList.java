package example.docljn.com.butterflies;

import java.util.ArrayList;

/**
 * Created by lornanoble on 23/01/2018.
 */

public class ButterflyList {

    public ArrayList<Butterfly> butterflies;

    public ButterflyList(){
        butterflies = new ArrayList<>();
        butterflies.add(new Butterfly("Duke of Burgundy", "Hamearis lucina", "pic"));
        butterflies.add(new Butterfly("Pearl-bordered fritillary", "Boloria euphrosyne", "pic"));
        butterflies.add(new Butterfly());
        butterflies.add(new Butterfly());
        butterflies.add(new Butterfly());
        butterflies.add(new Butterfly());
        butterflies.add(new Butterfly());
        butterflies.add(new Butterfly());
        butterflies.add(new Butterfly());
        butterflies.add(new Butterfly());
    }


}
