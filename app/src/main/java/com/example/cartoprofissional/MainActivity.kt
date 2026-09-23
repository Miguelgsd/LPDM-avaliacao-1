package com.example.cartoprofissional

import android.os.Bundle
import android.provider.ContactsContract
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartoprofissional.ui.theme.CartãoProfissionalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CartãoProfissionalTheme {
                Scaffold(modifier = Modifier.fillMaxSize().background(Color(0xFF6C6C6C))) { innerPadding ->
                    Project(name2 = "Usuário da Silva Jr.",
                            cargo1 = "- Programador ",
                            cargo2 = "- Pentester",
                            modifier = Modifier.padding(paddingValues = innerPadding).fillMaxSize().background(Color(0xFF6C6C6C)))
                }
            }
        }
    }
}

@Composable
fun Project(name2: String, cargo1: String, cargo2: String, modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.user)
    Box(modifier){
        Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Image(painter = image,
                contentDescription = null,
                contentScale = ContentScale.Crop
            )

            Greeting(name = name2,
                cargo1 = cargo1,
                cargo2 = cargo2)
        }

    }
}

@Composable
fun Greeting(name: String, cargo1: String, cargo2: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier,
        verticalArrangement = Arrangement.Center) {
        Text(
            text = "Olá, como vai?",
            fontSize = 55.sp,
            textAlign = TextAlign.Center,
            modifier = modifier.fillMaxWidth().padding(top = 15.dp)
        )

        Text(
            text = name,
            fontSize = 35.sp,
            textAlign = TextAlign.Center,
            modifier = modifier.fillMaxWidth().padding(top = 30.dp)
        )


    Row(modifier = modifier.align(Alignment.CenterHorizontally).padding(top = 5.dp)) {
        Text(
            text = cargo1,
            fontSize = 18.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = cargo2,
            fontSize = 18.sp,
            textAlign = TextAlign.Center
        )
    }

    About(modifier.padding(top = 10.dp))

        Text(
            text = "Contatos",
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            modifier = Modifier.fillMaxWidth().padding(top = 20.dp, bottom = 10.dp)
        )
    Contacts(modifier)}

}

@Composable
fun About(modifier: Modifier = Modifier){
    Column(modifier = modifier, verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Sobre mim",
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth().padding(top = 15.dp)
        )

        Text(
            text = "Formado em Análise e Desenvolvimento de Sistemas (ADS), atuo como programador no mercado desde 2010. Atualmente, me especializei também em testes de intrusão (Pentest)",
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
    }

}

@Composable
fun Contacts(modifier: Modifier = Modifier){
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = Icons.Default.Call,
            contentDescription = null,
            tint = Color(0xFF308FB9)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = "+55 11 7070-7070")}

    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = Icons.Default.Email,
            contentDescription = null,
            tint = Color(0xFF308FB9)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = "user_especial@teste.com")}

    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = Icons.Default.LocationOn,
            contentDescription = null,
            tint = Color(0xFF308FB9)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = "Empresa de Programação, São Paulo")}
}
