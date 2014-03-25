package _Jonathan_xD.java.abstractClass;

public class Main {
	public static SendMessage sm = new SendMessage();
	public static void main(String[] args) {
		sm.setMessage("Olá");
		sm.send();
		sm.setMessage("Olá2");
		sm.send();
	}

}
