package ml.bimdev.lesson21.binsearch;

import java.util.Random;

public class AudioTrack implements Comparable<AudioTrack> {
    private int duration;
    private String title;
    private static Random rnd = new Random();

    public AudioTrack(int duration, String title) {
        this.duration = duration;
        this.title = title;
    }

    @Override
    public int compareTo(AudioTrack o) {
        int d = duration - o.duration;
        if (d == 0) {
            return title.compareTo(o.title);
        } else {
            return d;
        }
    }

    @Override
    public String toString() {
        return String.format("AudioTrack %02d -- %s", duration, title);
    }

    public static AudioTrack random() {
        return new AudioTrack(rnd.nextInt(99), Character.toString((char) ('a' + rnd.nextInt((int) 'z' - 'a'))));
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof AudioTrack))
            return false;
        if (this == obj)
            return true;
        AudioTrack other = (AudioTrack) obj;
        return duration == other.duration && title.equals(other.title);
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 31 + duration;
        hash = hash * 31 * title.hashCode();
        return hash;
    }
}