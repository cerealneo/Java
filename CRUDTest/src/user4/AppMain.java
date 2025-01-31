package user4;

import java.util.*;

/*
 * 날짜 : 2025/01/27
 * 이름 : 이민성
 * 내용 : 자바 CRUD 실습하기
*/
public class AppMain {
	public static void main(String[] args) {

		System.out.println("-------------------");
		System.out.println("User4 CRUD 실습");
		System.out.println("-------------------");

		Scanner sc = new Scanner(System.in);
		boolean isRunning = true;

		User4Dao dao = User4Dao.getInstance();

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
				User4 user = inputUser(sc);
				dao.insertUser4(user);
				System.out.println("INSERT 완료...");
				break;
			case 2:
				// 조회
				List<User4> user4List = dao.selectUser4List();
				for (User4 user1 : user4List) {
					System.out.println(user1);
				}
				break;
			case 3:
				// 검색
				String uid = findUser(sc);
				User4 user1 = dao.selectUser4(uid);

				if (user1 != null) {
					System.out.println(user1);
				} else {
					System.out.println("해당 아이디를 찾을 수 없습니다.");
				}
				break;
			case 4:
				// 수정
				User4 modifiedUser = modifyUser(sc);
				dao.updateUser4(modifiedUser);
				System.out.println("해당 사용자를 수정했습니다.");
				break;
			case 5:
				// 삭제
				String removeUid = removeUser(sc);

				dao.deleteUser4(removeUid);
				System.out.println("해당 사용자를 삭제했습니다.");
				break;
			}
		}
		System.out.println("프로그램 종료...");
	} // main end

	public static User4 inputUser(Scanner sc) {
		sc.nextLine(); // 입력 버퍼 비우기

		System.out.print("아이디 입력 : ");
		String uid = sc.nextLine();

		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		
		System.out.print("성별 입력 : ");
		String gender = sc.nextLine();
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		sc.nextLine();

		System.out.print("휴대폰 입력 : ");
		String hp = sc.nextLine();
		
		System.out.print("주소 입력 : ");
		String addr = sc.nextLine();


		User4 user = new User4(uid, name, gender, age , hp, addr);
		return user;
	}

	public static String findUser(Scanner sc) {
		sc.nextLine();

		System.out.print("검색 아이디 입력 : ");
		String uid = sc.nextLine();

		return uid;
	}

	public static User4 modifyUser(Scanner sc) {
		sc.nextLine(); // 입력 버퍼 비우기

		System.out.print("수정 아이디 입력 : ");
		String uid = sc.nextLine();

		System.out.print("수정 이름 입력 : ");
		String name = sc.nextLine();
		
		System.out.print("수정 성별 입력 : ");
		String gender = sc.nextLine();
		
		System.out.print("수정 나이 입력 : ");
		int age = sc.nextInt();

		sc.nextLine();
		
		System.out.print("수정 휴대폰 입력 : ");
		String hp = sc.nextLine();
		
		System.out.print("수정 주소 입력 : ");
		String addr = sc.nextLine();

		User4 user = new User4(uid, name, gender, age , hp, addr);
		return user;
	}

	public static String removeUser(Scanner sc) {
		sc.nextLine(); // 입력 버퍼 비우기

		System.out.print("삭제 아이디 입력 : ");
		String uid = sc.nextLine();

		return uid;
	}

}