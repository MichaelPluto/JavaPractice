package com.yzf.set_;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"all"})
public class HashSetStructure {
    public static void main(String[] args) {
        Set set = new HashSet();
        //模拟一个HashSet底层
        //1.创建一个数组，数组类型是 Node[]
        // Node[]就是所谓的 table->表
        Node[] table = new Node[16];
        //创建Node
        Node john = new Node("john", null);
        table[2] = john;
        Node jack = new Node("jack", null);
        john.next = jack;
        Node rose = new Node("rose", null);
        jack.next = rose;
        System.out.println(table);

        Node tom = new Node("tom", null);
        table[3] = tom;
        Node mike = new Node("mike", null);
        tom.next = mike;

    }
}
class Node {
    Object item; // 存放数据
    Node next; // 指向下一个结点

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
}