import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.chsk.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		
		//CustomerService service = new CustomerServiceImpl();
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerService service = context.getBean("customerService", CustomerService.class);
		System.out.println(service);
		
		CustomerService service2 = context.getBean("customerService", CustomerService.class);
		System.out.println(service2);
		
		System.out.println(service.findAll().get(0).getFirstName());
	}
}
