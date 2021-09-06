public class Main {
    public static void main(String[] args) {
        Students std1 = new GroupA("Samora",
                "Jourdan",
                "samjour@email.com",
                "https://github.com/SamoraJourdan",
                23,
                "Spring",
                'A',
                32
                );
        Students std2 = new GroupA("Rossouw",
                "Venter",
                "rossouwventer@email.com",
                "https://github.com/RossouwVenter",
                22,
                "Spring",
                'A',
                43
        );
        Students std3 = new GroupA("Kyle",
                "Walkerley",
                "walkerleykyle@email.com",
                "https://github.com/KyleWalkerley",
                24,
                "Spring",
                'A',
                37
        );

        Students std4 = new GroupB("Trystan",
                "Dames",
                "trystandames@email.com",
                "https://github.com/TrystanDames",
                21,
                "Java Advanced",
                'B',
                206
                );

        Students std5 = new GroupB("Jaden",
                "Turnbull",
                "jadenturnbull@email.com",
                "https://github.com/JadenTurnbull",
                20,
                "Java Advanced",
                'B'
        );
        Students std6 = new GroupB("Keagan",
                "Dodsworth",
                "keagandodsworth@email.com",
                "https://github.com/KeaganDodsworth",
                19,
                "Java Advanced"
        );

//        Students[] std = {std1, std2, std3, std4, std5, std6};

//        for (int i = 0; i <= 5; i++){
//            std[i].display();
//        }

        Students[] theStudents = {std1, std2, std3, std4, std5, std6};

        for (Students std: theStudents){
            std.display();
        }
    }
}
