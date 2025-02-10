package org.harigabor96.sds.shared

import org.rogach.scallop.ScallopConf
import org.rogach.scallop.exceptions.GenericScallopException

import scala.collection.{Seq => CSeq}

abstract class Params(
                     args: CSeq[String] = Nil,
                     commandNameAndAliases: Seq[String] = Nil
                   ) extends ScallopConf(args, commandNameAndAliases) {

  errorMessageHandler = { message =>
    throw GenericScallopException(message)
  }

}
