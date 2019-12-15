package modyfikatory;

public class WashingMachine {
    private int temperature;
    private int spinning;

    public void modeForSensitiveClouthes() {
        this.temperature = 30;
        this.spinning = 800;
    }

    public void modeForTowelsAndBedLinen() {
        this.temperature = 80;
        this.spinning = 1200;
    }
    public void showSetting() {
        System.out.println("Temperatura : " + this.temperature + " , obroty : " + this.spinning);
    }

    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.modeForSensitiveClouthes();
        washingMachine.showSetting();

    }
}
