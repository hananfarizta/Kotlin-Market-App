package myiconpack

import MyIconPack
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val MyIconPack.IconStore: ImageVector
    get() {
        if (_iconStore != null) {
            return _iconStore!!
        }
        _iconStore = Builder(name = "IconStore", defaultWidth = 1.0.dp, defaultHeight = 1.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.95f, 13.43f)
                lineToRelative(-1.784f, -1.784f)
                quadToRelative(-0.147f, -0.146f, -0.345f, -0.155f)
                reflectiveQuadToRelative(-0.363f, 0.155f)
                reflectiveQuadToRelative(-0.166f, 0.357f)
                reflectiveQuadToRelative(0.166f, 0.357f)
                lineToRelative(1.927f, 1.932f)
                quadToRelative(0.242f, 0.243f, 0.565f, 0.243f)
                reflectiveQuadToRelative(0.566f, -0.243f)
                lineToRelative(4.038f, -4.038f)
                quadToRelative(0.146f, -0.146f, 0.156f, -0.347f)
                reflectiveQuadToRelative(-0.156f, -0.366f)
                reflectiveQuadToRelative(-0.357f, -0.166f)
                reflectiveQuadToRelative(-0.356f, 0.166f)
                close()
                moveTo(12.0f, 20.843f)
                quadToRelative(-0.136f, 0.0f, -0.286f, -0.025f)
                reflectiveQuadToRelative(-0.281f, -0.075f)
                quadTo(8.48f, 19.617f, 6.74f, 16.926f)
                reflectiveQuadTo(5.0f, 11.1f)
                verticalLineTo(6.817f)
                quadToRelative(0.0f, -0.51f, 0.295f, -0.923f)
                reflectiveQuadToRelative(0.755f, -0.6f)
                lineToRelative(5.385f, -2.0f)
                quadToRelative(0.292f, -0.106f, 0.565f, -0.106f)
                reflectiveQuadToRelative(0.566f, 0.106f)
                lineToRelative(5.384f, 2.0f)
                quadToRelative(0.46f, 0.187f, 0.755f, 0.6f)
                reflectiveQuadToRelative(0.295f, 0.923f)
                verticalLineTo(11.1f)
                quadToRelative(0.0f, 3.135f, -1.74f, 5.826f)
                reflectiveQuadToRelative(-4.693f, 3.816f)
                quadToRelative(-0.13f, 0.05f, -0.28f, 0.075f)
                reflectiveQuadToRelative(-0.287f, 0.025f)
                moveToRelative(0.0f, -0.942f)
                quadToRelative(2.6f, -0.825f, 4.3f, -3.3f)
                reflectiveQuadToRelative(1.7f, -5.5f)
                verticalLineTo(6.798f)
                quadToRelative(0.0f, -0.192f, -0.106f, -0.346f)
                quadToRelative(-0.105f, -0.154f, -0.298f, -0.23f)
                lineToRelative(-5.384f, -2.0f)
                quadToRelative(-0.096f, -0.04f, -0.212f, -0.04f)
                reflectiveQuadToRelative(-0.212f, 0.04f)
                lineToRelative(-5.384f, 2.0f)
                quadToRelative(-0.193f, 0.076f, -0.298f, 0.23f)
                quadTo(6.0f, 6.606f, 6.0f, 6.798f)
                verticalLineTo(11.1f)
                quadToRelative(0.0f, 3.025f, 1.7f, 5.5f)
                reflectiveQuadToRelative(4.3f, 3.3f)
                moveToRelative(0.0f, -7.861f)
            }
        }
        .build()
        return _iconStore!!
    }

private var _iconStore: ImageVector? = null
