package Lab17;

public enum Directions {
    NORTH("N", "Północ", "North"),
    NORTHandEASTH("NE", "PółnocnyWschód", "NorthWest"),
    NORTHandWEASTH("NW", "PółnocnyZachód", "NorthEast"),
    EASTH("E", "Wschód", "Easth"),
    WEAST("W", "Zachód", "WEAST"),
    SOUTH("S", "Południe", "South"),
    SOUTHEAST("SE", "PołudniowyWschód", "SouthEasth"),
    SOUTHWEAST("SW", "PołudniowyZachód","SouthWeast");

    private String sName;
    private String polName;
    private String engName;

    Directions(String sName, String polName, String engName) {
        this.sName = sName;
        this.polName = polName;
        this.engName = engName;
    }

    public String getsName() {
        return sName;
    }

    public String getPolName() {
        return polName;
    }

    public String getEngName() {
        return engName;
    }
}
