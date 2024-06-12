package myiconpack.`belajar-kotlin`.rakamindigitalacademy.`out`.production

import androidx.compose.ui.graphics.vector.ImageVector
import myiconpack.`belajar-kotlin`.rakamindigitalacademy.`out`.ProductionGroup
import myiconpack.`belajar-kotlin`.rakamindigitalacademy.`out`.production.rakamindigitalacademy.AllIcons
import myiconpack.`belajar-kotlin`.rakamindigitalacademy.`out`.production.rakamindigitalacademy.Data
import myiconpack.`belajar-kotlin`.rakamindigitalacademy.`out`.production.rakamindigitalacademy.`Meta-inf`
import kotlin.collections.List as ____KtList

public object RakamindigitalacademyGroup

public val ProductionGroup.Rakamindigitalacademy: RakamindigitalacademyGroup
  get() = RakamindigitalacademyGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val RakamindigitalacademyGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= `Meta-inf`.AllIcons + Data.AllIcons + listOf()
    return __AllIcons!!
  }
