package de.flashshop.showcasing.infrastructure

import de.flashshop.showcasing.model._

class StaticProductRepository extends ProductRepository
{
  import de.flashshop.finances.MoneyImplicits._

  lazy val all =
  ProductDescriptionList from
  (
    (         "Starbound", 211820, 10.$),
    (    "Civilization V",   8930,  5.$),
    (    "Road Not Taken", 293740, 10.$),
    ("Call of Duty: MW 3", 115300, 50.$)
  )
}