package node.power.tset;

import java.util.Random;

/*
    需求: 数组中保存30个随机字符，统计数组中的数字字符、小写字母字符、大写字母字符并分别保存到新的数组中
    然后对数组中数据进行排序
    需要3个数组： 保存数字字符   、 小写字母字符 、 大写字母字符
    定义方法分别获取  数字字符 、 写字母字符 、 大写字母字符的个数
 */
public class Test09 {
    public static void main(String[] args) {
        // 定义char数组
        char[] arr = new char[30];
        // 保存数据
        setArray( arr );
        // 查看数据
        print( arr );
        // 获取数组
        char[] numberChar = getNumberChar(arr);
        char[] minChar = getMinChar(arr);
        char[] maxChar = getMaxChar(arr);
        // 排序数字字符
        sort(numberChar);
        sort(maxChar);
        sort(minChar);
        // 打印查看数据
        print(numberChar);
        print(maxChar);
        print(minChar);

    }
    // 定义方法，对数组中的数据进行排序
    public static void sort( char[] arr ) {
        for( int i = 0; i < arr.length - 1;i++ ) {
            for( int j = i + 1; j < arr.length; j++ ) {
                if( arr[i] > arr[j] ) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    // 定义方法获取数字字符
    public static char[] getNumberChar( char[] arr ) {
        // 定义变量控制下标
        int index = 0;
        // 定义数组保存数字字符
        char[] numbers = new char[ getCounts(arr)[0] ];
        // 循环遍历字符数组，获取其中的数字字符
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] >= '0' && arr[i] <= '9' ) {
                numbers[index++] = arr[i];
            }
        }
        return numbers;
    }

    // 定义方法获取数字字符
    public static char[] getMinChar( char[] arr ) {
        // 定义变量控制下标
        int index = 0;
        // 定义数组保存数字字符
        char[] mins = new char[ getCounts(arr)[1] ];
        // 循环遍历字符数组，获取其中的数字字符
        for (int i = 0; i < arr.length; i++) {
            if (  arr[i] >= 'a' && arr[i] <= 'z'  ) {
                mins[index++] = arr[i];
            }
        }
        return mins;
    }
    // 定义方法获取数字字符
    public static char[] getMaxChar( char[] arr ) {
        // 定义变量控制下标
        int index = 0;
        // 定义数组保存数字字符
        char[] maxs = new char[ getCounts(arr)[2] ];
        // 循环遍历字符数组，获取其中的数字字符
        for (int i = 0; i < arr.length; i++) {
            if (  arr[i] >= 'A' && arr[i] <= 'Z'  ) {
                maxs[index++] = arr[i];
            }
        }
        return maxs;
    }

    // 定义方法，获取各种字符的个数
    public static int[] getCounts( char[] arr ) {
        // 声明数组 保存个数
        int[] counts = new int[3];
        // 循环判断字符的类型
        for( int i = 0; i < arr.length ;i++ ) {
            if( arr[i] >= '0' && arr[i] <= '9' ) {
                counts[0]++;
            } else if(  arr[i] >= 'a' && arr[i] <= 'z'  ) {
                counts[1]++;
            } else if( arr[i] >= 'A' && arr[i] <= 'Z'  ) {
                counts[2]++;
            }
        }
        return counts;
    }



    // 定义方法，给数组中保存数据
    public static void setArray(char[] arr) {
        // 创建随机数对象
        Random r = new Random();
        for(int i = 0 ; i < arr.length ;i++ ) {
            arr[i] = (char) ( r.nextInt(113) + 33 );
        }
    }
    // 遍历数组，查看其中的数据
    public static void print( char[] arr ) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

}
