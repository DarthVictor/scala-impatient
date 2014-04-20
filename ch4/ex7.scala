import scala.collection.JavaConversions._
val props = System.getProperties();
val maxLength  = (
    for(property<-asScalaSet(props.keySet())) 
        yield property.toString().length
    ).max

for(property<-asScalaSet(props.keySet())) {
        println(property.toString + 
            " " * (maxLength - property.toString().length) + 
            " | " +  props.getProperty(property.toString)
        )
}