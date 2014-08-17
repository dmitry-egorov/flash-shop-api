package de.flashshop.products.infrastructure

import de.flashshop.products.model._

class StaticProductRepository extends ProductRepository
{
  import de.flashshop.finances.MoneyImplicits._

  lazy val all = ProductDescriptionList from
  (
    ProductDescription("Starbound", 211820, 10.0),
    ProductDescription("Civilization V", 8930, 5.0),
    ProductDescription("Road Not Taken", 293740, 10.0),
    ProductDescription("Call of Duty: MW 3", 115300, 50.0)
  )
}