

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.example.springdatajpa1.Product;
import com.example.springdatajpa1.ProductServ;

@Service
public class Run implements CommandLineRunner {
    @Autowired
    ProductServ productServ;
    @Override
    public void run(String... args) throws Exception {
        Product product=new Product();
        product.setId(2332);
        product.setname("printer");
        product.setreleaseMonth("October");
        product.save(product);

    }
}
