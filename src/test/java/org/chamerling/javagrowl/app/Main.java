/**
 * 
 */
package org.chamerling.javagrowl.app;

import org.chamerling.javagrowl.Growl;
import org.chamerling.javagrowl.GrowlNetwork;

/**
 * @author chamerling
 *
 */
public class Main {
	
	public static void main(String[] args) {
		// will register only if needed but returns a Growl instance in all cases...
		Growl g = GrowlNetwork.register("JavaGrowlApp", "YOURPASSWORD");
		g.notify("JavaGrowlApp", "The title", "This is the notification message...", "YOURPASSWORD");
	}
}
