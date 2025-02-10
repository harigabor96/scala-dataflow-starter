package org.harigabor96.sds.dataflows.fooflowv1

object FooFlowV1App extends App {
  new FooFlowV1DAG(new FooFlowV1Params(args)).execute()
}
