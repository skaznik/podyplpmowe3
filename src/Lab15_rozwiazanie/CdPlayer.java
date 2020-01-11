package Lab15_rozwiazanie;

public class CdPlayer extends MusicPlayer {
    public CdPlayer(Song[] songs) {
        super(songs);
    }


    @Override
    public void play() {
        System.out.println("CD odtwarza : " + getCurrentSong());
    }

    @Override
    public void stop() {
        System.out.println("CD stop");
    }

    @Override
    public void pause() {
        System.out.println("CD pauza : " + getCurrentSong());
    }


}
