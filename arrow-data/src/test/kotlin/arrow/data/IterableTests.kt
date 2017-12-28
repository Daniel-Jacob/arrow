package arrow

import arrow.instances.collect
import io.kotlintest.KTestJUnitRunner
import org.junit.runner.RunWith

@RunWith(KTestJUnitRunner::class)
class IterableTests : UnitSpec() {

    init {

        "Iterable.collect can filter and transform" {
            listOf(1, 2, 3, 4, 5).collect(
                    case({ n: Int -> n % 2 == 0 } then { (it * 2).toString() })
            ) shouldBe listOf("4", "8")
        }

    }
}
