package com.kelvSYC.civtool

import CivAdvanceGroup._

/**
  * Civilization Advance data from the Mega Civilization game.
  */
object CivAdvances {
  val allAdvances: List[CivAdvance] = List(
    CivAdvanceImpl("Mysticism", 50, 1, Set(Arts, Religion), Map(Arts -> 5, Religion -> 5), Some(CivCreditImpl("Monument", 10))),
    CivAdvanceImpl("Monument", 180, 3, Set(Crafts, Religion), Map(Crafts -> 10, Religion -> 10), Some(CivCreditImpl("Wonder of the World", 20))),
    CivAdvanceImpl("Wonder of the World", 290, 6, Set(Arts, Crafts), Map(Arts -> 20, Crafts -> 20), None),
    CivAdvanceImpl("Sculpture", 50, 1, Set(Arts), Map(Arts -> 10, Civics -> 5), Some(CivCreditImpl("Architecture", 20))),
    CivAdvanceImpl("Architecture", 140, 3, Set(Arts), Map(Arts -> 10, Science -> 5), Some(CivCreditImpl("Mining", 10))),
    CivAdvanceImpl("Mining", 230, 6, Set(Crafts), Map(Crafts -> 20, Science -> 5), None),
    CivAdvanceImpl("Cloth Making", 50, 1, Set(Crafts), Map(Crafts -> 10, Arts -> 5), Some(CivCreditImpl("Naval Warfare", 10))),
    CivAdvanceImpl("Naval Warfare", 160, 3, Set(Civics), Map(Civics -> 10, Crafts -> 5), Some(CivCreditImpl("Diaspora", 20))),
    CivAdvanceImpl("Diaspora", 270, 6, Set(Religion), Map(Religion -> 20, Arts -> 5), None),
    CivAdvanceImpl("Urbanism", 50, 1, Set(Civics), Map(Civics -> 10, Science -> 5), Some(CivCreditImpl("Diplomacy", 10))),
    CivAdvanceImpl("Diplomacy", 160, 3, Set(Arts), Map(Arts -> 10, Civics -> 5), Some(CivCreditImpl("Provincial Empire", 20))),
    CivAdvanceImpl("Provincial Empire", 260, 6, Set(Civics), Map(Civics -> 20, Religion -> 5), None),
    CivAdvanceImpl("Monarchy", 60, 1, Set(Civics), Map(Civics -> 10, Religion -> 5), Some(CivCreditImpl("Law", 10))),
    CivAdvanceImpl("Law", 150, 3, Set(Civics), Map(Civics -> 10, Religion -> 5), Some(CivCreditImpl("Cultural Ascendancy", 20))),
    CivAdvanceImpl("Cultural Ascendancy", 280, 6, Set(Arts), Map(Arts -> 20, Religion -> 5), None),
    CivAdvanceImpl("Written Record", 60, 1, Set(Arts, Science), Map(Civics -> 5, Science -> 5), Some(CivCreditImpl("Cartography", 10))),
    CivAdvanceImpl("Cartography", 160, 3, Set(Science), Map(Science -> 10, Arts -> 5), Some(CivCreditImpl("Library", 20))),
    CivAdvanceImpl("Library", 220, 6, Set(Science), Map(Science -> 20, Arts -> 5), None),
    CivAdvanceImpl("Pottery", 60, 1, Set(Crafts), Map(Crafts -> 10, Arts -> 5), Some(CivCreditImpl("Agriculture", 10))),
    CivAdvanceImpl("Agriculture", 120, 3, Set(Crafts), Map(Crafts -> 10, Science -> 5), Some(CivCreditImpl("Democracy", 20))),
    CivAdvanceImpl("Democracy", 220, 6, Set(Civics), Map(Civics -> 20, Arts -> 5), None),
    CivAdvanceImpl("Masonry", 60, 1, Set(Crafts), Map(Crafts -> 10, Science -> 5), Some(CivCreditImpl("Engineering", 10))),
    CivAdvanceImpl("Engineering", 160, 3, Set(Crafts, Science), Map(Crafts -> 10, Science -> 10), Some(CivCreditImpl("Roadbuilding", 20))),
    CivAdvanceImpl("Roadbuilding", 220, 6, Set(Crafts), Map(Crafts -> 20, Science -> 5), None),
    CivAdvanceImpl("Mythology", 60, 1, Set(Religion), Map(Religion -> 10, Arts -> 5), Some(CivCreditImpl("Literacy", 10))),
    CivAdvanceImpl("Literacy", 110, 3, Set(Arts, Civics), Map(Arts -> 10, Civics -> 10, Crafts -> 5, Religion -> 5, Science -> 5), Some(CivCreditImpl("Mathematics", 20))),
    CivAdvanceImpl("Mathematics", 250, 6, Set(Arts, Science), Map(Science -> 20, Arts -> 20, Civics -> 10, Crafts -> 10, Religion -> 10), None),
    CivAdvanceImpl("Empiricism", 60, 1, Set(Science), Map(Science -> 10, Arts -> 5, Civics -> 5, Crafts -> 5, Religion -> 5), Some(CivCreditImpl("Medicine", 10))),
    CivAdvanceImpl("Medicine", 140, 3, Set(Science), Map(Science -> 10, Crafts -> 5), Some(CivCreditImpl("Anatomy", 20))),
    CivAdvanceImpl("Anatomy", 270, 6, Set(Science), Map(Science -> 20, Crafts -> 5), None),
    CivAdvanceImpl("Deism", 70, 1, Set(Religion), Map(Religion -> 10, Crafts -> 5), Some(CivCreditImpl("Fundamentalism", 10))),
    CivAdvanceImpl("Fundamentalism", 150, 3, Set(Religion), Map(Religion -> 10, Arts -> 5), Some(CivCreditImpl("Monotheism", 20))),
    CivAdvanceImpl("Monotheism", 240, 6, Set(Religion), Map(Religion -> 20, Civics -> 5), None),
    CivAdvanceImpl("Theocracy", 80, 1, Set(Civics, Religion), Map(Civics -> 5, Religion -> 5), Some(CivCreditImpl("Universal Doctrine", 10))),
    CivAdvanceImpl("Universal Doctrine", 160, 3, Set(Religion), Map(Religion -> 10, Civics -> 5), Some(CivCreditImpl("Theology", 20))),
    CivAdvanceImpl("Theology", 250, 6, Set(Religion), Map(Religion -> 20, Science -> 5), None),
    CivAdvanceImpl("Drama and Poetry", 80, 1, Set(Arts), Map(Arts -> 10, Religion -> 5), Some(CivCreditImpl("Rhetoric", 10))),
    CivAdvanceImpl("Rhetoric", 130, 3, Set(Arts), Map(Arts -> 10, Civics -> 5), Some(CivCreditImpl("Politics", 20))),
    CivAdvanceImpl("Politics", 230, 6, Set(Arts), Map(Arts -> 20, Religion -> 5), None),
    CivAdvanceImpl("Music", 80, 1, Set(Arts), Map(Arts -> 10, Religion -> 5), Some(CivCreditImpl("Enlightenment", 10))),
    CivAdvanceImpl("Enlightment", 160, 3, Set(Religion), Map(Religion -> 10, Crafts -> 5), Some(CivCreditImpl("Philosophy", 20))),
    CivAdvanceImpl("Philosophy", 220, 6, Set(Religion, Science), Map(Religion -> 20, Science -> 20), None),
    CivAdvanceImpl("Astronavigation", 80, 1, Set(Science), Map(Science -> 10, Religion -> 5), Some(CivCreditImpl("Calendar", 10))),
    CivAdvanceImpl("Calendar", 180, 3, Set(Science), Map(Science -> 10, Civics -> 5), Some(CivCreditImpl("Public Works", 20))),
    CivAdvanceImpl("Public Works", 230, 6, Set(Civics), Map(Civics -> 20, Crafts -> 5), None),
    CivAdvanceImpl("Coinage", 90, 1, Set(Science), Map(Science -> 10, Civics -> 5), Some(CivCreditImpl("Trade Routes", 10))),
    CivAdvanceImpl("Trade Routes", 180, 3, Set(Crafts), Map(Crafts -> 10, Religion -> 5), Some(CivCreditImpl("Trade Empire", 20))),
    CivAdvanceImpl("Trade Empire", 260, 6, Set(Crafts), Map(Crafts -> 20, Civics -> 5), None),
    CivAdvanceImpl("Metalworking", 90, 1, Set(Crafts), Map(Crafts -> 10, Civics -> 5), Some(CivCreditImpl("Military", 10))),
    CivAdvanceImpl("Military", 170, 3, Set(Civics), Map(Civics -> 10, Crafts -> 5), Some(CivCreditImpl("Advanced Military", 20))),
    CivAdvanceImpl("Advanced Military", 240, 6, Set(Civics), Map(Civics -> 20, Science -> 5), None)
  )
}
