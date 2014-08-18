package de.flashshop.spray

import spray.http._
import spray.routing.Directive0
import spray.routing.directives.RespondWithDirectives

trait SimpleRespondWithDirectives extends RespondWithDirectives
{
  import spray.http.HttpHeaders._
  import spray.http.MediaTypes._

  def json() = { respondWithMediaType(`application/json`) }
  def text() = { respondWithMediaType(`text/plain`) }

  def cors() : Directive0 = { cors(AllOrigins) }
  def cors(allowedOrigins: AllowedOrigins) = { respondWithHeader(`Access-Control-Allow-Origin`(allowedOrigins))}
}
