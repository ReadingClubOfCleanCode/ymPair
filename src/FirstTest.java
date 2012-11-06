import static org.junit.Assert.*;

import org.junit.Test;


public class FirstTest {

	@Test
	public void test() {
		CoinCounter coinCounter = new CoinCounter();
		int coin[] = { 10, 20, 30, 40, 50, 2 };
		
		coinCounter.setCoins( coin );
		coinCounter.setPrice( 500 );
		assertEquals( coinCounter.toString(), new String("1(500â~ã 1ñáÇÃçáåv1ñá)") );
	}
	
	@Test
	public void test2()
	{
		CoinCounter coinCounter = new CoinCounter();
		int coin[] = { 1000, 1, 1, 1, 1, 1 };
		
		coinCounter.setCoins(coin);
		coinCounter.setPrice(700);
		System.out.println(coinCounter.toString());
		assertEquals( coinCounter.toString(), new String("40(500â~ã 1ñáÅA100â~ã 1ñáÅA50â~ã 1ñáÅA10â~ã 1ñáÅA5â~ã 1ñáÅA1â~ã 35ñáÇÃçáåv40ñá)") );
	}
	
	@Test
	public void test3()
	{
		CoinCounter coinCounter = new CoinCounter();
		int coin[] = { 10, 20, 30, 40, 50, 2 };
		
		coinCounter.setCoins(coin);
		coinCounter.setPrice(0);
		assertEquals( coinCounter.toString(), new String("0(çáåv0ñá)") );
	}
	
	@Test
	public void test4()
	{
		CoinCounter coinCounter = new CoinCounter();
		int coin[] = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000 };
		
		coinCounter.setCoins(coin);
		coinCounter.setPrice(1000);
		assertEquals( coinCounter.toString(), new String("2(500â~ã 2ñáÇÃçáåv2ñá)") );
	}
	
	@Test
	public void test5()
	{
		CoinCounter coinCounter = new CoinCounter();
		int coin[] = { 1000000001, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000 };
		
		coinCounter.setCoins(coin);
		coinCounter.setPrice(1000);
		assertEquals( coinCounter.toString(), new String("çdâ›ÇÃñáêîÇ™ïsê≥") );
	}
	
	@Test
	public void test6()
	{
		CoinCounter coinCounter = new CoinCounter();
		int coin[] = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000 };
		
		coinCounter.setCoins(coin);
		coinCounter.setPrice(1000000000);
		assertEquals( coinCounter.toString(), new String("2000000(500â~ã 2000000ñáÇÃçáåv2000000ñá)") );
	}
}
