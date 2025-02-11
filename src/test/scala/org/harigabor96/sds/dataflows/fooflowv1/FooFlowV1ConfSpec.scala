package org.harigabor96.sds.dataflows.fooflowv1

import org.scalatest.funsuite.AnyFunSuite

import java.time.LocalDate
import java.time.format.DateTimeParseException

class FooFlowV1ConfSpec extends AnyFunSuite {

  test("orchestrationDate") {
    assertResult(
      LocalDate.parse("1970-01-01")
    )(
      new FooFlowV1Conf(new FooFlowV1Args(Seq("--orchestration-timestamp", "1970-01-01T00:00:00Z"))).orchestrationDate
    )
    assertThrows[DateTimeParseException](
      new FooFlowV1Conf(new FooFlowV1Args(Seq("--orchestration-timestamp", "Potato"))).orchestrationDate
    )
    assertThrows[NoSuchElementException](
      new FooFlowV1Conf(new FooFlowV1Args(Seq())).orchestrationDate
    )
  }

}
