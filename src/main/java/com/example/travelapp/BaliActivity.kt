package com.example.travelapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelapp.ui.theme.TravelAppTheme

class BaliActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PlaceOne()
                }
            }
        }
    }
}

@Composable
fun PlaceOne() {
    Column(modifier = Modifier.background(color = Color.White)
        .padding(20.dp)
        .verticalScroll(rememberScrollState())
    ) {
        Text(
            fontSize = 50.sp,
            color = Color(android.graphics.Color.rgb(120, 40, 251)),
            fontFamily = FontFamily.Cursive,
            text = stringResource(id = R.string.place_1),
        )
        Image(
            painterResource(id = R.drawable.india), contentDescription = "",
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()
                .height(150.dp)
                .scale(scaleX = 1.2F, scaleY = 1F)
        )
        Text(
            color=Color.Black,
            text = "Day 1: Arrive in Chennai, Transfer to Mahabalipuram Tamilnadu, India \n"+
                    "Take an evening stroll along the Mahabalipuram beach. \n"+
                    "Welcome to southern India! Meet your driver at the Chennai airport with a welcome in Tamil before setting off down the coast to the village of Mahabalipuram (one hour).\n"+
                    "An ancient port of the Pallava dynasty, Mahabalipuram dates back to the seventh century and is famous for its many temples and beautiful beaches.\n"+
                    "Depending on your arrival time, drop your things off at your hotel and go for a walk on the beach and enjoy the refreshing sea air. In the evening, enjoy traditional spiced Tamil cuisine.\n"+
                    "\n" +

                    "Day 2: Explore Shore Temple, Transfer to Pondicherry India \n"+
                    "Rise early this morning to explore the sandcastle-like Shore temple at mahabalipuram on the Coromandel Coast.\n"+
                    "Admire the thousands of sculptures dedicated to Shiva lit by the golden morning light.\n"+
                    "Continue your way through the sprawling complex until you reach the Descent of the Ganges monument, a massive rock relief carved on two boulders.\n"+
                    "Admire the precision of the Indian sculptors of this period.\n"+
                    "Next, visit the famous Pancha Rathas, also known as the Five Rathas, a monument complex made up of five chariot-shaped temples in procession, each carved from a single rock of granite.\n"+
                    "\n" +

                    "Day 3: Discover Chola Dynasty Temples, Transfer to Thanjavur Nataraja temple, Chidambaram, TamilNadu, SouthIndia\n"+
                    "Colorful detail of the Thillai Nataraja Temple\n"+
                    "After breakfast, you'll head south to explore three major temples of the Chola dynasty, stopping first at the Thillai Nataraja Temple (also known as the Chidambaram Nataraja Temple) in Chidambaram (two hours).\n"+
                    "A Hindu temple erected to the lord of dance, Shiva, it is a UNESCO-protected site and an excellent example of the Chola dynasty craftsmanship typical of South India.\n"+
                    "Wander the temple complex and discover the colorful artwork of the nine gopurams (monumental, ornate entrance tower).\n"+

                    "Next, continue to the temple of Lord Brihadisvara in the former capital of the Chola dynasty, Gangaikonda Cholapuram, before driving another hour farther inland to Darasuram to check out the 12th-century AiravateswaraTemple.\n"+
                    "From here, it's another hour west to your hotel in Thanjavur.\n"+
                    "\n" +

                    "Day 4: Cruise Kerala Backwaters at Kumarakom Houseboat stay in Kumarakom, India\n"+
                    "Cruise Kerala's backwaters on a kettuvallam\n"+
                    "This morning, trade in the Western Ghats for the backwaters of Kerala and head to Kumarakom (3.5 hours).\n"+
                    "With an extensive network of lagoons and canals lined with thick vegetation and quaint villages, you'll board a kettuvallam (a thatched roof and wooden hull houseboat) and meander along the waterways of Vembanad Lake.\n"+
                    "Fall asleep in comfort on your kettuvallam, listening to the sounds of distant tropical birds.\n"+
                    "\n" +

                    "Day 5: Transfer to Cochin Kathakali performers, Fort Cochin, India\n"+
                    "Take in a Kathakali performance Disembark your kettuvallam this morning to meet your driver and make the drive north along the coast of the Laccadive Sea to Cochin (also known as Kochi).\n"+
                    "The cultural and historical capital of Kerala, Cochin, is a melting pot of cultures, including Portuguese, Jewish, Dutch, Hindu, and even Chinese heritage due to the centuries of colonization.\n"+
                    "\n" +

                    "Day 6: Train to Jhansi, Transfer to Orchha\n"+
                    "Watch the sunrise illuminate the Taj Majal\n"+
                    "Wake up at dawn to witness one of the highlights of your trip—a sunrise over the jewel-encrusted marble of the Taj Mahal.\n"+
                    "After breakfast, a private transfer takes you to the Agra Railway Station, where you'll board a train bound for Jhansi.\n"+
                    "Upon arrival, a private driver will meet you at the station and transfer you to your hotel in nearby Orchha, a historic town nestled on the banks of the river Betwa.\n"+
                    "\n" +
                    "Day 7: Welcome to Ladakh\n"+
                    "Leh\n"+
                    "Fly from New Delhi to Leh, a spectacular flight over the mountains.\n"+
                    "You may even be able to see K2, Nanga Parbat, and Gasherbrum.\n"+
                    "On arrival, your guide will meet you and take you to your hotel.\n"+

                    "Take it easy after arrival, as the altitude difference between Delhi and Leh is large (Leh is at 11,562 feet/3500 m).\n"+
                    "If you feel like it, head out to explore one of Leh's markets, which are a good introduction to the life and culture of the city.\n"
        )


    }
}

