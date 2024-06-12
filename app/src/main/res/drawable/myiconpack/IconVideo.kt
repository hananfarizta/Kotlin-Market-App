package myiconpack

import MyIconPack
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val MyIconPack.IconVideo: ImageVector
    get() {
        if (_iconVideo != null) {
            return _iconVideo!!
        }
        _iconVideo = Builder(name = "IconVideo", defaultWidth = 1.0.dp, defaultHeight = 1.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, -4.477f, 10.0f, -10.0f)
                reflectiveCurveTo(17.523f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(2.0f, 6.477f, 2.0f, 12.0f)
                curveToRelative(0.0f, 1.6f, 0.376f, 3.112f, 1.043f, 4.453f)
                curveToRelative(0.178f, 0.356f, 0.237f, 0.763f, 0.134f, 1.148f)
                lineToRelative(-0.595f, 2.226f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, false, 1.591f, 1.592f)
                lineToRelative(2.226f, -0.596f)
                arcToRelative(1.634f, 1.634f, 0.0f, false, true, 1.149f, 0.133f)
                arcTo(9.958f, 9.958f, 0.0f, false, false, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 12.0f)
                curveToRelative(0.0f, -0.844f, -0.927f, -1.414f, -2.78f, -2.553f)
                curveToRelative(-1.88f, -1.155f, -2.82f, -1.732f, -3.52f, -1.308f)
                curveTo(9.0f, 8.563f, 9.0f, 9.709f, 9.0f, 12.0f)
                curveToRelative(0.0f, 2.291f, 0.0f, 3.437f, 0.7f, 3.861f)
                curveToRelative(0.701f, 0.424f, 1.64f, -0.153f, 3.52f, -1.308f)
                curveTo(15.073f, 13.414f, 16.0f, 12.844f, 16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _iconVideo!!
    }

private var _iconVideo: ImageVector? = null
