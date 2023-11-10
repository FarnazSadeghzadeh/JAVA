

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdatajpa1.Product;

@Service
public class ProductServ {
    @Autowired
    productRepository ProductRepository;
    @Transactional
    public void save(Product product){
        productRepository.save(product);
    }
}
