package de.common.model

object MoneyImplicits
{
   implicit def bigDecimal2Money(value : BigDecimal) = new Money(value)
   implicit def double2Money(value : Double) = new Money(value)
 }
