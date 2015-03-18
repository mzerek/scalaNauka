package pl.mzerek.scala.nauka.watki.start;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Java8Workshops {

	public static void main(String[] args) {
		OptionalInt result = IntStream.range(0, 100)
		.map(e->e*2)
		.parallel()
		.map(e->{
			System.out.println("jestem w : " +Thread.currentThread().getName());
			return e;
		})
		.reduce(Integer::sum);
		
		int resultInt = result.getAsInt();
		
		System.out.println(resultInt);

	}

}
