# Codility Challenge: Gamer's 2021

## FillTheGaps

- Difficulty: Hard
- Given a string consisting of characters 'a', 'b' and/or '?', replace each '?' with 'a' or 'b' so that the longest fragment of the resulting string consisting of equal letters is as short as possible.
- <https://app.codility.com/programmers/challenges/gamers_2021/>
- <https://app.codility.com/programmers/task/fill_the_gaps/>

## Versions

- Result
  - `Good`: Correctness 100%, Performance 100%.
  - `OK`: Correctness 100%, Performance <100%.
  - `Fail`: Correctness <100%, Performance <100%.
- File naming convention
  - Code `A`: `Gamers2021A.java`
  - etc

### Gold Award

| File | Complexity              | Result | Report                                                                            |
| ---- | ----------------------- | ------ | --------------------------------------------------------------------------------- |
| `A`  | `O(N * log(N)) or O(N)` | `Good` | [N7PTWR](https://app.codility.com/cert/view/certN7PTWR-SA8JKZ48PXEHSSSS/details/) |

### Other
| File | Complexity              | Result | Report                                                                            |
| ---- | ----------------------- | ------ | --------------------------------------------------------------------------------- |
| `B`  | `O(N * log(N)) or O(N)` | `Good` | [6WTXMU](https://app.codility.com/demo/results/training6WTXMU-629/) |


- Solution provided by Codility is written in Python and using `yield` command which not available in Java. So no java version implemented as it can't be compared fairly.
- Both `A`, `B` and Codility solutions are same concepts.
- `A` although earn a Gold award, but actually contains a bug, which failed the following scenario:
	- input:	'`aaaa?bbb?aaa?bbb?aaa?bbb?aaaa`', expected `5` (the program returns 4)
- `B` is the bug fix version of `A`


