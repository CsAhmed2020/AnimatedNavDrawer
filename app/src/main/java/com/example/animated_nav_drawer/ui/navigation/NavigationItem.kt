package com.example.animated_nav_drawer.ui.navigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import com.google.accompanist.flowlayout.FlowRow
import com.google.accompanist.flowlayout.MainAxisAlignment
import com.google.accompanist.flowlayout.SizeMode
import androidx.compose.material3.*
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.Modifier
import com.example.animated_nav_drawer.ui.theme.White

@ExperimentalMaterial3Api
@Composable
fun NavigationItem(
    resId: Int,
    text: String,
    topPadding: Dp = 10.dp,
    itemColor:Color = White,
    itemClicked: () -> Unit
) {
    Column(horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 5.dp, top = topPadding)
            .clickable { itemClicked() }
    ) {
        FlowRow(
            modifier = Modifier.fillMaxWidth(),
            mainAxisSpacing = 8.dp,
            mainAxisSize = SizeMode.Wrap,
            mainAxisAlignment = MainAxisAlignment.End
        ){
            AssistChip(
                onClick = { },
                colors = AssistChipDefaults.assistChipColors(
                    trailingIconContentColor = itemColor,
                ),
                border = AssistChipDefaults.assistChipBorder(
                    borderWidth = 0.dp,
                    borderColor = Color.Transparent
                ),
                trailingIcon = {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = resId),
                        contentDescription = null,
                    )
                },
                label = {
                    Text(text = text,color = itemColor)
                }
            )
        }
    }
}