package org.harigabor96.sds.dataflows.barflowv1

object BarFlowV1App extends App {
  new BarFlowV1DAG(new BarFlowV1Params(args)).execute()
}
