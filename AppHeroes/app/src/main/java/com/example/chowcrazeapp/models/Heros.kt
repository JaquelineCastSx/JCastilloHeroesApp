package com.example.chowcrazeapp.models

import java.io.Serializable

data class Heros(val id:Int, val name:String, val image:String, val description:String, val powers:String, val publisherid: Int):Serializable{
    companion object{
        //Lista de heroes
        val heroes: MutableList<Heros> = mutableListOf(
            Heros(
                id = 1,
                name = "Spider-Man",
                image = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/1ebab919-1015-421b-ac5a-dc53da375adc/dfvqklr-cad4a9b1-e823-4643-b910-245daf013a95.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzFlYmFiOTE5LTEwMTUtNDIxYi1hYzVhLWRjNTNkYTM3NWFkY1wvZGZ2cWtsci1jYWQ0YTliMS1lODIzLTQ2NDMtYjkxMC0yNDVkYWYwMTNhOTUucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.-3rxL2RqS5SdfIAdXRHL7PofFrpMKC__C7uKRr6K8LE",
                description = "Spider-Man is a fictional superhero created by writer Stan Lee and artist Steve Ditko.",
                powers = "Superhuman strength, agility, reflexes, and stamina; ability to cling to most surfaces; precognitive spider-sense.",
                publisherid = 1 // Assuming Marvel Comics publisher ID is 1
            ),
            Heros(
                id = 2,
                name = "Iron Man",
                image = "https://i.pinimg.com/originals/c1/4a/9f/c14a9f2295038c162b7b076c28c06af7.png",
                description = "Iron Man is a fictional superhero appearing in American comic books published by Marvel Comics.",
                powers = "Powered armor suit granting superhuman strength, durability, flight, and various weapons.",
                publisherid = 1
            ),
            Heros(
                id = 3,
                name = "Captain America",
                image = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/8911a890-1488-4033-b210-287b6a9c5319/dejobm4-c22e23ad-302f-4a57-86ac-09c09623a89b.png/v1/fill/w_1280,h_2368/captain_america_png_render__black_suit__by_dhv123_dejobm4-fullview.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MjM2OCIsInBhdGgiOiJcL2ZcLzg5MTFhODkwLTE0ODgtNDAzMy1iMjEwLTI4N2I2YTljNTMxOVwvZGVqb2JtNC1jMjJlMjNhZC0zMDJmLTRhNTctODZhYy0wOWMwOTYyM2E4OWIucG5nIiwid2lkdGgiOiI8PTEyODAifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uub3BlcmF0aW9ucyJdfQ.h7iiCQcO8VeSVOL-p2ym86wC_A9gobtcMuQuTfy_duY",
                description = "Captain America is a fictional superhero appearing in American comic books published by Marvel Comics.",
                powers = "Peak human strength, agility, stamina, and durability; master martial artist and tactician; Vibranium shield.",
                publisherid = 1
            ),
            Heros(
                id = 4,
                name = "Thor",
                image = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/8911a890-1488-4033-b210-287b6a9c5319/dfa8nhb-37ef5c19-c660-46e9-9713-1676aff8d978.png/v1/fit/w_828,h_828/thor___png__3__by_dhv123_dfa8nhb-414w-2x.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MzAwMCIsInBhdGgiOiJcL2ZcLzg5MTFhODkwLTE0ODgtNDAzMy1iMjEwLTI4N2I2YTljNTMxOVwvZGZhOG5oYi0zN2VmNWMxOS1jNjYwLTQ2ZTktOTcxMy0xNjc2YWZmOGQ5NzgucG5nIiwid2lkdGgiOiI8PTMwMDAifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uub3BlcmF0aW9ucyJdfQ.tbDXFPBASeNVRoSIeYbaA-tas0c0TBJApnkGiESuhbg",
                description = "Thor is a fictional superhero appearing in American comic books published by Marvel Comics.",
                powers = "Superhuman strength, speed, durability, agility, reflexes, and longevity; control over lightning and weather.",
                publisherid = 1
            ),
            Heros(
                id = 5,
                name = "Hulk",
                image = "https://pngfre.com/wp-content/uploads/hulk-poster.png",
                description = "Hulk is a fictional superhero appearing in American comic books published by Marvel Comics.",
                powers = "Unlimited superhuman strength, durability, and regenerative healing factor; increases in strength with anger.",
                publisherid = 1
            ),
            Heros(
                id = 6,
                name = "Black Widow",
                image = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/5b8d2b12-21e8-4931-8a6d-fb9ecdd60383/dd5itsy-b75d7de1-1c6e-43b8-90c0-ace2a136c9cb.png/v1/fit/w_828,h_1770/avengers_endgame_black_widow_png_by_metropolis_hero1125_dd5itsy-414w-2x.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MjA5NSIsInBhdGgiOiJcL2ZcLzViOGQyYjEyLTIxZTgtNDkzMS04YTZkLWZiOWVjZGQ2MDM4M1wvZGQ1aXRzeS1iNzVkN2RlMS0xYzZlLTQzYjgtOTBjMC1hY2UyYTEzNmM5Y2IucG5nIiwid2lkdGgiOiI8PTk4MCJ9XV0sImF1ZCI6WyJ1cm46c2VydmljZTppbWFnZS5vcGVyYXRpb25zIl19.Yi-0VcTQeAGoXVnO5ytyp3WffLBWkBDzwUJSW881TZc",
                description = "Black Widow is a fictional superhero appearing in American comic books published by Marvel Comics.",
                powers = "Expert martial artist and marksman; espionage expert; enhanced strength and agility due to Soviet training and enhancements.",
                publisherid = 1
            ),
            Heros(
                id = 7,
                name = "Doctor Strange",
                image = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/afa23e61-83ac-4a6a-bc9a-7b1fa27bf654/deqo5hj-b574b34b-aeef-4cea-8a81-4a5f08c20338.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcL2FmYTIzZTYxLTgzYWMtNGE2YS1iYzlhLTdiMWZhMjdiZjY1NFwvZGVxbzVoai1iNTc0YjM0Yi1hZWVmLTRjZWEtOGE4MS00YTVmMDhjMjAzMzgucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.05vcXFRrkiTCRCiiyJlWP0i7mmlUWG-1LMUdqvMT1DY",
                description = "Doctor Strange is a fictional superhero appearing in American comic books published by Marvel Comics.",
                powers = "Mastery of mystic arts; reality warping, teleportation, astral projection, energy manipulation, and time travel.",
                publisherid = 1
            ),
            Heros(
                id = 8,
                name = "Black Panther",
                image = "https://pngfre.com/wp-content/uploads/Black-Panther-12-886x1024.png",
                description = "Black Panther is a fictional superhero appearing in American comic books published by Marvel Comics.",
                powers = "Enhanced strength, speed, agility, and senses; Vibranium suit grants protection and energy absorption.",
                publisherid = 1
            ),
            Heros(
                id = 9,
                name = "Wolverine",
                image = "https://pngfre.com/wp-content/uploads/Wolverine-5-681x1024.png",
                description = "Wolverine is a fictional superhero appearing in American comic books published by Marvel Comics.",
                powers = "Regenerative healing factor; adamantium-laced skeleton and retractable claws; enhanced senses and combat skills.",
                publisherid = 1
            ),
            Heros(
                id = 10,
                name = "Captain Marvel",
                image = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/5b8d2b12-21e8-4931-8a6d-fb9ecdd60383/dd3kgmu-690909c9-e291-4b64-ba14-d3a1e218ce31.png/v1/fit/w_644,h_1175/avengers_endgame_captain_marvel_png_by_metropolis_hero1125_dd3kgmu-375w-2x.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MTE3NSIsInBhdGgiOiJcL2ZcLzViOGQyYjEyLTIxZTgtNDkzMS04YTZkLWZiOWVjZGQ2MDM4M1wvZGQza2dtdS02OTA5MDljOS1lMjkxLTRiNjQtYmExNC1kM2ExZTIxOGNlMzEucG5nIiwid2lkdGgiOiI8PTY0NCJ9XV0sImF1ZCI6WyJ1cm46c2VydmljZTppbWFnZS5vcGVyYXRpb25zIl19.BP20raRwptzdjzg7JYk_L0JrVmpur596oP93QoyvfX4",
                description = "Captain Marvel is a fictional superhero appearing in American comic books published by Marvel Comics.",
                powers = "Superhuman strength, durability, flight, energy projection, and absorption; photon blasts; cosmic awareness.",
                publisherid = 1
            ),
            Heros(
                id = 11,
                name = "Superman",
                image = "https://pngfre.com/wp-content/uploads/superman-png-from-pngfre-9.png",
                description = "Superman is a fictional superhero appearing in American comic books published by DC Comics.",
                powers = "Superhuman strength, speed, flight, and various other abilities.",
                publisherid = 2 // Assuming DC Comics publisher ID is 2
            ),
            Heros(
                id = 12,
                name = "Batman",
                image = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/8e4c3336-0621-4c1d-ad77-dee35d7a12d2/dd0uqo9-8a046c11-e93d-4007-a586-5e078a252b41.png/v1/fill/w_1280,h_1397/batman_png_by_arkhamanger_dd0uqo9-fullview.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MTM5NyIsInBhdGgiOiJcL2ZcLzhlNGMzMzM2LTA2MjEtNGMxZC1hZDc3LWRlZTM1ZDdhMTJkMlwvZGQwdXFvOS04YTA0NmMxMS1lOTNkLTQwMDctYTU4Ni01ZTA3OGEyNTJiNDEucG5nIiwid2lkdGgiOiI8PTEyODAifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uub3BlcmF0aW9ucyJdfQ.RKtZ7cdmmQUPaW1S1AQr4_qRmFMH-y5EqpfuIsbrlOA",
                description = "Batman is a fictional superhero appearing in American comic books published by DC Comics.",
                powers = "Master detective skills, peak human physical condition, martial arts expert, and high-tech equipment.",
                publisherid = 2
            ),
            Heros(
                id = 13,
                name = "Wonder Woman",
                image = "https://i.pinimg.com/originals/df/73/84/df73842fb7d8533e8477de38978417cc.png",
                description = "Wonder Woman is a fictional superhero appearing in American comic books published by DC Comics.",
                powers = "Superhuman strength, durability, agility, flight, and various mystical abilities.",
                publisherid = 2
            ),
            Heros(
                id = 14,
                name = "The Flash",
                image = "https://i.pinimg.com/originals/83/10/59/83105916580f7b38172a68bc0cd688bb.png",
                description = "The Flash is a fictional superhero appearing in American comic books published by DC Comics.",
                powers = "Superhuman speed, agility, and reflexes; ability to generate and control the Speed Force.",
                publisherid = 2
            ),
            Heros(
                id = 15,
                name = "Green Lantern",
                image = "https://www.pngall.com/wp-content/uploads/10/Green-Lantern-PNG-Images-HD.png",
                description = "Green Lantern is a fictional superhero appearing in American comic books published by DC Comics.",
                powers = "Power ring grants flight, energy constructs, and the ability to manifest the wearer's willpower.",
                publisherid = 2
            ),
            Heros(
                id = 16,
                name = "Aquaman",
                image = "https://static.wikia.nocookie.net/death-battle-fanon-wiki-en-espanol/images/8/84/Aquaman.png/revision/latest?cb=20190918015708&path-prefix=es",
                description = "Aquaman is a fictional superhero appearing in American comic books published by DC Comics.",
                powers = "Superhuman strength, durability, agility, and swimming speed; telepathic communication with marine life.",
                publisherid = 2
            ),
            Heros(
                id = 17,
                name = "Green Arrow",
                image = "https://i.pinimg.com/originals/c7/2c/84/c72c840b59e7d2fc0d97bc8b19a22d96.png",
                description = "Green Arrow is a fictional superhero appearing in American comic books published by DC Comics.",
                powers = "Master archer and hand-to-hand combatant; trick arrows and exceptional agility.",
                publisherid = 2
            ),
            Heros(
                id = 18,
                name = "Martian Manhunter",
                image = "https://static.wikia.nocookie.net/all-worlds-alliance/images/8/84/4696826030f121f0d836650a965c57c7.png/revision/latest?cb=20190304060411",
                description = "Martian Manhunter is a fictional superhero appearing in American comic books published by DC Comics.",
                powers = "Superhuman strength, speed, shape-shifting, telepathy, telekinesis, and intangibility.",
                publisherid = 2
            ),
            Heros(
                id = 19,
                name = "Shazam",
                image = "https://static.wikia.nocookie.net/death-battle-fanon-wiki-en-espanol/images/c/c7/Shazam.png/revision/latest?cb=20190411001751&path-prefix=es",
                description = "Shazam is a fictional superhero appearing in American comic books published by DC Comics.",
                powers = "Magical lightning-based powers including superhuman strength, speed, and flight.",
                publisherid = 2
            ),
            Heros(
                id = 20,
                name = "Cyborg",
                image = "https://static.wikia.nocookie.net/one-minute-melee/images/a/a3/Cyborg.png/revision/latest?cb=20180515183131&path-prefix=es",
                description = "Cyborg is a fictional superhero appearing in American comic books published by DC Comics.",
                powers = "Technological enhancements granting superhuman strength, durability, and various weapons.",
                publisherid = 2
            )
        )

    }
}
