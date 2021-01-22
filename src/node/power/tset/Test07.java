package node.power.tset;

import java.util.Random;

/*
    需求: 定义数组保存10个1-100之间的随机数，获取其中的偶数保存新到数组中，并打印输出数据。
    思想： 数组既可以作为方法的形参，一定也可以作为方法的返回值类型。
    1. 定义数组 声明10个长度
    2. 定义方法 给数组中保存随机数据
    3. 定义方法 获取数组中偶数的个数
    4. 定义方法 创建新的数组使用循环遍历原来的数组找到偶数保存到新的数组中
 */
public class Test07 {
    public static void main(String[] args) {
        //1. 定义数组 声明10个长度
        int[] arr = new int[10];
        // 调用方法给数组中保存数据
        setArray(arr);
        // 打印查看保存的数据
        print(arr);
        System.out.println(); // 换行
        // 调用获取偶数数组的方法
        int[] array = getArray(arr);
        // 打印偶数数组中的数据
        print(array);

    }
    // 4. 定义方法 创建新的数组使用循环遍历原来的数组找到偶数保存到新的数组中
    public static int[] getArray( int[] arr ) {
        // 定义变量 用来控制新数组的下标
        int index = 0;
        // 定义新的数组
        int[] newArr = new int[ getCount(arr) ];
        // 遍历原来的数组，取出偶数
        for( int i = 0; i < arr.length; i++ ) {
            // 判断是否为偶数
            if( arr[i] % 2 == 0 ) {
                newArr[index] = arr[i];
                index++;
            }
        }
        return newArr;
    }
    // 3. 定义方法 获取数组中偶数的个数
    public static int getCount( int[] arr ) {
        // 定义变量保存个数
        int count = 0;
        for( int i = 0; i < arr.length;i++ ) {
            if( arr[i] % 2 == 0 ) {
                count++;
            }
        }
        return count;
    }

    // 2. 定义方法 给数组中保存随机数据
    public static void setArray( int[] arr ) {
        // 创建随机数对象
        Random r = new Random();
        for( int i = 0; i < arr.length;i++ ) {
            arr[i] = r.nextInt(100) + 1;
        }
    }

    // 定义方法打印数组
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
