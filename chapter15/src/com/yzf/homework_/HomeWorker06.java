package com.yzf.homework_;

import java.util.HashSet;
import java.util.Objects;

public class HomeWorker06 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Person p1 = new Person(1001, "AA");
        Person p2 = new Person(1002, "BB");
        set.add(p1);
        set.add(p2);
        p1.name = "CC";
        set.remove(p1);
        /*
        此时p1的name被改为"CC",因此set.remove按照 1001，"CC" 去寻找新的hash值
            此时的hash值不等于原来的hash值，所以会找到一个null，因此删不掉
         */
        System.out.println(set);
        set.add(new Person(1001,"CC"));
        /*
        因为1001 + "CC"的hash值索引位置上为null，所以会直接加入
         */
        System.out.println(set);
        set.add(new Person(1001,"AA"));
        /*
        因为原 AA 被改为 CC后，仍然在原来的索引位置上，此时添加的 新AA 也找到该索引位置，与之进行比较
            因为 AA != CC 所以新AA会加入并挂在原AA后面
         */
        System.out.println(set);
    }
}
class Person{
    public int id;
    public String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

}
