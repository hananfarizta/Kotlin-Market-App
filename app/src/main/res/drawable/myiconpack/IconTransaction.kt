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

public val MyIconPack.IconTransaction: ImageVector
    get() {
        if (_iconTransaction != null) {
            return _iconTransaction!!
        }
        _iconTransaction = Builder(name = "IconTransaction", defaultWidth = 1.0.dp, defaultHeight =
                1.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 7.0f)
                horizontalLineToRelative(8.0f)
                moveToRelative(-8.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                moveToRelative(-8.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                moveToRelative(8.0f, 6.0f)
                verticalLineTo(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineTo(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                lineToRelative(2.5f, -2.0f)
                lineToRelative(3.0f, 2.0f)
                lineToRelative(2.5f, -2.0f)
                lineToRelative(2.5f, 2.0f)
                lineToRelative(3.0f, -2.0f)
                close()
            }
        }
        .build()
        return _iconTransaction!!
    }

private var _iconTransaction: ImageVector? = null
