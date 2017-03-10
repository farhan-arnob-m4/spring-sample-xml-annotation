import com.metafourarnob.service.CustomerService;
import com.metafourarnob.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();
		System.out.println(customerService.findAll().get(0).getFirstName());

	}

}
