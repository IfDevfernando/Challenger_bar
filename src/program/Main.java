package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("=========welcome Don's bar============");
		
		System.out.print("Sex: ");
		char sex = sc.next().charAt(0);
		System.out.print("Quantity of beers: ");
		int beer = sc.nextInt();
		System.out.print("Quantity of soft drinks: ");
		int drinks = sc.nextInt();
		System.out.print("Quantity of skewers: ");
		int skewer = sc.nextInt();
		
		Bill bill = new Bill(sex, beer, skewer, drinks);
		
		bill.setGender(sex);
		double cov = bill.cover(0.0);
		double cov1 = bill.cover(4.0);
		double consum = bill.feeding(beer, drinks, skewer);
		
		
		double valueTicket = bill.ticket();
		double valueTotal = bill.total(consum,cov , valueTicket);
		double valueTotal2 = bill.total(consum,cov1 , valueTicket);
		
		System.out.println("+++++++ Report +++++++");
		
		System.out.println("consumption: "+consum);
		
		if(consum > 30) {
			System.out.println("Ticket: "+valueTicket);
			System.out.println("Tips free");
			System.out.println("Amount to pay: "+valueTotal);
			
		}else {
			
			System.out.println("Ticket: "+valueTicket);
			System.out.println("Couvert:"+cov1);
			System.out.println();
			System.out.println("Amount to pay: "+valueTotal2);
		}
		
		
		
		
		
		
		sc.close();

	}

}
