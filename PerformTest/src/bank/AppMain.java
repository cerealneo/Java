package bank;

import java.util.*;

public class AppMain {
	private static Scanner scanner = new Scanner(System.in);
	private static List<Account> accounts = new ArrayList<>();

	public static void main(String[] args) {
		boolean isRunning = true;
		while (isRunning) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택 > ");

			int selectNo = Integer.parseInt(scanner.nextLine());
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				isRunning = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		System.out.println("------------------계좌생성-------------------");

		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();

		System.out.print("계좌주: ");
		String owner = scanner.nextLine();

		System.out.print("초기입금액: ");
		 int balance = Integer.parseInt(scanner.nextLine());
		
		 Account newAccount = new Account(ano, owner, balance);
		 accounts.add(newAccount);
		
		 System.out.println("결과: 계좌가 생성되었습니다.");
	}

	private static void accountList() {
		System.out.println("------------------계좌목록-------------------");

		 for (Account account : accounts) {
			if (account != null) {
				System.out.print(account.getAno());
				System.out.print("  ");
				System.out.print(account.getOwner());
				System.out.print("  ");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
	}

	private static void deposit() {
		System.out.println("-------------------예금--------------------");

		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("예금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("결과 : 계좌가없습니다");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("결과: 예금이 성공되었습니다");
	}

	private static void withdraw() {
		System.out.println("-------------------출금--------------------");

		System.out.print("계좌번호: ");
		 String ano = scanner.nextLine();
		 
		System.out.print("출금액: ");
		int money = Integer.parseInt(scanner.nextLine());

		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("결과 : 계좌가없습니다");
			return;
		}
		
		account.setBalance(account.getBalance() - money);
		System.out.println("결과:출금이 성공되었습니다");
	}

	private static Account findAccount(String ano) {
		for (Account acc : accounts) { 
	        if (acc != null && acc.getAno().equals(ano)) {
	            return acc;  
	        }
	    }
	    return null;  

	}

}
