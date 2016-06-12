package com.kelvSYC.civtool

/**
  * Civilization Advance
  */
trait CivAdvance {
  def name: String
  def cost: Int
  def victoryPoints: Int
  def groups: Set[CivAdvanceGroup]
  def colorCredits: Map[CivAdvanceGroup, Int]
  def civCredit: Option[CivCredit]
}

case class CivAdvanceImpl(name: String,
                          cost: Int,
                          victoryPoints: Int,
                          groups: Set[CivAdvanceGroup],
                          colorCredits: Map[CivAdvanceGroup, Int],
                          civCredit: Option[CivCredit]
                         ) extends CivAdvance

sealed trait CivCredit {
  def name: String
  def amount: Int
}

case class CivCreditImpl(name: String, amount: Int) extends CivCredit
