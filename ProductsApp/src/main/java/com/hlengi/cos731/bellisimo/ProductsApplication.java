/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hlengi.cos731.bellisimo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hjita
 */
@RestController
@SpringBootApplication
public class ProductsApplication
{
    @Autowired
    ProductRepository repository;
    
    @RequestMapping("/save")
	public String process(){
		repository.save(new Product("Bread", "Carbohydrate used for making sandwiches", 12, ""));
		repository.save(new Product("Belle of the ball", "Beautiful matric dance dress", 3500, ""));
		repository.save(new Product("Mince meat", "", 45, ""));
		repository.save(new Product("Levis Jeans", "The best there is", 900, ""));
		repository.save(new Product("Pie", "Pepper steak, Steak &Kidney or Chicken", 18, ""));
		return "Done";
	}

	@RequestMapping("/findall")
	public String findAll(){
		String result = "<html>";
		
		for(Product prod : repository.findAll()){
			result += "<div>" + prod.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping("/findbyid")
	public String findById(@RequestParam("id") int id){
		String result = "";
		result = repository.findOne(id).toString();
		return result;
	}
	
	@RequestMapping("/findbyname")
	public String fetchDataByName(@RequestParam("name") String name){
		String result = "<html>";
		
		for(Product prod: repository.findByName(name)){
			result += "<div>" + prod.toString() + "</div>"; 
		}
		
		return result + "</html>";
	}
        
        @RequestMapping("/addProduct")
        public String addPromotion(String prodName, String description, int price, String image)
        {
            repository.save(new Product(prodName, description, price, image));
            return "Product Added!";
        }
        
        @RequestMapping("/removeProduct")
        public String removeProduct(String prodName)
        {
            Product prod = repository.findByName(prodName).get(0);
            repository.delete(prod);
            return "Promotion Removed!";
        }
        
        @RequestMapping("/updateProduct")
        public String updateProduct (String prodName)
        {
            Product prod = repository.findByName(prodName).get(0);
            repository.delete(prod);
            return "Product Updated!";
        }
        
        public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}
    
}
