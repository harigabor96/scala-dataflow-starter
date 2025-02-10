package org.harigabor96.sds.dataflows.barflowv1

import java.time.LocalDate
import java.time.format.DateTimeFormatter.ISO_DATE_TIME

case class BarFlowV1Conf(params: BarFlowV1Params) {
  val orchestrationLocalDate = LocalDate.parse(params.orchestrationTimestamp(), ISO_DATE_TIME)
}
