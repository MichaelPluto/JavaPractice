-- 演示数学相关函数
-- ABS(num) 绝对值
SELECT ABS(-9) FROM DUAL
-- BIN (decimal_number )十进制转二进制
SELECT BIN(10) FROM DUAL
-- CEILING (number2 ) 向上取整, 得到比 num2 大的最小整数
 SELECT CEILING(2.8) FROM DUAL
SELECT CEILING(-2.8) FROM DUAL
-- CONV(number2,from_base,to_base) 进制转换
-- 下面的含义是 8 是十进制的 8, 转成 2 进制输出
 SELECT CONV(8,10,2) FROM DUAL
-- 下面的含义是 8 是 16 进制的 8, 转成 2 进制输出
 SELECT CONV(8,16,2) FROM DUAL
-- FLOOR (number2 ) 向下取整,得到比 num2 小的最大整数
SELECT FLOOR(-2.3) FROM DUAL
-- FORMAT (number,decimal_places ) 保留小数位数(四舍五入)
SELECT FORMAT(78.21312312,3) FROM DUAL --78.213
-- HEX (DecimalNumber ) 转十六进制
SELECT HEX(12) FROM DUAL
-- LEAST (number , number2 [,..]) 求最小值
SELECT LEAST(9,2) FROM DUAL
-- MOD (numerator ,denominator ) 求余
SELECT MOD(10,3) FROM DUAL
-- RAND([seed]) RAND([seed]) 返回随机数 其范围为 0 ≤ v < 1.0
-- 1. 如果使用 rand() 每次返回不同的随机数 ，在 0 ≤ v < 1.0
SELECT RAND() FROM DUAL
-- 2. 如果使用 rand(seed) 返回随机数, 范围 0 ≤ v < 1.0, 如果 seed 不变，
-- 该随机数也不变了
SELECT RAND(3) FROM DUAL