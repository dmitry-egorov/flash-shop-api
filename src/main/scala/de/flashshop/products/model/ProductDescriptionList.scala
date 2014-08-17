package de.flashshop.products.model

case class ProductDescriptionList(products: List[ProductDescription])

object ProductDescriptionList
{
  def from(items: ProductDescription*) = ProductDescriptionList(items.toList)
}
