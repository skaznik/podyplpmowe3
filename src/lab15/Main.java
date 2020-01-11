package lab15;

public class Main {
    public static void main(String[] args) {
        Song[] songs = new Song[5];
        songs[0] = new Song("Google","Umie","Szukać");
        songs[1] = new Song("Jakaś", "Inna", "Piosenka");
        songs[2] = new Song("Jeszcze", "Inna", "Piosenka");
        songs[3] = new Song("Przedostatnia", "Jakaś", "Piosenka");
        songs[4] = new Song("Ostatnia", "Moja", "Piosenka");

        Mp3 mp3 = new Mp3();
        mp3.play();
        mp3.pauza();
        mp3.stop();
        Cd cd = new Cd();
        cd.nastepny();
        cd.poprzedni();
    }
}

