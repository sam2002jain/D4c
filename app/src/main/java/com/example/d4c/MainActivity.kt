package com.example.d4c

import android.R.attr.category
import android.os.Bundle
import com.example.d4c.R
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.d4c.ui.theme.D4CTheme
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.Font


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        
        setContent {
            D4CTheme(darkTheme = true) {
                Scaffold(
                    topBar = { ShopHeader() },
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                            .verticalScroll(rememberScrollState()) // Add this
                    ) {
                        ShopFlowCard()
                        Categories()
                        ProductCard()
                        Spacer(modifier = Modifier.height(10.dp))
                        ProductCard()

                    }
                }
            }
        }
    }
}

@Composable
fun ShopFlowCard() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(240.dp)
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.shopflowcard1),
            contentDescription = "Offer Banner",
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(16.dp)),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .padding(24.dp)
                .align(Alignment.CenterStart)
        ) {
            Text(
                text = "GET 20% OFF",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Get 20% off",
                fontSize = 20.sp,
                color = Color.White,
                fontWeight = FontWeight.Normal
            )

            Spacer(modifier = Modifier.height(16.dp))

            Surface(
                color = Color(0xFFB5F40B),
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .wrapContentSize()
                    .height(30.dp)
            ) {
                Text(
                    text = "12-16 October",
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 2.dp),
                    color = Color.Black,
                    fontSize = 14.sp
                )
            }
        }

        Icon(
            imageVector = Icons.Default.Favorite,
            contentDescription = "Favorite",
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(24.dp)
                .size(32.dp),
            tint = Color.White
        )
    }
}

@Composable
fun ProductCard() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.cardbg),
            contentDescription = "Offer Banner",
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentScale = ContentScale.FillBounds
        )

        Image(
            painter = painterResource(id = R.drawable.productimage),
            contentDescription = "product Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(280.dp)
                .align(Alignment.TopCenter)
                .padding(top = 16.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentScale = ContentScale.Crop
        )

        Box(
            modifier = Modifier
                .width(350.dp)
                .height(170.dp)
                .align(Alignment.BottomCenter)
                .padding(bottom = 16.dp)
                .clip(RoundedCornerShape(16.dp))
        ) {
            Image(
                painter = painterResource(id = R.drawable.cardblackshape),
                contentDescription = "Black card background",
                modifier = Modifier
                    .fillMaxSize(),
                contentScale = ContentScale.FillBounds
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 12.dp, top = 5.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Clancera",
                        modifier = Modifier.padding(end = 8.dp),
                        color = Color(0xFFB5F40B),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic
                    )
                    Text(
                        text = "• In stock",
                        modifier = Modifier.padding(start = 8.dp).offset(x = -8.dp),
                        color = Color(0xFFB5F40B),
                        fontSize = 10.sp
                    )
                }
                Text(
                    text = "French clay and algae-powered cleanser",
                    modifier = Modifier.padding(top = 4.dp),
                    color = Color.White,
                    fontSize = 14.sp
                )
                Text(
                    text = "Skin Tightness • Dry & Dehyrated Skin",
                    modifier = Modifier.padding(top = 4.dp),
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium
                )
                Row(
                    modifier = Modifier.padding(top = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "RS. 355.20",
                        color = Color(0xFFB075F3),
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Medium
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "RS. 444.00",
                        color = Color.Gray,
                        fontSize = 16.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                }
                Row(
                    modifier = Modifier.padding(top = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "★★★★★",
                        color = Color(0xFFFFD700),
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "249 Reviews",
                        color = Color.White,
                        fontSize = 14.sp,
                        textDecoration = TextDecoration.Underline
                    )
                }
            }
        }


        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = (10).dp, y = -5.dp)
                .size(45.dp)
                .background(Color.Black, CircleShape)
                .border(2.dp, Color.Black, CircleShape)
        ) {
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "Favorite",
                modifier = Modifier
                    .align(Alignment.Center)
                    .size(32.dp),
                tint = Color(0xFFB075F3)
            )
        }
        Box(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .offset(x = (-7).dp, y = (-13).dp)
                .size(55.dp)
                .border(2.dp, Color(0xFFB5F40B), CircleShape)
        ) {
            Icon(
                imageVector = Icons.Default.ShoppingCart,
                contentDescription = "Add to Cart",
                modifier = Modifier
                    .align(Alignment.Center)
                    .size(30.dp),
                tint = Color(0xFFB5F40B)
            )
        }
    }
    Spacer(modifier = Modifier.height(10.dp))
}

@Composable
fun Categories(){
    Column {
//        ShopFlowCard()
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Categories",
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                fontSize = 20.sp,
                color = Color.White,
                modifier = Modifier.padding(horizontal = 10.dp)
            )
            Text(
                text = "See All",
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                fontSize = 12.sp,
                textDecoration = TextDecoration.Underline,
                color = Color.White,
                modifier = Modifier.padding(horizontal = 10.dp)
            )
        }
        Spacer(modifier = Modifier.padding(10.dp))

        Row(
            modifier = Modifier
                .padding(10.dp)
                .horizontalScroll(rememberScrollState())
        ) {
            categories.forEach { category ->
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(horizontal = 8.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(80.dp)
                            .background(category.backgroundColor, CircleShape)
                            .border(2.dp, category.borderColor, CircleShape)
                    ) {
                        Image(
                            painter = painterResource(id = category.imageRes),
                            contentDescription = category.name,
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp),
                            contentScale = ContentScale.Fit
                        )
                    }
                    Text(
                        text = category.name,
                        fontWeight = FontWeight.Light,
                        fontSize = 14.sp,
                        color = Color.White,
                    )
                }
            }
        }

        Spacer(modifier = Modifier.padding(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "New Products",
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                fontSize = 20.sp,
                color = Color.White,
                modifier = Modifier.padding(horizontal = 10.dp)
            )
            Text(
                text = "See All",
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                fontSize = 12.sp,
                textDecoration = TextDecoration.Underline,
                color = Color.White,
                modifier = Modifier.padding(horizontal = 10.dp)
            )
        }



    }
    Spacer(modifier = Modifier.padding(10.dp))
}

@Composable
fun RoundedCornerShape(x0: Dp) {
    TODO("Not yet implemented")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShopHeader() {
    TopAppBar(
        navigationIcon = {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back"
                    )
                }
                Text(
                    text = "Shop",
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic
                )
            }
        },
        title = { },
        actions = {
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Outlined.Search,
                    contentDescription = "Search"
                )
            }
            IconButton(onClick = {  }) {
                Icon(
                    imageVector = Icons.Outlined.FavoriteBorder,
                    contentDescription = "Favorites"
                )
            }
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Outlined.ShoppingCart,
                    contentDescription = "Cart"
                )
            }
        }
    )
}

data class CategoryItem(
    val name: String,
    val imageRes: Int,
    val backgroundColor: Color = Color.Black,
    val borderColor: Color = Color.Black
)

private val categories = listOf(
    CategoryItem("Cleaners", R.drawable.productimage),
    CategoryItem("Toners",R.drawable.categorysample),
    CategoryItem("Serums",R.drawable.productimage),
    CategoryItem("Moisturisers",R.drawable.categorysample),
    CategoryItem("Sunscreen",R.drawable.productimage)
)

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    D4CTheme(darkTheme = true) {
        Scaffold(
            topBar = { ShopHeader() },
            modifier = Modifier.background(Color.Black)
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ) {
                ShopFlowCard()
                Categories()
                ProductCard()
                ProductCard()
            }
        }
    }
}