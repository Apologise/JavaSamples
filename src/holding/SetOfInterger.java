package holding;
/*
import java.util.*;
import static util.Print.*;

public class SetOfInterger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		Set<Integer> intset = new HashSet<Integer>();
		for(int i = 0; i < 10000; ++i) {
			intset.add(rand.nextInt(30));
		}
		print(intset);
	}

}
*/
//: holding/SetOfInteger.java
import java.util.*;

public class SetOfInterger {
public static void main(String[] args) {
  Random rand = new Random(60);
  Set<Integer> intset = new HashSet<Integer>();
  for(int i = 0; i < 10000; i++)
    intset.add(rand.nextInt(40));
  System.out.println(intset);
}
} /* Output:
[15, 8, 23, 16, 7, 22, 9, 21, 6, 1, 29, 14, 24, 4, 19, 26, 11, 18, 3, 12, 27, 17, 2, 13, 28, 20, 25, 10, 5, 0]
*///:~

