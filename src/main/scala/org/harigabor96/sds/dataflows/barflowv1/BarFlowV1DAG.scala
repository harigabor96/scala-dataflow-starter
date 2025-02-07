package org.harigabor96.sds.dataflows.barflowv1

import org.harigabor96.sds.shared.DAG

class BarFlowV1DAG(conf: BarFlowV1Conf) extends DAG {

  def execute(): Unit = {
    writeToConsoleTask(
      generateCaptionTask()
    )
  }

  def generateCaptionTask(): String = {
    s"Bar!\nOrchestration Date: ${conf.orchestrationDate}"
  }

  def writeToConsoleTask(caption: String): Unit = {
    println(caption)
  }

}
