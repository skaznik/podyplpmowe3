package lab15;

public class Cd extends MusicPlayer {
    @Override
    public String play() {
        System.out.println("Gram z CD");
        return super.play();
    }

    @Override
    public String pauza() {
        System.out.println("Pauza z CD");
        return super.pauza();
    }

    @Override
    public String stop() {
        System.out.println("Stop z CD");
        return super.stop();
    }

    @Override
    public String nastepny() {
        System.out.println("Next z CD");
        return super.nastepny();
    }

    @Override
    public String poprzedni() {
        System.out.println("Poprzedni z CD");
        return super.poprzedni();
    }
}
