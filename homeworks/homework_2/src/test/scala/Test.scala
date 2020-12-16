import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }

        'primeFactor - {
            assert(Exercises.primeFactor(5) == Seq(5))
            assert(Exercises.primeFactor(10) == Seq(2,5))
            assert(Exercises.primeFactor(98) == Seq(2,7))
        }

        'test_Vector2D - {
            assert(Exercises.sumScalars(
                Exercises.Vector2D(-4, 12),
                Exercises.Vector2D(6, 1),
                Exercises.Vector2D(1, 10),
                Exercises.Vector2D(-1, 9)
            ) == 77.0)

            assert(Exercises.sumCosines(
                Exercises.Vector2D(1, 2),
                Exercises.Vector2D(-1, 2),
                Exercises.Vector2D(2, -3),
                Exercises.Vector2D(3, 1)
            ) - 0.863117405 < 1e-9)
        }

        'test_sortByHeavyweight - {
            val balls = Exercises.sortByHeavyweight()
            assert(balls.head == "Tin")
            assert(balls.last == "Graphite")
            assert(balls(3) == "Aluminium")

            assert(Exercises.sortByHeavyweight(Map.empty).isEmpty)
        }
    }
}
