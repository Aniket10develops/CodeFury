package com.ishika.ProductManager;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	
		private Long id;
		private String name;
		private String category;
		private Float price;

		public Product() {
			
		}
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}



		public Float getPrice() {
			return price;
		}


		public void setPrice(Float price) {
			this.price = price;
		}


		public String getCategory() {
			return category;
		}


		public void setCategory(String category) {
			this.category = category;
		}


}
