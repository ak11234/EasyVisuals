

import java.io.*;
import sun.audio.*;

import javax.sound.sampled.SourceDataLine;


/**
 * Created by Adam Kalman on 7/6/2016. EasyVisuals for Java 1.8
 */



public class EasyVisuals {
    public void quickStart(){
        try {
            InputStream inputStream = getClass().getResourceAsStream("RickRollCut.wav");
            java.io.InputStream audioStream = new AudioStream(inputStream);
            AudioPlayer.player.start(audioStream);
        }
        catch (Exception e) {
            //whatevers
        }
    }
}
