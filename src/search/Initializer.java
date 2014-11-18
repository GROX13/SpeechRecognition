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
		String text;
		String thambURL;
		String name;
		String desc;
		String vidURL;
		
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
		thambURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_86V5fA_cJ6BNbr4higQTUVWPaQBQKRmIZwYc5J_m3tIAtl4QKw";
		vidURL = "ImagineVideo.html";
		name = "Imagine";
		desc = "John Lennon";
		Videoes.vids.add(new VideoInfo(text.toLowerCase(), thambURL, vidURL, name, desc));	

		text = "As we grow older we often lose the extreme ends of our hearing spectrum "+
				"So how many of the following sounds can you hear? How old are your ears? "+
				"OK if you can hear 8000 Hz you are both alive and not hearing impaired "+
				"But lets keep racing the frequency How high could you hear? If you could hear "+
				"all of those frequencies You are probably under twenty years old "+
				"But that would not last forever Unlike other organs, such as the liver or "+
				"skin The inner ear does not have the capacity to regenerate In your ear there are "+
				"thousands of tiny nerve cells called hair cells These are responsible for picking up "+
				"different frequencies and Sending the signal to the brain where it is processed "+
				"But as you age the continual explosion to the noise and loud sounds Can brake bend and "+
				"destroy these cells So why do the high frequencies go first? It turns out that the "+
				"hairs tune to high pitches. Are the first to encounter sound waves As a result they experience "+
				"more stress and Tend to regenerate earlier Which is why the older you are the "+
				"harder is to hear high pitches";
		thambURL = "https://i.ytimg.com/vi/VxcbppCX6Rk/mqdefault.jpg";
		vidURL = "Ears.html";
		name = "How Old Are Your Ears?";
		desc = "(Hearing Test)";
		Videoes.vids.add(new VideoInfo(text.toLowerCase(), thambURL, vidURL, name, desc));

		text = "Sonet 147 by William Shakespeare "+
				"My love is as a fever longing still For that which longer nurseth the disease "+
				"Feeding on that which doth preserve the ill Th uncertain sickly appetite to please "+
				"My reason the physician to my love Angry that his prescriptions are not kept "+
				"Hath left me and I desperate now approve Desire is death which physic did except "+
				"Past cure I am now reason is past care And frantic-mad with evermore unrest "+
				"My thoughts and my discourse as madmens are At random from the truth vainly expressed "+
				"For I have sworn thee fair and thought thee bright Who art as black as hell as dark as night";
		thambURL = "https://i.ytimg.com/vi/OBQNs89mUls/mqdefault.jpg";
		vidURL = "Sonnet_147.html";
		name = "My Love Is A Fever";
		desc = "William Shakespeare";
		Videoes.vids.add(new VideoInfo(text.toLowerCase(), thambURL, vidURL, name, desc));
	
		text = "Set fire to your hair "+
				"Poke a stick at a grizzly bear "+
				"Eat medicine that's out of date "+
				"Use your private parts as piranha bait "+
				"Dumb ways to die, so many dumb ways to die, "+
				"dumb ways to di-i-i-ie, so many dumb ways to die "+
				"Get your toast out with a fork "+
				"Do your own electrical work "+
				"Teach yourself how to fly "+
				"Eat a two week old unrefrigerated pie "+
				"Dumb ways to die, so many dumb ways to die, "+
				"dumb ways to di-i-i-ie, so many dumb ways to die "+
				"Invite a psycho-killer inside "+
				"Scratch a drug dealer's brand new ride "+
				"Take your helmet off in outer space "+
				"Use your clothes dryer as a hiding place "+
				"Dumb ways to die, so many dumb ways to die, "+
				"dumb ways to di-i-i-ie, so many dumb ways to die "+
				"Keep a rattlesnake as pet "+
				"Sell both your kidneys on the internet "+
				"Eat a tube of superglue "+
				"Keep a rattlesnake as pet "+
				"I wonder what's this red button do? "+
				"Dumb ways to die, so many dumb ways to die, "+
				"dumb ways to di-i-i-ie, so many dumb ways to die "+
				"Dress up like a moose during hunting season "+
				"Disturb a nest of wasps for no good reason "+
				"Stand on the edge of a train station platform "+
				"Drive around the boom gates at a level crossing "+
				"Run across the tracks between the platforms "+
				"They may not rhyme but they're quite possibly "+
				"Dumbest ways to die Dumbest ways to die "+
				"Dumbest ways to di-i-i-ie So many dumb So many dumb ways to die "+
				"Be safe around trains. message from Metro";
		thambURL = "https://i.ytimg.com/vi/iKdHLPtdR0U/mqdefault.jpg";
		vidURL = "DumbWaysToDie.html";
		name = "Dumb Ways to Die";
		desc = "";
		Videoes.vids.add(new VideoInfo(text.toLowerCase(), thambURL, vidURL, name, desc));
	
		text = "So, so you think you can tell Heaven from Hell, Blue skies from "+
				"pain. Can you tell a green field From a cold steel rail? A smile from a "+
				"veil? Do you think you can tell? And did they get you to trade "+
				"Your heroes for ghosts? Hot ashes for trees? Hot air for a cool breeze? "+
				"Cold comfort for change? And did you exchange A walk on part in "+
				"the war For a lead role in a cage? How I wish, how I wish you were here. "+
				"We're just two lost souls Swimming in a fish bowl, Year after year, "+
				"Running over the same old ground. What have we found? The same old fears. "+
				"Wish you were here.";
		thambURL = "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBwgHBhQUBwgRFBUXEhkYGRgXGB4fHhoXIhgcGCEYHCEdJiggGCYxIhoZIz0tJik3Li4vGB8zOzUtNyg5LisBCgoKDg0OGxAQGi0mICQsLCwsNzQ1NzA3MSw0MCwsNDc0NDcwLzY4NC8sLywsLCwsNDE1NC8sLDQvLDUwNzc1LP/AABEIALEBHAMBEQACEQEDEQH/xAAbAAEAAgMBAQAAAAAAAAAAAAAABAUCAwYBB//EAEYQAAECAwMGDAQDBAoDAAAAAAEAAgMEEQUSIRQxUVSS0gYTFRYXIkFTVZGi0TJhcYFCobEHUrLwIzM0NkRiwcLh8TVzgv/EABoBAQACAwEAAAAAAAAAAAAAAAAEBQIDBgH/xAA0EQEAAQICCQMDAwQCAwAAAAAAAQIDFFEREhMVIVKBofAEMWEFQXEykbEiwdHhBkIjM/H/2gAMAwEAAhEDEQA/APhqAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgILg8F7ZH+D9bPdBBFnzZlXROJN1r7hJIFHYYUOPaOxBlNWXOyk22HMQKPdSgqMamgxBpnQemyZ5pi1gf1VL+I6tfvjm7EGLbOm3SPHcVSHWl4kCp+QJqfsg8kJCatGMWycK8Q28RUDCoFcSNIQSZmwbTlWAx5agLg0dZp6xzDA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DoW05MFTmYaMzpMnfDoW05MFTmYaMzpMnfDoW05MFTmYaM3CKakiAgICAgICAgICAgICAgICAgICAgICCVZloTdlT7I1nx3Q4jHXmuGcH/UdlDgQSEH3KH+06zbf4HF07FZBjw3N41hrQ4EcZDGdwOjOCaaCYvqKKpomKY0yl+muUxXE1ToZ2HNwbQLeSJlrsKAtdiMM50aVyuzu2rsTqzEum2lmq1+qJhccI4zJGXhcdLhwJcDQAAupnF9p7ca0V/8ASqP6qo+HF/8AIbtMW6ZmNMafbhl+JhzU9asgGF0WQhMA/wAxaAftSqvNWY95crr03J0U2/2/04fhBwwggFtmNBP72N1v0vVJP5fVeTc0eyf6b6bVVOtd4Rk4eJEfFiExHEkmpJ7StK9piKY0QxR6ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgzhRYkGIHQYhaRmINCPuF5MRPu9idCdFt62I0MCNasw4DMDEcafSpwXlNMU/pjQwuUxcjRXGn88UKNHix3VjRXOPzJP6rIpopp4Uxoa0ZCAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICD//2Q==";
		vidURL = "WishYouWereHere.html";
		name = "Wish You Were Here";
		desc = "Pink floyd";
		Videoes.vids.add(new VideoInfo(text.toLowerCase(), thambURL, vidURL, name, desc));
	}

}
