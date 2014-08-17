package de.flashshop.products.web

import de.flashshop.products.model.ProductRepository
import de.flashshop.spray.SimpleRespondWithDirectives
import org.json4s.DefaultFormats
import spray.httpx.Json4sSupport
import spray.routing.HttpService

// this trait defines our service behavior independently from the service actor
trait ProductsService
  extends HttpService
     with Json4sSupport
     with SimpleRespondWithDirectives
{
  val productRepository: ProductRepository

  val json4sFormats = DefaultFormats

  val route =
  {
    val root =
    path("") & get & text & complete
    {
      "Welcome to products api v0.1!"
    }

    val products =
    path("products") & get & json & cors & complete
    {
      productRepository.all
    }

    root ~ products
  }

}