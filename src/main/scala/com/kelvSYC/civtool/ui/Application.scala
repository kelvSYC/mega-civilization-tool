package com.kelvSYC.civtool.ui

import com.kelvSYC.civtool.{CivAdvance, CivAdvances, Stats}

import scala.swing.BorderPanel.Position
import scala.swing.event.ButtonClicked
import scala.swing.{BorderPanel, BoxPanel, CheckBox, FlowPanel, GridPanel, Label, MainFrame, Orientation, SimpleSwingApplication}

/**
  * Entry point in application.
  */
object Application extends SimpleSwingApplication {
  def top = new MainFrame {
    title = "Mega Civilization Tool"

    val advanceCheckboxes = CivAdvances.allAdvances.map(_ -> new CheckBox()).toMap
    val advanceCostLabels = CivAdvances.allAdvances.map(advance => advance -> new Label(s"Cost: ${advance.cost}")).toMap

    def assemblePanel(advance: CivAdvance) = {
      val rightPanel = new BoxPanel(Orientation.Vertical) {
        contents += new Label(advance.name)
        contents += advanceCostLabels(advance)
      }
      new FlowPanel(FlowPanel.Alignment.Left)(advanceCheckboxes(advance), rightPanel)
    }

    val panelGrid = new GridPanel(17, 3) {
      contents ++= CivAdvances.allAdvances.map(assemblePanel)
    }
    val vpLabel = new Label("Victory Points: 0")

    contents = new BorderPanel {
      layout(panelGrid) = Position.Center
      layout(vpLabel) = Position.South
    }

    listenTo(advanceCheckboxes.values.toSeq:_*)
    reactions += {
      case ButtonClicked(button) if advanceCheckboxes.values.toSeq.contains(button) =>
        val selectedAdvances = advanceCheckboxes.filter { case (_, checkbox) => checkbox.selected }.keySet
        val stats = new Stats(selectedAdvances.map(_.name))
        vpLabel.text = s"Victory Points: ${stats.victoryPoints}"
        advanceCostLabels.foreach {
          case (advance, label) if selectedAdvances.contains(advance) =>
            label.text = "Researched"
          case (advance, label) =>
            label.text = s"Cost: ${stats.costOfRemaining(advance.name)}"
        }
    }
  }
}
