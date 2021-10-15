package Test_Jedis.test_Jedis;

import redis.clients.jedis.Jedis;

public class testJedis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jedis jedis = new Jedis("localhost");
		jedis.set("foo", "lala");
		String value = jedis.get("foo");
		System.out.print(value);
	}

}
