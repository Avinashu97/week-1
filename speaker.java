
public class speaker {
String charge = "usb type c";
String[] controls = {"play","power","pause", "volume","bluetooth"};
String colour = "violet";

static boolean bluetooth = false;
static boolean power = false;
static int volume = 0;

public static void bluetoothOn() {
	bluetooth=true;}
public static void bluetoothOff() {
	bluetooth = false;}

public static void powerOn() {
	power=true;

}
public static void powerOff() {
	power=false;
}
public static void volumeUp() {
	volume++;}
public static void volumeDown() {
	volume--;}
}


