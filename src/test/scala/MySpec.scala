import org.specs2._

class MySpec extends Specification { def is = s2"""

 This is my first specification
   it is working                 $ok
   really working!               $ok
                                 """
}