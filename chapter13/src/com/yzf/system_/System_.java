package com.yzf.system_;

import java.util.Arrays;

public class System_ {
    public static void main(String[] args) {
        //1.exit 退出当前程序
//        System.out.println("ok1");
//        System.exit(0);//0表示一个正常的状态
//        System.out.println("ok2");
        //2.arraycopy 复制数组元素
        int[] src ={1, 2, 3};
        int[] dest = new int[3];//dest[] = {0, 0, 0}
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));
        //3.currentTimeMillis
        System.out.println(System.currentTimeMillis());
        //4.gc 运行垃圾回收机制
        System.gc();
    }
}
