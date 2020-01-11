package Lab15_rozwiazanie;

public class StereoSystem {
    public static void main(String[] args) {
        Song[] songs = new Song[3];
        songs[0] = new Song("Michael Jakson", "Beat It", "Threaler");
        songs[1] = new Song("Pearl Jeam", "Even Flow", "then");
        songs[2] = new Song("Ktoś", "Over", "NYC Live");


        Player[] players = {new Mp3Player(songs), new CdPlayer(songs)};
        players[0].play();
        players[0].pause();
        players[0].stop();

        players[1].play();
        players[1].next();
        players[1].previous();
        players[1].stop();
    }

}
