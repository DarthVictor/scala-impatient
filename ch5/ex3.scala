class Time(val hours: Int, val minutes: Int){
    
    def before(other: Time) = 
        (other.hours > this.hours) || 
        (other.hours == this.hours && other.minutes > this.minutes) 
}

val t1 = new Time(18, 45)
val t2 = new Time(19, 0)
val t3 = new Time(19, 30)
println(t1.before(t2))
println(t1.before(t1))
println(t2.before(t3))
println(t3.before(t2))