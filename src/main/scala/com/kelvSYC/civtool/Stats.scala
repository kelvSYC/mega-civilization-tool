package com.kelvSYC.civtool

import CivAdvanceGroup._

/**
  * Mega Civilization Stats, based on civilization advance data
  */
class Stats(advanceNames: Set[String]) {
  private val (advances, remainingAdvances) = CivAdvances.allAdvances.partition(advance => advanceNames.contains(advance.name))

  /**
    * Total victory point value for advances.
    */
  val victoryPoints: Int = advances.map(_.victoryPoints).sum

  /**
    * Accumulated color credits (credits towards the research of advances in a particular category)
    */
  val colorCredits: Map[CivAdvanceGroup, Int] = {
    val credits = advances.map(_.colorCredits)
    List(Arts, Civics, Crafts, Religion, Science).map(group => group -> credits.map(_.getOrElse(group, 0)).sum).toMap
  }

  /**
    * List of credits towards the research of advances that are not already researched.
    */
  val advanceCredits: Map[String, Int] = {
    advances.map(_.civCredit).filter(_.isDefined).map(_.get).
      filter(credit => remainingAdvances.map(_.name).contains(credit.name)).
      map(credit => credit.name -> credit.amount).toMap
  }

  /**
    * The cost of the remaining attributes, counting color credits and specific credits, but not including credits obtained
    * via advance attributes.
    */
  val costOfRemaining: Map[String, Int] = {
    remainingAdvances.map { advance =>
      val cost = advance.cost - advance.groups.map(colorCredits.getOrElse(_, 0)).max - advanceCredits.getOrElse(advance.name, 0)
      advance.name -> (if (cost < 0) 0 else cost)
    }.toMap
  }
}
