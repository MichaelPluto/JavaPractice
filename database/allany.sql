-- 子查询当作临时表使用
-- 查询ecshop中各个类别中 价格最高的商品
#查询到各类别中价格最高的商品，作为一个子表
SELECT cat_id,MAX(shop_price)
	FROM ecs_goods
	GROUP BY cat_id
#按找规定查询 作为主表
SELECT goods_id, cat_id, goods_name, shop_price
	FROM ecs_goods
#最后结果
SELECT goods_id, temp.cat_id /*这里需要指明是哪个表的cat_id*/, goods_name, shop_price
	FROM(
	SELECT cat_id,MAX(shop_price) AS max_price
	FROM ecs_goods
	GROUP BY cat_id
	) temp /*别名*/,ecs_goods
	WHERE temp.cat_id = ecs_goods.cat_id 
	AND temp.max_price = ecs_goods.shop_price



