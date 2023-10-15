public class RadianDegreeTest {
    public static void main(String[] args) {
        // テストケース1: degreeToRadian
        double result = RadianDegree.degreeToRadian(90.0);
        assert result == 1.5707963267948966 : "Test Case 1 Failed"; // π/2

        // テストケース2: radianToDegree
        result = RadianDegree.radianToDegree(2.0943951023931953); // 4π/3 ラジアン
        assert result == 120.0 : "Test Case 2 Failed";

        System.out.println("All test cases passed.");
    }
}
