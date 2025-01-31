package user4;
/*
 * Entity 객체
 *  - 데이터베이스 테이블 개체를 생성하는 객체
 *  - 접미사로 VO(Value Object)를 사용해도 됨
 */

public class User4 {

	private String uid;
	private String name;
	private String gender;
	private int age;
	private String hp;
	private String addr;
	
	public User4() {}

	public User4(String uid, String name, String gender, int age, String hp, String addr) {
		this.uid = uid;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.hp = hp;
		this.addr = addr;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
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

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "User4 [uid=" + uid + ", name=" + name + ", gender=" + gender + ", age=" + age + ", hp=" + hp + ", addr="
				+ addr + "]";
	}
	

	
}