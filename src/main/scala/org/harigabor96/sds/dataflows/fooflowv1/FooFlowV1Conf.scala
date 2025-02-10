package org.harigabor96.sds.dataflows.fooflowv1

import java.time.LocalDate
import java.time.format.DateTimeFormatter.ISO_DATE_TIME

case class FooFlowV1Conf(params: FooFlowV1Params) {
  val orchestrationDate = LocalDate.parse(params.orchestrationTimestamp(), ISO_DATE_TIME)
}
