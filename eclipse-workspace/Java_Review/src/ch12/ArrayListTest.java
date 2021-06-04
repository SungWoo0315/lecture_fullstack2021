package ch12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ch09.Player;

public class ArrayListTest {

	public static void main(String[] args) {
		
		Player[] p = new Player[10];

		ArrayList<Player> list = new ArrayList<Player>();
		ArrayList<Player> list2 = new ArrayList<>();
		
		list.add( new Player());
		list.add( new Player());
		list.add( new Player());
		

		list.get(0);
		list.get(1);
		
		list.remove(0);
		
		
		for(Player ppp : list) {
			
		}
		
		
		// 
		HashSet<String> hashset = new HashSet<String>();
		
		hashset.add( "홍길동");
		hashset.add( "고길동");
		hashset.add( "홍길동");
		hashset.add( "고길동");
		hashset.add( "김길동");
		hashset.add( "김길동");

		System.out.println(hashset);
		
		Iterator<String> iter = hashset.iterator();
		
		while( iter.hasNext()) {
			String s = iter.next();
		}
		
		
		// key = value
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("홍길동", 1);
		map.put("홍길동", 2);
		map.put("고길동", 1);
		map.put("김길동", 3);
		map.put("고길동", 1);
		
		System.out.println(map);
		
		System.out.println(map.get("홍길동"));
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			
			String key = keyIter.next();
			Integer value = map.get(key);
			System.out.println( key + ": " + value );
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
