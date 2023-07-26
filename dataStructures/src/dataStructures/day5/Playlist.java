package dataStructures.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Playlist {
    private Song head;
    private Song tail;
    private int size;

    class Song {

        Song prev;
        String title;
        String artist;
        String duration;
        Song next;

        Song(String title, String artist, String duration) {
            this.title = title;
            this.artist = artist;
            this.duration = duration;
        }

        @Override
        public String toString() {
            return "SongList { " +
                    "title='" + title + '\'' +
                    ", artist='" + artist + '\'' +
                    ", duration='" + duration + '\'' +
                    " }";
        }
    }

    Playlist() {

    }

    Playlist(String title, String artist, String duration) {
        Song newSong = new Song(title, artist, duration);
        this.head = newSong;
        this.tail = newSong;
        this.size = 1;
    }

    public void printPlalist() {
        Song temp = head;
        while (temp != null) {
            System.out.println( "title='" + temp.title + ", artist='" + temp.artist + ", duration='" + temp.duration);
            temp = temp.next;
        }
    }

    public void insert(String title, String artist, String duration) {
        Song newSong = new Song(title, artist, duration);
        if (head == null) {
            this.head = newSong;
            this.tail = newSong;
        } else {
            newSong.prev = tail;
            tail.next = newSong;
            tail = newSong;
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public Song remove(String title) {
        if (head == null) return null;
        Song temp = head;
        if (size == 1) return temp;
        while (temp.title != title) {
            temp = temp.next;
        }
        Song before = temp.prev;
        Song after = temp.next;
        before.next = after;
        after.prev = before;
        temp.prev = null;
        temp.next = null;
        size--;
        return temp;
    }

    public Song displaySong(String title) {
        Song temp = head;
        while (temp.title != title) {
            temp = temp.next;
        }
        return temp;
    }

    public void playBack(String title) {
        Song temp = head;
        while (temp != null && temp.title != title) {
            temp = temp.next;
        }
        if (temp == null) return;
        Song before = temp.prev;
        Song after = temp.next;
        if (before == null) {
            System.out.println("before: " + null + " | " + temp.toString() + " | " + after.toString());
        } else if (after == null) {
            System.out.println(before.toString() + " | " + temp.toString() + " | after: " + null);
        } else {
            System.out.println(before.toString() + temp.toString() + after.toString());
        }
    }

    public boolean search(String title) {
        Song temp = head;
        while (temp != null && temp.title != title) {
            temp = temp.next;
        }
        if (temp == null) return false;
        return true;
    }

    public void shuffle(Playlist pl) {
        Playlist newPlaylist = new Playlist();
        ArrayList<Integer> randomNumberList = new ArrayList<>();
        while (randomNumberList.size() != pl.getSize()) {
            int max = pl.getSize();
            double randomDouble = Math.random();
            int randomNumber = (int) (randomDouble * max);
            // To ensure no duplicate random numbers, you can regenerate if needed.
            if (!randomNumberList.contains(randomNumber)) {
                randomNumberList.add(randomNumber);
                Song temp = pl.head;
                for (int i = 0; i < randomNumber; i++) {
                    temp = temp.next;
                }
                newPlaylist.insert(temp.title, temp.artist, temp.duration);
            }
        }
        newPlaylist.printPlalist();
    }
}
