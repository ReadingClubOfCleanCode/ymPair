
import java.io.Console;

public class CoinCounterBoundary {
	public CoinCounterBoundary() {
		Console cons = System.console();
		if (cons != null) {
			System.out.print("input C1 C5 C10 C50 C100 C500 total");
			String input = cons.readLine();
			System.out.println(input);
		}
	}

	public static void main(String[] args) {
		Console cons = System.console();
		if (cons != null) {
			System.out.print("input C1 C5 C10 C50 C100 C500 total");
			String input = cons.readLine();
			System.out.println(input);
		}
	}
}
