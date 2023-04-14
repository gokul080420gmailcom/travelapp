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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelapp.ui.theme.TravelAppTheme

class ParisActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    Column(
        modifier = Modifier.background(color = Color.White)
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            fontSize = 40.sp,
            color = Color(android.graphics.Color.rgb(120, 40, 251)),
            fontFamily = FontFamily.Cursive,
            text = stringResource(id = R.string.place_2),
        )
        Image(
            painterResource(id = R.drawable.dubai1), contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(200.dp)
                .scale(scaleX = 1.2F, scaleY = 1F)
        )
        Text(
            color=Color.Black,
            text ="Day 1: The Burj Khalifa\n"+
                    "Morning: It would be best to arrive at Dubai International Airport (DXB) in the evening to get the most out of your  vacation.\n"+
                    "Hotels are one of Dubai’s great talents.\n"+
                    "A stay in any one of the hotels would be not only comfortable but also luxurious.\n"+
                    "Any of the hotels owned by the Jumeirah Group would be excellent options.\n"+
                    "Enjoy breakfast at your hotel before you head off for your first Dubai adventure!\n"+

                    "Afternoon: Start off with the most obvious sights in the city.\n"+
                    "One of Dubai’s shining attractions is its stunning and seemingly inconceivable architecture.\n"+
                    "And one of the first things tourists need to do when they head to this impressive city is to check out its two iconic structures that stand like beacons in the desert: the Burj Khalifa and Burj al Arab.\n"+
                    "Lucky for tourists, one of the main Dubai tourist attractions are these two buildings, and there are plenty of guided tours that help give the tourists what they want.\n"+

                    "\n" +

                    "Day 2: Do the Desert Safari\n"+
                    "No one comes to Dubai WITHOUT going on a desert safari. This is another one of the top 10 things to do in Dubai.\n"+
                    "It’s also reminds tourists that there a desert out there. The shiny buildings, ice rinks, luxurious hotels, and ski slopes can distract from the sandy dunes.\n"+
                    "But, the beauty of the desert should not be neglected. Watching the sun set over the desert and seeing its peachy glow spread from dune to dune, is one sight not worth missing.\n"+

                    "Morning: A includes “dune-bashing” with a 4×4, camel-riding, henna tattoos, a belly-dancing show, and a dinner (It should preferably be booked before the vacation).\n"+
                    "A dune-bashing driver will pick you and your group up from any hotel that you wish in the late morning.\n"+

                    "Afternoon: It will be about a 45 minute to an hour drive to the desert destination. Dune-bashing is in a protected vehicle with an experienced driver.\n"+
                    "Once he arrives in the desert, he deflates his wheels, and away you go flying from dune to dune, sliding around, going down hills, and sliding over the sandy surface.\n"+
                    "It’s a bumpy ride but it’s super exciting and still safe! And, the driver stops in the middle of the desert in order to take group pictures.\n"+

                    "Evening: Then, as the sun is setting, he returns you the encampment, where there is camel riding, henna tattoo artists, and then dinner and a show! Enjoy a belly-dancing show among other acrobatic feats along with an Arabian style meal.\n"+
                    "It’s a great way to enjoy the desert life. Tickets are about 50 dollars.\n"+

                    "\n" +

                    "Day 3: Dubai Beach + Nightlife\n"+
                    "Morning: Don’t forget that Dubai is a beach city. You can feel it in the salty breeze and the bright sun.\n"+
                    "The beaches of this Arabian city are absolutely pristine and tourists can gain quality beach access through their hotel or another if they pay a small fee.\n"+
                    "A great beach choice is in Jumeirah Beach Residence (JBR) (taxi drivers will know what you mean).\n"+

                    "Afternoon: Spend the afternoon soaking up the sun and even enjoying the inflatable “water park” out on the water.\n"+
                    "Evening: Dubai tourism is growing because of all of the things there are to do and nightlife is no exception.\n"+
                    "As a general rule with a few outliers, bars, clubs, and restaurants that serve alcohol are only located in hotels.\n"+
                    "So, almost every hotel, especially high class hotels, will have either a club or restaurant or bar.\n"+

                    "\n" +

                    "DAY 4 of the 7-DAY DUBAI ITINERARY\n"+
                    "Palm Jumeirah, Atlantis the Palm, Waterpark, The Pointe\n"+
                    "You can get to the Atlantis the Palm, either by monorail or by taxi.\n"+
                    "The monorail is much better because the view is so much nicer than from a taxi.\n"+

                    "HOW TO GET TO THE MONORAIL (Palm Jumeirah Monorail Footbridge)\n"+

                    "Fastest way: By taxi. Take the tram to the Internet City and then from there take a taxi.\n"+

                    "Cheapest way: Take the metro to the Damac Properties (Dubai Marina) and then change for the tram to Palm Jumeirah, and then take the walk to the Palm Gateway.\n"+
                    "You will have to walk through a parking lot to find the monorail.\n"+

                    "Monorail ticket: You can only buy your ticket on the spot. A single ticket costs 20 AED (~5 USD) and a return ticket costs 30 AED (~8 USD).\n"+
                    "You can also use the NOL card to pay for your ticket.\n"+
                   "\n" +
                    "Day 5: SEE UNIQUE MARINE CREATURES AT DUBAI AQUARIUM AND UNDERWATER ZOO\n"+
                    "It’s one of the largest and best Aquariums in the world and an absolutely incredible place home to over 33,000 beautiful marine creatures.\n"+
                    "Make sure you don’t miss the gigantic King Cros which is more than 700 kilograms ( 1543 lbs).\n"+
                    "You can see part of the aquarium from outside and take photos in front of the Aquarium. It’s in front of the restaurant called Cheese Cake Factory.\n"+
                    "Btw, It’s a super popular restaurant.\n"+

                    "Nevertheless, don’t miss the Aquarium and Underwater Zoo. Walking through its 48-meter-long underwater tunnel is an absolutely magical experience.\n"
        )
    }
}

