package org.harigabor96.sds.dataflows.fooflowv1

import org.rogach.scallop._

import java.time.LocalDate
import java.time.format.DateTimeFormatter.ISO_DATE_TIME

class FooFlowV1Conf(arguments: Seq[String]) extends ScallopConf(arguments) {
  val orchestrationTimestamp = opt[String](required = true)

  verify()

  val orchestrationDate = LocalDate.parse(orchestrationTimestamp(), ISO_DATE_TIME)
}
