package node.power.tset;

import java.util.Random;
import java.util.Scanner;

/*
    需求：创建数组使用随机数给数组中保存10个 1-100 之间的随机数据，
         键盘录入数据查看录入的数据在数组中是否存在
        如果存在则返回当前数据对应的下标，如果不存在则返回-1
 */
public class Test02 {
    public static void main(String[] args) {
        // 随机数对象
        Random r = new Random();
        // 定义数组
        int[] arr = new int[10];
        // 将随机数据保存到数组中
        for( int i = 0; i < 10;i++ ) {
            int r_num = r.nextInt(100) + 1;
            //保存随机数
            arr[i] = r_num;
        }
        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
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
