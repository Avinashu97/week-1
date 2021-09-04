
public class main {

	public static void main(String[] args) {
		speaker s = new speaker();
		System.out.println(s.colour);
		System.out.println(s.charge);
		System.out.println(s.bluetooth);
		s.bluetoothOn();
		System.out.println(s.bluetooth);
		s.bluetoothOff();
		System.out.println(s.bluetooth);
		System.out.println(s.volume);
		s.volumeUp();
		System.out.println(s.volume);
		s.volumeDown();
		System.out.println(s.volume);
		

	}

}
