package BackEnd;

import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;


public class  ActivateMusic extends Thread {
	private FloatControl gainControl;
	private File yourFile;
	private AudioInputStream stream;
	private AudioFormat format;
	private DataLine.Info info;
	private Clip clip;
	private int mode,mix;
	
		public ActivateMusic(int mode) {
			this.mode = mode;
		}
		public void changeVolume(int value) {
	    	mix = value;
	    	System.out.println("INHERE"+ mix);
	    	gainControl.setValue(mix);
		}
		
		public void close() {
			clip.close();
		}
		 
		public void run() {
			
			try {	
				
			    if (mode == 1) {
			    yourFile = new File("src/resources/Front Menu.wav");
			    stream = AudioSystem.getAudioInputStream(yourFile);
			    } 
			    if (mode == 2) {
		    	yourFile = new File("src/resources/Ingame.wav");
			    stream = AudioSystem.getAudioInputStream(yourFile);
			    }
			    format = stream.getFormat();
			    info = new DataLine.Info(Clip.class, format); 
			    clip = (Clip) AudioSystem.getLine(info);
			    clip.open(stream);
			    gainControl = 
			    	    (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			    	gainControl.setValue(mix);
			    clip.start(); 
			     
			}
			catch(Exception e){	
			}
			
		}
		
	
}



