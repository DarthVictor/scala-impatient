class Person(fullName: String){
	val firstName: String = fullName.split(" ")(0)
	val lastName: String = fullName.split(" ")(1)
}
val p:Person = new Person("Fred Smith")
println(p.firstName + ", " + p.lastName)
//println(p.fullName)