package org.harigabor96.sds.dataflows.barflowv1

import org.harigabor96.sds.shared.DAG

class BarFlowV1DAG(conf: BarFlowV1Params) extends DAG {

  def execute(): Unit = {
    writeToConsoleTask(
      generateTextDataTask()
    )
  }

  def generateTextDataTask(): String = {
    s"Bar!\nOrchestration Date: ${conf.orchestrationLocalDate}"
  }

  def writeToConsoleTask(textData: String): Unit = {
    println(textData)
  }

}
