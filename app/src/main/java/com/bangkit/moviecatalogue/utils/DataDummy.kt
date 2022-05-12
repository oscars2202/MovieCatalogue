package com.bangkit.moviecatalogue.utils

import com.bangkit.moviecatalogue.R
import com.bangkit.moviecatalogue.data.source.local.entity.FilmEntity
import com.bangkit.moviecatalogue.data.source.remote.response.MoviesResponse
import com.bangkit.moviecatalogue.data.source.remote.response.TVShowsResponse

object DataDummy {

    fun generateDummyMovie() : List<FilmEntity> {

        val movies = ArrayList<FilmEntity>()

        movies.add(
            FilmEntity(1,
                "movies",
                "A Star Is Born",
                R.drawable.poster_a_start_is_born,
                "10/05/2018",
                "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                "75%",
                "https://youtu.be/nSbzyEJ8X9E",
                false
        )
        )

        movies.add(
            FilmEntity(2,
            "movies",
            "Alita : Battle Angel",
            R.drawable.poster_alita,
            "02/14/2019",
            "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
            "72%",
            "https://youtu.be/w7pYhpJaJW8",
                false
        )
        )

        movies.add(
            FilmEntity(3,
            "movies",
            "Aquaman",
            R.drawable.poster_aquaman,
            "12/21/2018",
            "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
            "69%",
            "https://youtu.be/WDkg3h8PCVU",
                false
        )
        )

        movies.add(
            FilmEntity(4,
            "movies",
            "Bohemian Rhapsody",
            R.drawable.poster_bohemian,
            "11/02/2018",
            "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
            "80%",
            "https://youtu.be/27zlBpzdOZg",
                false
        )
        )

        movies.add(
            FilmEntity(5,
            "movies",
            "Cold Pursuit",
            R.drawable.poster_cold_persuit,
            "02/08/2019",
            "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
            "57%",
            "https://youtu.be/0phuNQQ_gHI",
                false
        )
        )

        movies.add(
            FilmEntity(6,
            "movies",
            "Creed II",
            R.drawable.poster_creed,
            "11/21/2018",
            "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
            "69%",
            "https://youtu.be/cPNVNqn4T9I",
                false
        )
        )

        movies.add(
            FilmEntity(7,
            "movies",
            "Fantastic Beasts: The Crimes of Grindelwald",
            R.drawable.poster_crimes,
            "11/16/2018",
            "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
            "69%",
            "https://youtu.be/vvFybpmyB9E",
                false
        )
        )

        movies.add(
            FilmEntity(8,
            "movies",
            "Glass",
            R.drawable.poster_glass,
            "01/18/2019",
            "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
            "67%",
            "https://youtu.be/95ghQs5AmNk",
                false
        )
        )

        movies.add(
            FilmEntity(9,
            "movies",
            "How to Train Your Dragon: The Hidden World",
            R.drawable.poster_how_to_train,
            "01/09/2019",
            "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
            "78%",
            "https://youtu.be/SkcucKDrbOI",
                false
        )
        )

        movies.add(
            FilmEntity(10,
            "movies",
            "Avengers: Infinity War",
            R.drawable.poster_infinity_war,
            "04/27/2018",
            "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
            "83%",
            "https://youtu.be/QwievZ1Tx-8",
                false
        )
        )

        movies.add(
            FilmEntity(11,
            "movies",
            "Mary Queen of Scots",
            R.drawable.poster_marry_queen,
            "12/21/2018",
            "In 1561, Mary Stuart, widow of the King of France, returns to Scotland, reclaims her rightful throne and menaces the future of Queen Elizabeth I as ruler of England, because she has a legitimate claim to the English throne. Betrayals, rebellions, conspiracies and their own life choices imperil both Queens. They experience the bitter cost of power, until their tragic fate is finally fulfilled.",
            "66%",
            "https://youtu.be/QwievZ1Tx-8",
                false
        )
        )

        movies.add(
            FilmEntity(12,
            "movies",
            "Master Z: Ip Man Legacy",
            R.drawable.poster_master_z,
            "12/26/2018",
            "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight.",
            "60%",
            "https://youtu.be/KZau4zsOtyM",
                false
        )
        )

        movies.add(
            FilmEntity(13,
            "movies",
            "Mortal Engines",
            R.drawable.poster_mortal_engines,
            "12/14/2018",
            "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
            "61%",
            "https://youtu.be/dqYyKztOZOw",
                false
        )
        )

        movies.add(
            FilmEntity(14,
            "movies",
            "Overlord",
            R.drawable.poster_overlord,
            "11/09/2018",
            "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
            "67%",
            "https://youtu.be/USPd0vX2sdc",
                false
        )
        )

        movies.add(
            FilmEntity(15,
            "movies",
            "Ralph Breaks the Internet",
            R.drawable.poster_ralph,
            "11/21/2018",
            "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, Sugar Rush. In way over their heads, Ralph and Vanellope rely on the citizens of the internet — the netizens — to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.",
            "72%",
            "https://youtu.be/T73h5bmD8Dc",
                false
        )
        )

        movies.add(
            FilmEntity(16,
            "movies",
            "Robin Hood",
            R.drawable.poster_robin_hood,
            "11/21/2018",
            "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
            "59%",
            "https://youtu.be/tJfDBSWYqU8",
                false
        )
        )

        movies.add(
            FilmEntity(17,
            "movies",
            "Serenity",
            R.drawable.poster_serenity,
            "01/25/2019",
            "The quiet life of Baker Dill, a fishing boat captain who lives on the isolated Plymouth Island, where he spends his days obsessed with capturing an elusive tuna while fighting his personal demons, is interrupted when someone from his past comes to him searching for help.",
            "54%",
            "https://youtu.be/k3zMlsEK8xA",
                false
        )
        )

        movies.add(
            FilmEntity(18,
            "movies",
            "Spider-Man: Into the Spider-Verse",
            R.drawable.poster_spiderman,
            "12/14/2018",
            "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson 'Kingpin' Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
            "84%",
            "https://youtu.be/tg52up16eq0",
                false
        )
        )

        movies.add(
            FilmEntity(19,
            "movies",
            "T-34",
            R.drawable.poster_t34,
            "01/01/2019",
            "In 1944, a courageous group of Russian soldiers managed to escape from German captivity in a half-destroyed legendary T-34 tank. Those were the times of unforgettable bravery, fierce fighting, unbreakable love, and legendary miracles.",
            "70%",
            "https://youtu.be/D1UDvi5xL9w",
                false
        )
        )


        return movies
    }

    fun generateDummyShows() : List<FilmEntity> {

        val shows = ArrayList<FilmEntity>()

        shows.add(
            FilmEntity(20,
            "tvshows",
            "Arrow",
            R.drawable.poster_arrow,
            "10/10/2012",
            "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
            "67%",
            "https://youtu.be/hTv13EjlLNg",
                false
        )
        )

        shows.add(
            FilmEntity(21,
            "tvshows",
            "Doom Patrol",
            R.drawable.poster_doom_patrol,
            "02/15/2019",
            "WThe Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
            "76%",
            "https://youtu.be/w7pYhpJaJW8",
                false
        )
        )

        shows.add(
            FilmEntity(22,
            "tvshows",
            "Dragon Ball",
            R.drawable.poster_dragon_ball,
            "2/26/1986",
            "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish.",
            "81%",
            "https://youtu.be/y_0APzy4BcU",
                false
        )
        )

        shows.add(
            FilmEntity(23,
            "tvshows",
            "Fairy Tail",
            R.drawable.poster_fairytail,
            "10/12/2009",
            "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
            "78%",
            "https://youtu.be/29jsKEZN1ag",
                false
        )
        )

        shows.add(
            FilmEntity(24,
            "tvshows",
            "Family Guy",
            R.drawable.poster_family_guy,
            "01/31/1999",
            "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
            "70%",
            "https://youtu.be/vIKlVgw_b90",
                false
        )
        )

        shows.add(
            FilmEntity(25,
            "tvshows",
            "The Flash",
            R.drawable.poster_flash,
            "10/7/2014",
            "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only 'meta-human' who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
            "77%",
            "https://youtu.be/Yj0l7iGKh8g",
                false
        )
        )

        shows.add(
            FilmEntity(26,
            "tvshows",
            "Game of Thrones",
            R.drawable.poster_god,
            "4/17/2011",
            "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
            "84%",
            "https://youtu.be/bjqEWgDVPe0",
                false
        )
        )

        shows.add(
            FilmEntity(27,
            "tvshows",
            "Gotham",
            R.drawable.poster_gotham,
            "09/22/2014",
            "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
            "75%",
            "https://youtu.be/VwOPA2upeCA",
                false
        )
        )

        shows.add(
            FilmEntity(28,
            "tvshows",
            "Grey's Anatomy",
            R.drawable.poster_grey_anatomy,
            "03/27/2005",
            "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
            "82%",
            "https://youtu.be/cZcjNaAao6g",
                false
        )
        )

        shows.add(
            FilmEntity(29,
            "tvshows",
            "Hanna",
            R.drawable.poster_hanna,
            "03/28/2019",
            "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
            "75%",
            "https://youtu.be/82gItcSb8mI",
                false
        )
        )

        shows.add(
            FilmEntity(30,
            "tvshows",
            "Marvel's Iron Fist",
            R.drawable.poster_iron_fist,
            "03/17/2017",
            "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
            "66%",
            "https://youtu.be/f9OKL5no-S0",
                false
        )
        )

        shows.add(
            FilmEntity(31,
            "tvshows",
            "Naruto Shippūden",
            R.drawable.poster_naruto_shipudden,
            "02/15/2007",
            "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
            "86%",
            "https://youtu.be/1WLO0Owi5-A",
                false
        )
        )

        shows.add(
            FilmEntity(32,
            "tvshows",
            "NCIS",
            R.drawable.poster_ncis,
            "09/23/2003",
            "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
            "74%",
            "https://youtu.be/fRfpzhmQGFY",
                false
        )
        )

        shows.add(
            FilmEntity(33,
            "tvshows",
            "Riverdale",
            R.drawable.poster_riverdale,
            "01/26/2017",
            "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
            "86%",
            "https://youtu.be/HxtLlByaYTc",
                false
        )
        )

        shows.add(
            FilmEntity(34,
            "tvshows",
            "Shameless",
            R.drawable.poster_shameless,
            "01/09/2011",
            "Chicagoan Frank Gallagher is the proud single dad of six smart, industrious, independent kids, who without him would be... perhaps better off. When Frank's not at the bar spending what little money they have, he's passed out on the floor. But the kids have found ways to grow up in spite of him. They may not be like any family you know, but they make no apologies for being exactly who they are.",
            "80%",
            "https://youtu.be/-7QA-uMAiLw",
                false
        )
        )

        shows.add(
            FilmEntity(35,
            "tvshows",
            "Supergirl",
            R.drawable.poster_supergirl,
            "10/26/2015",
            "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
            "73%",
            "https://youtu.be/Mh8MYFadTmQ",
                false
        )
        )

        shows.add(
            FilmEntity(36,
            "tvshows",
            "Supernatural",
            R.drawable.poster_supernatural,
            "09/13/2005",
            "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
            "82%",
            "https://youtu.be/yy96yJjkvjo",
                false
        )
        )

        shows.add(
            FilmEntity(37,
            "tvshows",
            "The Simpsons",
            R.drawable.poster_the_simpson,
            "12/17/1989",
            "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
            "79%",
            "https://youtu.be/DX1iplQQJTo",
                false
        )
        )

        shows.add(
            FilmEntity(38,
            "tvshows",
            "The Umbrella Academy",
            R.drawable.poster_the_umbrella,
            "02/15/2019",
            "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
            "87%",
            "https://youtu.be/0DAmWHxeoKw",
                false
        )
        )

        shows.add(
            FilmEntity(39,
            "tvshows",
            "The Walking Dead",
            R.drawable.poster_the_walking_dead,
            "10/31/2010",
            "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
            "81%",
            "https://youtu.be/R1v0uFms68U",
                false
        )
        )

        return shows
    }

    fun generateRemoteDummyMovies() : List<MoviesResponse> {

        val movies = ArrayList<MoviesResponse>()

        movies.add(MoviesResponse(1,
            "movies",
            "A Star Is Born",
            R.drawable.poster_a_start_is_born,
            "10/05/2018",
            "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
            "75%",
            "https://youtu.be/nSbzyEJ8X9E"
        ))

        movies.add(MoviesResponse(2,
            "movies",
            "Alita : Battle Angel",
            R.drawable.poster_alita,
            "02/14/2019",
            "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
            "72%",
            "https://youtu.be/w7pYhpJaJW8"
        ))

        movies.add(MoviesResponse(3,
            "movies",
            "Aquaman",
            R.drawable.poster_aquaman,
            "12/21/2018",
            "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
            "69%",
            "https://youtu.be/WDkg3h8PCVU"
        ))

        movies.add(MoviesResponse(4,
            "movies",
            "Bohemian Rhapsody",
            R.drawable.poster_bohemian,
            "11/02/2018",
            "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
            "80%",
            "https://youtu.be/27zlBpzdOZg"
        ))

        movies.add(MoviesResponse(5,
            "movies",
            "Cold Pursuit",
            R.drawable.poster_cold_persuit,
            "02/08/2019",
            "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
            "57%",
            "https://youtu.be/0phuNQQ_gHI"
        ))

        movies.add(MoviesResponse(6,
            "movies",
            "Creed II",
            R.drawable.poster_creed,
            "11/21/2018",
            "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
            "69%",
            "https://youtu.be/cPNVNqn4T9I"
        ))

        movies.add(MoviesResponse(7,
            "movies",
            "Fantastic Beasts: The Crimes of Grindelwald",
            R.drawable.poster_crimes,
            "11/16/2018",
            "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
            "69%",
            "https://youtu.be/vvFybpmyB9E"
        ))

        movies.add(MoviesResponse(8,
            "movies",
            "Glass",
            R.drawable.poster_glass,
            "01/18/2019",
            "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
            "67%",
            "https://youtu.be/95ghQs5AmNk"
        ))

        movies.add(MoviesResponse(9,
            "movies",
            "How to Train Your Dragon: The Hidden World",
            R.drawable.poster_how_to_train,
            "01/09/2019",
            "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
            "78%",
            "https://youtu.be/SkcucKDrbOI"
        ))

        movies.add(MoviesResponse(10,
            "movies",
            "Avengers: Infinity War",
            R.drawable.poster_infinity_war,
            "04/27/2018",
            "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
            "83%",
            "https://youtu.be/QwievZ1Tx-8"
        ))

        movies.add(MoviesResponse(11,
            "movies",
            "Mary Queen of Scots",
            R.drawable.poster_marry_queen,
            "12/21/2018",
            "In 1561, Mary Stuart, widow of the King of France, returns to Scotland, reclaims her rightful throne and menaces the future of Queen Elizabeth I as ruler of England, because she has a legitimate claim to the English throne. Betrayals, rebellions, conspiracies and their own life choices imperil both Queens. They experience the bitter cost of power, until their tragic fate is finally fulfilled.",
            "66%",
            "https://youtu.be/QwievZ1Tx-8"
        ))

        movies.add(MoviesResponse(12,
            "movies",
            "Master Z: Ip Man Legacy",
            R.drawable.poster_master_z,
            "12/26/2018",
            "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight.",
            "60%",
            "https://youtu.be/KZau4zsOtyM"
        ))

        movies.add(MoviesResponse(13,
            "movies",
            "Mortal Engines",
            R.drawable.poster_mortal_engines,
            "12/14/2018",
            "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
            "61%",
            "https://youtu.be/dqYyKztOZOw"
        ))

        movies.add(MoviesResponse(14,
            "movies",
            "Overlord",
            R.drawable.poster_overlord,
            "11/09/2018",
            "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
            "67%",
            "https://youtu.be/USPd0vX2sdc"
        ))

        movies.add(MoviesResponse(15,
            "movies",
            "Ralph Breaks the Internet",
            R.drawable.poster_ralph,
            "11/21/2018",
            "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, Sugar Rush. In way over their heads, Ralph and Vanellope rely on the citizens of the internet — the netizens — to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.",
            "72%",
            "https://youtu.be/T73h5bmD8Dc"
        ))

        movies.add(MoviesResponse(16,
            "movies",
            "Robin Hood",
            R.drawable.poster_robin_hood,
            "11/21/2018",
            "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
            "59%",
            "https://youtu.be/tJfDBSWYqU8"
        ))

        movies.add(MoviesResponse(17,
            "movies",
            "Serenity",
            R.drawable.poster_serenity,
            "01/25/2019",
            "The quiet life of Baker Dill, a fishing boat captain who lives on the isolated Plymouth Island, where he spends his days obsessed with capturing an elusive tuna while fighting his personal demons, is interrupted when someone from his past comes to him searching for help.",
            "54%",
            "https://youtu.be/k3zMlsEK8xA"
        ))

        movies.add(MoviesResponse(18,
            "movies",
            "Spider-Man: Into the Spider-Verse",
            R.drawable.poster_spiderman,
            "12/14/2018",
            "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson 'Kingpin' Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
            "84%",
            "https://youtu.be/tg52up16eq0"
        ))

        movies.add(MoviesResponse(19,
            "movies",
            "T-34",
            R.drawable.poster_t34,
            "01/01/2019",
            "In 1944, a courageous group of Russian soldiers managed to escape from German captivity in a half-destroyed legendary T-34 tank. Those were the times of unforgettable bravery, fierce fighting, unbreakable love, and legendary miracles.",
            "70%",
            "https://youtu.be/D1UDvi5xL9w"
        ))


        return movies
    }

    fun generateRemoteDummyShows() : List<TVShowsResponse> {

        val shows = ArrayList<TVShowsResponse>()

        shows.add(TVShowsResponse(1,
            "tvshows",
            "Arrow",
            R.drawable.poster_arrow,
            "10/10/2012",
            "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
            "67%",
            "https://youtu.be/hTv13EjlLNg"
        ))

        shows.add(TVShowsResponse(2,
            "tvshows",
            "Doom Patrol",
            R.drawable.poster_doom_patrol,
            "02/15/2019",
            "WThe Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
            "76%",
            "https://youtu.be/w7pYhpJaJW8"
        ))

        shows.add(TVShowsResponse(3,
            "tvshows",
            "Dragon Ball",
            R.drawable.poster_dragon_ball,
            "2/26/1986",
            "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish.",
            "81%",
            "https://youtu.be/y_0APzy4BcU"
        ))

        shows.add(TVShowsResponse(4,
            "tvshows",
            "Fairy Tail",
            R.drawable.poster_fairytail,
            "10/12/2009",
            "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
            "78%",
            "https://youtu.be/29jsKEZN1ag"
        ))

        shows.add(TVShowsResponse(5,
            "tvshows",
            "Family Guy",
            R.drawable.poster_family_guy,
            "01/31/1999",
            "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
            "70%",
            "https://youtu.be/vIKlVgw_b90"
        ))

        shows.add(TVShowsResponse(6,
            "tvshows",
            "The Flash",
            R.drawable.poster_flash,
            "10/7/2014",
            "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only 'meta-human' who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
            "77%",
            "https://youtu.be/Yj0l7iGKh8g"
        ))

        shows.add(TVShowsResponse(7,
            "tvshows",
            "Game of Thrones",
            R.drawable.poster_god,
            "4/17/2011",
            "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
            "84%",
            "https://youtu.be/bjqEWgDVPe0"
        ))

        shows.add(TVShowsResponse(8,
            "tvshows",
            "Gotham",
            R.drawable.poster_gotham,
            "09/22/2014",
            "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
            "75%",
            "https://youtu.be/VwOPA2upeCA"
        ))

        shows.add(TVShowsResponse(9,
            "tvshows",
            "Grey's Anatomy",
            R.drawable.poster_grey_anatomy,
            "03/27/2005",
            "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
            "82%",
            "https://youtu.be/cZcjNaAao6g"
        ))

        shows.add(TVShowsResponse(10,
            "tvshows",
            "Hanna",
            R.drawable.poster_hanna,
            "03/28/2019",
            "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
            "75%",
            "https://youtu.be/82gItcSb8mI"
        ))

        shows.add(TVShowsResponse(11,
            "tvshows",
            "Marvel's Iron Fist",
            R.drawable.poster_iron_fist,
            "03/17/2017",
            "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
            "66%",
            "https://youtu.be/f9OKL5no-S0"
        ))

        shows.add(TVShowsResponse(12,
            "tvshows",
            "Naruto Shippūden",
            R.drawable.poster_naruto_shipudden,
            "02/15/2007",
            "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
            "86%",
            "https://youtu.be/1WLO0Owi5-A"
        ))

        shows.add(TVShowsResponse(13,
            "tvshows",
            "NCIS",
            R.drawable.poster_ncis,
            "09/23/2003",
            "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
            "74%",
            "https://youtu.be/fRfpzhmQGFY"
        ))

        shows.add(TVShowsResponse(14,
            "tvshows",
            "Riverdale",
            R.drawable.poster_riverdale,
            "01/26/2017",
            "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
            "86%",
            "https://youtu.be/HxtLlByaYTc"
        ))

        shows.add(TVShowsResponse(15,
            "tvshows",
            "Shameless",
            R.drawable.poster_shameless,
            "01/09/2011",
            "Chicagoan Frank Gallagher is the proud single dad of six smart, industrious, independent kids, who without him would be... perhaps better off. When Frank's not at the bar spending what little money they have, he's passed out on the floor. But the kids have found ways to grow up in spite of him. They may not be like any family you know, but they make no apologies for being exactly who they are.",
            "80%",
            "https://youtu.be/-7QA-uMAiLw"
        ))

        shows.add(TVShowsResponse(16,
            "tvshows",
            "Supergirl",
            R.drawable.poster_supergirl,
            "10/26/2015",
            "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
            "73%",
            "https://youtu.be/Mh8MYFadTmQ"
        ))

        shows.add(TVShowsResponse(17,
            "tvshows",
            "Supernatural",
            R.drawable.poster_supernatural,
            "09/13/2005",
            "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
            "82%",
            "https://youtu.be/yy96yJjkvjo"
        ))

        shows.add(TVShowsResponse(18,
            "tvshows",
            "The Simpsons",
            R.drawable.poster_the_simpson,
            "12/17/1989",
            "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
            "79%",
            "https://youtu.be/DX1iplQQJTo"
        ))

        shows.add(TVShowsResponse(19,
            "tvshows",
            "The Umbrella Academy",
            R.drawable.poster_the_umbrella,
            "02/15/2019",
            "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
            "87%",
            "https://youtu.be/0DAmWHxeoKw"
        ))

        shows.add(TVShowsResponse(20,
            "tvshows",
            "The Walking Dead",
            R.drawable.poster_the_walking_dead,
            "10/31/2010",
            "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
            "81%",
            "https://youtu.be/R1v0uFms68U"
        ))

        return shows
    }
    /*

    fun moviesDetail(movieTitle: String?) : List<FilmEntity> {
        return generateDummyMovie()
    }

    fun tvShowsDetail(tvShowsTitle: String?) : List<FilmEntity> {
        return generateDummyShows()
    }

 */
}