package pl.mzerek.scala.nauka.kolekcje.pawelwlodarski.cw1;

import static java.util.Arrays.asList;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Demo {

	public static void main(String[] args) {
		List<Integer> lista = asList(1, 2, 3, 4, 5);

		Stream<Integer> stream = lista.stream().filter(dupa -> dupa > 2);

		List<Integer> result = stream.collect(Collectors.toList());

		result.forEach(System.out::println);

		List<String> lista2 = asList("a", "b", "c", "d", "e");

		Stream<String> stream2 = lista2.stream().filter(dupa2 -> lista2.indexOf(dupa2) > lista2.indexOf("c"));

		List<String> result2 = stream2.collect(Collectors.toList());

		result2.forEach(System.out::println);

	}

}
