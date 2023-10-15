public class JudgeTest {
    public static void main(String[] args) {
        // テストケース1: score >= 60
        Judge judge1 = new Judge(75);
        assert judge1.isPassed() : "Test Case 1 Failed";

        // テストケース2: score < 60
        Judge judge2 = new Judge(45);
        assert !judge2.isPassed() : "Test Case 2 Failed";

        // テストケース3: grade S
        Judge judge3 = new Judge(95);
        assert judge3.grade().equals("S") : "Test Case 3 Failed";

        // テストケース4: grade A
        Judge judge4 = new Judge(85);
        assert judge4.grade().equals("A") : "Test Case 4 Failed";

        // テストケース5: grade B
        Judge judge5 = new Judge(75);
        assert judge5.grade().equals("B") : "Test Case 5 Failed";

        // テストケース6: grade C
        Judge judge6 = new Judge(65);
        assert judge6.grade().equals("C") : "Test Case 6 Failed";

        // テストケース7: grade D
        Judge judge7 = new Judge(55);
        assert judge7.grade().equals("D") : "Test Case 7 Failed";

        // テストケース8: grade F
        Judge judge8 = new Judge(45);
        assert judge8.grade().equals("F") : "Test Case 8 Failed";

        System.out.println("All test cases passed.");
    }
}
