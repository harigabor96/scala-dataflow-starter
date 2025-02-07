package org.harigabor96.sds.dataflows.barflowv1

import org.harigabor96.sds.shared.Conf
import org.rogach.scallop._

import java.time.LocalDate
import java.time.format.DateTimeFormatter.ISO_DATE_TIME

class BarFlowV1Conf(arguments: Seq[String]) extends Conf(arguments) {
  val orchestrationTimestamp = opt[String](required = true)

  verify()

  val orchestrationDate = LocalDate.parse(orchestrationTimestamp(), ISO_DATE_TIME)
}
