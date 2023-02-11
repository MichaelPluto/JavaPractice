class NQueens {
    int[] result; //存储八皇后的位置结果

    public NQueens() {
        result = new int[8];
    }

    public void cal8queens(int row) {
        if (row == 8) { //8个皇后都已经找到了位置，输出结果
            printQueens(result);
            return;
        }
        for (int column = 0; column < 8; ++column) {
            if (isOk(row, column)) {
                result[row] = column; //第row行的皇后放到了column列
                cal8queens(row + 1);
            }
        }
    }

    private boolean isOk(int row, int column) {
        int leftUp = column - 1, rightUp = column + 1;
        for (int i = row - 1; i >= 0; --i) {
            if (result[i] == column) return false; //第i行的皇后在同一列
            if (leftUp >= 0) {
                if (result[i] == leftUp) return false; //左上方有皇后
                --leftUp;
            }
            if (rightUp < 8) {
                if (result[i] == rightUp) return false; //右上方有皇后
                ++rightUp;
            }
        }
        return true;
    }

    private void printQueens(int[] result) {
        for (int row = 0; row < 8; ++row) {
            for (int column = 0; column < 8; ++column) {
                if (result[row] == column) System.out.print("Q ");
                else System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NQueens queens = new NQueens();
        queens.cal8queens(0);
    }
}
