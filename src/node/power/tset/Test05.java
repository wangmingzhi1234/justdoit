package node.power.tset;
import java.util.Random;
/*
    需求: 数组中保存10个 33-145 之间的 随机数，获取数组中偶数的个数 及其 计算奇数和值
        r.nextInt(最大值 - 最小值 + 1 ) + 最小值;
 */
public class Test05 {
    public static void main(String[] args) {
        // 创建数组
        int[] arr = new int[10];
        // 调用方法给数组赋值
        setValue( arr );
        // 打印数组
        printArray(arr);
        // 调用方法
        getSumCount(arr);
    }
    // 定义方法 计算偶数个数 和 奇数和值
    public static void getSumCount( int[] arr ) {
        // 定义变量保存和值 和 个数
        int sum = 0;
        int count = 0;
        // 遍历数组 获取数据判断类型
        for( int i = 0; i < arr.length; i++ ) {
            // 是偶数
            if( arr[i] % 2 == 0 ) {
                count++;
            } else {
                // 计算和值
                sum += arr[i];
            }
        }
        System.out.println("偶数的个数为:" + count  + "，奇数的和值为:" + sum);
    }

    // 循环给数组中的数据赋值
    public static void setValue( int[] arr ) {
        // 创建随机数对象
        Random r = new Random();
        // 循环给数组中的数据赋值
        for( int i = 0; i < arr.length;i++ ) {
            arr[i] = r.nextInt(113 ) + 33;
        }
    }
    // 定义方法 遍历数组
    public static void printArray( int[] arr ) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
