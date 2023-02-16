package com.yzf.customgeneric_.homework_;

import java.util.*;

public class DAO <T> {
    private Map<String,T> map = new HashMap<>();
    public void save(String id,T entity){
        //保存 T类型对象到Map变量中
        map.put(id,entity);
    }
    public T get(String id){
        //从Map中获取id对应的对象
        return map.get(id);
    }
    public void update(String id,T entity){
        //替换map中key为id的内容，改为entity对象
        map.put(id,entity);
    }
    public List<T> list(){
        //返回map中存放的所以T对象
        //要先遍历,返回类型为list，所以new 一个 ArrayList 的list用于接收返回值
        List <T> list = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            list.add(map.get(key));
        }
        return list;
    }
    public void delete(String id){
        //删除指定id对象
        map.remove(id);
    }
}
