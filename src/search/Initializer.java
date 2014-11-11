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
    	String yesterday = "Yesterday, all my troubles seemed so far away\n"+
    						"Now it looks as though they're here to stay\n"+
    						"Oh, I believe in yesterday\n"+
    						"Suddenly, I'm not half the man I used to be\n"+
    						"There's a shadow hanging over me.\n"+
    						"Oh, I yesterday came suddenly\n"+
    						"Why she had to go I don't know she wouldn't say\n"+
    						"I said something wrong, now I long for yesterday";
    	
        Videoes.vids.add(new VideoInfo(yesterday, "https://i.ytimg.com/vi/XNnaxGFO18o.default.jpg", "video1.html", "Yesterday", "The Beatles"));

        String HeyJude = "Hey, Jude, don't make it bad\n"+
        				 "Take a sad song and make it better\n"+
        				 "Remember to let her into your heart\n"+
        				 "Then you can start to make it better";
        Videoes.vids.add(new VideoInfo(HeyJude, "https://i.ytimg.com/vi/XNnaxGFO18o.default.jpg", "video1.html", "Hey Jude", "The Beatles"));
//        Videoes.vids.add(new VideoInfo(txt, thmbURL, vidURL, name, desc));
//        Videoes.vids.add(new VideoInfo(txt, thmbURL, vidURL, name, desc));
//        Videoes.vids.add(new VideoInfo(txt, thmbURL, vidURL, name, desc));
    }
	
}
