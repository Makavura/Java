class methodsClassObject {

    // Declare a class
    //  Instance variable is defimed oin a class
    public static class Color {
        String _w, _v;
        //Overloading ---two methods with different arguments
        // Color (String a, String b) { a=_w; b=_v;}

        //Constructor
        // Color(_w, _v) { _w="rest"; _v="full";} 
        // }
        public void brightness() {
            System.out.println("In order to work best, you need to " + _w);
            System.out.println("Be paid in " + _v);
        }

        public svoid increment() {
            String _W =  _w.toUpperCase();
            System.out.println(_W);
        }
    }
     
    public static void main(String[] args){

        //  Local variable is defined in a method
        Color _obj = new Color();
        // Color _object = new Color("tate", "jade");

        System.out.println(_obj.increment());
        _obj.brightness();

        System.out.println(_object.increment());
        _object.brightness();
    }



    

}