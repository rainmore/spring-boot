package com.worldmanager.platform.kpi.scala.controllers.kpi

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{ModelAttribute, RequestMethod, RequestParam, RequestMapping}
import java.lang.String
import scala.Predef.String
import org.springframework.ui.Model
import com.worldmanager.platform.kpi.scala.data.kpi.TemplateService
import scala.collection.JavaConversions
import com.worldmanager.platform.kpi.scala.data.kpi.models.Template
import javax.validation.Valid
import org.springframework.validation.BindingResult
import org.springframework.context.MessageSource
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scala.context.function.FunctionalConfigApplicationContext
import scala.beans.BeanProperty
import org.springframework.web.servlet.mvc.support.RedirectAttributes

@Controller
class TemplateController {

  @Autowired
  @BeanProperty
  val messageSource:MessageSource = null

  @RequestMapping(Array("/kpi/template"))
  def index() = {
    val template = "greeting"
    template
  }

  @RequestMapping(Array("/kpi/template/greeting"))
  def greeting(@RequestParam(value = "name", required = false, defaultValue = "World") name: String, model: Model) = {
    model.addAttribute("name", name)
    "greeting"
  }

  @RequestMapping(Array("/kpi/template/list"))
  def list(@RequestParam(value="id", required = false, defaultValue = "0") id: Long, model: Model) = {
    model.addAttribute("list", JavaConversions.asJavaIterable(TemplateService.list))
    Console.println(id)
    Console.println(id.getClass)
    if (id > 0) {
      val template = TemplateService.findById(id)
      model.addAttribute("sections", JavaConversions.asJavaIterable(template.sections))
      model.addAttribute("template", template)
    }

    "kpi/list"
//    "greeting"
  }

  @RequestMapping(Array("/kpi/template/view"))
  def view(@RequestParam(value="id", required = true) id: Long, model: Model,
           @ModelAttribute("message") message: String) = {
    val template = findById(id)
    model.addAttribute("id", id)
    model.addAttribute("template", template)
    model.addAttribute("message", message)
    model.addAttribute("sections", JavaConversions.asJavaIterable(template.sections))
    "kpi/view"
  }

  @RequestMapping(Array("/kpi/template/activate"))
  def activate(@RequestParam(value="id", required = true) id: Long, model: Model, redirectAttributes: RedirectAttributes) = {
    val template = findById(id)
    template.isActive = !template.isActive
    model.asMap().clear()
    redirectAttributes.addFlashAttribute("message", "Updated")
    "redirect:/kpi/template/list"
  }

  @RequestMapping(Array("/kpi/template/copy"))
  def copy(@RequestParam(value="id", required = true) id: Long, model: Model) = {
    model.addAttribute("id", id)
    model.addAttribute("template", findById(id))
    "greeting"
  }


  @RequestMapping(Array("/kpi/template/edit"))
  def edit(@RequestParam(value="id", required = true) id: Long, model: Model) = {
    model.addAttribute("id", id)
    model.addAttribute("template", findById(id))
    "kpi/form"
  }

  @RequestMapping(value = Array("/kpi/template/save"), method= Array(RequestMethod.POST))
  def save(@RequestParam(value="id", required = false) id: Long,
           @Valid template: Template, result: BindingResult, model:Model,
           redirectAttributes: RedirectAttributes) = {
//    val template = if (id != Unit) findById(id) else new Template
    var view = "kpi/form"
    if (!result.hasErrors) {
      TemplateService.save(template)
      view = "redirect:/kpi/template/list"
      redirectAttributes.addFlashAttribute("message", "Saved!")
    } else {
      redirectAttributes.addFlashAttribute("template", template)
      redirectAttributes.addFlashAttribute("message", "Failed!")
//      view = "redirect:/kpi/template/edit?id=%s".format(template.id.toString)
    }
    view
  }

  @RequestMapping(Array("/kpi/template/delete"))
  def delete(@RequestParam(value="id", required = true) id: Long, model: Model) = {
    model.addAttribute("id", id)
    model.addAttribute("template", findById(id))
    "greeting"
  }

  def findById(id: Long) = {
    TemplateService.findById(id)
  }
}
