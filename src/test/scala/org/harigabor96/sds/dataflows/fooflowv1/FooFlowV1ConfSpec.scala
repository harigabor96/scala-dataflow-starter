package org.harigabor96.sds.dataflows.fooflowv1

import org.scalatest.funsuite.AnyFunSuite

import java.time.LocalDate

class FooFlowV1ConfSpec extends AnyFunSuite {

  test("orchestrationDate") {
    assertResult(
      LocalDate.parse("1970-01-01")
    )(
      FooFlowV1Conf(new FooFlowV1Params(Seq("--orchestration-timestamp", "1970-01-01T00:00:00Z"))).orchestrationDate
    )
  }

}
