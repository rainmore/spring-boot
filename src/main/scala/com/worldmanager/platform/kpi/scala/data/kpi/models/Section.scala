package com.worldmanager.platform.kpi.scala.data.kpi.models

import scala.beans.BeanProperty
import javax.validation.constraints.Size

class Section {
  @BeanProperty var id: Long = _
  @Size(min=1, max=256)
  @BeanProperty var name: String = _
  @BeanProperty var position: Int = 1
  @BeanProperty var template: Template = _

  override def toString = {
    "Section [id: %d, name = %s]".format(id, name)
  }
}
