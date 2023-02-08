package com.yzf.stringbuffer_;

public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello");
        //1.增 append
        s.append(',');
        s.append("张三丰");
        s.append("赵敏").append(100).append(true).append(10.5);
        System.out.println(s);//hello,张三丰赵敏100ture10.5

        //2.删 delete(start,end)
        /*
        删除索引为>=start && end 处的字符
         */
        s.delete(11,14);//[11,14)
        System.out.println(s);

        //3.改 replace(start,end,string)
        //将start---end之间的内容替换成string 不含end
        s.replace(9,11,"周芷若");//[9,11)
        System.out.println(s);//张三丰周芷若true10.5

        //4.查 indexOf
        //查找字串在字符串第一次出现的索引，找不到返回-1
        int indexOf = s.indexOf("张三丰");
        System.out.println(indexOf);//6

        //5.插 insert
        //在索引为9处插入"赵敏"，原来为9处的内容自动后移
        s.insert(9,"赵敏");
        System.out.println(s);

            //6.长度
        System.out.println(s.length());
    }
}
