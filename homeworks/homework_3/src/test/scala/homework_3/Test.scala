package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_example - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
        }

        'test_prettyBooleanFormatter1 - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1("true") == "true")
            assert(Exercises.prettyBooleanFormatter1(3) == "3")
            assert(Exercises.prettyBooleanFormatter1(5.10) == "5.1")
        }
        'test_prettyBooleanFormatter2 - {
            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2("true") == "true")
            assert(Exercises.prettyBooleanFormatter2(3) == "3")
            assert(Exercises.prettyBooleanFormatter2(5.10) == "5.1")
        }
        'test_prettyBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3("true") == "true")
            assert(Exercises.prettyBooleanFormatter3(3) == "3")
            assert(Exercises.prettyBooleanFormatter3(5.10) == "5.1")
        }

        'test_max1 - {
            assert(Exercises.max1(Seq(1, 2, 3)) == 3)
            assert(Exercises.max1(Seq(-1, -2, -3)) == -1)
            assert(Exercises.max1(Seq.empty) == 0)
            assert(Exercises.max1(Seq()) == 0)
        }
        'test_max2 - {
            assert(Exercises.max2(Seq(1, 2, 3)) == Seq(3))
            assert(Exercises.max2(Seq(-1, -2, -3)) == Seq(-1))
            assert(Exercises.max2(Seq.empty) == Seq())
            assert(Exercises.max2(Seq()) == Seq.empty)
        }
        'test_max3 - {
            assert(Exercises.max3(Seq(1, 2, 3)) == Some(3))
            assert(Exercises.max3(Seq(-1, -2, -3)) == Some(-1))
            assert(Exercises.max3(Seq.empty) == None)
            assert(Exercises.max3(Seq()) == None)
        }

        'test_sum1 - {
            assert(Exercises.sum1(1, 1) == 2)
            assert(Exercises.sum1(0, 0) == 0)
        }
        'test_sum2 - {
            assert(Exercises.sum1(1, 1) == 2)
            assert(Exercises.sum1(0, 0) == 0)
        }
        'test_sum3 - {
            assert(Exercises.sum1(1, 1) == 2)
            assert(Exercises.sum1(0, 0) == 0)
        }
    }
}
