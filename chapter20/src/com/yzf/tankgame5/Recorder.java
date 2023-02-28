package com.yzf.tankgame5;

import java.io.*;
import java.util.Vector;

/**
 * 该类记录相关信息 和文件交互
 */
public class Recorder {
    //定义变量，记录我方击毁敌人坦克数
    private static int allEnemyTankNum = 0;
    //定义IO对象,准备写数据到文件中
    private static FileWriter fw = null;
    private static BufferedWriter bw = null;
    private static BufferedReader br = null;
    private static String recordFile = "d:\\record.txt";
    //创建一个成员，指向MyPanel中的 Vector<EnemyTank>
    private static Vector<EnemyTank> enemyTanks = null;
    //定义一个Node 的 Vector，用于保存敌人信息的node
    private static Vector<MyNode> myNodes = new Vector<>();
    public static Vector<EnemyTank> getEnemyTanks() {
        return enemyTanks;
    }
    //增加一个方法，用于读取recordFile,恢复相关信息
    //该方法在启动游戏时调用
    public static Vector<MyNode> getNodesAndEnemyTankRec() {

        try {
            br = new BufferedReader(new FileReader(recordFile));
            //循环读取文件，生成nodes 集合
            String line = "";//255 40 0
            allEnemyTankNum = Integer.parseInt(br.readLine());
            while ((line = br.readLine()) != null) {
                String[] xyd = line.split(" ");
                MyNode myNode = new MyNode(Integer.parseInt(xyd[0]), Integer.parseInt(xyd[1]),
                        Integer.parseInt(xyd[2]));
                myNodes.add(myNode);//放入nodes Vector
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return myNodes;
        }
    }
    public static void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        Recorder.enemyTanks = enemyTanks;
    }

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    public static void setAllEnemyTankNum(int allEnemyTankNum) {
        Recorder.allEnemyTankNum = allEnemyTankNum;
    }

    public static void add(){
        Recorder.allEnemyTankNum ++;
    }

    //当游戏关闭时，记录当前摧毁坦克的数量到 d:\record 中
    public static void saveAllEnemyTankNum(){
        try {
            bw = new BufferedWriter(new FileWriter(recordFile));
            bw.write(allEnemyTankNum +"\t\n");
            //记录存活坦克的坐标和方向
            for (int i = 0; i < enemyTanks.size(); i++) {
                EnemyTank enemyTank = enemyTanks.get(i);
                if (enemyTank.isLive){
                    //保存该enemyTank信息
                    String record = enemyTank.getX() + " " + enemyTank.getY() + " " + enemyTank.getDirection();
                    //写入文件中
                    bw.write(record + "\t\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
