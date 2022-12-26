public class Main {

    /*
     * Void return
     */

    // Ex1: Void (returns nothing)
    public void jump() {
    }

    // Ex2: void with return (return is redundant in this case)
    public void jump1() {
        return;
    }

    /*
     * With return type
     */
    // Ex1: String type return
    String jump2() {
        return "";
    }

    // Ex2: Invalid method
    // String jump3(){} // Won't compile as return is a must

    // Ex3: invalid - won't compile as "a" can be either true of false
    // String jump3(int a){
    // if(a == 5){
    // return "";
    // }
    // }

    // Ex4: Above example with valid return types
    String jump4(int a) {
        if (a == 5) {
            return "a is 5";
        }
        return "a is NOT 5";
    }

    // Ex5: Int return
    int getInt1() {
        return 9;
    }

    // Ex6: return char in an int return method
    static int getInt2() {
        return 'a'; // will return int 97
    }

    // Ex7: won't compile as Long is a bigger data type than int
    // int getInt3() {
    // return 9L;
    // }

    // Ex8: casting the return type (above example)
    int getInt4() {
        return (int) 9L;
    }

    // Ex9: Boolean
    boolean getBool1() {
        return true;
    }

    // Ex10: Boolean using expression
    boolean getBool2() {
        return 5 < 10;
    }

    public static void main(String args[]) {
        System.out.println(getInt2());
    }
}
