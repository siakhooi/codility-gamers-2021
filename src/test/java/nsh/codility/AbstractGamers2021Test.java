package nsh.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public abstract class AbstractGamers2021Test {
	abstract Gamers2021Interface getTestObject();

	Gamers2021Interface testObject;

	@BeforeEach
	void setup() {
		testObject = getTestObject();
	}

	@Test
	void test_sample_1() {
		String S = "aa??bbb";
		int R = 3;

		assertEquals(R, testObject.solution(S));
	}

	@Test
	void test_sample_2() {
		String S = "a?b?aa?b?a";
		int R = 2;

		assertEquals(R, testObject.solution(S));
	}

	@Test
	void test_sample_3() {
		String S = "?????";
		int R = 1;

		assertEquals(R, testObject.solution(S));
	}

	@Test
	void test_sample_4() {
		String S = "aa?b?aa";
		int R = 3;

		assertEquals(R, testObject.solution(S));
	}

	@ParameterizedTest
	@CsvSource(textBlock = """
			aaaaa?bbbbb, 6
			aaaaa??bbbbb, 5
			aaaaa???bbbbb, 5
			aaaaa????bbbbb, 5
			 """)
	void test_letters_of_equal_length(String S, int R) {
		assertEquals(R, testObject.solution(S));
	}

	@ParameterizedTest
	@CsvSource(textBlock = """
			aaaaa?bbbb?aaaaa, 6
			aaaaa?bbbbb?aaaaa, 6
			aaaaa?aaaa?aaaaa, 5
			aaaaaa?aaaa?aaaaa, 6
			aaaaa?aaaaa?aaaaa, 5
			""")
	void test_odd_mountain(String S, int R) {
		assertEquals(R, testObject.solution(S));
	}

	@ParameterizedTest
	@CsvSource(textBlock = """
			aaaaa??bbbb??aaaaa, 5
			aaaaa??bbbbb??aaaaa, 5
			aaaaa??aaaaa??aaaaa, 5
			aaaaa??aaaa??aaaaa, 5
			aaaaaa??aaaa??aaaaa, 6
			 """)
	void test_even_mountain(String S, int R) {
		assertEquals(R, testObject.solution(S));
	}

	@ParameterizedTest
	@CsvSource(textBlock = """
			???aaaaa??bbbb??aaaaa, 5
			???aaaaa??bbbbb??aaaaa, 5
			???aaaaa??aaaaa??aaaaa, 5
			???aaaaa??aaaa??aaaaa, 5
			???aaaaaa??aaaa??aaaaa, 6
			 """)
	void test_start_questions(String S, int R) {
		assertEquals(R, testObject.solution(S));
	}

	@ParameterizedTest
	@CsvSource(textBlock = """
			aaaaa??bbbb??aaaaa???, 5
			aaaaa??bbbbb??aaaaa???, 5
			aaaaa??aaaaa??aaaaa???, 5
			aaaaa??aaaa??aaaaa???, 5
			aaaaaa??aaaa??aaaaa???, 6
			 """)
	void test_end_questions(String S, int R) {
		assertEquals(R, testObject.solution(S));
	}

	@ParameterizedTest
	@CsvSource(textBlock = """
			a?b?a?b?a?b, 2
			?a?b?a?b?a?b, 2
			a?b?a?b?a?b?, 2
			?a?b?a?b?a?b?, 2
			a?a?a?a?a?a,1
			?a?a?a?a?a?a,1
			a?a?a?a?a?a?,1
			?a?a?a?a?a?a?,1
			 """)
	void test_all_single_counts(String S, int R) {
		assertEquals(R, testObject.solution(S));
	}

	@ParameterizedTest
	@CsvSource(textBlock = """
			a??b??a??b??a??b, 1
			??a??b??a??b??a??b, 1
			a??b??a??b??a??b??, 1
			??a??b??a??b??a??b??, 1
			 """)
	void test_two_questions(String S, int R) {
		assertEquals(R, testObject.solution(S));
	}

	@ParameterizedTest
	@CsvSource(textBlock = """
			aa?aa, 2
			aa???aa, 2
			aa?bb, 3
			aa??bb, 2
			aa???bb, 2
			aa????bb, 2
			""")
	void test_small_questions(String S, int R) {
		assertEquals(R, testObject.solution(S));
	}

	@ParameterizedTest
	@CsvSource(textBlock = """
			a??aa, 2
			a??a,2
			aa??aa, 2
			aa????aa, 2
			aa?????aa, 2
			aaaa??aaaa, 4
			aaa????aaa, 3
			aaaa????aaaa, 4
			""")
	void test_small_questions_same_char(String S, int R) {
		assertEquals(R, testObject.solution(S));
	}

	@ParameterizedTest
	@CsvSource(textBlock = """
			a??bb, 2
			aa??bb, 2
			aa????bb, 2
			aaaa??bbbb, 4
			aaa????bbb, 3
			aaaa????bbbb, 4
			""")
	void test_even_questions_diff_chars(String S, int R) {
		assertEquals(R, testObject.solution(S));
	}

	@ParameterizedTest
	@CsvSource(textBlock = """
			a?b,2
			a???b,2
			aa?????bbb, 3
			aa?????bb, 2
			aaa?????bbb, 3
			""")
	void test_odd_questions_diff_chars(String S, int R) {
		assertEquals(R, testObject.solution(S));
	}
}