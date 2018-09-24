package ex0001;

public class WetterWert {

    private int temperatur;
    private int luftfeuchtigkeit;
    private final String zeitpunkt;

    public WetterWert(int temperatur, int luftfeuchtigkeit, String zeitpunkt) {
        this.temperatur = temperatur;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        this.zeitpunkt = zeitpunkt;
    }

    public int getTemperatur() {
        return temperatur;
    }

    public void setTemperatur(int temperatur) {
        this.temperatur = temperatur;
    }

    public int getLuftfeuchtigkeit() {
        return luftfeuchtigkeit;
    }

    public void setLuftfeuchtigkeit(int luftfeuchtigkeit) {
        this.luftfeuchtigkeit = luftfeuchtigkeit;
    }

    public String getZeitpunkt() {
        return zeitpunkt;
    }

}
