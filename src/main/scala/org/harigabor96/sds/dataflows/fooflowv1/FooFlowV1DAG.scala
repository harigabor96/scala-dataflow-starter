package org.harigabor96.sds.dataflows.fooflowv1

import org.harigabor96.sds.shared.DAG

class FooFlowV1DAG(conf: FooFlowV1Conf) extends DAG {

  def execute(): Unit = {
    writeToConsoleTask(
      generateTextDataTask()
    )
  }

  def generateTextDataTask(): String = {
    s"Foo!\nOrchestration Date: ${conf.orchestrationDate}"
  }

  def writeToConsoleTask(textData: String): Unit = {
    println(textData)
  }

}
