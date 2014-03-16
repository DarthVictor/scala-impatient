val n = 12
val a = (1 until n).toArray
val b = for(i <- 0 until a.length) yield {
    if (i%2 == 0) 
        if (i==a.length-1) a(i) else a(i+1)
    else 
        a(i-1)
}
for(elem <- b) println(elem);