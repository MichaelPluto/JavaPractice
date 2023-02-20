package com.yzf.tankgame3;

import java.util.Vector;

public class EnemyTank extends Tank {
    public EnemyTank(int x, int y) {
        super(x, y);
    }
    Vector<Shot> shots = new Vector<>();// 使用Vector 保存多个Shot
}
