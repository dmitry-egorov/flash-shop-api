package de.flashshop.products.model

import de.common.model.Money

case class ProductDescription(name: String, imgId: Long, price: Money)
case class ProductDescriptionList(products: List[ProductDescription])

object ProductDescriptionList
{
  def from(items: ProductDescription*) = ProductDescriptionList(items.toList)
}
