package com.bwei.beans;

import java.math.BigDecimal;

public class Goods {

		private Integer id;
		
		private String name;
		
		private BigDecimal price;
		
		private Integer saleay;


		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public BigDecimal getPrice() {
			return price;
		}

		public void setPrice(BigDecimal price) {
			this.price = price;
		}

		public Integer getSaleay() {
			return saleay;
		}

		public void setSaleay(Integer saleay) {
			this.saleay = saleay;
		}

		public Goods() {
			super();
		}

		public Goods(Integer id, String name, BigDecimal price, Integer saleay) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
			this.saleay = saleay;
		}

		@Override
		public String toString() {
			return "Goods [id=" + id + ", name=" + name + ", price=" + price + ", saleay=" + saleay + "]";
		}
		
	}
