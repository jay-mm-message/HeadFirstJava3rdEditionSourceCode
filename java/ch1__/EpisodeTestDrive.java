package ch1__;

public class EpisodeTestDrive {
    public static void main(String[] args) {
        Episode episode = new Episode();

        episode.seriesNumber = 4;
        episode.skipIntro();
        episode.skipToNext();
    }
}
