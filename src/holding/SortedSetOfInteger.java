package holding;

import java.util.*;
import static util.Print.*;

public class SortedSetOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		SortedSet<Integer> intset = new TreeSet<Integer>();
		for(int i = 0; i < 100; i++) {
			intset.add(rand.nextInt(60));
		}
		print(intset);
	}

}
