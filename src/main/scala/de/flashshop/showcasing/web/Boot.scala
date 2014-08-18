package de.flashshop.showcasing.web

import akka.actor.{ActorSystem, Props}
import akka.io.IO
import akka.pattern.ask
import akka.util.Timeout
import spray.can.Http

import scala.concurrent.duration._
import scala.util.Properties

object Boot extends App
{
  implicit val system = ActorSystem("on-spray-can")

  val service = system.actorOf(Props[ProductsServiceActor], "demo-service")

  implicit val timeout = Timeout(5.seconds)

  val port = Properties.envOrElse("PORT", "8080").toInt
  println("Starting flashshop.products api on port:" + port)

  IO(Http) ? Http.Bind(service, interface = "0.0.0.0", port = port)
}
