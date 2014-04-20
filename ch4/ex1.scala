val normalPrices = Map(
    "Samsung Galaxy Tab PRO 8.4" -> 400,
    "Canon EOS 700D kit 18-135 IS STM" -> 1000,
    "AMD R290" -> 500);
val discontPrices:  Map[String, Double] = 
    (for((name, price) <- normalPrices) yield (name, 0.9*price)) toMap;

for((name, price) <- discontPrices) {
    println (name + ": " + price)
}
discontPrices.foreach{case(a,b) => println(a + ": " + b)}