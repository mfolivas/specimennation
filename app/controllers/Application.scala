package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def blog = Action {
    Ok(views.html.blog("Your new application is ready."))
  }

  def blogdetails = Action {
    Ok(views.html.blogdetails("Your new application is ready."))
  }

  def shortcodes = Action {
    Ok(views.html.shortcodes("Your new application is ready."))
  }

}