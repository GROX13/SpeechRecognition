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
				"I hope someday you'll join us And the world will live as one John Lennon";
		thambURL = "WEB-RES/images/lemon.jpg";
		vidURL = "Imagine.html";
		name = "Imagine All The People";
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
				"harder is to hear high pitches (Hearing Test)";
		thambURL = "WEB-RES/images/ears.jpg";
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
		thambURL = "WEB-RES/images/mq.jpg";
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
				"Be safe around trains. message from Metro (Unknown)";
		thambURL = "WEB-RES/images/dead.jpg";
		vidURL = "DumbWaysToDie.html";
		name = "Dumb Ways to Die";
		desc = "(Unknown)";
		Videoes.vids.add(new VideoInfo(text.toLowerCase(), thambURL, vidURL, name, desc));
	
		text = "So, so you think you can tell Heaven from Hell, Blue skies from "+
				"pain. Can you tell a green field From a cold steel rail? A smile from a "+
				"veil? Do you think you can tell? And did they get you to trade "+
				"Your heroes for ghosts? Hot ashes for trees? Hot air for a cool breeze? "+
				"Cold comfort for change? And did you exchange A walk on part in "+
				"the war For a lead role in a cage? How I wish, how I wish you were here. "+
				"We're just two lost souls Swimming in a fish bowl, Year after year, "+
				"Running over the same old ground. What have we found? The same old fears. "+
				"Wish you were here. Pink floyd";
		thambURL = "WEB-RES/images/floyd.jpg";
		vidURL = "WishYouWereHere.html";
		name = "Wish You Were Here";
		desc = "Pink floyd";
		Videoes.vids.add(new VideoInfo(text.toLowerCase(), thambURL, vidURL, name, desc));
	}

}
