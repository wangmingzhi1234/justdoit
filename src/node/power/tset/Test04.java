package node.power.tset;

import java.util.Random;
import java.util.Scanner;
/*
    需求：创建长度为1-10随机个数的数组，给数组中保存1-100 之间的随机数据，
         键盘录入数据查看录入的数据在数组中是否存在,如果不存在，则继续录入数据
         直到找到数组中存在的数据为

    思想: 在程序中，只要是一个独立功能，都需要单独抽取的一个方法中    低耦合 高内聚
 */
public class Test04 {
    public static void main(String[] args) {
        // 随机数对象
        Random r = new Random();
        // 产生一个1-10之间的随机数作为数组的长度
        // 定义数组
        int[] arr = new int[ r.nextInt(10) + 1 ];
        // 将随机数据保存到数组中
        for( int i = 0; i < arr.length;i++ ) {
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
        // 调用方法 获取录入数据对应的下标
        int index = getIndex(arr, number);
        while(true) {
            // 判断index是否等于 -1
            if( index == -1) {
                System.out.print("没猜对，继续猜:");
                number = input.nextInt();
                index = getIndex(arr,number);
            } else {
                System.out.println("猜对了！");
                break;
            }
        }
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
