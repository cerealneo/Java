package sub3;

import java.util.*;

/*
 *  날짜 : 2025/01/21
 *  이름 : 이민성
 *  내용 : java 스트림필터 실습하기
*/
public class StreamFilterTest {

	public static void main(String[] args) {
		
		
		//리스트 생성
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3);
		System.out.println(nums);
		
		
		//중복제거하기
		nums.stream().distinct().forEach(num -> System.out.print(num + ", "));
		System.out.println();
		
		//5이상 테이터 필터링
		nums.stream().filter((num) -> {
			if (num >= 5) {
				return false;
			}else {
				return true;
			}
		}).forEach((num)-> {
			System.out.print(num+", ");
		});
		
		System.out.println();
		
		//중복제거, 짝수, 데이터 필터링, 내림차순 정렬
		nums
			.stream()
			.distinct()
			.filter(num -> num %2 ==0)
			.sorted(Collections.reverseOrder())
			.forEach(num -> System.out.print(num+","));
		
		
	}

}
