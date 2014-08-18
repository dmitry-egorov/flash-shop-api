package de.flashshop.showcasing.web

import de.flashshop.showcasing.infrastructure.StaticProductRepository
import de.flashshop.showcasing.model.ProductDescriptionList
import org.specs2.mutable.Specification
import spray.http.StatusCodes._
import spray.testkit.Specs2RouteTest

class ProductsServiceSpec extends Specification with Specs2RouteTest with ProductsService
{
  val productRepository = new StaticProductRepository
  def actorRefFactory = system
  
  "ProductsService" should {

    "return a greeting for GET requests to the root path" in {
      Get() ~> route ~> check
      {
        handled must beTrue
      }
    }

    "leave GET requests to other paths unhandled" in {
      Get("/kermit") ~> route ~> check
      {
        handled must beFalse
      }
    }

    "return a MethodNotAllowed error for PUT requests to the root path" in {
      Put() ~> sealRoute(route) ~> check
      {
        status === MethodNotAllowed
      }
    }

    "return a list of products for GET requests to /products" in {
      Get("/products") ~> route ~>check
      {
        responseAs[ProductDescriptionList] === productRepository.all
      }
    }
  }
}
