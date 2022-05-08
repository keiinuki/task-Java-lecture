package task;

public class HelloWorldFor {

	public static void main(String[] args) {
		for (int i = 1; i < 12; i++) {
			if (i < 11) {
				System.out.println("Hello World " + i + " 回目");
			} else {
				System.out.println("Hello!! " + i + " 回目");
			}
		}
	}

}
