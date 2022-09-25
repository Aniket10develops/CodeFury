package com.ishika.ProductManager;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



import java.util.List;

@Controller
public class AppController {

	@Autowired
	private Productservice service;
	
	@Autowired
	private OrderService service2;
	
	@RequestMapping("/")
	public String ViewHomePage(Model m) {
		List<Product> listproduct=service.listAll();
		m.addAttribute("listproduct",listproduct);
		
		List<Order> listorder=service2.listAll();
		m.addAttribute("listorder",listorder);
		
		return "index";
	}
	
	@RequestMapping("/new")
	public String AddProduct(Model m) {
		Product product=new Product();
		m.addAttribute("product",product);
		return "new_product";
	}
	
	@RequestMapping("/newquote")
	public String AddQuote(Model m) {
		Order order=new Order();
		m.addAttribute("order",order);
		return "new_quote";
	}
	
	
	@RequestMapping(value="/save")
	public String SaveProduct(@ModelAttribute("product") Product product) {
		
		service.save(product);
		return "redirect:/";
	}
	
	@RequestMapping(value="/savequote")
	public String SaveQuote(@ModelAttribute("order") Order order) {
		
		service2.save(order);
		return "redirect:/";
	}
	
	@RequestMapping(value="/edit/{id}")
	public ModelAndView EditProduct(@PathVariable(name="id") Long id) {
		
		ModelAndView mav=new ModelAndView("edit_product");
		Product product=service.get(id);
		mav.addObject("product",product);
		return mav;
	}
	
	@RequestMapping(value="/viewinedit/{oid}")
	public ModelAndView ViewinEditProduct(@PathVariable(name="oid") Long oid) {
		
		ModelAndView mav=new ModelAndView("approve_invoice");
		Order order=service2.get(oid);
		mav.addObject("order",order);
		return mav;
	}
	
	@RequestMapping(value="/viewin/{oid}")
	public ModelAndView ViewInvoice(@PathVariable(name="oid") Long oid) {
		
		ModelAndView mav=new ModelAndView("view_invoice");
		Order order=service2.get(oid);
		mav.addObject("order",order);
		return mav;
	}
	
	@RequestMapping(value="/delete/{id}")
	public String DeleteProduct(@PathVariable(name="id") Long id) {
		
		service.delete(id);
		return "redirect:/";
	}
	

}
