package com.yzf.map;

import java.util.HashMap;
import java.util.Map;
@SuppressWarnings({"all"})
public class Map_ {
    public static void main(String[] args) {
        Map map = new HashMap();
         //1. Map 与 Collection 并列存在。用于保存具有映射关系的数据:Key-Value(双列元素)
         //2. Map 中的 key 和 value 可以是任何引用类型的数据，会封装到 HashMap$Node 对象中
         //3. Map 中的 key 不允许重复，原因和 HashSet 一样，前面分析过源码.
        // 4. Map 中的 value 可以重复
         //5. Map 的 key 可以为 null, value 也可以为 null ，注意 key 为 null, 第 664页
        // 只能有一个，value 为 null ,可以多个
         //6. 常用 String 类作为 Map 的 key
         //7. key 和 value 之间存在单向一对一关系，即通过指定的 key 总能找到对应的 value
        map.put("No1","C罗");
        map.put("No2","梅西");
        map.put("No3","贝尔");
        map.put("No2","大罗");
        map.put("No5","C罗");
        System.out.println(map);
        System.out.println(map.get("No1"));
        System.out.println(map);
    }
}
