package personalWork;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr =new String[] {"a","b","c"};

		Stream<String> stream = Arrays.stream(arr);
		
stream.forEach(num-> System.out.println(num));		

	}

}
