import redis.clients.jedis.Jedis;

/**
 * 
 * @description: 功能描述 (redis的第一个demo)
 * @copyright: Copyright (c) 2019
 * @company: 昭阳科技
 * @author:
 * @version: 2.0
 * @date: 2019 2019年5月20日 下午4:23:42
 */
public class RedisStringJava {
	public static void main(String[] args) {
		// 连接本地的 Redis 服务
		Jedis jedis = new Jedis("47.94.238.23");
		System.out.println("连接成功");
		// 设置 redis 字符串数据
		jedis.set("key1", "value1");
		// 获取存储的数据并输出
		System.out.println("redis 存储的字符串为: " + jedis.get("key1"));
	}
}
