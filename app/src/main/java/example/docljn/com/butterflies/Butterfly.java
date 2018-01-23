package example.docljn.com.butterflies;

/**
 * Created by lornanoble on 23/01/2018.
 */

public class Butterfly {
    private String commonName;
    private String latinName;
    private String imageID;

    public Butterfly(String commonName, String latinName, String imageID){

        this.commonName = commonName;
        this.latinName = latinName;
        this.imageID = imageID;
    }

    public String getCommonName() {
        return this.commonName;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public String getImageLocation() {
        return this.imageID;
    }
}
