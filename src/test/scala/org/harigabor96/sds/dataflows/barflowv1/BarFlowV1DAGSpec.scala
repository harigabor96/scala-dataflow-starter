package org.harigabor96.sds.dataflows.barflowv1

import org.mockito.IdiomaticMockito.StubbingOps
import org.mockito.MockitoSugar._
import org.scalatest.funsuite.AnyFunSuite

import java.time.LocalDate

class BarFlowV1DAGSpec extends AnyFunSuite {

  test("generateTextDataTask()") {
    assertResult(
      s"Bar!\nOrchestration Date: 1970-01-01"
    )(
      new BarFlowV1DAG({val c = mock[BarFlowV1Params]
        c.orchestrationLocalDate returns LocalDate.parse("1970-01-01")
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
        new BarFlowV1DAG(mock[BarFlowV1Params])
          .writeToConsoleTask("Potato")
      }
      stream.toString.trim
    })
  }

}
