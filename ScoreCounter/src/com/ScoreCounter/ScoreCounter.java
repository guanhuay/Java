package com.ScoreCounter;
//library scanner to take user input
import java.util.Scanner;
public class ScoreCounter {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in); //create scanner object
		System.out.println("please input your score: ");
		int score = input.nextInt();
		int count = 0;
		System.out.println("score before bonus point: " +score);
		while(score < 60){//if score less than 60, add bonus point till 60
			score++;
			count++;
		}
		System.out.println("after bonus point: "+ score);
		System.out.println("the score has add: " + count);
	}
}
