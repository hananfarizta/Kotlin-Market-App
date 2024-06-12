package myiconpack

import MyIconPack
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val MyIconPack.IconLove: ImageVector
    get() {
        if (_iconLove != null) {
            return _iconLove!!
        }
        _iconLove = Builder(name = "IconLove", defaultWidth = 1.0.dp, defaultHeight = 1.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.75f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 8.0f)
                curveTo(8.925f, 8.0f, 4.0f, 12.925f, 4.0f, 19.0f)
                curveToRelative(0.0f, 11.0f, 13.0f, 21.0f, 20.0f, 23.326f)
                curveTo(31.0f, 40.0f, 44.0f, 30.0f, 44.0f, 19.0f)
                curveToRelative(0.0f, -6.075f, -4.925f, -11.0f, -11.0f, -11.0f)
                curveToRelative(-3.72f, 0.0f, -7.01f, 1.847f, -9.0f, 4.674f)
                arcTo(10.987f, 10.987f, 0.0f, false, false, 15.0f, 8.0f)
            }
        }
        .build()
        return _iconLove!!
    }

private var _iconLove: ImageVector? = null
