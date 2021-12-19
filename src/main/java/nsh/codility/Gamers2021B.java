package nsh.codility;

public class Gamers2021B implements Gamers2021Interface {

	@Override
	public int solution(String S) {
		char[] C = S.toCharArray();
		char[] Char1 = new char[C.length];
		int[] Count1 = new int[C.length];
		int index = -1;

		for (int i = 0; i < C.length; i++) {
			char c = C[i];
			if (i == 0 || Char1[index] != c) {
				Char1[++index] = c;
				Count1[index] = 1;
			} else
				Count1[index]++;
		}
		int MaxCount = 1;
		for (int i = 0; i <= index; i++)
			if (Char1[i] == '?') {
				if (i > 0 && i < index) {
					if (Char1[i - 1] == Char1[i + 1]) {
						if (MaxCount == 1 && Count1[i] % 2 == 0)
							MaxCount = 2;
						Count1[i] = 0;
					} else {
						if (Count1[i] % 2 == 0)
							Count1[i] = 0;
						else if (MaxCount == 1 && Count1[i] > 2) {
							MaxCount = 2;
							Count1[i] = 0;
						}
					}
				}
			} else
				MaxCount = Math.max(MaxCount, Count1[i]);

		for (int i = 0; i < index - 1; i++) {
			if (Char1[i] != '?' && Count1[i] == MaxCount) {
				if (Char1[i + 1] == '?' && Count1[i + 2] == MaxCount && Count1[i + 1] == 1) {
					return MaxCount + 1;
				}else if(Char1[i + 1] == '?' && Count1[i + 2] == MaxCount-1 && Count1[i + 1] == 1) {
					Count1[i + 2]++;
				}
			}
		}
		
		
		return MaxCount;
		
	}
}
