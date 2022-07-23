package assignmentday8;
/*A Bank
Look at the Account class Account.java and write a main method in a different class to briefly experiment with some instances of the Account class. 

1.1>> Using the Account class as a base class, 
write two derived classes called SavingsAccount and CurrentAccount. 
A SavingsAccount object, in addition to the attributes of an Account object, 
should have an interest variable and a method which adds interest to the account. 
A CurrentAccount object, in addition to the attributes of an Account object, 
should have an overdraft limit variable. Ensure that you have overridden methods 
of the Account class as necessary in both derived classes.
*/
class Account{
	int amount ;
	void showAmount(){
		System.out.println("Your balance is :"+ amount);
		
	}
}
class SavingAccount extends Account{
	int balance = 500000;
	float interest = 2.6f;
	@Override
	void showAmount(){
		System.out.println("Your saving account balance is :"+ balance);
		System.out.println("Interest rate is:"+ interest+ "%");
	}
}

class CurrentAccount extends Account{
	int currentAmount = 200000;
	int drawableLimit = 25000;
	@Override
	void showAmount(){
		System.out.println("Your current account balance is :"+ currentAmount);
	}
	void showLimit() {
		System.out.println("Your current account withdraw limit  is :"+ drawableLimit);
	}
	
}

public class BankAccount {
	
	
	public static void main(String[] args) {
		
		SavingAccount object = new SavingAccount();
        object.showAmount();
        CurrentAccount obj = new CurrentAccount();
        obj.showAmount();
        obj.showLimit();
	}

}
