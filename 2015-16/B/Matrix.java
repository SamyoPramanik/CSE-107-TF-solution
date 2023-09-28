import java.util.Scanner;

class TwoDimException extends Exception{
    @Override
    public String toString(){
        return "Determinant cannot be 0";
    }
}

class NotSquareMatException extends Exception{
    @Override
    public String toString(){
        return "Matrix must be square to find the determinant";
    }
}

class UnsupportedMatSizeException extends Exception{
    @Override
    public String toString(){
        return "Unsupported matrix size for determinant calculation.";
    }
}


class TwoDimMatrix {
    int[][] arr;
    int m;
    int n;

    TwoDimMatrix(int m, int n) {
        arr = new int[m][n];
        this.m = m;
        this.n = n;
    }

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the matrix elements: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the [" + i + "][" + j + "] the element:");
                arr[i][j] = scanner.nextInt();
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    void print() {
        System.out.println("Matrix is being printed: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    int determinant() throws NotSquareMatException, UnsupportedMatSizeException {
        if (m != n) {
            throw new NotSquareMatException();
        }
        
        if (m == 2 && n == 2) {
            return calculate2x2Determinant();
        } else if (m == 3 && n == 3) {
            return calculate3x3Determinant();
        } else {
            throw new UnsupportedMatSizeException();
        }
    }

    private int calculate2x2Determinant() {
        return arr[0][0] * arr[1][1] - arr[0][1] * arr[1][0];
    }

    private int calculate3x3Determinant() {
        return arr[0][0] * (arr[1][1] * arr[2][2] - arr[1][2] * arr[2][1])
             - arr[0][1] * (arr[1][0] * arr[2][2] - arr[1][2] * arr[2][0])
             + arr[0][2] * (arr[1][0] * arr[2][1] - arr[1][1] * arr[2][0]);
    }
}

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int m = scanner.nextInt();
        scanner.nextLine();
        int n = scanner.nextInt();
        scanner.nextLine();
        TwoDimMatrix matrix = new TwoDimMatrix(m, n);
        matrix.input();
        matrix.print();

        try{
        int det = matrix.determinant();
        System.out.println("Determinant: " + det);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            scanner.close();
        }
        
    }
}

