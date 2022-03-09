import java.util.Scanner;

/**
 * 求矩阵主对角线元素的和
 */
public class t2 {
    public static void main(String[] args) {
        double result = sumMajorDiagonal(getArray());
        System.out.println("sum of major diagonal is "+result);
    }

    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for (int i = 0;i < m.length;i++){
            sum +=m[i][i];
        }
        return sum;
    }

    public static double[][] getArray(){
        //获取二维数组
        Scanner input = new Scanner(System.in);
        System.out.println("enter a 4-by-4 matrix row by row:");
        double [][]m = new double[4][4];
        System.out.println("input "+m.length+" rows "+m[0].length+" columns:");
        for (int i = 0;i < m.length;i++){
            for (int j = 0;j < m[0].length;j++){
                m[i][j] = input.nextDouble();
            }
        }
        return m;
    }
}
