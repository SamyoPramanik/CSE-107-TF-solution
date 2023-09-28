public class b5 {
    public static void main(String[] args) {
        int[][] a = new int[5][];
        int count = 0;
        int num = 0;
        for(int i = 5; i >= 1; --i)
        {
            a[num] = new int[i];
            for(int j = 0; j < i; j++)
            {
                ++count;
                a[num][j] = count;
                System.out.print(count + " ");
            }
            System.out.println();
            ++num;
        }
        System.out.println();
        int[][] b = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {10, 11, 12}, {13, 14}, {15}};
        for(int i = 0; i < 5; ++i)
        {
            for(int j = 0; j < b[i].length; ++j)
            {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
