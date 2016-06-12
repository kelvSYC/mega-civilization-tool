package com.kelvSYC.civtool

/**
  * Civilization advance group.
  */
sealed trait CivAdvanceGroup

/**
  * Enumeration object representing the five civilization advance groups.
  */
object CivAdvanceGroup {
  case object Science extends CivAdvanceGroup
  case object Arts extends CivAdvanceGroup
  case object Crafts extends CivAdvanceGroup
  case object Civics extends CivAdvanceGroup
  case object Religion extends CivAdvanceGroup
}
