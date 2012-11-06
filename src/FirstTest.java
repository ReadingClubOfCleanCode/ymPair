import static org.junit.Assert.*;

import org.junit.Test;


public class FirstTest {

	@Test
	public void test() {
		CoinCounter coinCounter = new CoinCounter();
		int coin[] = { 10, 20, 30, 40, 50, 2 };
		
		coinCounter.setCoins( coin );
		coinCounter.setPrice( 500 );
		assertEquals( coinCounter.toString(), new String("1(500�~��1���̍��v1��)") );
	}
	
	@Test
	public void test2()
	{
		CoinCounter coinCounter = new CoinCounter();
		int coin[] = { 1000, 1, 1, 1, 1, 1 };
		
		coinCounter.setCoins(coin);
		coinCounter.setPrice(700);
		System.out.println(coinCounter.toString());
		assertEquals( coinCounter.toString(), new String("40(500�~��1���A100�~��1���A50�~��1���A10�~��1���A5�~��1���A1�~��35���̍��v40��)") );
	}
	
	@Test
	public void test3()
	{
		CoinCounter coinCounter = new CoinCounter();
		int coin[] = { 10, 20, 30, 40, 50, 2 };
		
		coinCounter.setCoins(coin);
		coinCounter.setPrice(0);
		assertEquals( coinCounter.toString(), new String("0(���v0��)") );
	}
	
	@Test
	public void test4()
	{
		CoinCounter coinCounter = new CoinCounter();
		int coin[] = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000 };
		
		coinCounter.setCoins(coin);
		coinCounter.setPrice(1000);
		assertEquals( coinCounter.toString(), new String("2(500�~��2���̍��v2��)") );
	}
	
	@Test
	public void test5()
	{
		CoinCounter coinCounter = new CoinCounter();
		int coin[] = { 1000000001, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000 };
		
		coinCounter.setCoins(coin);
		coinCounter.setPrice(1000);
		assertEquals( coinCounter.toString(), new String("�d�݂̖������s��") );
	}
	
	@Test
	public void test6()
	{
		CoinCounter coinCounter = new CoinCounter();
		int coin[] = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000 };
		
		coinCounter.setCoins(coin);
		coinCounter.setPrice(1000000000);
		assertEquals( coinCounter.toString(), new String("2000000(500�~��2000000���̍��v2000000��)") );
	}
}
