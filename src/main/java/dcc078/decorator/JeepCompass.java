package dcc078.decorator;

public class JeepCompass implements Jeep{

    public  float precoJeep;

    public JeepCompass() {

    }
    public JeepCompass(float precoJeep) {
        this.precoJeep = precoJeep;
    }

    @Override
    public float getPreco() {
        return precoJeep;
    }

    @Override
    public String getOpcional() {
        return "Jeep Compass";
    }
}
