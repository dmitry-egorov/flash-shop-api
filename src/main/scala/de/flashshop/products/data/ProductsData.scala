package de.flashshop.products.data

import de.common.model.MoneyImplicits
import de.flashshop.products.model.{ProductDescriptionList, ProductDescription}
import MoneyImplicits._

object ProductsData
{
  val all = ProductDescriptionList.from(
    ProductDescription("Starbound",                      211820, 10.0),
    ProductDescription("Civilization V",                 8930,    5.0),
    ProductDescription("Road Not Taken",                 293740, 10.0),
    ProductDescription("Call of Duty: Modern Warfare 3", 115300, 50.0)
  )
}
