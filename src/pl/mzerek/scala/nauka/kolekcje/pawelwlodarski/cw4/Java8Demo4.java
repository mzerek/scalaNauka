package pl.mzerek.scala.nauka.kolekcje.pawelwlodarski.cw4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Demo4 {

	public static void main(String[] args) {
		
		Stream.of(1,1,2,1,3,1,4,5)
		.limit(5)
		.skip(2)
		.collect(Collectors.toList())
		.forEach(System.out::println);	
		

	}

}
