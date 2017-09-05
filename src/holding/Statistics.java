package holding;


import static util.Print.*;
import java.util.*;

public class Statistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < 1000; ++i) {
			int r = rand.nextInt(30);
			Integer freq = map.get(r);
			map.put(r, freq == null? 1 : freq+1);
		}
		print(map);
	}

}
