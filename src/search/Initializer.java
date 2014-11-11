package search;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class Initializer
 * 
 */
@WebListener
public class Initializer implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public Initializer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent arg0) {
		String text = "Yesterday, all my troubles seemed so far away\n"
				+ "Now it looks as though they're here to stay\n"
				+ "Oh, I believe in yesterday\n"
				+ "Suddenly, I'm not half the man I used to be\n"
				+ "There's a shadow hanging over me.\n"
				+ "Oh, I yesterday came suddenly\n"
				+ "Why she had to go I don't know she wouldn't say\n"
				+ "I said something wrong, now I long for yesterday"
				+ "Hey, Jude, don't make it bad\n";
		String thambURL = "https://i.ytimg.com/vi/XNnaxGFO18o.default.jpg";
		String vidURL = "video1.html";
		String name = "Yesterday";
		String desc = "The Beatles";
		Videoes.vids.add(new VideoInfo(text, thambURL, vidURL, name, desc));

		// text = "Hey, Jude, don't make it bad\n"
		// 		+ "Take a sad song and make it better\n"
		// 		+ "Remember to let her into your heart\n"
		// 		+ "Then you can start to make it better";
		
		// thambURL = "https://i.ytimg.com/vi/XNnaxGFO18o.default.jpg";
		// vidURL = "video1.html";
		// name = "Hey Jude";
		// desc = "The Beatles";
		// Videoes.vids.add(new VideoInfo(text, thambURL, vidURL, name, desc));

		text = "bla";
		thambURL = "//i.ytimg.com/vi/bpOSxM0rNPM/mqdefault.jpg";
		vidURL = "video1.html";
		name = "Do I Wanna Know?";
		desc = "Arctic Monkeys";
		Videoes.vids.add(new VideoInfo(text, thambURL, vidURL, name, desc));

		text = "bla";
		thambURL = "https://i.ytimg.com/vi/DVg2EJvvlF8/mqdefault.jpg";
		vidURL = "video1.html";
		name = "Imagine";
		desc = "John Lennon";
		Videoes.vids.add(new VideoInfo(text, thambURL, vidURL, name, desc));	

		text = "bla";
		thambURL = "https://i.ytimg.com/vi/K9vFWA1rnWc/mqdefault.jpg";
		vidURL = "video1.html";
		name = "Best Advertisement Ever";
		desc = "Winner of Best Ad 2014";
		Videoes.vids.add(new VideoInfo(text, thambURL, vidURL, name, desc));

		text = "bla";
		thambURL = "https://i.ytimg.com/vi/OBQNs89mUls/mqdefault.jpg";
		vidURL = "video1.html";
		name = "My Love Is A Fever";
		desc = "William Shakespeare - Sonnet 147";
		Videoes.vids.add(new VideoInfo(text, thambURL, vidURL, name, desc));
	}

}
