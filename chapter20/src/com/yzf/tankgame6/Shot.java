package com.yzf.tankgame6;

public class Shot implements Runnable{
    int x; //子弹x坐标
    int y; //子弹y坐标
    int direction = 0 ;//子弹方向
    int speed = 4; //子弹速度

   boolean isLive = true;//判断子弹是否存活

    public Shot(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    @Override
    public void run() {//射击
        while(isLive){

            try {
                //让线程休眠 50ms
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //根据方向来改变x，y坐标
            switch (direction){
                case 0://向上
                    y -= speed;
                    break;
                case 1://向下
                    y += speed;
                    break;
                case 2://向左
                    x -= speed;
                    break;
                case 3://向右
                    x += speed;
                    break;
            }
            // System.out.println("子弹 x=" + x + " y=" + y);
            //当子弹移动到面板的边界时,就应该销毁子弹线程
            if (!(x > 0 && x < 1000 && y > 0 && y < 750 && isLive)){
                System.out.println("子弹被销毁");
                isLive = false;
                break;
            }
        }
    }
}
