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

		text = "Have you got colour in your cheeks Do you ever get that fear that you can't shift "+
				"The type that sticks around like something in your teeth Are there some aces up your sleeve "+
				"Have you no idea that you're in deep I dreamt about you nearly every night this week "+
				"How many secrets can you keep 'Cause there's this tune I found that makes me think of you somehow and I play it on repeat "+
				"Until I fall asleep Spilling drinks on my settee (Do I wanna know) If this feeling flows both ways? (Sad to see you go) "+
				"Was sort of hoping that you'd stay (Baby we both know) That the nights were mainly made for saying things that you can't say tomorrow day "+
				"Crawling back to you Ever thought of calling when you've had a few? 'Cause I always do Maybe I'm too busy being yours to fall for somebody new "+
				"Now I've thought it through Crawling back to you So have you got the guts? Been wondering if your heart's still open and if so I wanna know what time it shuts "+
				"Simmer down and pucker up I'm sorry to interrupt. It's just I'm constantly on the cusp of trying to kiss you I don't know if you feel the same as I do "+
				"But we could be together if you wanted to (Do I wanna know?) If this feeling flows both ways? (Sad to see you go) Was sort of hoping that you'd stay (Baby we both know) "+
				"That the nights were mainly made for saying things that you can't say tomorrow day Crawling back to you (crawling back to you) "+
				"Ever thought of calling when you've had a few? (you've had a few) 'Cause I always do ('cause I always do) Maybe I'm too (maybe I'm too busy) busy being yours to fall for somebody new "+
				"Now I've thought it through Crawling back to you (Do I wanna know?) If this feeling flows both ways? (Sad to see you go) Was sort of hoping that you'd stay "+
				"(Baby we both know) That the nights were mainly made for saying things that you can't say tomorrow day (Do I wanna know?) Too busy being yours to fall "+
				"(Sad to see you go) Ever thought of calling darling? (Do I wanna know?) Do you want me crawling back to you?";
		thambURL = "//i.ytimg.com/vi/bpOSxM0rNPM/mqdefault.jpg";
		vidURL = "video1.html";
		name = "Do I Wanna Know?";
		desc = "Arctic Monkeys";
		Videoes.vids.add(new VideoInfo(text, thambURL, vidURL, name, desc));

		text = "Imagine there's no heaven It's easy if you try "+
				"No hell below us Above us only sky Imagine all "+
				"the people Living for today "+
				"Imagine there's no countries It isn't hard to do "+
				"Nothing to kill or die for And no religion too "+
				"Imagine all the people Living life in peace "+
				"You may say I'm a dreamer But I'm not the only one "+
				"I hope someday you'll join us And the world will be as one "+
				"Imagine no possessions I wonder if you can "+
				"No need for greed or hunger A brotherhood of man "+
				"Imagine all the people Sharing all the world "+
				"You may say I'm a dreamer But I'm not the only one "+
				"I hope someday you'll join us And the world will live as one";
		thambURL = "https://i.ytimg.com/vi/DVg2EJvvlF8/default.jpg";
		vidURL = "ImagineVideo.html";
		name = "Imagine";
		desc = "John Lennon";
		Videoes.vids.add(new VideoInfo(text, thambURL, vidURL, name, desc));	

		text = "bla";
		thambURL = "https://i.ytimg.com/vi/K9vFWA1rnWc/mqdefault.jpg";
		vidURL = "video1.html";
		name = "Best Advertisement Ever";
		desc = "Winner of Best Ad 2014";
		Videoes.vids.add(new VideoInfo(text, thambURL, vidURL, name, desc));

		text = "Sonet 147 by William Shakespeare "+
				"My love is as a fever longing still For that which longer nurseth the disease "+
				"Feeding on that which doth preserve the ill Th uncertain sickly appetite to please "+
				"My reason the physician to my love Angry that his prescriptions are not kept "+
				"Hath left me and I desperate now approve Desire is death which physic did except "+
				"Past cure I am now reason is past care And frantic-mad with evermore unrest "+
				"My thoughts and my discourse as madmens are At random from the truth vainly expressed "+
				"For I have sworn thee fair and thought thee bright Who art as black as hell as dark as night";
		thambURL = "https://i.ytimg.com/vi/OBQNs89mUls/mqdefault.jpg";
		vidURL = "video1.html";
		name = "My Love Is A Fever";
		desc = "William Shakespeare - Sonnet 147";
		Videoes.vids.add(new VideoInfo(text, thambURL, vidURL, name, desc));
	}

}
