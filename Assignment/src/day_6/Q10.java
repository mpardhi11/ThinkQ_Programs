package day_6;

interface MusicalInstrument {
	void play ();
	static void learnInstrument () {
		System.out.println("Learning Musical Instrument");
	}
}

abstract class Sound {
	void listenSound () {
		System.out.println("Listing Sound");
	}
	
}

class StringedInstrument extends Sound implements MusicalInstrument{
	public void play () {
		System.out.println("Playing Tabla");
		MusicalInstrument.learnInstrument();
	}
}

class PercussionInstrument extends Sound implements MusicalInstrument{
	public void play () {
		System.out.println("Playing Violin");
		MusicalInstrument.learnInstrument();
	}
}
public class Q10 {

	public static void main(String[] args) {
		StringedInstrument Tabla = new StringedInstrument();
		//MusicalInstrument.learnInstrument();
		Tabla.play();
		Tabla.listenSound();
		
		
		PercussionInstrument Violin = new PercussionInstrument ();
		//MusicalInstrument.learnInstrument();
		Violin.play();
		Violin.listenSound();
	}

}
