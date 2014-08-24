package de.flashshop.finances

case class Money(amount: BigDecimal)
{
  override def toString = amount + "$"
}


