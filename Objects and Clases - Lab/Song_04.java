package Lab_ObjectsAndClases;

import java.util.*;

public class Song_04 {

    static class Song {
        String typeList;
        String songName;
        String time;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int songsCount = Integer.parseInt(scan.nextLine());

        Song[] songs = new Song[songsCount];

        for (int i = 0; i < songsCount; i++) {
            String[] currentSongAsString = scan.nextLine().split("_");
            Song currentSong = new Song();
            currentSong.typeList = currentSongAsString[0];
            currentSong.songName = currentSongAsString[1];
            currentSong.time = currentSongAsString[2];
            songs[i] = currentSong;
        }

        String searchingTypeList = scan.nextLine();

        for (Song song : songs) {
            if (song.typeList.equals(searchingTypeList)){
                System.out.println(song.songName);
            } else if (searchingTypeList.equals("all")){
                System.out.println(song.songName);
            }
        }


    }
}
