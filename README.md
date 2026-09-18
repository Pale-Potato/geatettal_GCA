Gruppemedlemmer: Alberte, Mads, Jacob og Thomas.

1:
Vi har lavet et ''gæt et tal spil'', hvor programmet vælger et tælfældigt tal ud fra spiller valgt sværhedsgrad, og spiller så skal gætte tallet.

2:
Programmet kører ved at computeren vælger et tilfældigt tal via Math.random, og derefter tjekker om dit gæt er højere eller lavere end tallet.

3:
programmet er inddelt i 8 metoder:

Tries og max metoderne sætter værdierne, der blever brugt i spillogikken udfra spillervalgt sværhedsgrad.

computerChoice metoden vælger et tilfældigt tal der skal gættes.

guessChecker metoden checker spillerens gæt ift. computerens tal, dette gør den ved at kigge på differensen mellem de 2 tal. Hvis den er 0 er de 2 tal ens, positiv er gættet for højt og negativ gættet for lavt. 
Dette bruger vi til at fastsætte om den er lidt for højt/lavt, som vi har sæt til 3 fra korrekt.

pointsCal udregner og printer points i slutningen af spillet.

Vi har 3 print metoder, der printer intro, menu og spil igen.

4:
Vi bruger disse metoder til at gøre main mindre linjetung, og gøre det nemmere at skabe et overblik over programmet.

5:
Static int max (int choice), har parametern choice, der angiver spillervalgt sværhedsgrad.
Alle vores spillelogik metoder har mindst en parameter.

6:
int static computerChoice (int max), har parameteren max, den returner tallet som spiller skal gætte (i metoden kaldt target).
Alle vores spillelogik metoder returnere en værdi.

7:
Vi har brugt 2 do-while løkker, en til spille loppen og en til at sende spiller tilbage til menu, hvis de vil spille igen. Vi valgte do while, da vi antyder at spiller gerne vil spille mindst en gang når de åbner spillet, og de skal give mindst 1 gæt når spillet starter. 

8:
Vi har under test printet computerChoice, så vi kunne se om det var korrekt.
Vi har testet computerChoice, om den gav en værdi indenfor det ønskede interval indenfor den valgte sværhedsgrad.
Vi har testet vores ''lidt for højt/lavt'' system, flere gange med mange kombinationer.
Vi har testet om antal gæt bliver talt ned korrekt.
Vi har testet pointssystemet mange gange, og justeret det mange gange.

9:
Points systemet blev ved med at returnere 0 points, selvom man gættede rigtigt på sidste forsøg. Vi fik løst det ved at tilføje check parameteren, der på linje 149, sørger for at man ikke svarede korrekt, før den giver 0 points.
Vi har generelt siddet længe med points systemet, og rettet det efter hver fejlet test. Vores fejlkode -99999 har været meget brugbar herunder.

10:
Vi har lært det er godt at have en plan før man koder, når der er mange elementer i programmet. Vi brugte vores flowchart meget undervejs.
Metoder er smarte, og gør det mere overskueligt at læse programmet, og nemmere at ændre koden.
