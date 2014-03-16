val a = Array(1, 0, 9, -5, 3, -4, 2, -7, -2, 0, 9, -5, 3, -4, 2, -7, -2);
var indexes = Array(for(i <- 0 until a.length; if a(i) < 0) yield i).reverse;
indexes = indexes.remove(indexes.length-1);
println(indexes.mkString("[", ", ", "]"));
