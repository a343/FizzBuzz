package fizzBuzz;

import java.util.stream.IntStream;

/*
    IMPORTANT:
	The aim of this exercise is to showcase your coding skills. Please do not think that we expect you to deliver the minnimun ammount of code required for this exercise to work.
	You are allowed to modify all the provided code. Do not think that provided classes have to remain untouched.
	Things that We take into consideration: Use of design patterns, clean code, testing.

    The Problem:
    Write a program that prints the numbers from 1 to 100.
    But for multiples of three print "Fizz" instead of the number
    and for the multiples of five print "Buzz".
    For numbers which are multiples of both three and five print "FizzBuzz".

 */
public class FizzBuzz {

	public static void main(String... args) {

		/*
		 * IntStream.range(1, 100) -- creara una lista de numero de 1 a 100 que iremos
		 * recorriendo y analizando para mostrar FizzBuzz, Fizz o el numero en cuestion
		 */
		IntStream.range(1, 100).forEach(n -> {
			if (n % 3 == 0 && n % 5 == 0) {
				System.out.println("FizzBuzz");

			} else if (n % 3 == 0) {
				System.out.println("Fizz");
			} else if (n % 5 == 0) {
				System.out.println("Buzz");

			} else {
				System.out.println(n);

			}
		});
	}
}
