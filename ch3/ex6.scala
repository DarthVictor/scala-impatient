val a = Array(1, 0, 9, -5, 3, -4, 2, -7, -2);
scala.util.Sorting.quickSort(a);
println(a.reverse.mkString("<", ",", ">"));

var b = scala.collection.mutable.ArrayBuffer(1, 0, 9, -5, 3, -4, 2, -7, -2);
println(b.sorted.reverse.mkString("<", ",", ">"));
