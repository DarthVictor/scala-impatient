val in = new java.util.Scanner(new java.io.File("D:\\Users\\DarthVictor\\Documents\\Scala\\scala-impatient\\ch4\\ex2.scala"
))
val vocabulary = new scala.collection.mutable.HashMap[String, Int];

while(in.hasNext()) {
    val value = in.next();
    vocabulary.put(value, vocabulary.getOrElse(value, 0) + 1);
}
val vocabularySorted = scala.collection.immutable.TreeMap(vocabulary.toArray:_*);

for((word, freq) <- vocabularySorted) {
    println (word + ": " + freq)
}