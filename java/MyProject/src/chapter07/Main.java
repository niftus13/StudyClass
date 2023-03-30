package chapter07;

public class Main {

	public static void main(String[] args) {

		Person p1 = new Male("손", "960205-1647542", true);
		Person p2 = new Female("양", "870809-2435242", false);
		
		p1.greet();
		p2.greet();
		System.out.println();
		
		Person[] p = new Person[5];
		
		p[0] = new Male("김", "830624-1054864", true);
		p[1] = new Female("양", "000624-2054664", false);
		p[2] = new Male("박", "030624-105564", false);
		p[3] = new Female("손", "660624-2054297", true);
		p[4] = new Male("차", "770624-1056724", true);
		

		for(Person people : p) {
			people.greet();
		}
	}
}