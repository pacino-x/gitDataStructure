import org.w3c.dom.ls.LSOutput;

import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

public class testinteger {
    /**
     * 测试一下Java取整
     * @param args
     */
    public static void main(String[] args) {
        int a = 5/2;
        System.out.println("a="+a);
        System.out.println("-------------------");
        int[] numbers = new int[]{1,2,3,4};
//        useFill(numbers);
        twoArray();
    }
    //说明是向下取整

    /**
     * 尝试使用fill方法
     * @param nums
     */
    public static void useFill(int[] nums){
        java.util.Arrays.fill(nums,5);
        System.out.println(java.util.Arrays.toString(nums));
    }
    /**
     * 使用二维数组
     */
    public static void twoArray(){
        int[][] matrix = new int[6][5];
        System.out.println("function:twoArray");
        System.out.println("matrix.length is "+matrix.length);
        System.out.println("matrix[0].length is "+matrix[0].length);
    }
}
