/*
 * problem link : https://neetcode.io/problems/string-encode-and-decode
*/


import java.util.*;

public class EncodeDecode {

    public String encode(List<String> strs) {
        
        StringBuilder encStr = new StringBuilder();
        for (String str : strs) {
            int len = str.length();
            encStr.append(str + ":;");
        }
        return encStr.toString();
    }

    public List<String> decode(String str) {

        List<String> decStr = new ArrayList<>();
        int i = 0;
        int startIdx = 0;
        while (i < str.length() - 1) {
            if (str.substring(i, i + 2).equals(":;")) {
                decStr.add(str.substring(startIdx, i));
                i += 2;
                startIdx = i;
            }
            i++;
        }
        return decStr;
    }

}


