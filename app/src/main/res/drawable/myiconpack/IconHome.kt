package myiconpack

import MyIconPack
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val MyIconPack.IconHome: ImageVector
    get() {
        if (_iconHome != null) {
            return _iconHome!!
        }
        _iconHome = Builder(name = "IconHome", defaultWidth = 1.0.dp, defaultHeight = 1.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 0.75f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(9.0f, 22.0f)
                lineToRelative(-0.251f, -3.509f)
                arcToRelative(3.259f, 3.259f, 0.0f, true, true, 6.501f, 0.0f)
                lineTo(15.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 0.75f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.352f, 13.214f)
                curveToRelative(-0.354f, -2.298f, -0.53f, -3.446f, -0.096f, -4.465f)
                reflectiveCurveToRelative(1.398f, -1.715f, 3.325f, -3.108f)
                lineTo(7.021f, 4.6f)
                curveTo(9.418f, 2.867f, 10.617f, 2.0f, 12.001f, 2.0f)
                curveToRelative(1.382f, 0.0f, 2.58f, 0.867f, 4.978f, 2.6f)
                lineToRelative(1.44f, 1.041f)
                curveToRelative(1.927f, 1.393f, 2.89f, 2.09f, 3.325f, 3.108f)
                curveToRelative(0.434f, 1.019f, 0.258f, 2.167f, -0.095f, 4.464f)
                lineToRelative(-0.301f, 1.96f)
                curveToRelative(-0.5f, 3.256f, -0.751f, 4.884f, -1.919f, 5.856f)
                reflectiveCurveTo(16.554f, 22.0f, 13.14f, 22.0f)
                horizontalLineToRelative(-2.28f)
                curveToRelative(-3.415f, 0.0f, -5.122f, 0.0f, -6.29f, -0.971f)
                curveToRelative(-1.168f, -0.972f, -1.418f, -2.6f, -1.918f, -5.857f)
                close()
            }
        }
        .build()
        return _iconHome!!
    }

private var _iconHome: ImageVector? = null
