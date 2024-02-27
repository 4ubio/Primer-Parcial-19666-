package com.example.primerparcial_19666.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.primerparcial_19666.R
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext

@Composable
fun Screen_A() {
    var winText: String by remember { mutableStateOf("") }
    var whiteMove: Boolean by remember { mutableStateOf(false) }
    var blackMove: Boolean by remember { mutableStateOf(false) }
    var isAlreadyClicked: Boolean by remember { mutableStateOf(false) }
    var secondText: String by remember { mutableStateOf("") }

    val context = LocalContext.current

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        //Board
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
        ) {
            Column (
                modifier = Modifier.height(360.dp),
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Text(text = "6", color = Color(0xFF030303), fontWeight = FontWeight.Bold)
                Text(text = "5", color = Color(0xFF030303), fontWeight = FontWeight.Bold)
                Text(text = "4", color = Color(0xFF030303), fontWeight = FontWeight.Bold)
                Text(text = "3", color = Color(0xFF030303), fontWeight = FontWeight.Bold)
                Text(text = "2", color = Color(0xFF030303), fontWeight = FontWeight.Bold)
                Text(text = "1", color = Color(0xFF030303), fontWeight = FontWeight.Bold)
            }

            Spacer(modifier = Modifier.width(5.dp))

            Column (

            ) {
                Box (modifier = Modifier
                    .background(Color(0xFF69B00B))
                    .size(60.dp)) {}
                Box (modifier = Modifier
                    .background(Color(0xFFFFE4C4))
                    .size(60.dp)
                    .clickable {
                        Toast
                            .makeText(context, "Soy una Torre Negra.", Toast.LENGTH_LONG)
                            .show()
                    }
                ) {
                    if (!blackMove) {
                        Image(painter = painterResource(id = R.drawable.black_rook), contentDescription = "Piece", modifier = Modifier.align(
                            Alignment.Center))
                    }
                }
                Box (modifier = Modifier
                    .background(Color(0xFF69B00B))
                    .size(60.dp)) {}
                Box (modifier = Modifier
                    .background(Color(0xFFFFE4C4))
                    .size(60.dp)) {}
                Box (modifier = Modifier
                    .background(Color(0xFF69B00B))
                    .size(60.dp)) {}
                Box (modifier = Modifier
                    .background(Color(0xFFFFE4C4))
                    .size(60.dp)
                    .clickable {
                        Toast
                            .makeText(context, "Soy una Torre Negra.", Toast.LENGTH_LONG)
                            .show()
                    }
                ) {
                    if (blackMove) {
                        Image(painter = painterResource(id = R.drawable.black_rook), contentDescription = "Piece", modifier = Modifier.align(
                            Alignment.Center))
                    }
                }
                Text(text = "a", color = Color(0xFF030303), fontWeight = FontWeight.Bold, modifier = Modifier.align(
                    Alignment.CenterHorizontally))
            }

            Column (

            ) {
                Box (modifier = Modifier
                    .background(Color(0xFFFFE4C4))
                    .size(60.dp)
                    .clickable {
                        Toast
                            .makeText(context, "Soy una Dama Blanca.", Toast.LENGTH_LONG)
                            .show()
                    }
                ) {
                    if (whiteMove) {
                        Image(painter = painterResource(id = R.drawable.white_queen), contentDescription = "Piece", modifier = Modifier.align(
                            Alignment.Center))
                    }
                }
                Box (modifier = Modifier
                    .background(Color(0xFF69B00B))
                    .size(60.dp)) {}
                Box (modifier = Modifier
                    .background(Color(0xFFFFE4C4))
                    .size(60.dp)) {}
                Box (modifier = Modifier
                    .background(Color(0xFF69B00B))
                    .size(60.dp)
                    .clickable {
                        Toast
                            .makeText(context, "Soy una Dama Blanca.", Toast.LENGTH_LONG)
                            .show()
                    }
                ) {
                    if (!whiteMove) {
                        Image(painter = painterResource(id = R.drawable.white_queen), contentDescription = "Piece", modifier = Modifier.align(
                            Alignment.Center))
                    }
                }
                Box (modifier = Modifier
                    .background(Color(0xFFFFE4C4))
                    .size(60.dp)) {}
                Box (modifier = Modifier
                    .background(Color(0xFF69B00B))
                    .size(60.dp)) {}
                Text(text = "b", color = Color(0xFF030303), fontWeight = FontWeight.Bold, modifier = Modifier.align(
                    Alignment.CenterHorizontally))
            }

            Column (

            ) {
                Box (modifier = Modifier
                    .background(Color(0xFF69B00B))
                    .size(60.dp)) {}
                Box (modifier = Modifier
                    .background(Color(0xFFFFE4C4))
                    .size(60.dp)
                    .clickable {
                        Toast
                            .makeText(context, "Soy un Peón Negro.", Toast.LENGTH_LONG)
                            .show()
                    }
                ) {
                    Image(painter = painterResource(id = R.drawable.black_pawn), contentDescription = "Piece", modifier = Modifier.align(
                        Alignment.Center))
                }
                Box (modifier = Modifier
                    .background(Color(0xFF69B00B))
                    .size(60.dp)) {}
                Box (modifier = Modifier
                    .background(Color(0xFFFFE4C4))
                    .size(60.dp)) {}
                Box (modifier = Modifier
                    .background(Color(0xFF69B00B))
                    .size(60.dp)
                    .clickable {
                        Toast
                            .makeText(context, "Soy un Peón Blanco.", Toast.LENGTH_LONG)
                            .show()
                    }
                ) {
                    Image(painter = painterResource(id = R.drawable.white_pawn), contentDescription = "Piece", modifier = Modifier.align(
                        Alignment.Center))
                }
                Box (modifier = Modifier
                    .background(Color(0xFFFFE4C4))
                    .size(60.dp)) {}
                Text(text = "c", color = Color(0xFF030303), fontWeight = FontWeight.Bold, modifier = Modifier.align(
                    Alignment.CenterHorizontally))
            }

            Column (

            ) {
                Box (modifier = Modifier
                    .background(Color(0xFFFFE4C4))
                    .size(60.dp)) {}
                Box (modifier = Modifier
                    .background(Color(0xFF69B00B))
                    .size(60.dp)
                    .clickable {
                        Toast
                            .makeText(context, "Soy un Peón Negro.", Toast.LENGTH_LONG)
                            .show()
                    }
                ) {
                    Image(painter = painterResource(id = R.drawable.black_pawn), contentDescription = "Piece", modifier = Modifier.align(
                        Alignment.Center))
                }
                Box (modifier = Modifier
                    .background(Color(0xFFFFE4C4))
                    .size(60.dp)) {}
                Box (modifier = Modifier
                    .background(Color(0xFF69B00B))
                    .size(60.dp)) {}
                Box (modifier = Modifier
                    .background(Color(0xFFFFE4C4))
                    .size(60.dp)
                    .clickable {
                        Toast
                            .makeText(context, "Soy un Peón Blanco.", Toast.LENGTH_LONG)
                            .show()
                    }
                ) {
                    Image(painter = painterResource(id = R.drawable.white_pawn), contentDescription = "Piece", modifier = Modifier.align(
                        Alignment.Center))
                }
                Box (modifier = Modifier
                    .background(Color(0xFF69B00B))
                    .size(60.dp)) {}
                Text(text = "d", color = Color(0xFF030303), fontWeight = FontWeight.Bold, modifier = Modifier.align(
                    Alignment.CenterHorizontally))
            }

            Column (

            ) {
                Box (modifier = Modifier
                    .background(Color(0xFF69B00B))
                    .size(60.dp)
                    .clickable {
                        Toast
                            .makeText(context, "Soy un Rey Negro.", Toast.LENGTH_LONG)
                            .show()
                    }
                ) {
                    Image(painter = painterResource(id = R.drawable.black_king), contentDescription = "Piece", modifier = Modifier.align(
                        Alignment.Center))
                }
                Box (modifier = Modifier
                    .background(Color(0xFFFFE4C4))
                    .size(60.dp)
                    .clickable {
                        Toast
                            .makeText(context, "Soy un Peón Negro.", Toast.LENGTH_LONG)
                            .show()
                    }
                ) {
                    Image(painter = painterResource(id = R.drawable.black_pawn), contentDescription = "Piece", modifier = Modifier.align(
                        Alignment.Center))
                }
                Box (modifier = Modifier
                    .background(Color(0xFF69B00B))
                    .size(60.dp)) {}
                Box (modifier = Modifier
                    .background(Color(0xFFFFE4C4))
                    .size(60.dp)) {}
                Box (modifier = Modifier
                    .background(Color(0xFF69B00B))
                    .size(60.dp)
                    .clickable {
                        Toast
                            .makeText(context, "Soy un Peón Blanco.", Toast.LENGTH_LONG)
                            .show()
                    }
                ) {
                    Image(painter = painterResource(id = R.drawable.white_pawn), contentDescription = "Piece", modifier = Modifier.align(
                        Alignment.Center))
                }
                Box (modifier = Modifier
                    .background(Color(0xFFFFE4C4))
                    .size(60.dp)
                    .clickable {
                        Toast
                            .makeText(context, "Soy un Rey Blanco.", Toast.LENGTH_LONG)
                            .show()
                    }
                ) {
                    Image(painter = painterResource(id = R.drawable.whie_king), contentDescription = "Piece", modifier = Modifier.align(
                        Alignment.Center))
                }
                Text(text = "e", color = Color(0xFF030303), fontWeight = FontWeight.Bold, modifier = Modifier.align(
                    Alignment.CenterHorizontally))
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Anatholy Karpov vs Gary Kasparov", fontSize = 20.sp)
            Text(text = "Rusia 1993", fontSize = 20.sp, fontStyle = FontStyle.Italic)
            Spacer(modifier = Modifier.height(30.dp))
            Text(text = secondText, fontSize = 15.sp, color = Color(0xFFFF0000))
            Text(text = winText, fontSize = 30.sp, fontWeight = FontWeight.Bold)
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = {
                    if (!isAlreadyClicked) {
                        whiteMove = true
                        isAlreadyClicked = true
                        winText = "Ganan las Blancas"
                    } else {
                        secondText = "Ya hay un ganador. Favor de dar clic en Reiniciar"
                    }
                },
                colors = ButtonDefaults.buttonColors(Color(0xFF69B00B)),
            ) {
                Text(text = "Juegan Blancas", color = Color(0xFF000000))
            }


            Button(
                onClick = {
                    if (!isAlreadyClicked) {
                        blackMove = true
                        isAlreadyClicked = true
                        winText = "Ganan las Negras"

                        Toast
                            .makeText(context, "Las blancas se rinden, ¡Kasparov es Campeón!", Toast.LENGTH_LONG)
                            .show()
                    } else {
                        secondText = "Ya hay un ganador. Favor de dar clic en Reiniciar"
                    }
                },
                colors = ButtonDefaults.buttonColors(Color(0xFF000000)),
            ) {
                Text(text = "Juegan Negras", color = Color(0xFF69B00B))
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = {
                    whiteMove = false
                    blackMove = false
                    isAlreadyClicked = false
                    winText = ""
                    secondText = ""
                },
                colors = ButtonDefaults.buttonColors(Color(0xFF69B00B)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Reiniciar", color = Color(0xFF000000))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview_A() {
    Screen_A()
}