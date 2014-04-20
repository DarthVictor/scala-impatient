import java.util.Calendar;
val weekDays = scala.collection.immutable.ListMap(
    "Monday" -> Calendar.MONDAY,
    "Tuesday" -> Calendar.TUESDAY,
    "Wednesday" -> Calendar.WEDNESDAY,
    "Thursday" -> Calendar.THURSDAY,
    "Friday" -> Calendar.FRIDAY,
    "Saturday" -> Calendar.SATURDAY,
    "Sunday" -> Calendar.SUNDAY
);
for((day, value) <- weekDays) {
    println (day + ": " + value)
}