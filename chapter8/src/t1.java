import java.util.Scanner;

/**
 * 求矩阵中特定列所有元素的和
 */
public class t1 {
    public static void main(String[] args) {
        double sumOfColumn = 0;
        int index = getIndex();
        sumOfColumn = sumColumn(getArray(),index);
        System.out.println("sum of column"+index+" is "+sumOfColumn);
    }

    public static double sumColumn(double [][] m,int columnIndex){
        //实现二维数组指定列的和
        double sum = 0;
        for (int n = 0;n < m.length;n++){
            sum += m[n][columnIndex];
        }
        return sum;
    }
    public static int getIndex(){
        int index;
        System.out.println("input columnIndex:");
        Scanner input = new Scanner(System.in);
        index = input.nextInt();
        return index;
    }

    public static double[][] getArray(){
        //获取二维数组
        Scanner input = new Scanner(System.in);
        System.out.println("input a 2d array:");
        double [][]m = new double[3][4];
        System.out.println("input"+m.length+" rows"+m[0].length+"columns:");
        for (int i = 0;i < m.length;i++){
            for (int j = 0;j < m[0].length;j++){
                m[i][j] = input.nextDouble();
            }
        }
        return m;
    }
}
