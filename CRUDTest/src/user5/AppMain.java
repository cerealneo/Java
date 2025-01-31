package user5;

import java.util.*;

/*
 * 날짜 : 2025/01/27
 * 이름 : 이민성
 * 내용 : 자바 CRUD 실습하기
*/
public class AppMain {
	public static void main(String[] args) {

		System.out.println("-------------------");
		System.out.println("User5 CRUD 실습");
		System.out.println("-------------------");

		Scanner sc = new Scanner(System.in);
		boolean isRunning = true;

		User5Dao dao = User5Dao.getInstance();

		while (isRunning) {

			System.out.println("0:종료, 1:입력, 2:조회, 3:검색, 4:수정, 5:삭제");
			System.out.print("선택> ");

			int answer = sc.nextInt();

			switch (answer) {
			case 0:
				isRunning = false;
				break;
			case 1:
				// 입력
				User5 user = inputUser(sc);
				dao.insertUser5(user);
				System.out.println("INSERT 완료...");
				break;
			case 2:
				// 조회
				List<User5> user5List = dao.selectUser5List();
				for (User5 user1 : user5List) {
					System.out.println(user1);
				}
				break;
			case 3:
				// 검색
				int seq = findUser(sc);
				User5 user1 = dao.selectUser5(seq);

				if (user1 != null) {
					System.out.println(user1);
				} else {
					System.out.println("해당 번호를 찾을 수 없습니다.");
				}
				break;
			case 4:
				// 수정
				User5 modifiedUser = modifyUser(sc);
				dao.updateUser5(modifiedUser);
				System.out.println("해당 사용자를 수정했습니다.");
				break;
			case 5:
				// 삭제
				int removeSeq = removeUser(sc);

				dao.deleteUser5(removeSeq);
				System.out.println("해당 사용자를 삭제했습니다.");
				break;
			}
		}
		System.out.println("프로그램 종료...");
	} // main end

	public static User5 inputUser(Scanner sc) {
		sc.nextLine(); // 입력 버퍼 비우기

		System.out.print("이름 입력 : ");
		String name = sc.nextLine();

		System.out.print("성별 입력 : ");
		String gender = sc.nextLine();

		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("주소 입력 : ");
		String addr = sc.nextLine();


		User5 user = new User5(name, gender, age, addr);
		return user;
	}

	public static int findUser(Scanner sc) {
		sc.nextLine();

		System.out.print("검색 번호 입력 : ");
		int seq = sc.nextInt();

		return seq;
	}

	public static User5 modifyUser(Scanner sc) {
		sc.nextLine(); // 입력 버퍼 비우기
		
		System.out.print("수정 번호 입력 : ");
		int seq = sc.nextInt();
		
		sc.nextLine();

		System.out.print("수정 이름 입력 : ");
		String name = sc.nextLine();

		System.out.print("수정 성별 입력 : ");
		String gender = sc.nextLine();

		System.out.print("수정 나이 입력 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("수정 주소 입력 : ");
		String addr = sc.nextLine();

		User5 user = new User5(seq,name, gender, age, addr);
		return user;
	}

	public static int removeUser(Scanner sc) {
		sc.nextLine(); // 입력 버퍼 비우기

		System.out.print("삭제 번호 입력 : ");
		int seq = sc.nextInt();

		return seq;
	}

}