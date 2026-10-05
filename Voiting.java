package day1;

import java.util.Scanner;

public class Voiting {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a age:");
		int age=sc.nextInt();
		if(age>=18 && age<100) {
			System.out.println("eligible to vote");
		}
		else if (age<0){
			System.out.println("invalid age");
		}else {
			System.out.println("not eligible to vote");
		}
			sc.close();

	}

}
