public class Anagrams {

    public static String doRev(String input) {

        String[] strArr = input.split(" ", input.length());
        String fs = "";

        for (int i = 0; i < strArr.length; i++) {
            char[] wtc = strArr[i].toCharArray();

            int wsi = 0;
            int wei = wtc.length - 1;

            while (wsi < wei) {
                if (!Character.isLetter(wtc[wsi])) {
                    wsi++;
                } else if (!Character.isLetter(wtc[wei])) {
                    wei--;
                } else {
                    char temp = wtc[wsi];
                    wtc[wsi] = wtc[wei];
                    wtc[wei] = temp;
                    wsi++;
                    wei--;
                }
            }
            if (i < strArr.length - 1) {
                fs = fs + new String(wtc) + " ";
            } else
                fs = fs + new String(wtc);
        }
        return fs;
    }
}
