package com.yzf.inputstream;

import java.io.Serializable;

public class Dog implements Serializable{
        private String name;
        private int age;
        private static final long serialVersionUID = 1l;//提高版本兼容性
        private Master master = new Master();
        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

