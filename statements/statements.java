class statements {
    public static void main(String[] args) {
        switchCase();
        ifElse();
        forLoop();
        whileLoop();
        doWhile();
        breakBeak();
        continueBeak();
    }

    static void switchCase() {
        String xyz = "XYZ";
        switch (xyz) {

        // case (xyz.charAt(2) == 'Y'): System.out.print("IYEEE!!!"); break;
        // case (xyz.charAt(1) == 'Y'): System.out.print("KIBARE KWA MDOMO"); break;
        default:
            System.out.println("OG, (0__0) au sio");
            break;
        }
    }

    static void ifElse() {
        double a = 0.43;
        double c = 0.432;
        double d = 0.432;

        if (a != d) {
            System.out.println("MOMO THINGS  (0)(0)_____ ***");
        } else if (d == c) {
            System.out.println("Uhuu uh");
        } else {
            System.out.println("(0__0)");
        }

    }

    static void forLoop() {
        int t;
        for (t = 0; t <= 10; t++) {
            System.out.print(t);
        }
    }

    /*
     * while ( test-expression ) { // some java code in here; } “while loop” loops
     * through a block of code if the specified condition is true.
     */
    static void whileLoop() {
        int counter = 0;
        while (counter < 2) {
            System.out.println("(o__0)");
            counter++;
        }

    }

    /*
     * do{ // some java code in here } while ( test- expression); “do...while” loops
     * through a block of code once, and then repeats the loop if the specified
     * condition is true.
     */
    static void doWhile() {
        int counter = 0;
        do {
            whileLoop();
            counter++;
        } while (counter < 2);
        // RUN NINE TIMES
    }

    static void breakBeak() {
        int num = 0;
        while (num<10){
            System.out.print( num );

            if (num==5) break; // leave the while loop
        num++;
        }
        }
    
        static void continueBeak() {
            int num = 0;
            while (num<10){
                num++;
                if (num==5) continue; // leave the while loop
                System.out.print( num );            
            }
            }
}

