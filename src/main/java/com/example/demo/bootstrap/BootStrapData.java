package com.example.demo.bootstrap;


import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;
    private final InhousePartRepository inhousePartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
        this.inhousePartRepository = inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */

        if(partRepository.count() == 0) {
            OutsourcedPart graphicsCard = new OutsourcedPart();
            graphicsCard.setCompanyName("NVIDIA");
            graphicsCard.setName("RTX 4080");
            graphicsCard.setInv(4);
            graphicsCard.setPrice(1099.99);
            graphicsCard.setId(121);
            outsourcedPartRepository.save(graphicsCard);

            OutsourcedPart cpu = new OutsourcedPart();
            cpu.setCompanyName("Intel");
            cpu.setName("i7 13700K");
            cpu.setInv(11);
            cpu.setPrice(409.99);
            cpu.setId(122);
            outsourcedPartRepository.save(cpu);

            OutsourcedPart mobo = new OutsourcedPart();
            mobo.setCompanyName("MSI");
            mobo.setName("B650 GAMING PLUS WIFI ATX AM5");
            mobo.setInv(8);
            mobo.setPrice(169.99);
            mobo.setId(123);
            outsourcedPartRepository.save(mobo);

            OutsourcedPart psu = new OutsourcedPart();
            psu.setCompanyName("Corsair");
            psu.setName("RM850e");
            psu.setInv(10);
            psu.setPrice(129.99);
            psu.setId(124);
            outsourcedPartRepository.save(psu);

            InhousePart tower = new InhousePart();
            tower.setPartId(125);
            tower.setName("RTX 4080 Compatible Case");
            tower.setInv(5);
            tower.setPrice(134.99);
            inhousePartRepository.save(tower);
        }

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        if(productRepository.count() == 0) {
            Product base = new Product("Base Edition", 749.99, 13);
            Product gold = new Product("Gold Edition", 849.99, 12);
            Product plat = new Product("Platinum Edition", 949.99, 7);
            Product diam = new Product("Diamond Edition", 1399.99, 6);
            Product pro = new Product("Pro Edition", 2099.99, 4);

            productRepository.save(base);
            productRepository.save(gold);
            productRepository.save(plat);
            productRepository.save(diam);
            productRepository.save(pro);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
