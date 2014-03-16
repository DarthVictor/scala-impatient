val a = Array(1, 0, 9, -5, 3, -4, 2, -7, -2);

val b1 = for(elem <- a; if elem > 0) yield elem;
val b2 = for(elem <- a; if elem <= 0) yield elem;
val b = b1 ++ b2;
for(elem <- b) println(elem);