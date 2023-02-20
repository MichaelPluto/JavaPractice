package com.yzf.tankgame4;

import com.sun.javaws.exceptions.ExitException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

//坦克大战的绘图区域
@SuppressWarnings({"all"})
public class MyPanel extends JPanel implements KeyListener, Runnable {
    //定义我的坦克
    Hero hero = null;
    //定义敌方坦克,因为敌方坦克数量不确定，所以将其放入一个集合 Vector中
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemySize = 3;
    //定义一个Vector存放炸弹对象,当子弹击中坦克时，就加入Bomb对象到bombs集合中
    Vector<Bomb> bombs = new Vector<>();
    //定义三张炸弹图片用于显示爆炸
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    //控制我方坦克移动范围
    public void heroMove() {
        if (hero.getX() > 1000 && hero.getX() < 0 && hero.getY() > 750 && hero.getY() < 0) {
            hero.move = false;
        }
    }

    public MyPanel() {// 构造器
        hero = new Hero(500, 100);//初始化坦克
        hero.setSpeed(4);

        //初始化敌方坦克，循环加入敌方坦克入集合中
        for (int i = 0; i < enemySize; i++) {
            //在面板中创建敌方坦克对象，并确定位置
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
            //设置方向
            enemyTanks.add(enemyTank);
            enemyTank.setDirection(1);
            //启动敌人坦克线程，让他动起来
            new Thread(enemyTank).start();
            //每当创建一个坦克对象，就给该对象初始化一个Shot对象，并存入Verctor中
            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirection());
            enemyTank.shots.add(shot);//存入集合中
            new Thread(shot).start();// 启动子弹线程
        }

        //初始化图片对象
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.gif"));
    }

    @Override
    public void paint(Graphics g) {
        //在此区域绘制坦克
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//默认黑色
        //将绘制坦克封装成一个方法，再调用即可
        //drawTank(hero.getX(), hero.getY(), g, 0, hero.getDirection());
        if (hero != null && hero.isLive == true) {
            drawTank(hero.getX(), hero.getY(), g, 0, hero.getDirection());
        }
        //绘制敌方坦克，遍历Vector
        for (int i = 0; i < enemyTanks.size(); i++) {
            //取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            //判断当前坦克是否还存活
            if (enemyTank.isLive) {//当敌人坦克时存活的，才画
                //enemyTank.setDirection(1);
                drawTank(enemyTank.getX(), enemyTank.getY(), g, 1, enemyTank.getDirection());
                //遍历敌方坦克对象时，绘制所有的子弹，当子弹 isLive == false 时，就从Vector中移除
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    //取出子弹
                    Shot shot = enemyTank.shots.get(j);
                    //绘制
                    if (!(shot.isLive())) {
                        enemyTank.shots.remove(j);
                    }
                    g.setColor(Color.cyan);
                    g.fill3DRect(shot.x, shot.y, 3, 3, false);
                }
            }
        }

        //将hero的子弹集合shots遍历取出绘制
        //绘制子弹
        for (int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
            if (shot != null && shot.isLive() != false) {
                g.setColor(Color.PINK);
                g.fill3DRect(shot.x, shot.y, 3, 3, false);

            } else {// 如果该shot对象已经无效，就移除
                hero.shots.remove(shot);
            }
        }

        //如果bombs集合中有对象，就画出
        for (int i = 0; i < bombs.size(); i++) {
            try {
                Thread.sleep(60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Bomb bomb = bombs.get(i);
            //根据当前的bomb对象的life值 去画出相应的图片
            if (bomb.life > 6) {
                g.drawImage(image1, bomb.x, bomb.y, 60, 60, this);
            } else if (bomb.life > 3) {
                g.drawImage(image2, bomb.x, bomb.y, 60, 60, this);
            } else {
                g.drawImage(image3, bomb.x, bomb.y, 60, 60, this);
            }
            //让炸弹的生命值减少
            bomb.lifeDown();
            //如果bomb.life 为0 时，就从集合中删除
            if (bomb.life == 0) {
                bombs.remove(bomb);
            }
        }
    }


    //画出坦克-封装方法
    public void drawTank(int x, int y, Graphics g, int type, int direction) {
        switch (type) {
            case 0://自己的坦克
                //改变画笔的颜色，用于区分敌我坦克
                g.setColor(Color.PINK);
                break;
            case 1://敌人的坦克
                g.setColor(Color.cyan);
                break;
            default:
                System.out.println("输入错误");
        }
        switch (direction) {
            case 0://方向向上
                g.fill3DRect(x, y, 10, 60, false);//左轮
                g.fill3DRect(x + 30, y, 10, 60, false);//右轮
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//主体
                g.fillOval(x + 10, y + 20, 20, 20);//盖子
                g.drawLine(x + 20, y + 30, x + 20, y);//炮筒

                break;
            case 1: //表示向下
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);//画出圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60);//画出炮筒
                break;
            case 2: //表示向左
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);//画出圆形盖子
                g.drawLine(x + 30, y + 20, x, y + 20);//画出炮筒
                break;
            case 3: //表示向右
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);//画出圆形盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20);//画出炮筒
                break;

            default:
                System.out.println("暂时不处理");
        }
    }

    //控制敌方坦克移动范围
    public void enemyMove() {
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            if (enemyTank.getX() > 1000 && enemyTank.getX() < 0
                    && enemyTank.getY() > 750 && enemyTank.getY() > 0) {
                enemyTank.move = false;
            }
        }
    }

    //编写方法，判断我方子弹是否击中敌方坦克
    public void hitEnemyTank() {
        for (int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
            if (shot != null && shot.isLive) {//当我的子弹还存活时

                //遍历敌人所有的坦克
                for (int j = 0; j < enemyTanks.size(); j++) {
                    //取出坦克
                    EnemyTank enemyTank = enemyTanks.get(j);
                    hitTank(shot, enemyTank);//将子弹和敌方坦克对象传入方法中
                }

            }
        }
    }

    //编写方法，判断敌方子弹是否击中我方坦克
    public void hitHero() {
        //遍历所有的敌人坦克
        for (int i = 0; i < enemyTanks.size(); i++) {
            //取出敌人坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            //遍历enemyTank对象里所有的子弹
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                //取出所有子弹
                Shot shot = enemyTank.shots.get(j);
                //判断是否击中我方坦克
                if (hero.isLive && shot.isLive) {
                    hitTank(shot, hero);
                }
            }
        }
    }

    //编写方法，判断我方的子弹是否击中敌人坦克
    //什么时候判断 我方子弹是否击中别人？ run方法
    public void hitTank(Shot shot, Tank Tank) {
        switch (Tank.getDirection()) {
            case 0://向上
            case 1://向下
                if (shot.x > Tank.getX() && shot.x < Tank.getX() + 40
                        && shot.y > Tank.getY() && shot.y < Tank.getY() + 60) {
                    shot.isLive = false;
                    Tank.isLive = false;
                    enemyTanks.remove(Tank);
                    //创建Bomb对象，加入到bombs集合中
                    Bomb bomb = new Bomb(Tank.getX(), Tank.getY());
                    bombs.add(bomb);
                }
                break;
            case 2://向左
            case 3://向右
                if (shot.x > Tank.getX() && shot.x < Tank.getX() + 60
                        && shot.y > Tank.getY() && shot.y < Tank.getY() + 40) {
                    shot.isLive = false;
                    Tank.isLive = false;
                    enemyTanks.remove(Tank);
                    Bomb bomb = new Bomb(Tank.getX(), Tank.getY());
                    bombs.add(bomb);
                }
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
//        for (int i = 0; i < enemyTanks.size(); i++) {
//            EnemyTank enemyTank = enemyTanks.get(i);
//            if (e.getKeyCode() == KeyEvent.VK_S){
//                enemyTank.setDirection(1);
//                enemyTank.moveDown();
//            }else if (e.getKeyCode() == KeyEvent.VK_W){
//                enemyTank.setDirection(0);
//                enemyTank.moveUp();
//            }else if (e.getKeyCode() == KeyEvent.VK_A){
//                enemyTank.setDirection(2);
//                enemyTank.moveLeft();
//            }else if (e.getKeyCode() == KeyEvent.VK_D){
//                enemyTank.setDirection(3);
//                enemyTank.moveRight();
//            }
//
//        }
        //为了方便移动坦克,将坐标 x y 变换封装成方法move()

        //根据用户按下的不同键，来处理坦克的移动(上下左右的键)
        if (e.getKeyCode() == KeyEvent.VK_W) {
            hero.setDirection(0);
            if (hero.getY() > 0) {
                hero.moveUp();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirection(1);
            if (hero.getY() + 60 < 750) {
                hero.moveDown();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirection(2);
            if (hero.getX() > 0) {
                hero.moveLeft();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirection(3);
            if (hero.getX() + 60 < 1000) {
                hero.moveRight();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_J) {
//            if (hero.shot == null || !hero.shot.isLive) {
            hero.fire();
//            }
        }
        //改变值后必须重新绘制
        heroMove();
        if (hero.move == true) {
            this.repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    //将重绘子弹作为线程单独运行，每隔 100毫秒，重绘区域
    public void run() {
        while (true) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //判断是否击中了敌人坦克
            hitEnemyTank();
            //判断敌人是否击中我方坦克
            hitHero();
            this.repaint();
        }
    }
}
