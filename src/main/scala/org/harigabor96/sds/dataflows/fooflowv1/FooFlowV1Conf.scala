package org.harigabor96.sds.dataflows.fooflowv1

import org.harigabor96.sds.shared.Conf
import org.rogach.scallop._

import java.time.LocalDate
import java.time.format.DateTimeFormatter.ISO_DATE_TIME

class FooFlowV1Conf(arguments: Seq[String]) extends Conf(arguments) {
  val orchestrationTimestamp = opt[String](required = true)

  verify()

  val orchestrationLocalDate = LocalDate.parse(orchestrationTimestamp(), ISO_DATE_TIME)
}
