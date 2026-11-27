import java.util.Arrays;

public class Number07 {
    public static void main(String[] args) {
        int[][] myNumbers = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] copy = myNumbers;
        copy[0][0] = 99;

        System.out.println("Reference copy:");
        System.out.println(myNumbers[0][0]);

        myNumbers[0][0] = 1;

        int[][] cloneCopy = myNumbers.clone();
        cloneCopy[0][0] = 88;

        System.out.println(myNumbers[0][0]);

        myNumbers[0][0] = 1;

        int[][] deepCopy = new int[myNumbers.length][];

        for (int i = 0; i < myNumbers.length; i++) {
            deepCopy[i] = new int[myNumbers[i].length];

            for (int j = 0; j < myNumbers[i].length; j++) {
                deepCopy[i][j] = myNumbers[i][j];
            }
        }

        deepCopy[0][0] = 77;

        System.out.println("\nDeep copy:");
        System.out.println("Original: " + Arrays.deepToString(myNumbers));
        System.out.println("Copy: " + Arrays.deepToString(deepCopy));
    }
}