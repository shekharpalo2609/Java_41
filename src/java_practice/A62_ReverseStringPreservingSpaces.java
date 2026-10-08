package java_practice;

public class A62_ReverseStringPreservingSpaces {

	public static void main(String[] args) {

		String str = "Hello to the world of java";
		char ch[] = str.toCharArray();
		int left = 0;
		int right = ch.length - 1;
		while (left < right) {
			if (ch[left] == ' ') {
				left++;
			} else if (ch[right] == ' ') {
				right--;
			} else {
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;
				left++;
				right--;
			}
		}
		System.out.println(new String(ch));

	}

}
