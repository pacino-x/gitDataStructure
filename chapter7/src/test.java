public class test {
    public static void main(String[] args) {
        double[] myList = new double[10];
        System.out.println("length = "+myList.length);
        for(int i = 0;i < myList.length; i++){
            myList[i] = Math.random()*100;
            System.out.println(myList[i]);
        }
        System.out.println("foreach快速遍历数组：");
        for (double e:myList
             ) {
            System.out.println(e);
        }
    }
}
