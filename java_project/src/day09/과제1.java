package day09;

import java.util.Scanner;

public class 과제1 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		
		System.out.println("이름, 나이, 번호를 입력해주세요.");
		s1.setName(scan.next());
		s1.setAge(scan.nextInt());
		s1.setNumber(scan.next());
		s1.info();
		System.out.println();
		
		System.out.println("이름, 나이, 번호를 입력해주세요.");
		s2.setName(scan.next());
		s2.setAge(scan.nextInt());
		s2.setNumber(scan.next());
		s2.info();
		
	
	}

}

class Student1{
	String name;
	int age;
	String number;
	
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
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public void info() {
		System.out.println(name+"("+age+") "+number);
	}
}
