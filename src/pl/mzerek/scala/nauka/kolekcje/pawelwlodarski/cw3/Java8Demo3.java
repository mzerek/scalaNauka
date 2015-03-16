package pl.mzerek.scala.nauka.kolekcje.pawelwlodarski.cw3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Demo3 {

	public static void main(String[] args) {
		List<Integer> result = IntStream.range(0, 100)
				.boxed()
				.sorted(Comparator.reverseOrder())
				.map(e->e+1)
				.collect(Collectors.toList());
		
		result.forEach(System.out::println);

	}

}
