
public class CoinCounter {
	final static int valid = 0;
	final static int invalid = 1;
	private Amount price = new Amount();
	private Coin data = new Coin();

	public CoinCounter()
	{
		data.stockCoins = new int[6];
		initializeAttribute();
	}

	private void initializeAttribute() {
		for(int coinIndex = 0; coinIndex < data.stockCoins.length; coinIndex++){
			data.stockCoins[coinIndex] = 0;			
		}
		data.coinsCountInvalid = valid;
	}
	
	public String toString()
	{
		int workPrice = price.price;
		int[] coinsCount = {0,0,0,0,0,0}; // 1,5,10,50,100,500
		int totalCoinCount;
		
		if( data.coinsCountInvalid == invalid )
		{
			return new String( "d‰Ý‚Ì–‡”‚ª•s³" );
		}
		
		getCoinsCount(workPrice, coinsCount);
//		getCoinsCount(coinsCount);
		totalCoinCount = totalCoinCount(coinsCount);
		
		return new String( totalCoinCount + getAdditionalString( coinsCount, totalCoinCount ));
	}

	private int totalCoinCount(int[] coinsCount) {
		int totalCoinCount = 0;
		
		for(int coinIndex = 0; coinIndex < 6; coinIndex++)
		{
			totalCoinCount += coinsCount[coinIndex]; 
		}
		return totalCoinCount;
	}
	
	// (500‰~‹Ê1–‡A100‰~‹Ê1–‡A50‰~‹Ê1–‡A10‰~‹Ê1–‡A5‰~‹Ê1–‡A1‰~‹Ê35–‡‚Ì‡Œv40–‡j
	private String getAdditionalString( int[] coinsCount, int totalCount )
	{
		StringBuffer stringBuffer = new StringBuffer();
		int[] coinTable = { 1, 5, 10, 50, 100, 500};
		
		for (int coinIndex = 5; coinIndex >= 0; coinIndex--)
		{
			if(coinsCount[coinIndex] != 0)
			{
				if(coinIndex != 5)
				{
					stringBuffer.append("A");
				}
				stringBuffer.append(
						String.valueOf(coinTable[coinIndex]) + "‰~‹Ê"
							+ coinsCount[coinIndex] + "–‡");
			}
		}
		if(totalCount != 0)
		{
			stringBuffer.append("‚Ì");
		}
		stringBuffer.append("‡Œv" + totalCount + "–‡");
		return "(" + stringBuffer.toString() + ")";
	}
	
	private void getCoinsCount(int workPrice, int[] coinsCount) {
//	private void getCoinsCount(int[] coinsCount) {
		int coinCount;
		int[] coinTable = { 1,5,10,50,100,500};
		for( int i = 5; i >= 0; i-- )
		{
			for(coinCount = 0;
					(coinCount < data.stockCoins[i]) && (workPrice >= coinTable[i]);
					coinCount++)
			{
				coinsCount[i]++;
				workPrice = workPrice - coinTable[i];			
			}
		}
	}
	
	public void setCoin( int[] coin )
	{
		for( int i = 0; i < 6; i ++ )
		{
			if( 0 <= coin[i] && coin[i] <= 1000000000 )
			{
				data.stockCoins[i] = coin[i];
			}
			else
			{
				data.coinsCountInvalid = invalid;
			}
		}
	}
	
	public void setPrice( int price )
	{
		this.price.price = price;
	}
}
