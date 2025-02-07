package org.harigabor96.sds.dataflows.barflowv1

import org.rogach.scallop._

import java.time.LocalDate
import java.time.format.DateTimeFormatter.ISO_DATE_TIME

class BarFlowV1Conf(arguments: Seq[String]) extends ScallopConf(arguments) {
  val orchestrationTimestamp = opt[String](default = Some("1970-01-01T00:00:00Z"))

  verify()

  val orchestrationDate = LocalDate.parse(orchestrationTimestamp(), ISO_DATE_TIME)
}
