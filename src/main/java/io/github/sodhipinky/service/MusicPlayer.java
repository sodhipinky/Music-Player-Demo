/*
 * Author : Pinky Sodhi
 * Date : 30-11-2022
 * Created Using : IntelliJ IDEA Community Edition
 */
package io.github.sodhipinky.service;

import java.io.File;

public class MusicPlayer {
    public void play() {
        //1. path of the song file to be played
        String songPath = "src/main/resources/Wakanda Origins.wav";
        //2. create a File object to represent the song file
        File songFile = new File(songPath);
    }
}
