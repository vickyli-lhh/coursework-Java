import java.util.*;
public class Tester {

	private static ArrayList<BankAccount> accounts = new ArrayList<>();
	
	public static void main(String[] args) {
		BankAccount accountA = new SavingsAccount(8000, 306049001, 1);
		BankAccount accountB = new SavingsAccount(1000, 306049011, 2);
		BankAccount accountC = new CheckingAccount(9000, 306016033);
		BankAccount accountD = new CheckingAccount(3000, 306016041);
		
		accounts.add(accountA);
		accounts.add(accountB);
		accounts.add(accountC);
		accounts.add(accountD);
		
		Scanner scanner = new Scanner(System.in);
		while (true){
			System.out.print("D)Deposit  W)Withdraw  M)Month end  Q)Quit:");
			String operation = scanner.next();
			
			if (operation.equals("M")) {
				for (int i=0; i<accounts.size(); i++) {
					BankAccount account = accounts.get(i);
					account.monthEnd();
					System.out.printf("%d %.1f\n", i, account.getBalance());
				}
			}else if (operation.equals("D") || operation.equals("W")) {
				System.out.print("Enter your account number:");
				int accID = scanner.nextInt();
				System.out.print("Enter transaction amount:");
				int amount = scanner.nextInt();
				
				BankAccount account = getAccount(accID);
				
				if (account == null) {
					System.out.println("Corresponding account cannot be found.");
				}else {
					doOperation(account, operation, amount);
					System.out.printf("Balance: %.1f\n", account.getBalance());
				}
			}else if (operation.equals("Q")) {
				break;
			}
			
		}
		
	}
	
	public static BankAccount getAccount(int ID) {
		BankAccount account = null;
		for (BankAccount a : accounts) {
			if (a.getID() == ID) {
				account = a;
				break;
			}
		}
		return account;
	}
	
	public static void doOperation(BankAccount account, String operation, int amount) {
		if (operation.equals("D")) {
			account.deposit(amount);			
		}else if (operation.equals("W")) {
			account.withdraw(amount);
		}
	}

}
