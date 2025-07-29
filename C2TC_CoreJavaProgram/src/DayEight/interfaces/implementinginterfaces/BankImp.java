package DayEight.interfaces.implementinginterfaces;

public class BankImp implements Bank {
	
	@Override
	 public void deposit(Account account, double amount) {
		 if (amount > DEPOSIT_LIMIT)
				System.err.println("Deposit not possible.. exceeds Deposit Limit");
			else
				account.setBalance(account.getBalance()+amount);
	     System.out.println("Deposited " + amount + " into account: " + account.getAccNo());
	 }

	
	 @Override
	 public void withdraw(Account account, double amount) {
		 if (account.getBalance() - amount >= MIN_BALANCE)
		 {
				account.setBalance(account.getBalance()-amount);
				System.out.println("Withdrawn " + amount + " from account: " + account.getAccNo());
		 }
		 else
			 System.out.println("Insufficient balance in account: " + account.getAccNo());
	 }
	 
	 public static void main(String[] args) {
	        Account acc1 = new Account(0, "ACC123", 2000, null);
	        Bank bank = new BankImp();

	        bank.deposit(acc1, 3000);   
	        bank.withdraw(acc1, 1500);  
	        bank.withdraw(acc1, 4000);  
	        bank.deposit(acc1, 60000);  
	    }
}