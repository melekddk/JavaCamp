package oopIntro;

public class Product {
	//encapsulation
		private int id;
		private String name;
		private double unitPrice; //Birim Fiyat�
		private String detail;
		private double discount; //indirim oran�
		
		
		public Product() {
			
		}
		
		//Product � bellekte olu�tururken onun bir �ey yapmas�n� istedi�imiz zaman constructor yap�s�n� kullan�yoruz.
		public Product(int id, String name, double unitPrice, String detail, double discount) {
			super();
			this.id = id;
			this.name = name;
			this.unitPrice = unitPrice;
			this.detail = detail;
			this.discount = discount;
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getUnitPrice() {
			return unitPrice;
		}

		public void setUnitPrice(double unitPrice) {
			this.unitPrice = unitPrice;
		}

		public String getDetail() {
			return detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}

		public double getDiscount() {
			return discount;
		}

		public void setDiscount(double discount) {
			this.discount = discount;
		}

		public double getUnitPriceAfterDiscount() {
			return this.unitPrice - (this.unitPrice * this.discount /100);
		}
		

}
