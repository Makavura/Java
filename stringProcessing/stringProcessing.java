class stringProcessing{
    public static void main(String[] args){
        strings();
    }

    static void strings(){
            String _str = "string";
            String _xtr = "gnirts";
            
            System.out.println(_str.length());

            System.out.println(_str.concat(_xtr));

            System.out.println(_xtr.equals(_str));

            char _char = _xtr.charAt(3);
            System.out.println(_char);

            System.out.println(_xtr.indexOf(1));

            System.out.println(_str.substring(2, 4));

            System.out.println(_xtr.toUpperCase());

            String _ngori = "Kama una ngori...";
            System.out.println(_ngori.replace("...", "  me siogopi!!!"));

            int _tiddies = 5050;
            System.out.println(Integer.toString(_tiddies));

            String oops = "     OOPS ";
            System.out.println(oops.trim());

            StringBuffer _string = new StringBuffer("Luke");
            System.out.println(_string);
            System.out.println(_string.insert(4, "...(@__@)"));
            System.out.println(_string.append("  Skywalking __c0oOQ_ on this code"));
        
    }
}
