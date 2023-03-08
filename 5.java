import java.util.Scanner;

public class App {

	public static String reverseStr(String str) {
		String revStr = "";
		for (int i = str.length() - 1; i >= 0; --i) {
			revStr += str.charAt(i);
		}
		return revStr;
	}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

		str = reverseStr(str);

		System.out.println(str);
    }
}
