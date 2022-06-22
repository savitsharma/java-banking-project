package com.learnclearly.banking;

public class BankingMain {
	public static void main ( String [ ] args ) { 
		BankAccount b1 = new BankAccount ( 101 , " Ravi " , 15000 ) ; 
		
		BankAccount b2 = new BankAccount ( 102 , " Scott " , 25000 ) ; 
		
		b1.deposit ( 1000 ) ;
		b1.deposit ( 500 ) ; 
		b1.deposit ( 700 ) ;
		b1.withdraw (3500) ; 
		b1.withdraw ( 300 ) ; 
		b1.deposit ( 500 ) ; 
		
		System.out.println ( " -- " ) ;
		TransactionDetails.showMiniStatement ( 101) ;
		
		b2.deposit ( 10000 ) ;
		b2.deposit ( 5000 ) ; 
		b2.deposit ( 7000) ;
		b2.withdraw (1500) ; 
		b2.withdraw ( 3000 ) ; 
		b2.deposit ( 5000 ) ; 
		
		System.out.println ( " -- " ) ;
		TransactionDetails.showMiniStatement ( 102) ;
	}

}
