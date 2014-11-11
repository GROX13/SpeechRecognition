package search;

import java.util.StringTokenizer;

public class VideoInfo {
	private String text;
	private String thambURL;
	private String videoURL;
	private String name;
	private String describtion;
	
	public VideoInfo(String txt, String thmbURL, String vidURL, String name, String desc){
		text = txt;
		thambURL = thmbURL;
		videoURL = vidURL;
		this.name = name;
		describtion = desc;
	}
	
	public boolean match(String searchValue){
		StringTokenizer tk = new StringTokenizer(searchValue);
		while(tk.hasMoreTokens()){
			String token = tk.nextToken();
			if(!(text.contains(token) || name.contains(token))) return false;
		}
		
		return true;
	}
	
	public String getThamb(){
		return thambURL;
	}
	
	public String getURL(){
		return videoURL;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescribtion(){
		return describtion;
	}
}
