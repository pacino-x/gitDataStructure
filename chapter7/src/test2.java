
public class test2 {
    /**
     * 探究Math.random()生成整数作为数组下标的可能性和可靠性
     * @param args
     */
    public static void main(String[] args) {
        int[] list = new int[10];
        int j = 0;
        for (int i = 0;i < list.length;i++){
            list[i] = (int)(Math.random()* list.length);
            System.out.println(list[i]);
        }
        System.out.println("arraycopy:");
        int[] source = {1,2,3};
        int[] list2 = new int[10];
        System.arraycopy(source,0,list2,6,3);
        for (int e :list2
             ) {
            System.out.println(e);
        }
    }
}
