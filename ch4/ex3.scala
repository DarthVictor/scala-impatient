val in = new java.util.Scanner(new java.io.File("ex2.scala"))
var vocabulary = new scala.collection.immutable.HashMap[String, Int];

while(in.hasNext()) {
    val value = in.next();
    vocabulary = vocabulary + (value -> (vocabulary.getOrElse(value, 0) + 1));
}

for((word, freq) <- vocabulary) {
    println (word + ": " + freq)
}