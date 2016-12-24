import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ApplePen {
	public static void main(String[] args) {
		// 8個の単語のリスト
		List<String> words = Arrays.asList("I", "have", "a", "pen", "I", "have", "an", "apple");

		// Stringを与えるとPredicate<String>(String -> booleanの関数)を返す関数
		// このPredicateはtestするたびに*を1個出力する
		Function<String, Predicate<String>> f = word -> (s -> {
			System.out.print("*");
			return s.equals(word);
		});

		// filterの引数にf("have")で得られるPredicateを渡す・・・単語の数は8個なので8回*が出力されそうだが・・・
		String s = words.stream().filter(f.apply("have")).findFirst().orElse("");

		// 上の処理の結果を出力。haveが出力される。
		System.out.println(s);
	}
}
