package org.harigabor96.sds.dataflows.barflowv1

import org.harigabor96.sds.shared.Params
import org.rogach.scallop._

class BarFlowV1Params(arguments: Seq[String]) extends Params(arguments) {
  val orchestrationTimestamp = opt[String]()

  verify()
}
