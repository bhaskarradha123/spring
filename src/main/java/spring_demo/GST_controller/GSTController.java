package spring_demo.GST_controller;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_demo.GST_dto.DelhiGst;
import spring_demo.GST_dto.Good_Service;
import spring_demo.GST_dto.KarGST;
import spring_demo.GST_dto.TnGST;

public class GSTController {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("gst.xml");
//		Good_Service gst=context.getBean("kar",KarGST.class);
//		gst.calculate();
		
//		Good_Service gst=context.getBean("tn",TnGST.class);
//		gst.calculate();

		Good_Service gst=context.getBean("delhi",DelhiGst.class);	
		gst.calculate();
	}
}
