package com.horstman {
    class Outer(val i:Int);
}
package com.horstman.impatient {
    object Test1{
        val o = new Outer(0); // compile error
    }
}
package com {
    package horstman {
        package impatient {
            object Test2{
                val o = new Outer(0); // OK
            }
        }
    }
}