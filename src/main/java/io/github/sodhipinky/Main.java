package io.github.sodhipinky;

import io.github.sodhipinky.service.MusicPlayer;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.play("src/main/resources/Wakanda Origins.wav");
    }
}