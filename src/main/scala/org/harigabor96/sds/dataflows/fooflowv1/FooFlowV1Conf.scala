package org.harigabor96.sds.dataflows.fooflowv1

import java.time.LocalDate
import java.time.format.DateTimeFormatter.ISO_DATE_TIME

class FooFlowV1Conf(args: FooFlowV1Args) {
  lazy val orchestrationDate = LocalDate.parse(args.orchestrationTimestamp(), ISO_DATE_TIME)
}
