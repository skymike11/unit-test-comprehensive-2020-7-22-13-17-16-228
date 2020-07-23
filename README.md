# Unit Test Comprehensive 

### PDCA - 游戏流程模块

|                                                              |       |       |      |      |
| ------------------------------------------------------------ | ----- | ----- | ---- | ---- |
| function                                                     | P     | D     | C    | A    |
| 初始化gradle项目，拆分模块，画出答案分布表                   | 15min | 13min |      |      |
| 创建游戏流程模块的主要类：GuessNumber，并根据种类编写测试用例 |       |       |      |      |
| 数字位置与数字全正确的用例，并实现                           | 12min | 13min |      |      |
| 数字位置与数字全部分正确的用例，并实现                       | 8min  | 8min  |      |      |
| 数字位置都不正确，与数字全部分正确的用例，并实现             | 7min  | 7min  |      |      |
| 数字位置部分正确，与数字全部分都正确的用例，并实现           | 7min  | 7min  |      |      |
| 数字位置部分都不正确，与数字全部分都不正确的用例，并实现     | 6min  | 6min  |      |      |
|                                                              |       |       |      |      |



### PDCA - 输入校验模块

|                                            |       |       |      |      |
| ------------------------------------------ | ----- | ----- | ---- | ---- |
| function                                   | P     | D     | C    | A    |
| 初始化gradle项目，拆分模块，画出答案分布表 | 10min | 10min |      |      |
| 验证输入长度的用例与实现                   | 10min | 9min  |      |      |
| 验证输入数字大小的用例与实现               | 10min | 9min  |      |      |
| 验证输入数字是否重复的用例与实现           | 10min | 11min |      |      |
|                                            |       |       |      |      |



### PDCA - 随机答案模块

|                              |       |       |      |      |
| ---------------------------- | ----- | ----- | ---- | ---- |
| function                     | P     | D     | C    | A    |
| 编写随机产生答案的用例并实现 | 15min | 14min |      |      |



### PDCA - 生成答案模块

|                          |       |       |      |      |
| ------------------------ | ----- | ----- | ---- | ---- |
| function                 | P     | D     | C    | A    |
| 编写打印结果的用例并实现 | 15min | 14min |      |      |



## Business Requirement

There is a game that realizes guessing numbers. There are four grids in the game, each with a number from 0 to 9, and the numbers for any two grids are different. You have 6 chances to guess. If you guess right, then you win; otherwise, you fail. Each time when you guess, you need to input 4 numbers in sequence. The program will give you feedback of xAxB according to the guessing situation. The number before A represents the number of correct position and number, and the number before B represents the number of correct number but wrong position.

For example: the answer is 1 2 3 4, then there are the following outputs based on different inputs

**Example**：

> The answer is 1 2 3 4, then there are the following outputs based on different inputs


```
Input　　    Output             Instruction
1 5 6 7      1A0B                 1 correct
2 4 7 8      0A2B                 2 and 4 wrong position 
0 3 2 4      1A2B                 4 correct，2 and 3 wrong position
5 6 7 8      0A0B                 all wrong
4 3 2 1      0A4B                 4 numbers position wrong
1 2 3 4      4A0B                 win, all correct
1 1 2 3    Wrong Input，Input again
1 2        Wrong Input，Input again
```

The answer is randomly generated at the beginning of the game. There are only 6 chances for input.  Each time when you guess, the program should give the results of the current guess, as well as all previously guessed numbers and results for the player's reference. The input interface is Console (console) to avoid too many interface codes that are not related to the problem.
When inputting, separate the numbers with spaces.

## Practice Requirement:
- ** Design and write test cases after clearly understanding the requirements**
- ** Complete tests in the existing test file and ensure that the test coverage of the test category of this test file is 100%**
- Unit testing should cover all core business logic
- Make unit test refactoring with small steps
- **Denominate meaningful names for unit tests and methods**
- ** Submit code in small steps with a comment on meaning **

#### Environment Requirement
- Java 8
- Intellj IDEA

#### How to Test
- Implement `./gradlew clean test` under root catalogue and view test result

## Practice Output && Submit
- You should implement the test code and push your repo to github repo named **unit-test-comprehensive**.
- Commit your repository link to complete this Question.
