import SimpleDictionaryService.Dictionary;
import SimpleDictionaryService.DictionaryService;
import SimpleDictionaryService.language.Language;
import org.SimpleEncodings.Encoding;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        System.out.printf("Entering test area!\n");
        Dictionary dictionary = new Dictionary("./test.txt", Encoding.DEFAULT_UTF8, Language.UNICODE_RUSSIAN, Language.UNICODE_LATIN);
        DictionaryService dictionaryService = new DictionaryService(dictionary);
//        /*
//        Попытка чтения файла...
//         */
//        byte[] dictionaryBytes = readAllDictionaryBytes();
//        for (byte bt : dictionaryBytes) {
//            System.out.printf("%s\n",String.format("%8s", Integer.toBinaryString(bt & 0xFF)).replace(' ', '0'));
//        }
//        System.out.printf("Affected by UTF-8 : %s\n", Encoding.DEFAULT_UTF8.isArrayOfBytesMatchTheEncoding(dictionaryBytes) ? "true" : "false");
//        Symbol[] symbols = Encoding.DEFAULT_UTF8.convertEncodedByteArrayToEncodedSymbolArray(dictionaryBytes);
//        try {
//            PrintStream out = new PrintStream(System.out, true, "UTF-8");
//            for (Symbol symbol : symbols) {
//                out.printf("Symbol code : %d, symbol view : %c\n", Encoding.DEFAULT_UTF8.getSymbolValuablePart(symbol), (char)(Encoding.DEFAULT_UTF8.getSymbolValuablePart(symbol)));
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }

    }

    private static byte[] readAllDictionaryBytes(){
        byte[] bytes = new byte[]{};
        try {
            InputStream inputStream = new FileInputStream(new File("./Test.txt"));
            bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
        }catch (IOException exception){
            exception.printStackTrace();
        }
        return bytes;
    }

}
