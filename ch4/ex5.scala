import scala.collection.JavaConversions.mapAsScalaMap
val in = new java.util.Scanner(new java.io.File("D:\\Users\\DarthVictor\\Documents\\Scala\\scala-impatient\\ch4\\ex2.scala"
))
var vocabulary = new java.util.TreeMap[String, Int];

while(in.hasNext()) {
    val value = in.next();
    var freq = 0
    if(vocabulary.containsKey(value))
        freq = vocabulary.get(value)
                
    vocabulary.put(value, freq);
}

 println(vocabulary.mkString(vocabulary.getClass.getSimpleName + "(", ", ", ")"))
