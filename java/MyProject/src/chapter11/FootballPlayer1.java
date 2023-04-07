package chapter11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 
인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.*/

//축구선수의 정보를 저장하는 클래스 : 축구선수 데이터 저장 => 인스턴스 생성
public class FootballPlayer1 implements Comparable<FootballPlayer1> {

	private String name;
	private int number;
	private String team;
	private int age;

	public FootballPlayer1(String name, int number, String team, int age) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}

	public FootballPlayer1() {
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
	public int hashCode() {
		return (team.hashCode() + name.hashCode() + age);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this && obj instanceof FootballPlayer1) {
			return true;
		}
		FootballPlayer1 player = (FootballPlayer1) obj;
		return this.team.equals(player.getTeam()) && this.name.equals(player.getName()) && this.age == player.getAge();
	}

	@Override
	public String toString() {
		return "FootballPlayer1 [ :" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
	}

	public void showInfo() {
		System.out.printf("[%s] %s(%d 번,%d 살)\n", this.team, this.name, this.number, this.age);
	}

	@Override
	public int compareTo(FootballPlayer1 o) {	//compare == 0  => 두 값이 같다.
		int compare = this.team.compareTo(o.getTeam());
		
		if (compare == 0) {
			compare = this.name.compareTo(o.getName());
			if (compare == 0) {
				compare = this.number = o.getNumber();
				//compare = Integer.compare(this.Number, o.getNumber
			}
		}
		return compare;
	}

	public static void main(String[] args) {

		// 나의 팀을 구성하고 싶다. -> 선수들을 저장할 수 있는 공간을 생성하고 선수들을 저장
		List<FootballPlayer1> players = createPlayers();
		printPlayers(players);

		Set<FootballPlayer1> playersHash = hashPlayers(players);

		Set<FootballPlayer1> playersTree = treePlayers(players);

		Map<Integer, FootballPlayer1> playerMap = new HashMap<>();
		for (int i = 0; i < players.size(); i++) {
			playerMap.put(i, players.get(i));
		}

		Set<Integer> keySet = playerMap.keySet();
		for (Integer keyName : keySet) {
			playerMap.get(keyName).showInfo();
		}

	}

	private static List<FootballPlayer1> createPlayers() {
		List<FootballPlayer1> players = new ArrayList<>();
		players.add(new FootballPlayer1("손흥민", 7, "토트넘", 21));
		players.add(new FootballPlayer1("이강인", 21, "마요르카", 30));
		players.add(new FootballPlayer1("박지성", 51, "멘유", 42));
		players.add(new FootballPlayer1("손흥민", 17, "토트넘", 21));


		return players;
	}

	private static Set<FootballPlayer1> hashPlayers(List<FootballPlayer1> players) {
		Set<FootballPlayer1> playerSet = new HashSet<>();
		playerSet.addAll(players);
		for (FootballPlayer1 player : playerSet) {
			player.showInfo();
		}
		System.out.println();

		return playerSet;
	}

	private static Set<FootballPlayer1> treePlayers(List<FootballPlayer1> players) {
		Set<FootballPlayer1> playerTree = new TreeSet<>();
		playerTree.addAll(players);
		for (FootballPlayer1 player : playerTree) {
			player.showInfo();
		}
		System.out.println();
		return playerTree;
	}

	private static void printPlayers(List<FootballPlayer1> players) {
		for (FootballPlayer1 player : players) {
			player.showInfo();
		}
		System.out.println();
	}
}
