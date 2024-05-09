package slips;
import java.util.Date;
import java.text.SimpleDateFormat;
public class date {

	public static void main(String[] args)
	{
		SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
		Date date=new Date();
		String pat1=sdf1.format(date);
		System.out.println("current date is :"+pat1);

		SimpleDateFormat sdf2=new SimpleDateFormat("mm-dd-yyyy");
		String pat2=sdf2.format(date);
		System.out.println("current date is:"+pat2);
		
		SimpleDateFormat sdf3=new SimpleDateFormat("EEEEE MMMMM dd yy");
		String pat3=sdf3.format(date);
		System.out.println("current date is:"+pat3);
	}

}
