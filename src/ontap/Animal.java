package ontap;

public class Animal implements InterfaceStudy {
    public synchronized void test() {
//        StringBuilder
//                StringBuffer
        String str = "abc";

        str = str + "d";

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("abc");
        stringBuffer.append("d");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abc");
    }
}
