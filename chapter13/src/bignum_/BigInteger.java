package bignum_;

public class BigInteger {
    public static void main(String[] args) {
        java.math.BigInteger bigInteger = new java.math.BigInteger("8754654854654874");
        java.math.BigInteger bigInteger1 = new java.math.BigInteger("54879864234");
        System.out.println(bigInteger);
        //对BigInteger 进行加减乘除操作时候，需要使用对应的方法
        //加
        System.out.println(bigInteger.add(bigInteger1));
        //减
        System.out.println(bigInteger.subtract(bigInteger1));
        //乘
        System.out.println(bigInteger.multiply(bigInteger1));
        //除
        System.out.println(bigInteger.divide(bigInteger1));
    }
}
