package com.hananfarizta.marketapp.component


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hananfarizta.marketapp.R
import com.hananfarizta.marketapp.ui.theme.Green
import com.hananfarizta.marketapp.ui.theme.MarketAppTheme

@Composable
fun MainTopBar(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(16.dp)
    ) {
        Row(
            modifier = modifier.width(IntrinsicSize.Max),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            OutlinedTextField(
                modifier = modifier
                    .weight(1f)
                    .height(50.dp),
                value = "",
                onValueChange = {},
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Search,
                        contentDescription = null,
                    )
                },
                placeholder = {
                    Text(
                        text = "Search here",
                        style = MaterialTheme.typography.bodyMedium
                    )
                },
                shape = RoundedCornerShape(16.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedTextColor = Color.LightGray,
                    unfocusedBorderColor = Color.LightGray,
                    unfocusedLabelColor = Color.LightGray,
                    unfocusedLeadingIconColor = Color.Gray,
                ),
                textStyle = MaterialTheme.typography.bodySmall,
                singleLine = true,
            )
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = modifier.padding(start = 8.dp)
            ) {
                Icon(imageVector = Icons.Outlined.Email, contentDescription = null)
                Icon(imageVector = Icons.Outlined.Notifications, contentDescription = null)
                Icon(imageVector = Icons.Outlined.ShoppingCart, contentDescription = null)
                Icon(imageVector = Icons.Outlined.Menu, contentDescription = null)
            }
        }
        Row(
            modifier = modifier.padding(top = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            Icon(
                imageVector = Icons.Filled.LocationOn,
                contentDescription = null,
                tint = Green,
                modifier = modifier
                    .size(18.dp)
            )
            Text(
                text = stringResource(id = R.string.txt_dummy_address),
                style = MaterialTheme.typography.bodySmall,
                color = Color.Gray,
                fontSize = 12.sp,
            )
            Text(
                text = stringResource(id = R.string.txt_dummy_username),
                style = MaterialTheme.typography.labelSmall,
                color = Color.DarkGray,
                fontSize = 12.sp,
            )
            Icon(
                imageVector = Icons.Rounded.KeyboardArrowDown,
                contentDescription = null,
                modifier = modifier.size(18.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainTopBarPreview() {
    MarketAppTheme {
        MainTopBar()
    }
}