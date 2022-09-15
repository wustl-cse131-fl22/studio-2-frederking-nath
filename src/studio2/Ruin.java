package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Start Amount?");
		int startAmount=in.nextInt();
		System.out.println("Probability of winning?");
		double winChance=in.nextDouble();
		System.out.println("Earnings Limit?");
		int winLimit=in.nextInt();
		System.out.println("Total Simulations?");
		int totalSimulations = in.nextInt();
		double currentEarnings=startAmount;
		for(int i = 0; i <= totalSimulations; i++){
			while ((0<currentEarnings) && (currentEarnings<winLimit)) {
				if (Math.random() < winChance)
				{ currentEarnings++;
				}
				else {
					currentEarnings--;

				}
			}
			if (currentEarnings>= winLimit){
				System.out.println("Simulation " + i+ ": " + "Win!");
			}
			else 
			{	System.out.println("Simulation " + i+ ": " + "Ruin :(");

			}
	
		}

			}
		}
	

