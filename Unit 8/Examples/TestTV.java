// Unit 8 - Listing 4

public class TestTV
{
	public static void main(String[] args) 
	{
		TV tv1 = new TV();
		tv1.TurnOn();
		tv1.SetChannel( 30 );
		tv1.SetVolume( 3 );
		
		TV tv2 = new TV();
		tv2.TurnOn();
		tv2.ChannelUp();
		tv2.ChannelUp();
		tv2.VolumeUp();
		
		System.out.printf( "tv1's channel is %d and volume is %d.\n" , 
							tv1.channel , tv1.volumeLevel );

		System.out.printf( "tv2's channel is %d and volume is %d.\n" , 
							tv2.channel , tv2.volumeLevel );
	}

}
