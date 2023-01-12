package com.example.mlaku

import java.util.*


object PlacesData {
    private val placeNames = arrayOf(
        arrayOf(
            "Kalibiru",
            "Kalibiru adalah salah satu objek wisata yang terkenal di Jogja. Objek wisata ini terletak di Desa Kalibiru, Kecamatan Hargobinangun, Kabupaten Kulon Progo, sekitar 50 kilometer sebelah utara Kota Jogja. Kalibiru merupakan sebuah tempat wisata alam yang memiliki pemandangan indah hutan pinus dan tebing yang tinggi. Di Kalibiru, Anda dapat berjalan-jalan di taman yang terdapat di atas tebing, menikmati pemandangan indah dari atas tebing, atau bahkan melakukan trekking di hutan pinus. Selain itu, Anda juga dapat menikmati berbagai aktivitas wisata lainnya seperti menyusuri sungai dengan perahu atau bermain outbound. Kalibiru juga menyediakan berbagai fasilitas seperti warung makan, toilet, dan tempat parkir. Banyak wisatawan yang datang ke Kalibiru untuk menikmati keindahan alamnya, bersantai, atau menikmati berbagai aktivitas wisata lainnya. Kalibiru juga sering dijadikan tempat untuk menyelenggarakan berbagai acara, seperti pesta kembang api atau festival musik.",
            "${R.drawable.kalibiru}",
            "Kulon Progo - Yogyakarta",
            "Rp. 50.000",
            "-7.807401, 110.129268"
        ),
        arrayOf(
            "Bunker Kaliadem",
            "Bungker Kaliadem adalah salah satu objek wisata yang terkenal di Jogja. Objek wisata ini terletak di Desa Kaliadem, Kecamatan Cepit, Kabupaten Bantul, sekitar 20 kilometer sebelah selatan Kota Jogja. Bungker Kaliadem merupakan sebuah tempat wisata alam yang memiliki pemandangan indah tebing yang tinggi dan air terjun yang membentang di bawahnya. Di Bungker Kaliadem, Anda dapat berjalan-jalan di taman yang terdapat di atas tebing, menikmati pemandangan indah dari atas tebing, atau bahkan melakukan trekking di hutan pinus yang terdapat di sekitar tempat wisata. Selain itu, Anda juga dapat menikmati berbagai aktivitas wisata lainnya seperti menyusuri sungai dengan perahu atau bermain outbound. Bungker Kaliadem juga menyediakan berbagai fasilitas seperti warung makan, toilet, dan tempat parkir. Banyak wisatawan yang datang ke Bungker Kaliadem untuk menikmati keindahan alamnya, bersantai, atau menikmati berbagai aktivitas wisata lainnya. Bungker Kaliadem juga sering dijadikan tempat untuk menyelenggarakan berbagai acara, seperti pesta kembang api atau festival musik.",
            "${R.drawable.kaliadem}",
            "Sleman - Yogyakarta",
            "Rp. 50.000",
            "-7.582920, 110.447680"
        ),

        arrayOf(
            "Tebing Breksi",
            "Tebing Breksi adalah salah satu objek wisata yang terkenal di Jogja. Objek wisata ini terletak di Desa Breksi, Kecamatan Samigaluh, Kabupaten Kulon Progo, sekitar 40 kilometer sebelah utara Kota Jogja. Tebing Breksi merupakan sebuah tempat wisata alam yang memiliki pemandangan indah tebing yang tinggi dan gua yang terdapat di dalamnya. Di Tebing Breksi, Anda dapat berjalan-jalan di taman yang terdapat di atas tebing, menikmati pemandangan indah dari atas tebing, atau bahkan melakukan trekking di hutan pinus yang terdapat di sekitar tempat wisata. Selain itu, Anda juga dapat menikmati berbagai aktivitas wisata lainnya seperti menyusuri sungai dengan perahu atau bermain outbound. Tebing Breksi juga menyediakan berbagai fasilitas seperti warung makan, toilet, dan tempat parkir. Banyak wisatawan yang datang ke Tebing Breksi untuk menikmati keindahan alamnya, bersantai, atau menikmati berbagai aktivitas wisata lainnya. Tebing Breksi juga sering dijadikan tempat untuk menyelenggarakan berbagai acara, seperti pesta kembang api atau festival musik.",
            "${R.drawable.breksi}",
            "Yogyakarta",
            "Rp. 50.000",
            "-7.781571, 110.504582"
        ),

        arrayOf(
            "Malioboro",
            "Malioboro adalah salah satu objek wisata yang terkenal di Kota Jogja. Objek wisata ini terletak di Jalan Malioboro, Kota Jogja, dan merupakan salah satu pusat belanja, kuliner, dan hiburan di Kota Jogja. Malioboro dikenal sebagai tempat wisata yang ramai dan selalu penuh dengan wisatawan dan pengunjung lokal. Di Malioboro, Anda dapat menemukan berbagai toko, galeri, restoran, dan café yang menjual berbagai produk dan makanan khas Jogja. Selain itu, Anda juga dapat menemukan berbagai taman dan monumen yang terkenal di sekitar Malioboro, seperti Taman Sari, Benteng Vredeburg, dan Monumen Jogja Kembali. Malioboro juga menyediakan berbagai fasilitas seperti warung makan, toilet, dan tempat parkir. Banyak wisatawan yang datang ke Malioboro untuk berbelanja, menikmati kuliner khas Jogja, atau sekadar bersantai di taman-taman yang terdapat di sekitar objek wisata ini. Malioboro juga sering dijadikan tempat untuk menyelenggarakan berbagai acara, seperti pesta kembang api atau festival musik.",
            "${R.drawable.malioboro}",
            "Yogyakarta",
            "Rp. 50.000",
            "-7.792626, 110.365841"
        ),

        arrayOf(
            "Candi Prambanan",
            "Candi Prambanan adalah salah satu objek wisata yang terkenal di Kota Jogja. Objek wisata ini terletak di Desa Bokoharjo, Kecamatan Prambanan, Kabupaten Sleman, sekitar 18 kilometer sebelah timur Kota Jogja. Candi Prambanan merupakan sebuah kompleks candi Hindu terbesar di Indonesia yang dibangun pada abad ke-9. Candi ini terdiri dari 3 candi utama yang masing-masing diperuntukkan untuk Trimurti, yaitu Brahma, Vishnu, dan Shiva. Selain itu, di sekitar Candi Prambanan juga terdapat berbagai candi kecil yang terdiri dari 224 candi yang tersebar di sekitar kompleks candi. Di Candi Prambanan, Anda dapat menikmati pemandangan indah candi-candi yang berdiri tegak di tengah taman yang luas. Selain itu, Anda juga dapat mengunjungi museum yang terdapat di dalam kompleks candi untuk mengetahui lebih banyak tentang sejarah dan budaya Hindu di Indonesia. Candi Prambanan juga menyediakan berbagai fasilitas seperti warung makan, toilet, dan tempat parkir. Banyak wisatawan yang datang ke Candi Prambanan untuk menikmati keindahan candi-candi yang terdapat di dalam kompleks ini, atau untuk mengetahui lebih banyak tentang sejarah dan budaya Hindu di Indonesia.",
            "${R.drawable.prambanan}",
            "Sleman - Yogyakarta",
            "Rp. 50.000",
            "-7.751904, 110.491489"
        ),

        arrayOf(
            "Tugu Jogja",
            "Tugu Jogja adalah salah satu objek wisata yang terkenal di Kota Jogja. Objek wisata ini terletak di Jalan Pintu Besar Utara, Kota Jogja, dan merupakan salah satu monumen terkenal di Kota Jogja. Tugu Jogja adalah sebuah monumen yang dibangun pada tahun 1755 untuk mengenang kejayaan Kerajaan Mataram pada masa itu. Monumen ini terdiri dari sebuah tugu yang tinggi yang dikelilingi oleh taman yang luas. Di sekitar Tugu Jogja, Anda dapat menemukan berbagai toko, galeri, restoran, dan café yang menjual berbagai produk dan makanan khas Jogja. Selain itu, Anda juga dapat menikmati pemandangan indah Tugu Jogja yang terletak di tengah taman yang luas. Tugu Jogja juga menyediakan berbagai fasilitas seperti warung makan, toilet, dan tempat parkir. Banyak wisatawan yang datang ke Tugu Jogja untuk menikmati keindahan monumen yang terletak di tengah taman yang luas, atau untuk berbelanja di toko-toko yang terdapat di sekitar objek wisata ini. Tugu Jogja juga sering dijadikan tempat untuk menyelenggarakan berbagai acara, seperti pesta kembang api atau festival musik. Objek wisata ini menjadi salah satu ikon Kota Jogja dan menjadi salah satu tempat yang wajib dikunjungi oleh wisatawan yang berkunjung ke Kota Jogja.",
            "${R.drawable.tugu}",
            "Yogyakarta",
            "Rp. 50.000",
            "-7.782920, 110.367085"
        ),
        arrayOf(
            "Tamansari",
            "Taman Sari adalah salah satu objek wisata yang terkenal di Kota Jogja. Objek wisata ini terletak di Jalan Pintu Besar Selatan, Kota Jogja, dan merupakan salah satu tempat wisata yang terkenal di Kota Jogja. Taman Sari adalah sebuah kompleks air terjun yang dibangun pada abad ke-18 sebagai tempat rekreasi bagi keluarga kerajaan. Di Taman Sari, Anda dapat menemukan berbagai taman yang terdapat di sekitar kompleks air terjun, seperti taman air mancur, taman air terjun, dan taman air bakar. Selain itu, Anda juga dapat menemukan berbagai fasilitas seperti warung makan, toilet, dan tempat parkir. Banyak wisatawan yang datang ke Taman Sari untuk menikmati keindahan taman yang terdapat di dalam kompleks ini, atau untuk sekadar bersantai di taman yang terdapat di sekitar objek wisata ini. TamanSari juga sering dijadikan tempat untuk menyelenggarakan berbagai acara, seperti pesta kembang api atau festival musik. Objek wisata ini menjadi salah satu ikon Kota Jogja dan menjadi salah satu tempat yang wajib dikunjungi oleh wisatawan yang berkunjung ke Kota Jogja. Selain itu, Taman Sari juga merupakan tempat yang ideal untuk menikmati keindahan alam dan sejarah yang terkandung di dalamnya.",
            "${R.drawable.tamansari}",
            "Yogyakarta",
            "Rp. 50.000",
            "-7.810075, 110.359477"
        ),
        arrayOf(
            "Pantai Parangtritis",
            "Pantai Parangtritis adalah salah satu objek wisata yang terkenal di Jogja. Pantai ini terletak di Kecamatan Kretek, Kabupaten Bantul, sekitar 30 kilometer sebelah selatan Kota Jogja. Pantai Parangtritis memiliki pasir putih yang lembut dan air laut yang biru, sehingga menjadi salah satu pantai favorit wisatawan. Di pantai ini, Anda dapat bermain air, berenang, atau sekadar bersantai di bawah sinar matahari. Selain itu, Anda juga dapat menikmati pemandangan indah Gunung Merbabu dan Gunung Merapi yang terlihat di kejauhan. Pantai Parangtritis juga menyediakan berbagai fasilitas seperti warung makan, toilet, dan tempat parkir. Banyak wisatawan yang datang ke pantai ini untuk menikmati keindahan alamnya, bersantai, atau menikmati berbagai aktivitas wisata lainnya. Pantai Parangtritis juga sering dijadikan tempat untuk menyelenggarakan berbagai acara, seperti pesta kembang api atau festival musik.",
            "${R.drawable.pantai_parangtritis}",
            "Bantul - Yogyakarta",
            "Rp. 50.000",
            "-8.024608, 110.329804"
        ),

        arrayOf(
            "Bukit Bintang",
            "Bukit Bintang adalah salah satu objek wisata yang terkenal di Kota Jogja. Objek wisata ini terletak di Desa Bintang, Kecamatan Prambanan, Kabupaten Sleman, sekitar 15 kilometer sebelah timur Kota Jogja. Bukit Bintang merupakan sebuah tempat wisata alam yang memiliki pemandangan indah tebing yang tinggi dan gua yang terdapat di dalamnya. Di Bukit Bintang, Anda dapat berjalan-jalan di taman yang terdapat di atas tebing, menikmati pemandangan indah dari atas tebing, atau bahkan melakukan trekking di hutan pinus yang terdapat di sekitar tempat wisata. Selain itu, Anda juga dapat menikmati berbagai aktivitas wisata lainnya seperti menyusuri sungai dengan perahu atau bermain outbound. Bukit Bintang juga menyediakan berbagai fasilitas seperti warung makan, toilet, dan tempat parkir. Banyak wisatawan yang datang ke Bukit Bintang untuk menikmati keindahan alamnya, bersantai, atau menikmati berbagai aktivitas wisata lainnya. Bukit Bintang jugasering dijadikan tempat untuk menyelenggarakan berbagai acara, seperti pesta kembang api atau festival musik. Objek wisata ini menjadi salah satu ikon Kota Jogja dan menjadi salah satu tempat yang wajib dikunjungi oleh wisatawan yang berkunjung ke Kota Jogja. Selain itu, Bukit Bintang juga merupakan tempat yang ideal untuk menikmati keindahan alam yang terkandung di dalamnya.",
            "${R.drawable.bukit_bintang}",
            "Yogyakarta",
            "Rp. 50.000",
            "-7.845843, 110.479845"
        ),
        arrayOf(
            "Candi Ratu Boko",
            "Candi Ratu Boko adalah salah satu objek wisata yang terkenal di Kota Jogja. Objek wisata ini terletak di Desa Bokoharjo, Kecamatan Prambanan, Kabupaten Sleman, sekitar 15 kilometer sebelah timur Kota Jogja. Candi Ratu Boko merupakan sebuah kompleks candi yang dibangun pada abad ke-9 oleh Kerajaan Mataram. Candi ini terdiri dari berbagai bangunan yang tersebar di sekitar kompleks candi, seperti candi utama, candi anak-anak, dan candi pengawal. Di Candi Ratu Boko, Anda dapat menikmati pemandangan indah candi-candi yang terdapat di dalam kompleks candi ini. Selain itu, Anda juga dapat mengunjungi museum yang terdapat di dalam kompleks candi untuk mengetahui lebih banyak tentang sejarah dan budaya Kerajaan Mataram. Candi Ratu Boko juga menyediakan berbagai fasilitas seperti warung makan, toilet, dan tempat parkir. Banyak wisatawan yang datang ke Candi Ratu Boko untuk menikmati keindahan candi-candi yang terdapat di dalam kompleks ini, atau untuk mengetahui lebih banyak tentang sejarah dan budaya Kerajaan Mataram. Candi Ratu Boko juga sering dijadikan tempat untuk menyelenggarakan berbagai acara, seperti pesta kembang api atau festival musik. Objek wisata ini menjadi salah satu ikon Kota Jogja dan menjadi salah satu tempat yang wajib dikunjungi oleh wisatawan yang berkunjung ke Kota Jogja. Selain itu, Candi Ratu Boko juga merupakan tempat yang ideal untuk menikmati keindahan alam dan sejarah yang terkandung di dalamnya. Taman yang terdapat di sekitar candi ini juga menjadi tempat yang ideal untuk bersantai dan menikmati pemandangan indah yang terdapat di sekitar candi. Candi Ratu Boko merupakan salah satu objek wisata yang tidak boleh Anda lewatkan ketika berkunjung ke Kota Jogja.",
            "${R.drawable.ratu_boko}",
            "Jatijajar - Yogyakarta",
            "Rp. 50.000",
            "-7.770546, 110.489414"
        ),
        arrayOf(
            "Pantai Indrayanti",
            "Pantai Indrayanti adalah salah satu objek wisata yang terkenal di Kota Jogja. Objek wisata ini terletak di Desa Tepus, Kecamatan Tepus, Kabupaten Gunungkidul, sekitar 50 kilometer sebelah selatan Kota Jogja. Pantai Indrayanti merupakan sebuah pantai yang memiliki pasir putih yang halus dan air laut yang jernih. Di Pantai Indrayanti, Anda dapat menikmati keindahan pantai yang terdapat di dalam kompleks pantai ini, atau bahkan melakukan aktivitas wisata seperti berenang, snorkeling, atau bahkan diving. Selain itu, Anda juga dapat menemukan berbagai toko, galeri, restoran, dan café yang menjual berbagai produk dan makanan khas Jogja. Pantai Indrayanti juga menyediakan berbagai fasilitas seperti warung makan, toilet, dan tempat parkir. Banyak wisatawan yang datang ke Pantai Indrayanti untuk menikmati keindahan pantai yang terdapat di dalam kompleks ini, atau untuk melakukan aktivitas wisata lainnya. Pantai Indrayanti juga sering dijadikan tempat untuk menyelenggarakan berbagai acara, seperti pesta kembang api atau festival musik. Objek wisata ini menjadi salah satu ikon Kota Jogja dan menjadi salah satu tempat yang wajib dikunjungi oleh wisatawan yang berkunjung ke Kota Jogja.",
            "${R.drawable.pantai_indrayanti}",
            "Gunungkidul - Yogyakarta",
            "Rp. 50.000",
            "-8.150379, 110.612577"
        ),

        arrayOf(
            "Waduk Sermo",
            "Waduk sempor merupakan bendungan pada daerah Sungai Jatinegara atau disebut juga Sungai Sempor dan Sungai Cicingguling " +
                    "yang mengalir dari utara ke selatan di Pegunungan Serayu Selatan dan bermuara di Samudra Hindia. " +
                    "Waduk Sempor terletak 8 km disebelah utara kota Gombong. Waduk sempor berada di ketinggian kurang lebih 30 meter " +
                    "di atas permukaan air laut. " +
                    "Meskipun berada pada wilayah yang dekat dengan pantai, udara di Waduk Sempor tergolong sejuk karena berada pada lokasi " +
                    "perbukitan yang masih alami. " +
                    "Perbukitan di sekeliling Waduk Sempor diisi dengan ribuan pohon pinus. " +
                    "Pemandangan di Waduk Sempor didominasi oleh air di waduk dan pohon-pohon pinus di bukit. " +
                    "Waduk ini juga dapat digunakan sebagai tempat menikmati matahari terbit (sunrise). " +
                    "Pemandangan bebatuan dan suara gemericik air dapat dinikmati di sungai pada sekitaran waduk. " +
                    "Waduk Sempor telah dilengkapi dengan fasilitas untuk bersepeda dan berlar-lari santai untuk para wisatawan. " +
                    "Selain sebagai tempat wisata Waduk Sempor juga cocok digunakan sebagai tempat seminar, rapat kerja ataupun kegiatan " +
                    "sejenis lainnya karena suasana tempat yang tenang",
            "${R.drawable.waduk_sermo}",
            "Sempor - Yogyakarta",
            "Rp. 50.000",
            "-7.825758, 110.116417"
        )
    )
        val listData: ArrayList<Place>
        get() {
            val list = ArrayList<Place>()
            for (position in placeNames) {
                val place = Place()
                place.name = position[0]
                place.detail = position[1]
                place.photo = position[2].toInt()
                place.location = position[3]
                place.harga = position[4]
                place.geo = position[5]
                list.add(place)
            }
            return list
        }
}