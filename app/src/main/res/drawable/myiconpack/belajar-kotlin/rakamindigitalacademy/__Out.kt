package myiconpack.`belajar-kotlin`.rakamindigitalacademy

import androidx.compose.ui.graphics.vector.ImageVector
import myiconpack.`belajar-kotlin`.RakamindigitalacademyGroup
import myiconpack.`belajar-kotlin`.rakamindigitalacademy.`out`.AllIcons
import myiconpack.`belajar-kotlin`.rakamindigitalacademy.`out`.Production
import kotlin.collections.List as ____KtList

public object OutGroup

public val RakamindigitalacademyGroup.Out: OutGroup
  get() = OutGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val OutGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Production.AllIcons + listOf()
    return __AllIcons!!
  }
