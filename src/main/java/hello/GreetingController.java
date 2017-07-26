package hello;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dao.IClientRepository;
import model.Client;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    
    @Autowired
    IClientRepository clientRepository;
    
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    
    @RequestMapping("/add")
    public Greeting add(
    		@RequestParam(value="numa", defaultValue="1") int numa,
    		@RequestParam(value="numb", defaultValue="1") int numb) {
        
    	int a = numa+numb; 
    	return new Greeting(counter.incrementAndGet(),
                            String.format(template, ""+a));
    }
    
    
    @RequestMapping("/search")
    public Greeting search(
    		@RequestParam(value="numa", defaultValue="1") int numa,
    		@RequestParam(value="numb", defaultValue="1") int numb) {
        
    	List<Client> list = clientRepository.findAll();
    	for (Client customer : list) {
            System.out.println(customer);
        }
    	
    	int a = list.size(); 
    	return new Greeting(counter.incrementAndGet(),
                            String.format(template, ""+a));
    }
}
