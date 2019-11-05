class lessons {
    public static void main(String[] args) {
        multiLinePrinting();
        singleLinePrinting();
        escapingChars();
        variables();
    }

    static void singleLinePrinting() {
        System.out.print("Single line printing");
        System.out.print("x");
        System.out.print("y");
        System.out.print("z");
    }

    static void multiLinePrinting() {
        System.out.println("Multi line printing");
        System.out.println("x");
        System.out.println("y");
        System.out.println("z");
    }

    static void escapingChars() {
        /*
         * \n outputs content to the next new line. \r makes a return \t makes a tab \’
         * outputs a single quotation mark. \” outputs a double quotation mark.
         */
        // System.out.println("Headed to a \n
        // New line\t Tabbed \n
        // \"DOUBLE QUOTES\"\n\r
        // \'Single Quote\'\\ ");
    }

    // CREAYING VARIABLES
    static void variables() {
        // FORMART: dataType variableName = value;
        String stringString = "String";
        char charChar = 'c';
        int intInt = 7000;
        double dobDob = 3.12;
        boolean truTru = true;

        System.out.print(stringString);
        System.out.print(charChar);
        System.out.print(truTru);
        System.out.print(dobDob);
        System.out.print(intInt);
    }
}
