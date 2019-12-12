import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;
public class ManagerApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BufferManager<String> bufferManager = new BufferManager<>();
		ArrayList<String> seperatedText = new ArrayList<>();
		while (true) {
			System.out.println("Cümleyi giriniz.");
			String text = input.nextLine();
			seperatedText.clear();
			for (String str : text.split(" ")) {
				seperatedText.add(str);

			}
			bufferManager.bufferRun(seperatedText);
		}
	}
}
