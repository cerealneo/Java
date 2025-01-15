package sub3;

import java.util.*;

/*
 *  날짜 : 2025/01/15
 *  이름 : 이민성
 *  내용 : java 컬렉션 set 실습하기
*/
public class SetTest {
	public static void main(String[] args) {
		//set 생성
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(2);
		set.add(3);
		
		System.out.println(set);
		
		//반복차(iterator) 데이터 출력
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			//다음 데이터 존재할 때 까지 반복 실행
			System.out.println(it.next());
		}
		
		//반복문으로 데이터 출력
		for(int num : set) {
			System.out.println(num);
		}
		
		//데이터 출력
	}
}
