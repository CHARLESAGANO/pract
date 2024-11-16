package com.example.act7BaguioCity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelForMain : ViewModel() {
    private val _location = MutableLiveData<List<Location>>()
    val location: LiveData<List<Location>> get() = _location

    private val locationData = mapOf(
        "Food Trip" to listOf(
            Location("Good Taste", R.drawable.botanical_garden, "Kid-Friendly Places", "Great for kids to explore nature, with walking trails, sculptures, and native huts.", "Location: Leonard Wood Road, Baguio City"),
            Location("Pizza Volante", R.drawable.burnham_park, "Kid-Friendly Places", "Perfect for family outings, featuring a lake for boat rides, bike rentals, and playgrounds.", "Location: Jose Abad Santos Drive, Baguio City"),
            Location("Sizzling Plate", R.drawable.children_park, "Kid-Friendly Places", "Fun playground and picnic area, with swings, slides, and spacious grounds.", "Location: Burnham Park, Baguio City"),
            Location("Pet's Bulaluhan", R.drawable.camp_john_hay, "Kid-Friendly Places", "A nature and recreation site with picnic spots, hiking trails, and scenic views.", "Location: Loakan Road, Baguio City"),

        ),

        "Schools" to listOf(
            Location("University of the Cordilleras", R.drawable.wright_park, "Parks", "Great for horseback riding and scenic views of pine trees.", "Location: Gibraltar Road, Baguio City"),
            Location("Saint Louis Univesity", R.drawable.mines_view_park, "Parks", "Offers breathtaking mountain views and souvenir shopping.", "Location: Outlook Drive, Baguio City"),
            Location("University of Baguio", R.drawable.sunshine_park, "Parks", "A relaxing spot with beautiful gardens and vibrant flowers.", "Location: Upper Session Road, Baguio City"),
        ),

        "Parks" to listOf(
            Location("Burnham Park", R.drawable.good_taste, "Restaurants", "Known for affordable prices and generous portions of Filipino and Chinese dishes.", "Location: Carino St, Baguio City, Benguet"),
            Location("Sunshine Park", R.drawable.oh_my_gulay, "Restaurants", "Famous for its vegetarian and artfully presented dishes in a unique, bohemian atmosphere.", "Location: 5th Floor, La Azotea Building, Session Road, Baguio City"),
            Location("Baguio Post Office Park", R.drawable.cafe_by_the_uins, "Restaurants", "Offers locally inspired cuisine with fresh ingredients in a rustic, cultural ambiance.", "Location: 25 Shuntug Rd, Baguio City, Benguet"),
            Location("Rizal park", R.drawable.lemon_olives, "Restaurants", "Popular for authentic Greek cuisine with a scenic outdoor seating area overlooking Baguio's natural beauty.", "Location: 26 Outlook Drive, Baguio City, Benguet"),
            ),


        "Computer Shop" to listOf(
            Location("Nostrax", R.drawable.sm_baguio, "Shopping Centers", "SM Baguio is a vibrant shopping destination with stores, dining, and entertainment in a cool, open-air setting.", "Location: Luneta Hill, Upper Session Road, Baguio City, Benguet."),
            Location("GG gamers", R.drawable.porta_vaga_mall, "Shopping Centers", "Porta Vaga Mall in Baguio offers themed buildings, a department store, food lane, and boutiques, focusing on social and environmental responsibility.", "Location: Upper Session Road, Baguio City, Benguet."),
            Location("GG gamers 2", R.drawable.baguio_center_mall, "Shopping Centers", "Baguio Center Mall is a bustling shopping spot with diverse stores, dining, and entertainment, popular with locals and tourists.", "Location: Magsaysay Ave, Baguio City, Benguet."),
            ),


        "Cafe" to listOf(
            Location("Spade Super Club", R.drawable.spade_super_club, "Club and Bar", "Lively bar offering cocktails, a dance floor, and regular events, ideal for socializing.", "Location: 9 Military Cutoff Rd, Baguio City, Benguet."),
            Location("The Camp", R.drawable.the_camp, "Club and Bar", "An outdoor bar with a cozy vibe, ideal for gatherings and enjoying the fresh air.", "Location: 7 Loakan Rd, Baguio City, Benguet."),
            Location("The Ampersand", R.drawable.the_ampersand, "Club and Bar", "A stylish bar offering craft cocktails and an extensive wine selection, perfect for a night out.", "Location: 46 Upper Session Rd, Baguio City, Benguet."),
            Location("Hotline Bar", R.drawable.hotline_bar, "Club and Bar", "A popular spot for locals and tourists, offering a relaxed vibe with great drinks and a friendly atmosphere.", "Location: 4, Magsaysay Ave, Baguio City, Benguet."),
            Location("Publiquo Bar", R.drawable.publiquo_bar, "Club and Bar", "Known for its vibrant atmosphere and affordable drinks, ideal for casual hangouts.", "Location: 22 S. B. G. Avenue, Baguio City, Benguet.")
        )



    )


    fun loadLocation(category: String) {
        _location.value = locationData[category] ?: emptyList()
    }
}