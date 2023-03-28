package contact;

import java.util.Scanner;

public class Contact {

	//캡슐화 처리
	private String name;
	private String phoneNumber;
	private String email;
	private String address;
	private String birth;
	private String group;
	
	//Getter , Setter 메소드

	
	//Contact 생성자
	public Contact(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public Contact(String name, String phoneNumber, String email, String address, String birth, String group) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.birth = birth;
		this.group = group;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}

	//출력하는 메소드
	public void showData() {
		System.out.println("이름" + name);
		System.out.println("전화번호" + phoneNumber);
		System.out.println("email" + email);
		System.out.println("주소" + address);
		System.out.println("생일" + birth);
		System.out.println("그룹" + group);
	}
	
}

