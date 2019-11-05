import java.util.Arrays;

class arrayMath{
    public static void main(String[] args){
        arrays();

    }

    static void arrays(){
        int tempArray[] = { 0, 1, 2, 3, 4, 5};
        // System.out.print(tempArray);
        int x = tempArray.length;
        System.out.println(x);

        int value = tempArray[4];
        System.out.println(value);

        int tempArrayX[] = {0};
        tempArrayX[0] = value;
        System.out.println(tempArrayX);

        int tempArrayY[] = {-2, 59,4,56,-200};
        Arrays.sort(tempArrayY);
        for(int xx = 0; xx < tempArrayY.length; xx++){
            System.out.println(tempArrayY[xx]);
        }
    }

    // MATH FUNCTIONS
    /*
    abs( )  a number’s absolute value
    ceil( )an integer greater than or equal its argument
    cos() an angle’s trigonometric cosine
    exp( ) a number’s Math.E to the power
    floor( ) an integer less than or equal its argument.
    log( ) a number’s natural logarithm
    random( ) a random positive value from 0 to 1
    max( ) a greater between two numbers    
    min( ) a smaller between two numbers 
    pow() the first argument to the power of the second
    round( ) the closest long or int
    sin( ) an angle’s trigonometric sine
    sqrt( ) a number’s square root
    tan( ) an angle’s trigonometric tangent
    */
    static void mathFx(){
        float num = 9.2f;
        int _num = 9;
        int o = 0;
        int n = -1;

        System.out.println(Math.round(num));

        System.out.println(Math.ceil(num));

        System.out.println(Math.floor(num));

        System.out.println(Math.min(o, n));

        System.out.println(Math.max(o, n));

        System.out.println(Math.pow(n, _num));

        System.out.println(Math.sqrt(_num));

        System.out.println(Math.random());

        System.out.println(Math.PI);

    }

}