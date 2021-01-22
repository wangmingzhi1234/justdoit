package node.power.tset;

import java.util.Scanner;

/*
    需求：创建数组保存数据，键盘录入数据查看录入的数据在数组中是否存在
    如果存在则返回当前数据对应的下标，如果不存在则返回-1
 */
public class Test01 {
    public static void main(String[] args) {
        // 定义数组
        int[] arr = {1,2,3,4,5,6,7};
        // 键盘录入
        Scanner input = new Scanner(System.in);
        System.out.print("请输入需要查找的数据:");
        int number = input.nextInt();

        int index = getIndex(arr, number);
        System.out.println("index = " + index);
    }
    // 1. 需要操作的数组  2. 查看的数据
    public static int getIndex( int[] arr, int number ) {
        // 遍历数组，获取数组中的每一个数据
        for( int i = 0; i < arr.length;i++ ) {
            // 判断获取的数据和查找的数据是否相等
            if( number == arr[i] ) {
                return i;
            }
        }
        return -1;
    }
}
