package user5;
/*
 * Entity 객체
 *  - 데이터베이스 테이블 개체를 생성하는 객체
 *  - 접미사로 VO(Value Object)를 사용해도 됨
 */

public class User5 {
	private int seq;
	private String name;
	private String gender;
	private int age;
	private String addr;
	
	public User5() {}
	
	public User5(String name, String gender, int age, String addr) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.addr = addr;
	}

	
	public User5(int seq, String name, String gender, int age, String addr) {
		this.seq = seq;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.addr = addr;
	}
	
	public int getSeq() {
		return seq;
	}


	public void setSeq(int seq) {
		this.seq = seq;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	@Override
	public String toString() {
		return "User5 [seq=" + seq + ", name=" + name + ", gender=" + gender + ", age=" + age + ", addr=" + addr + "]";
	}


	
	
}