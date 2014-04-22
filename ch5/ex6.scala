class Person{
	private var privateAge = 0
	def age = privateAge
	def age_= (newValue: Int){
		if (newValue >=0 ) privateAge = newValue;
	}
}