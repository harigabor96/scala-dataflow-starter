package org.harigabor96.sds.dataflows.barflowv1

import org.scalatest.funsuite.AnyFunSuite

import java.time.LocalDate

class BarFlowV1ConfSpec extends AnyFunSuite {

  test("orchestrationLocalDate") {
    assertResult(
      LocalDate.parse("1970-01-01")
    )(
      BarFlowV1Conf(new BarFlowV1Params(Seq("--orchestration-timestamp", "1970-01-01T00:00:00Z"))).orchestrationLocalDate
    )
  }

}
