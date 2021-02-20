package generate500Numbers;
//Practical 1: Generate 500 random numbers and print the nth smallest number in a programming 
//language of your choice. (Ask user for the Nth smallest number)

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GenerateNumbers {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Give me Nth smallest number");
		int smallestnth = userInput.nextInt();
		System.out.println("..................................");

		ArrayList<Integer> randNum = new ArrayList<Integer>();
		for (int i = 1; i <= 500; i++) {
			System.out.println(i);

			randNum.add(numGenerator(smallestnth));
		}
		System.out.println("The size of number generated is:" + randNum.size());
		System.out.println("The Nthsmallest number is:" + Collections.min(randNum));
	}

	public static int numGenerator(int smallestnth) {
		int rand = (int) ((Math.random() * (1000 - smallestnth)) + smallestnth);
		return smallestnth;

	}

}
