package com.example.springrestexample;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sun.research.ws.wadl.Representation;

@RestController
public class RestWebSvsExample {

	@RequestMapping(value="/message", method=RequestMethod.GET)
	public String getSimpleMessage(@RequestParam HashMap<String, String> reqParams) throws Exception{
		
		System.out.println(reqParams.get("city"));
		
		return "Hello Text Plain message";
	}
	
	@RequestMapping(value="/products", method = RequestMethod.GET)
	
	public @ResponseBody ArrayList<HashMap<String, String>> getProducts() throws Exception{
		
		HashMap<String,String> product1 = new HashMap<>();
		
		product1.put("productId", "34535");
		product1.put("productName","abc");
		
		HashMap<String,String> product2 = new HashMap<>();
		
		product2.put("productId", "34534");
		product2.put("productName","ccc");
		
		ArrayList<HashMap<String, String>> productList = new ArrayList<>();
		
		productList.add(product1);
		
		productList.add(product2);
		
		return productList;
		
	}
	
	
}


