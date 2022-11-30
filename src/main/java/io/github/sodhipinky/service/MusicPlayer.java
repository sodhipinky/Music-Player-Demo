/*
 * Author : Pinky Sodhi
 * Date : 30-11-2022
 * Created Using : IntelliJ IDEA Community Edition
 */
package io.github.sodhipinky.service;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class MusicPlayer {
    public void play() {
        //1. path of the song file to be played
        String songPath = "src/main/resources/Wakanda Origins.wav";
        //2. create a File object to represent the song file
        File songFile = new File(songPath);
        //3. create an object of AudioInputStream class
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(songFile);
        } catch (UnsupportedAudioFileException | IOException exception) {
            exception.printStackTrace();
        }
    }
}
