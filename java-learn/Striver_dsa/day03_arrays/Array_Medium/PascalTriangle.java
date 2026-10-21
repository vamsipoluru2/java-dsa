import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {

        int row = 5;
        int col = 3;

        System.out.println(
            "Element at row " + row + ", column " + col + ": "
            + pascalElement(row, col)
        );
        // printNthRow(6);
        // printTriangle(6);
        System.out.println(generate(6));
        
    }

    static long pascalElement(int row, int col) {

        int R = row - 1;
        int c = col - 1;

        long result = 1;

        for(int i = 0; i < c; i++){
            result = result * (R - i);
            result = result / (i + 1);
        }

        return result;
    }

    static void printNthRow(int n) {
        long ans=1;
        System.out.print(ans+" ");
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            System.out.print(ans+" ");
        }
        System.out.println();
    }

    static void printTriangle(int n) {
        for(int i=1;i<=n;i++){
            printNthRow(i);
        }
    }

    static List<List<Integer>> generate(int n) {

    List<List<Integer>> ans = new ArrayList<>();

    for(int row = 1; row <= n; row++) {

        List<Integer> currentRow = new ArrayList<>();
        long value = 1;

        currentRow.add(1);

        for(int col = 1; col < row; col++) {
            value = value * (row - col) / col;
            currentRow.add((int)value);
        }

        ans.add(currentRow);
    }

    return ans;
}
}