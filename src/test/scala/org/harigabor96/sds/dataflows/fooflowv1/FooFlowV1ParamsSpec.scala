package org.harigabor96.sds.dataflows.fooflowv1

import org.rogach.scallop.exceptions.GenericScallopException
import org.scalatest.funsuite.AnyFunSuite

import java.time.LocalDate

class FooFlowV1ParamsSpec extends AnyFunSuite {

  test("orchestrationTimestamp") {
    assertResult(
      "1970-01-01T00:00:00Z"
    )(
      new FooFlowV1Params(Seq("--orchestration-timestamp", "1970-01-01T00:00:00Z")).orchestrationTimestamp()
    )
    assertThrows[GenericScallopException](
      new FooFlowV1Params(Seq()).orchestrationTimestamp
    )
  }

  test("orchestrationLocalDate") {
    assertResult(
      LocalDate.parse("1970-01-01")
    )(
      new FooFlowV1Params(Seq("--orchestration-timestamp", "1970-01-01T00:00:00Z")).orchestrationLocalDate
    )
  }

}
