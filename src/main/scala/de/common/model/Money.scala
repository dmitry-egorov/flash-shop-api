package de.common.model

case class Money(amount: BigDecimal)
{
  override def toString() = amount + "$"
}


