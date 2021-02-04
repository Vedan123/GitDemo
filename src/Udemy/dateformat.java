package Udemy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateformat {

	public static void main(String[] args) {
		
		
		Date d =new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(sdf.format(d));
		System.out.println("vedan");
		System.out.println("vedan1");
		
		System.out.println("vedan2");
		System.out.println("vedan3");
		
		System.out.println("vedan4");
		System.out.println("vedan5");

	}

}
