import java.util.List;

public class SILab1_2 {

    private static String makeBigStringFrom (List<String> list, int minLength) {
        StringBuilder sb = new StringBuilder();
        for (String el : list) {
<<<<<<< HEAD
            if (el.length() < minLength) {
                sb.append(el);
            }
=======
            if (el.length() >= minLength) {
               sb.append(el);
            }  
>>>>>>> bug2
        }
        return sb.toString();
    }
}