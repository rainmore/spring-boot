package com.worldmanager.platform.kpi.scala.data.kpi.models

import scala.beans.BeanProperty
import javax.validation.constraints.Size

class Template {
  @BeanProperty var id: Long = _
  @Size(min=1, max=256)
  @BeanProperty var name: String = _
  @BeanProperty var description: String = _
  @BeanProperty var isActive: Boolean = _
  @BeanProperty var sections: List[Section] = _

  override def toString = {
    "Template [id: %d, name = %s, isActive = %s]".format(id, name, isActive.toString)
  }
}
