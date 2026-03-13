package lesson2;
import java.util.Random;

public class Tapkar {
	public static void main(String[] args) {
		        char[] simvollar = {'H', 'e', 'l', 'l', 'o'};
		        String metn = new String(simvollar);
		        System.out.println(metn);
		        String soz = "Abc";
		        boolean ucSimvol = isThreeEnglishLetters(soz);
		        System.out.println(ucSimvol);
		        String bosMetn = "";
		        boolean bosdur = bosMetn.isEmpty();
		        System.out.println(bosdur);
		        boolean bitir = bitirMi("SalamDunya", "Dunya");
		        System.out.println(bitir);
		        int eded = randomNumber(10, 30);
		        System.out.println(eded);
		        double kesr = 12.34567;
		        double yuvarlaq = Math.round(kesr * 100.0) / 100.0;
		        System.out.println(yuvarlaq);
		    }
		    static boolean isThreeEnglishLetters(String text) {
		        return text.length() == 3 && text.matches("[A-Za-z]{3}");
		    }
		    static boolean bitirMi(String metn1, String metn2) {
		        return metn1.endsWith(metn2);
		    }
		    static int randomNumber(int min, int max) {
		        Random rnd = new Random();
		        return rnd.nextInt(max - min + 1) + min;
		    }
	}




