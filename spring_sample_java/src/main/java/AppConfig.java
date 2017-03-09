import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"com.chsk"})
@PropertySource("app.properties")
public class AppConfig {
	
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	/*@Bean(name="customerService")
	public CustomerService getCustomerService(){
		//CustomerServiceImpl serviceImpl = new CustomerServiceImpl(getCustomerRepository());
		CustomerServiceImpl serviceImpl = new CustomerServiceImpl();
		//serviceImpl.setCustomerRepository(getCustomerRepository());
		return serviceImpl;
	}*/
	
	/*@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository(){
		return new HibernateCustomerRepositoryImpl();
	}*/
}
