import java.util.ArrayList;

public class BufferManager<TYPE> {

	private ArrayList<TYPE> buffer = new ArrayList<>(5);
	private TYPE oldWord = null;
	private int counter = 0;

	public void bufferRun(ArrayList<TYPE> seperatedText) {

		System.out.println("Seperated List: "+seperatedText);

		for (TYPE newWord : seperatedText) {
			System.out.println("Yeni kelime: " + newWord);
			System.out.println("Eski kelime: " + oldWord);
			if (!buffer.contains(newWord)) {

				if (buffer.size() == 5) {
					buffer.remove(4);
					buffer.add(0, newWord);
					oldWord = buffer.get(counter-1);
					System.out.println("BUFFER: " + buffer + "\n");
				} else {

					buffer.add(0, newWord);
					oldWord = buffer.get(counter++);
					System.out.println("BUFFER: " + buffer + "\n");
				}
			}

			else {
				buffer.remove(newWord);
				buffer.add(0, newWord);
				oldWord = buffer.get(counter - 1);

				System.out.println("BUFFER: " + buffer + "\n");
			}

		}
	}

}
