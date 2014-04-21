class Time(h: Int, m: Int){
    private val min: Int = 60*h + m
	
	def hours = min/60
	def minutes = min%60
    def before(other: Time) =  other.min > this.min 
}

val t1 = new Time(18, 45)
val t2 = new Time(19, 0)
val t3 = new Time(19, 30)
println("" + t1.hours + ":" + t1.minutes)
println(t1.before(t2))
println(t1.before(t1))
println(t2.before(t3))
println(t3.before(t2))