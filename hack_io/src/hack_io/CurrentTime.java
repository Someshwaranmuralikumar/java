package hack_io;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class CurrentTime 
{
	public static void main(String[] args)
	{
		System.out.format("Now : %tc",System.currentTimeMillis());
		System.out.println();
		SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd	HH:mm:ss:SSS");
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		System.out.println("Now : "+cdt.format(System.currentTimeMillis()));
	}

}
