package org.harigabor96.sds.dataflows.fooflowv1

import org.harigabor96.sds.shared.DAG

class FooFlowV1DAG(conf: FooFlowV1Conf) extends DAG {

  def execute(): Unit = {
    writeToConsoleTask(
      generateCaptionTask()
    )
  }

  def generateCaptionTask(): String = {
    s"Foo!\nOrchestration Date: ${conf.orchestrationLocalDate}"
  }

  def writeToConsoleTask(caption: String): Unit = {
    println(caption)
  }

}
