package _Jonathan_xD.java.abstractClass;

public class SendMessage extends MessagesSender{
	public String message = " ";
	@Override
	public String getMessage() {		
		return message;
	}

	public void setMessage(String string) {
		message = string;
	}

}
