package com.dicoding.picodiploma.islamichero.model

import com.dicoding.picodiploma.islamichero.R

object HeroesData {
    private val heroNames = arrayOf(
        "ABU BAKAR ASH SHIDDIQ",
        "UMAR BIN AL KHATHTHAB",
        "UTSMAN BIN ‘AFFAN",
        "ALI BIN ABI THALIB",
        "ABU UBAIDAH BIN AL JARRA",
        " THALHAH BIN UBAIDILLAH",
        "AZ ZUBAIR BIN AL ‘AWWAM",
        "ABDURRAHMAN BIN AUF",
        "SA’AD BIN ABI WAQQASH",
        "SA’ID BIN ZAID"
    )

    private val heroDetails = arrayOf(
        "Abu Bakar ash-Shiddiq adalah merupakan sahabat Nabi yang paling awal memeluk Islam. Ia dikenal sebagai khalifa pertama yang meneruskan perjuangan Nabi Muhammad SAW dalam memimpin ummat islam.\n" +
                "            Setelah wafatnya Nabi Muhammad SAW beliau menjadi khalifah Islam yang pertama pada tahun 632 hingga tahun 634 M. Dan merupakan satu di antara empat khalifah yang diberi gelar Khulafaur Rasyidin atau khalifah yang diberi petunjuk\n",
        "Umar bin Khattab adalah salah seorang sahabat nabi dan khalifah kedua setelah wafatnya Abu Bakar As-Sidiq. Jasa dan pengaruhnya terhadap penyebaran Islam sangat besar hingga Michael H. Heart menempatkannya sebagai orang paling berpengaruh nomor 51 sedunia sepanjang masa",
        "Utsman merupakan seseorang yang pemalu. Bila dia masuk, sedangkan aku masih berbaring, pasti dia malu untuk masuk dan akan cepat-cepat pulang, padahal belum dia menyelesaikan keperluannya. Wahai, Aisyah, tidakkah aku patut malu kepada seseorang yang dimalui (disegani) oleh para malaikat?\" jelas Rasulullah SAW.\n" +
                " Demikianlah, Nabi SAW menerangkan, bahkan para malaikat pun bersikap malu terhadap Utsman. Sifat itu merupakan teladan bagi umat Islam. Sebab, hal itu sendiri diajarkan oleh baginda shalallahu 'alaihi wasallam. Dalam sebuah hadis, Rasul SAW bersabda, \"Malu tidak menimbulkan sesuatu kecuali kebaikan\n",
        "Berkata Ali bin Abi Thalib radhiallahu anhuYakinlah, ada sesuatu yang menantimu setelah banyak kesabaran (yang kau jalani), yang akan membuatmu terpana hingga kau lupa betapa pedihnya rasa saki",
        "Ada tiga orang Quraisy yang sangat cemerlang wajahnya, tinggi akhlaknya, dan sangat pemalu. Bila berbicara mereka tidak pernah dusta. Dan apabila orang berbicara, me reka tidak cepat-cepat mendustakan. Mereka itu adalah Abu Bakar ash-Shiddiq, Utsman bin Affan, dan Abu Ubaidah bin Jarrah",
        "Tentang Thalhah, Rasulullah SAW mengatakan,Thalhah dan Zubair, keduanya adalah tetanggaku di surga(Hadits Riwayat At-Tirmidzi). Beliau juga mengatakan,Siapa yang ingin melihat seorang syahid berjalan di muka bumi, hendaklah ia melihat Thalhah ibn Ubaidillah(HR At-Tirmidzi).",
        "Kecintaan dan penghargaan Rasulullah kepada Zubair bin Awwam sangat luar biasa. Dalam sebuah hadisnya beliau bersabda, “Setiap nabi mempunyai pembela, dan pembelaku adalah Zubair bin Awwam",
        "Beliau menangis karen kaya. Ia sedih jika saja balasan untuk amalan shalihnya disegerakan di dunia dengan kekayaan yang ia peroleh saat itu. Itulah yang beliau takutkan.",
        "Saad bin Abi Waqqash adalah seorang sahabat Rasulullah ﷺ yang memiliki doa yang manjur dan mustajab. Rasulullah ﷺ meminta kepada Allah ﷻ agar doa Saad menjadi doa yang mustajab tidak tertolak. ",
        "Said bin Zaid termasuk salah satu dari sepuluh orang sahabat yang dijamin masuk surga. Selain termasuk kalangan Orang yang pertama masuk Islam (As-Sabiquna Al Awwalun), ia juga pejuang perang Badar dan salah seorang yang mendapatkan keridhaan Allah. Dia ikut dalam beberapa peperangan bersama Rasulullah SAW"
    )

    private val heroImages = intArrayOf(
        R.drawable.satu,
        R.drawable.dua,
        R.drawable.tiga,
        R.drawable.empat,
        R.drawable.lima,
        R.drawable.enam,
        R.drawable.tujuh,
        R.drawable.delapan,
        R.drawable.sembilan,
        R.drawable.sepuluh
    )


    val listData: ArrayList<Hero>
        get() {
            val list = arrayListOf<Hero>()
            for (position in heroNames.indices) {
                val hero = Hero()
                hero.name = heroNames[position]
                hero.detail = heroDetails[position]
                hero.photo = heroImages[position]
                list.add(hero)
            }
            return list

        }
}
