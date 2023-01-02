package com.yzf.poly_.polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack",22);
        persons[1] = new Student("杨质飞", 22, 99.8);
        persons[2] = new Student("刘芮", 21, 98.8);
        persons[3] = new Teacher("王港", 35, 8500);
        persons[4] = new Teacher("韩信", 65, 25000);
        for (int i = 0; i < persons.length; i++) {
            //persons[i].say();  动态绑定 随着i的变化 persons的运行类型发生改变，则方法调用的对象也发生改变
            if(persons[i] instanceof Student){
                ((Student)persons[i]).study();
            }else if(persons[i] instanceof Teacher){
                ((Teacher)persons[i]).teach();
            }else if(persons[i] instanceof Person) {

            }else {
                System.out.println("类型有误");
            }
            System.out.println(persons[i].say());
            }


        }

    }


