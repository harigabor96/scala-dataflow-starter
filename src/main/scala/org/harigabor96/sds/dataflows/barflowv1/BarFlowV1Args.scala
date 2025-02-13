package org.harigabor96.sds.dataflows.barflowv1

import org.harigabor96.sds.shared.Args
import org.rogach.scallop._

class BarFlowV1Args(args: Seq[String]) extends Args(args) {
  val orchestrationTimestamp = opt[String]()
  val message = opt[String]()
  verify()
}
