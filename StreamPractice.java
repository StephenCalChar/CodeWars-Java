import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream
			.range(1,10)
			.skip(5)
			.forEach(x -> System.out.println(x));
		System.out.println();
		
		String[] names = {"Tim","Pedro","Juan","Larik","Bert", "Ted"};
		Arrays.stream(names)
			.filter(x -> x.startsWith("T"))
			.sorted()
			.forEach(x -> System.out.println(x));
		Arrays.stream(new int[] {1,2,3,4,5,6,7,200})
			.map(x -> x*x)
			.average()
			.ifPresent(x -> System.out.println(x));

		

	}

}

