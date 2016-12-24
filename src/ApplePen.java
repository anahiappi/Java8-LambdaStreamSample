import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ApplePen {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("I","have","a","pen","I","have","an","apple");
		Predicate<String> p = s -> {System.out.print("*");return s.equals("have");};
		String s = words.stream().filter(p).findFirst().orElse("");
		System.out.println(s);
	}
}
