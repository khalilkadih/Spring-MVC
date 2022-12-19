package com.youcode.vc;

import com.youcode.vc.entity.Client;
import com.youcode.vc.entity.Command;
import com.youcode.vc.entity.CommandItem;
import com.youcode.vc.entity.Product;
import com.youcode.vc.repository.ClientRepository;
import com.youcode.vc.repository.CommandItemRepo;
import com.youcode.vc.repository.CommandRepository;
import com.youcode.vc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class VcApplication   {
/*	@Autowired
	CommandRepository commandRepository;*/
/*@Autowired
	ClientRepository clientRepository;
@Autowired
CommandItemRepo commandItemRepo;
@Autowired
ProductRepository productRepository;*/
	public static void main(String[] args) {
		SpringApplication.run(VcApplication.class, args);

	}

	/*@Bean
	CommandLineRunner commandLineRunner(CommandRepository commandRepository){
		return args -> {

			Product product= productRepository.findById(1l).get();
			 Client  clientFind=clientRepository.getReferenceById(1L);
			*//* CommandItem commandItem= new CommandItem();
			 commandItem.setItemQuantity(1000);
			 commandItem.setProduct(product);
			 commandItemRepo.save(new CommandItem());*//*

			Command command= new Command();
			command.setClient(clientFind);
			command.setCommandDate(new Date());
*//*
			command.setCommandItem();
*//*
			command.setReference("A0111");
			command.setReference("A0111");
			command.setCommandTotalPrice(100.11);
			commandRepository.save(command);
			commandRepository.findAll().forEach(System.out::println);

		};
	}*/

/*	@Bean
	CommandLineRunner commandLineRunner(ProductRepository productRepository){
		return args -> {

			Product product= new Product(788998L,"lenovo i8",800.00,"PC","lenovo i9",100);
			Product product1= new Product(7889L,"lenovo i8",800.00,"PC","lenovo i9",100);
			Product product2= new Product(78844L,"lenovo i8",800.00,"PC","lenovo i9",100);
			Product product3= new Product(78L,"lenovo i8",800.00,"PC","lenovo i9",100);
			Product product4= new Product(788L,"lenovo i8",800.00,"PC","lenovo i9",100);
			Product product5= new Product(888L,"lenovo i8",800.00,"PC","lenovo i9",100);
			Product product6uct5= new Product(888L,"lenovo i8",800.00,"PC","lenovo i9",100);
			Product product6= new Product(888L,"lenovo i8",800.00,"PC","lenovo i9",100);
			Product product7= new Product(888L,"lenovo i8",800.00,"PC","lenovo i9",100);
			Product product8= new Product(888L,"lenovo i8",800.00,"PC","lenovo i9",100);
			Product product9= new Product(888L,"lenovo i8",800.00,"PC","lenovo i9",100);
			Product product10= new Product(888L,"lenovo i8",800.00,"PC","lenovo i9",100);
			Product product11= new Product(888L,"lenovo i8",800.00,"PC","lenovo i9",100);
			Product product12= new Product(888L,"lenovo i8",800.00,"PC","lenovo i9",100);


			productRepository.save(product);
			productRepository.save(product1);
			productRepository.save(product2);
			productRepository.save(product3);
			productRepository.save(product4);
			productRepository.save(product5);
			productRepository.save(product6);
			productRepository.save(product7);
			productRepository.save(product8);
			productRepository.save(product9);
			productRepository.save(product10);
			productRepository.save(product11);
			productRepository.save(product12);
			productRepository.findAll().forEach(System.out::println);
		};
	}*/

/*	@Bean
	CommandLineRunner commandLineRunner(ProductRepository productRepository) {
		return args -> {


			commandRepository.findAll().forEach(System.out::println);

	};
}*/
	}
