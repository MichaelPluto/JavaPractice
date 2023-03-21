package com.yzf.dao.dao;

import com.yzf.dao.domain.Actor;
import com.yzf.dao.domain.Goods;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * 测试ActorDAO 对 Actor表的crud操作
 */
public class TestDAO {
   @Test
    public void testActorDAO(){
        ActorDAO actorDAO = new ActorDAO();
        List<Actor> actors = actorDAO.queryMulti("select * from actor where id >= ?", Actor.class, 1);
        System.out.println("查询结果");
        for (Actor actor : actors) {
            System.out.println(actor);
        }

       System.out.println("查询单行记录");
       Actor actor = actorDAO.querySingle("select * from actor where id = ?", Actor.class, 2);
       System.out.println(actor);

       System.out.println("查询单行单列记录");
       Object obj = actorDAO.queryScalar("select name from actor where id = ?", 5);
       System.out.println(obj);

       System.out.println("增删改操作");
       int update1 = actorDAO.update("update actor set name = '马云' where id = ?", 5);
       System.out.println(update1);

       int update2 = actorDAO.update("insert into actor values(null,'马化腾','男','1999-9-18','144')");
       System.out.println(update2);

       int update3 = actorDAO.update("delete from actor where id = ?", 2);
       System.out.println(update3);
   }

   @Test
   public void add(){
       GoodsDAO goodsDAO = new GoodsDAO();
       int phone1 = goodsDAO.update("insert into Goods values(null,'华为手机',2000)");
       int phone2 = goodsDAO.update("insert into Goods values(null,'苹果手机',3000)");
       int phone3 = goodsDAO.update("insert into Goods values(null,'小米手机',2000)");
       int phone4 = goodsDAO.update("insert into Goods values(null,'vivo手机',1000)");

   }

   @Test
   public void selectGoods(){
       GoodsDAO goodsDAO = new GoodsDAO();
       List<Goods> goods = goodsDAO.queryMulti("select * from Goods where id >= ?", Goods.class, 1);
       System.out.println(goods);
   }
}
