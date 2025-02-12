package org.harigabor96.sds.dataflows.barflowv1

import java.time.LocalDate
import java.time.format.DateTimeFormatter.ISO_DATE_TIME

class BarFlowV1Conf(args: BarFlowV1Args) {
  lazy val orchestrationDate = LocalDate.parse(args.orchestrationTimestamp(), ISO_DATE_TIME)
}
