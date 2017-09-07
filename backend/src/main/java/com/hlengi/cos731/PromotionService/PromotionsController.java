package com.hlengi.cos731.PromotionService;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hjita
 */
@RestController
public class PromotionsController 
{
        @Autowired
        PromotionsRepository repository;
        
        @RequestMapping("/save")
	public String process(){
		repository.save(new Promotion("Bread", new Date(), new Date(), 10));
		repository.save(new Promotion("Dress", new Date(), new Date(), 3000));
		repository.save(new Promotion("Mince Meat", new Date(), new Date(), 40));
		return "Done";
	}
        
        @RequestMapping("/addPromotion")
        public String addPromotion(String prodName, Date start, Date end, int price)
        {
            repository.save(new Promotion(prodName, start, end, price));
            return "Promotion Added!";
        }
        
        @RequestMapping("/removePromotion")
        public String removePromotion(String prodName)
        {
            Promotion promo = repository.findByProduct(prodName).get(0);
            repository.delete(promo);
            return "Promotion Removed!";
        }
        
        @RequestMapping("/findall")
	public String findAll(){
		String result = "<html>";
		
		for(Promotion prom : repository.findAll()){
			result += "<div>" + prom.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
	@RequestMapping("/findbyid")
	public String findById(@RequestParam("id") long id){
		String result = "";
		result = repository.findOne(id).toString();
		return result;
	}
	
	@RequestMapping("/findbyproduct")
	public String fetchDataByProduct(@RequestParam("prodName") String prodName){
		String result = "<html>";
		
		for(Promotion prom: repository.findByProduct(prodName))
                {
			result += "<div>" + prom.toString() + "</div>"; 
		}
		
		return result + "</html>";
	}        
}
