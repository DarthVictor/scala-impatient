import scala.beans.BeanProperty

class Student(@BeanProperty var id: Long,
	@BeanProperty var name: String
	)
val s = new Student(18, "Ivanov")
println("" + s.id + ", " + s.name)
s.id = 112
s.name = "Petrov"
println("" + s.id + ", " + s.name)
s.setId(37)
s.setName("Sidorov")
println("" + s.getId() + ", " + s.getName())

