package scalatype;

public class MutableInvariant {

    public static void main(String[] args) {
        String[] str = new String[] { "KIP" };
        Object[] obj = str;
        obj[0] = 1;
        String s = (String) obj[0];
    }
}
