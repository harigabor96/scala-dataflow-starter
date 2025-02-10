package org.harigabor96.sds.dataflows.barflowv1

import org.harigabor96.sds.shared.Params
import org.rogach.scallop._

import java.time.LocalDate
import java.time.format.DateTimeFormatter.ISO_DATE_TIME

class BarFlowV1Params(arguments: Seq[String]) extends Params(arguments) {
  val orchestrationTimestamp = opt[String](required = true)

  verify()

  val orchestrationLocalDate = LocalDate.parse(orchestrationTimestamp(), ISO_DATE_TIME)
}
