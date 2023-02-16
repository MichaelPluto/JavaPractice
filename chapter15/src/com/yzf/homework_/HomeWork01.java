package com.yzf.homework_;

import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings({"all"})
public class HomeWork01 {
    public static void main(String[] args) {
        News news1 = new News("新闻一", "新冠确诊病例超千万，数百万印度教信徒赴恒河“圣浴”引民众担忧");
        News news2 = new News("新闻二", "男子突然想起两个月前钓的鱼还在网兜中，捞起一看赶紧放生");
        ArrayList list = new ArrayList();
        list.add(news1);
        list.add(news2);
        Collections.reverse(list);
        for (Object o : list) {
            News src = (News) o;
            System.out.println(src.processTitle(src.getContent()));
        }

    }
}
class News {
    private String title;
    private String content;

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "\nNew{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
    public String processTitle(String title){
        if (title == null){
            return "";
        }
        if (title.length() > 15){
            return title.substring(0,15) + "...";
        }else {
            return title;
        }
    }
}
