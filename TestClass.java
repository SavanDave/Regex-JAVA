import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestClass {

	public static void main(String[] args) {
		Scanner input;
		try {
			input = new Scanner(new File("valencia.txt"));
			while (input.hasNextLine()) {
				String startRegex = "\\d ([4-9]|[1-9][0-9])$";
				Pattern startSequence = Pattern.compile(startRegex);
				Matcher startSequenceMatch = startSequence.matcher(input.nextLine());

				if (startSequenceMatch.find()) {

					checkLabHours(input.nextLine());

				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File cannot be read");
			e.printStackTrace();
		}

		// while (true) {
		// System.out.println("\nEnter your regex: ");
		// String myRegex = console.nextLine();
		//
		// Pattern pattern = Pattern.compile(myRegex);
		//
		// System.out.println("\nEnter the String to search: ");
		// String searchString = console.nextLine();
		//
		// Matcher matcher = pattern.matcher(searchString);
		//
		// boolean found = false;
		// while (matcher.find()) {
		// System.out.format("I found the text \"%s\" starting at " +
		// "index %d and ending at index %d.%n",
		// matcher.group(), matcher.start(), matcher.end());
		// found = true;
		// }
		//
		// if(!found){
		// System.out.println("No match found.\n");
		// }
		// }

	}

	private static void checkLabHours(String nextLine) {
		String detailRegex = "(\\w\\w\\w)(\\s)(\\w\\w\\w\\w\\w?)(\\s)(\\d)(\\s)(\\d)(\\s)(\\d)";
		Pattern wholeSequence = Pattern.compile(detailRegex);
		Matcher labSequenceMatch = wholeSequence.matcher(nextLine);

		System.out.println(nextLine);

	}
}
