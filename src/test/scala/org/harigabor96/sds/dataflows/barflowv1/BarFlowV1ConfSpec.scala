package org.harigabor96.sds.dataflows.barflowv1

import org.scalatest.funsuite.AnyFunSuite

import java.time.LocalDate
import java.time.format.DateTimeParseException

class BarFlowV1ConfSpec extends AnyFunSuite {

  test("orchestrationDate") {
    assertResult(
      LocalDate.parse("1970-01-01")
    )(
      new BarFlowV1Conf(new BarFlowV1Args(Seq("--orchestration-timestamp", "1970-01-01T00:00:00Z"))).orchestrationDate
    )
    assertThrows[DateTimeParseException](
      new BarFlowV1Conf(new BarFlowV1Args(Seq("--orchestration-timestamp", "Potato"))).orchestrationDate
    )
    assertThrows[NoSuchElementException](
      new BarFlowV1Conf(new BarFlowV1Args(Seq())).orchestrationDate
    )
  }

  test("message") {
    assertResult(
      "Potato"
    )(
      new BarFlowV1Conf(new BarFlowV1Args(Seq("--message", "Potato"))).message
    )
    assertThrows[NoSuchElementException](
      new BarFlowV1Conf(new BarFlowV1Args(Seq())).message
    )
  }

}
