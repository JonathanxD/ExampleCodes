package _Jonathan_xD.java.abstractClass;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public abstract class MessagesSender {
	public final void send()
	{
		Logger log = Logger.getLogger(this.getClass().getName());
		log.info(this.getMessage());
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Log.txt", true)))) {
		    out.println(this.getMessage());
		}catch (IOException e) {
		}		
	}

	public abstract String getMessage();
	
}
