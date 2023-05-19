package Final.Q2;

public class MusicRequest implements Request{
    private String song;

    public MusicRequest(String song) {
        this.song = song;
    }

    @Override
    public void execute() {
        System.out.println("Playing " + song);
    }

    @Override
    public String type() {
        return "Music";
    }
}
