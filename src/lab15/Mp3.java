package lab15;

public  class Mp3 extends MusicPlayer {
    @Override
    public String play() {
        System.out.println("Gram z MP3 : " +);
        return super.play();
    }

    @Override
    public String pauza() {
        System.out.println("Pauza z MP3");
       return super.pauza();
    }

    @Override
    public String stop() {
        System.out.println("Stop z MP3");
        return super.stop();
    }

    @Override
    public String nastepny() {
        System.out.println("Next z MP3");
        return super.nastepny();
    }

    @Override
    public String poprzedni() {
        System.out.println("Poprzedni z MP3");
        return super.poprzedni();
    }
}
