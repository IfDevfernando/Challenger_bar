package entities;

public class Bill {
	
	private char gender;
	private int beer;
	private int barbecue;
	private int softDrink;
	
	public Bill() {
		
	}

	public Bill(char gender, int beer, int barbecue, int softDrink) {
		
		this.gender = gender;
		this.beer = beer;
		this.barbecue = barbecue;
		this.softDrink = softDrink;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getBeer() {
		return beer;
	}

	public void setBeer(int beer) {
		this.beer = beer;
	}

	public int getBarbecue() {
		return barbecue;
	}

	public void setBarbecue(int barbecue) {
		this.barbecue = barbecue;
	}

	public int getSoftDrink() {
		return softDrink;
	}

	public void setSoftDrink(int softDrink) {
		this.softDrink = softDrink;
	}
	
	public double cover(double cover) {
		return cover;
	}
	public double feeding(double brQuantity,double bcQuantity,double sdQuantity  ) {
		
		double valorBeer = 5.0;
		double valorSofDrink = 3;
		double valorBerbecue = 7;
		
		double quantity = (brQuantity *valorBeer ) + (bcQuantity * valorSofDrink) + ( sdQuantity*valorBerbecue );
		
		return quantity;
		
	}
	
	
	public double ticket() {
		
		double tk = 0.0;
		
		if(this.gender == 'm') {
			tk = 10.0;
		}else if(this.gender == 'f') {
			tk =8.0;
		}
		return tk;
	}
	public double total(double cover,double feeding,double ticket) {
		
		return cover + feeding + ticket;
		
	}

	
	
	

}
