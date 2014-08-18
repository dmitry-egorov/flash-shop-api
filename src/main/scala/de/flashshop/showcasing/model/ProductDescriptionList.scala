package de.flashshop.showcasing.model

import de.flashshop.finances.Money

case class ProductDescriptionList(products: List[ProductDescription])

object ProductDescriptionList
{
  def from(items: (String, Int, Money)*) = new ProductDescriptionList(items.map(t => ProductDescription.tupled(t)).toList)
}
