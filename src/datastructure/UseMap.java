package datastructure;

import java.util.*;

public class UseMap {

	public static <list> void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */

			ArrayList<String> city_of_USA = new ArrayList<>();
				city_of_USA.add("NY");
				city_of_USA.add("PA");
				city_of_USA.add("DC");

			ArrayList<String> city_of_UAE = new ArrayList<>();
				city_of_UAE.add("DXB");
				city_of_UAE.add("SHJ");
				city_of_UAE.add("AUH");

			Map<String, List<String>> map = new HashMap<>();
				map.put("USA" , city_of_USA);
				map.put("UAE" , city_of_UAE);

				for(Map.Entry<String, List<String>> entry:map.entrySet()){
					System.out.println(entry.getKey()+" "+ entry.getValue());
				}

				System.out.println("using iterator");
				Iterator it = map.entrySet().iterator();
				while(it.hasNext()){
					System.out.println(it.next());
				}
	}


}
