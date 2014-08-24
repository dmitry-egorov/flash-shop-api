package de.flashshop.finances

import scala.language.implicitConversions

object MoneyImplicits
{
  implicit def bigDecimal2Money(value : BigDecimal) = new Money(value)

  implicit class DoubleToMoneyConverter(val value : Double) extends AnyVal
  {
    def $: Money = new Money(value)
  }
}

