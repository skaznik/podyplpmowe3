package lab15;

abstract public class MusicPlayer implements Player{
    @Override
    public String play() {
        return "play";
    }

    @Override
    public String pauza() {
        return "pauza";
    }

    @Override
    public String stop() {
        return "stop";
    }

    @Override
    public String nastepny() {
        return "nastepny";
    }

    @Override
    public String poprzedni() {
        return "poprzedni";
    }

    public MusicPlayer() {
    }
}
