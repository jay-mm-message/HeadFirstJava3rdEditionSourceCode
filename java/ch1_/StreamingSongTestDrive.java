package ch1_;

public class StreamingSongTestDrive {
    public static void main(String [] args) {
        StreamingSong song = new StreamingSong();

        song.artist = "The Beatles";
        song.title = "Come Togther";

        song.play();
        song.printDetails();
    }
}
