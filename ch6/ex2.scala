class UnitConversion(val scale: Double) {
	def convert(value: Double): Double = scale * value
}

object InchesToSantimeters extends UnitConversion(2.54)
object GallonsToLiters extends UnitConversion(3.78)
object MilesToKilometers extends UnitConversion(1.71)