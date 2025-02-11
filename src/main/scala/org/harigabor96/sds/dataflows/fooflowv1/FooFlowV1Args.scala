package org.harigabor96.sds.dataflows.fooflowv1

import org.harigabor96.sds.shared.Args
import org.rogach.scallop._

class FooFlowV1Args(args: Seq[String]) extends Args(args) {
  val orchestrationTimestamp = opt[String]()
  verify()
}
