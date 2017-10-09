import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateCharsInString dcs = new DuplicateCharsInString();
		dcs.findDuplicateChars("Java2novice");

	}

	public void findDuplicateChars(String string) {
		// TODO Auto-generated method stub
		Map<Character,Integer> dumpMap = new HashMap<Character,Integer>();
		char[] strSeq = string.toCharArray();
		for(Character c: strSeq){
			if(dumpMap.get(c) != null){
				dumpMap.put(c,dumpMap.get(c)+1);
			}else{
				dumpMap.put(c,1);
			}
		}
		/*Set<Entry<Character, Integer>> set = dumpMap.entrySet();
		List<Integer> list = new ArrayList<>();
		
		for(Entry<Character, Integer> ele: set){
			list.add(ele.getValue(), ele.getKey().data+list.get(index));
			ele.getValue()
		}*/
		Set<Character> charSet = dumpMap.keySet();
		for(Character ch : charSet){
			 if(dumpMap.get(ch) > 1){
			System.out.println(ch+":"+dumpMap.get(ch));
			 }
		}
		//System.out.println(dumpMap.entrySet());
	}

}
