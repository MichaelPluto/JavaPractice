package bignum_;

public class BigDecimal {
    public static void main(String[] args) {
        java.math.BigDecimal bigDecimal = new java.math.BigDecimal("19996.3234545");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal("3.2");
        System.out.println(bigDecimal);
        System.out.println(bigDecimal1);
        //加减乘除

        //加
        System.out.println(bigDecimal.add(bigDecimal1));
        //减
        System.out.println(bigDecimal.subtract(bigDecimal1));
        //乘
        System.out.println(bigDecimal.multiply(bigDecimal1));
        //除
        //System.out.println(bigDecimal.divide(bigDecimal1));//可能会抛出异常
        //解决办法
        System.out.println(bigDecimal.divide(bigDecimal1));//在divide方法后 + BigDecimal.ROUND_CEILING
    }
}
