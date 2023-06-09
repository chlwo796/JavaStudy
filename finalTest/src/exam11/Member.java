package exam11;

import java.util.Objects;

// 일반클래스 - 붕어빵틀, 설계도, 객체(인스턴스)를 100개건 1000개건 만들 수 있다.
// 1. 회원아이디, 이름, 나이
// 2. toString()
//     hashcode()
//    equals()

public class Member { // public class Member extends Object
	// 필드
	int memID;
	String name;
	int age;

	public Member() {
	}

	public Member(int memID, String name, int age) {
		super();
		this.memID = memID;
		this.name = name;
		this.age = age;
	}

	public int getMemID() {
		return memID;
	}

	public void setMemID(int memID) {
		this.memID = memID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	@Override
//	public String toString() {
//		// Object의 toString()메소드 오버라이딩(재정의)
//		return "회원아이디 : " + memID + ", 회원명 : " + name + ", 나이 : " + age;
//	}

	@Override
	public int hashCode() {
		// Object의 hashCode()메소드 오버라이딩(재정의)
		return Objects.hash(memID, name);
	}

	@Override
	public boolean equals(Object obj) {
		// Object의 equals()메소드 오버라이딩(재정의)
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return memID == other.memID && Objects.equals(other, obj);
	}
}