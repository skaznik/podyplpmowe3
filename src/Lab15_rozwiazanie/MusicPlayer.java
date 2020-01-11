package Lab15_rozwiazanie;

abstract public class MusicPlayer implements Player {
private Song[] songs;
private int current;

    public MusicPlayer(Song[] songs) {
        this.current = 0;
        this.songs = songs;
    }
    public Song getCurrentSong() {
        return songs[current];
    }

    public void next() {
        if (++current >= songs.length) {
            current = 0;
        }
        play();
    }

    @Override
    public void previous() {
        if (--current < 0) {
            current = songs.length - 1;
        }
        play();
    }
}
