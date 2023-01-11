package com.robosoft.weatherapp.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.robosoft.weatherapp.R

@Preview
@Composable
fun HomeContent(){
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (data) = createRefs()

        Column(modifier = Modifier
            .fillMaxWidth()
            .constrainAs(data) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(parent.top)
                height = Dimension.fillToConstraints
            }) {
            Text(text = "Wed, 28 Nov 2018    11:35 AM", fontSize = 13.sp ,modifier = Modifier.align(CenterHorizontally).padding(top = 54.dp), color = White.copy(alpha = 0.6f),)
            Text(text = "Udupi, Karnataka", fontSize = 18.sp,modifier = Modifier.align(CenterHorizontally).padding(top = 10.dp),color = White)
            Row(modifier = Modifier.align(CenterHorizontally).padding(top = 23.dp)) {
                Image(painter = painterResource(id = R.drawable.icon_favourite), contentDescription = "favourite icon")
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "Add to favourite",fontSize = 13.sp,color = White)
            }
        }
    }
}