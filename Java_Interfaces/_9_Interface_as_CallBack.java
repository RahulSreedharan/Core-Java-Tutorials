// Interface as call backs

public class _8_Interface_as_CallBack
{
	public static void main(String[] Args)
	{
		
	}
	
}

interface TextReceiver
{
	void receiveText(String Text);
}

class TickerTape implements TextReceiver
{
	public receiveText(String Text)
	{
		System.out.println("Ticker:\n" + Text + "\n");
	}
}

class TextSource
{
	TextReceiver receiver;
	
	TextSource(TextReceiver r )
	{
		receiver = r;
	}
	
	public void SendText(String S )
	{
		receiver.receiveText(S);
	}
}
