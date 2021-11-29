class DrawHangman {
    /**
     *
     * @param l print Hangman up to condition
     */
    public static void drawHangman(int l) {

        if(l == 7) {
            System.out.println("""
                     /''''''\\
                     |      |
                     |
                     |
                     |
                     |
                     |
                 ----------------""");
        }
        else if(l == 6) {
            System.out.println("""
                    /''''''\\
                    |      |
                    |      O
                    |
                    |
                    |
                ----------------""");
        }
        else if(l == 5) {
            System.out.println("""
                    /''''''\\
                    |      |
                    |      O
                    |      |
                    |
                    |
                    |
                ----------------""");

        }
        else if(l == 4) {
            System.out.println("""
                    /''''''\\
                    |      |
                    |      O
                    |      |/
                    |
                    |
                    |
                ----------------""");

        }
        else if(l == 3) {
            System.out.println("""
                    /''''''\\
                    |      |
                    |      O
                    |     \\|/
                    |
                    |
                    |
                ----------------""");

        }
        else if(l == 2) {
            System.out.println("""
                    /''''''\\
                    |      |
                    |      O
                    |     \\|/
                    |      |
                    |
                    |
                ----------------""");

        }
        else if (l==1){
            System.out.println("""
                    /''''''\\
                    |      |
                    |      O
                    |     \\|/
                    |      |
                    |     /
                    |
                ----------------""");

        }
        else{
            System.out.println("""
                    /''''''\\
                    |      |
                    |      O
                    |     \\|/
                    |      |
                    |     / \\
                    |
                ----------------""");
        }
    }

}