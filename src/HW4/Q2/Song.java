package HW4.Q2;

public class Song {
    String title;
    String artist;
    String album;
    int duration;

    public Song(String title, String artist, String album, int duration) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAlbum() {
        return this.album;
    }

    public void print() {
        System.out.println(this.title + ", by " + this.artist + ", Album: " + this.album + ", Duration (sec): " + this.duration);
    }
}
