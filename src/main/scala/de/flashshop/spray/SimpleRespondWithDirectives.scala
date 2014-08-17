package de.flashshop.spray

import spray.http.HttpHeaders.RawHeader
import spray.routing.Directive0
import spray.routing.directives.RespondWithDirectives

trait SimpleRespondWithDirectives extends RespondWithDirectives
{
  import spray.http.MediaTypes._
  
  def json() = { respondWithMediaType(`application/json`) }
  def text() = { respondWithMediaType(`text/plain`) }

  def cors() : Directive0 = { cors("*") }
  def cors(hosts: String) = { respondWithHeader(RawHeader("Access-Control-Allow-Origin", hosts)) }

}
