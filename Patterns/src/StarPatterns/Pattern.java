package StarPatterns;

public class Pattern {
    public static void main(String[] args) {
        pattern2(5);
    }
    //pattern1
    static void pattern1(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //pattern 2
    static void pattern2(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//pattern 3
    static void pattern3(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j=n;j>i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
