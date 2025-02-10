package org.harigabor96.sds.dataflows.fooflowv1

import org.mockito.IdiomaticMockito.StubbingOps
import org.mockito.MockitoSugar._
import org.scalatest.funsuite.AnyFunSuite

import java.time.LocalDate

class FooFlowV1DAGSpec extends AnyFunSuite {

  test("generateTextDataTask()") {
    assertResult(
      s"Foo!\nOrchestration Date: 1970-01-01"
    )(
      new FooFlowV1DAG({val c = mock[FooFlowV1Conf]
        c.orchestrationDate returns LocalDate.parse("1970-01-01")
      })
      .generateTextDataTask()
    )
  }

  test("writeToConsoleTask()") {
    assertResult(
      "Potato"
    )({
      val stream = new java.io.ByteArrayOutputStream()
      Console.withOut(stream) {
        new FooFlowV1DAG(mock[FooFlowV1Conf])
          .writeToConsoleTask("Potato")
      }
      stream.toString.trim
    })
  }

}
