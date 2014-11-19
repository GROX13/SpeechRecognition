package search;

import java.util.ArrayList;
import java.util.List;

public class Videoes {
	public static List<VideoInfo> vids = new ArrayList<VideoInfo>();
	
	public static List<VideoInfo> getVideoes(String searchValue){
		List<VideoInfo> res = new ArrayList<VideoInfo>();
		for(int i=0; i<Videoes.vids.size(); i++){
			if(Videoes.vids.get(i).match(searchValue.toLowerCase())){
				res.add(Videoes.vids.get(i));
			}
		}
		return res;
	}
}
