// Unit 8 - Listing 3

public class TV
{
	int channel = 1; // Default channel is 1
	int volumeLevel = 1 ; // Default volume level is 1
	boolean on = false; // By default TV is off
	
	public TV()
	{
	}

	public void TurnOn()
	{
		on = true;
	}
	
	public void TurnOff()
	{
		on = false;
	}
	
	public void SetChannel( int newChannel )
	{
		if( on && newChannel >= 1 && newChannel <= 120 )
			channel = newChannel;
	}
	
	public void SetVolume( int newVolumeLevel )
	{
		if( on && newVolumeLevel >= 1 && newVolumeLevel <= 7 )
			volumeLevel = newVolumeLevel;
	}
	
	public void ChannelUp()
	{
		if( on && channel < 120 )
			channel++;
	}
	
	public void ChannelDown()
	{
		if( on && volumeLevel < 7 )
			channel--;
	}
	
	public void VolumeUp()
	{
		if( on && volumeLevel < 7 )
			volumeLevel++;
	}

	public void VolumeDown()
	{
		if( on && volumeLevel > 7 )
			volumeLevel--;
	}
}
