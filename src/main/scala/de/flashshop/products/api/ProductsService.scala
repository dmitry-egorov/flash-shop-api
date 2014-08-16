package de.flashshop.products.api

import de.flashshop.products.data.ProductsData
import org.json4s.DefaultFormats
import spray.http.HttpHeaders.RawHeader
import spray.http.MediaTypes._
import spray.httpx.Json4sSupport
import spray.routing._

// this trait defines our service behavior independently from the service actor
trait ProductsService extends HttpService with Json4sSupport
{
  val json4sFormats = DefaultFormats

  val route =
  (path("") & get & respondWithMediaType(`text/plain`)) { complete
  {
    "Welcome to products api"
  }} ~
  (
    path("products")
  & get
  & respondWithMediaType(`application/json`)
  & respondWithHeader(RawHeader("Access-Control-Allow-Origin", "*"))
  )
  { complete
  {
    ProductsData.all
  }}
}