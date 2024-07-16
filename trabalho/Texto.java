class Texto {

    static String substr(String str, int start, int end) {

        String res = "";

        if (start < 0) {
            if (start < -str.length())
                start = 0;
            else start = start + str.length();

        } else if(start > str.length() || start > end){
            return "";
        }
        if (end < 0) {
            end = end + str.length();

        } else if(end > str.length()){
            end = str.length();
        }

        for (int i = start; i < end; i++) {
            res += str.charAt(i);
        }
        return res;
    }

    static String substr(String str, int start) {
        
       return substr(str, start, str.length());
    }

    static String substr(String str, int... args) {
        String res = "";

        for (int i = 0; i < args.length; i+=2) {
            if(i <= args.length -2){
                res += substr(str, args[i], args[i+1]);
                continue;
            }
            res += substr(str, args[args.length - 1]);
            break;
        }
        return res;
    }
}
