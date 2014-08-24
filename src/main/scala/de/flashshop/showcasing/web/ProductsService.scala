package de.flashshop.showcasing.web

import de.flashshop.showcasing.model.ProductRepository
import de.flashshop.spray.SimpleRespondWithDirectives
import org.json4s.DefaultFormats
import spray.httpx.Json4sSupport
import spray.routing.HttpService
import de.flashshop.BuildInfo

// this trait defines our service behavior independently from the service actor
trait ProductsService
  extends HttpService
     with Json4sSupport
     with SimpleRespondWithDirectives
{
  val version = BuildInfo.version

  val productRepository: ProductRepository

  val json4sFormats = DefaultFormats

  val route =
  {
    val root =
    path("") & get & text & complete
    {
      s"Welcome to showcasing api v$version!"
    }

    val products =
    path("products") & get & json & cors & complete
    {
      productRepository.all
    }

    root ~ products
  }
}