package colletionprogramms.com;

 class Beer implements Comparable<Beer> {
	 String brand;
	 int cost;
	 double quantity;
	 Beer(String brand,int cost,double quantity){
		 this.brand=brand;
		 this.cost=cost;
		 this.quantity=quantity;
		 
	 }
	 public String toString() {
		 return "Brand:"+brand+ " Cost:"+cost+"  Quantity:"+quantity;
	 }
	 public int compareTo(Beer b) {
		return this.cost-b.cost;
	 }
	 

}
