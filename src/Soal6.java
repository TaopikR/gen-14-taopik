import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soal6 {
    public static void main(String[] args) {
        String kalimat = "aku belajar pemrograman";
        int a = 0, i = 0, u = 0 ,e = 0, o = 0;

        for(int j = 0; j < kalimat.length(); j++) {
            if (kalimat.charAt(j) == 'a') {
                a++;
            } else if (kalimat.charAt(j) == 'i') {
                i++;
            } else if (kalimat.charAt(j) == 'u') {
                u++;
            } else if (kalimat.charAt(j) == 'e') {
                e++;
            } else if (kalimat.charAt(j) == 'o') {
                o++;
            }
        }
        System.out.println("a = " +a);
        System.out.println("i = " +i);
        System.out.println("u = " +u);
        System.out.println("e = " +e);
        System.out.println("o = " +o);
    }
}
