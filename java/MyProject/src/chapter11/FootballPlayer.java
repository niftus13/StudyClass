package chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 
인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.*/

public class FootballPlayer {

	private String name;
	private int number;
	private String team;
	private int age;

	public FootballPlayer(String name, int number, String team, int age) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "FootballPlayer1 [ :" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		List<FootballPlayer> players = createPlayers();

		printPlayers(players);

	}

	private static List<FootballPlayer> createPlayers() {
		List<FootballPlayer> players = new ArrayList<>();
		players.add(new FootballPlayer("손", 8, "대한민국", 21));
		players.add(new FootballPlayer("박", 21, "대한민국", 30));
		players.add(new FootballPlayer("차", 50, "대한민국", 42));
		players.add(new FootballPlayer("안", 29, "대한민국", 19));

		return players;
	}

	private static void printPlayers(List<FootballPlayer> player) {
		Iterator<FootballPlayer> itr = player.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
