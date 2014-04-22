class Car(
	val manufacturer: String,
	val model: String,
	val year: Int,
	val number: String){
	
	def this(
		manufacturer: String, 
		model: String,
		year: Int){
		this(manufacturer, model, year, "");
	}
	
	def this(
		manufacturer: String, 
		model: String,
		number: String){
		this(manufacturer, model, -1, number);
	}
	
	def this(
		manufacturer: String, 
		model: String){
		this(manufacturer, model, -1, "");
	}
}