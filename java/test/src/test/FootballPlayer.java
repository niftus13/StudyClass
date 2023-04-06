package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class FootballPlayer implements Comparable<FootballPlayer> {
	private String name;
	private int number;
	private String team;
	private int age;

// 생성자
	public FootballPlayer(String name, int number, String team, int age) {

		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}

// getter/setter

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

	// override

	@Override
	public String toString() {
		return "FootballPlayer [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
	}

	public void showInfo() {
		System.out.printf("[%s] %s(%d번 , 나이 :%d)\n", team, name, number, age);
	}

	// Hash
	@Override
	public int hashCode() {
		return (team.hashCode() + name.hashCode() + age);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this && (obj instanceof FootballPlayer)) {
			return true;
		}
		FootballPlayer player = (FootballPlayer) obj;
		return this.team.equals(player.getTeam()) && this.name.equals(player.getName()) && this.age == player.getAge();
	}

	// Tree
	@Override
	public int compareTo(FootballPlayer o) {
		int compare = this.team.compareTo(o.getName());
		if(compare == 0) {
			compare = this.name.compareTo(getName());
			if(compare==0) {
				compare=this.number=o.getNumber();
			}
		}
		return compare;
	}

	// main
	public static void main(String[] args) {
		List<FootballPlayer> players = new ArrayList<>();
		players.add(new FootballPlayer("손흥민", 7, "토트넘", 21));
		players.add(new FootballPlayer("이강인", 21, "마요르카", 30));
		players.add(new FootballPlayer("박지성", 7, "멘유", 42));
		players.add(new FootballPlayer("손흥민", 7, "토트넘", 21));
		for (FootballPlayer player : players) {
			player.showInfo();
		}

		System.out.println();
		Set<FootballPlayer> playerSet = new HashSet<>();
		playerSet.add(new FootballPlayer("손흥민", 7, "토트넘", 21));
		playerSet.add(new FootballPlayer("이강인", 21, "마요르카", 30));
		playerSet.add(new FootballPlayer("박지성", 45, "멘유", 42));
		playerSet.add(new FootballPlayer("손흥민", 7, "토트넘", 21));
		for (FootballPlayer player : playerSet) {
			player.showInfo();
		}

		System.out.println();
		Set<FootballPlayer> playerTree = new TreeSet<>();
		playerTree.add(new FootballPlayer("손흥민", 7, "토트넘", 21));
		playerTree.add(new FootballPlayer("이강인", 21, "마요르카", 30));
		playerTree.add(new FootballPlayer("박지성", 45, "멘유", 42));
		playerTree.add(new FootballPlayer("손흥민", 7, "토트넘", 21));
		for (FootballPlayer player : playerTree) {
			player.showInfo();
		}

		Map<Integer, FootballPlayer> playerMap = new HashMap<>();
		FootballPlayer p1 = new FootballPlayer("손흥민", 7, "토트넘", 21);
		playerMap.put(7, p1);
		FootballPlayer p2 = new FootballPlayer("이강인", 21, "마요르카", 30);
		playerMap.put(21, p2);
		FootballPlayer p3 = new FootballPlayer("박지성", 45, "멘유", 42);
		playerMap.put(45, p3);
		FootballPlayer p4 = new FootballPlayer("손흥민", 7, "토트넘", 21);
		playerMap.put(7, p4);
		Set<Integer> keySet = playerMap.keySet();
		for (Integer keyName : keySet) {
			System.out.println(keyName + " : " + playerMap.get(keyName));

		}

	}

}
