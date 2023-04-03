package chapter09;

public class StringBufferTest {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());

		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);

		// .append -> overload
		// sb.append('~'); // "Hello~"
		// sb.append(" JAVA"); //"Hello~ JAVA"
		sb.append('~').append(" JAVA");
		// 인스턴스에 자기 자신을 처리후 반환하기 때문에 .append 만으로도 가능 -> chaining
		System.out.println(sb); // "Hello~JAVA"

		// delete
		sb.delete(5, 7); // 5~(7-1)
		System.out.println(sb); // HelloJAVA

		// insert
		sb.insert(5, '~');
		System.out.println(sb);	// Hello~JAVA
		sb.insert(6, "~!");
		System.out.println(sb);	// Hello~~!JAVA
		sb.insert(sb.length(), false);
		System.out.println(sb);

		// reverse
		sb.reverse();
		System.out.println(sb);

		String result = new String(sb);
		
		System.out.println(result);
		
		
	}

}
