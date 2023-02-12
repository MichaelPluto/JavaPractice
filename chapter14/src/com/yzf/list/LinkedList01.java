package com.yzf.list;

public class LinkedList01 {
    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node yzf = new Node("杨质飞");

        jack.next = tom;
        tom.next = yzf;
        yzf.pre = tom;
        tom.pre = jack;

        Node first = jack;
        Node last = yzf;
        //正序遍历输出
        while (true){
            if (first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        System.out.println("=======");
        //倒叙遍历输出
        while (true){
            if (last == null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }

        //在tom 和 yzf 之间再加一个节点 mike
        Node mike = new Node("mike");
        tom.next = mike;
        mike.next = yzf;
        yzf.pre = mike;
        mike.pre = tom;

        first = jack;
        last = yzf;
        System.out.println("添加后");
        //正序遍历
        while (true){
            if (first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        System.out.println("=====");
        //倒叙遍历
        while (true){
            if (last == null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }
    }
}
class Node {
    public Object item;//数据主题
    public Node next;//指向下一个节点
    public Node pre;//指向上一个节点

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name = " + item;
    }
}