import java.util.Scanner;

public class TipoDatos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un mensaje");
        StringBuilder s = new StringBuilder();
        String strLine;
        while (!(strLine = scanner.nextLine()).equals("S")) {
            s.append(strLine);
        }

        String [] cadena = binario(convetirAEntero(procesaCadena(s.toString())));
        recorridoArr(cadena);
        System.out.println("\nMensaje decodificado:");
        System.out.print(retornaMesaje(cadena));
    }
    public static Object [] procesaCadena(String s){
        Character [] ch = new Character[s.length()];

        for (int i = 0; i < s.length();i++){
            ch [i]= s.charAt(i);
        }
        return ch;
    }

    public static Integer [] convetirAEntero(Object[] arr){
        Integer [] datos = new Integer[arr.length];
        for (int i= 0; i < arr.length;i++){
            datos [i] = (int) (char) arr[i];
        }
        return datos;
    }
    public static String [] binario(Integer[] in){
        String [] bo = new String[in.length];
        for (int i = 0; i < in.length;i++){
            bo[i] = Integer.toBinaryString(in[i]);
        }
        return bo;
    }
    public static char[] retornaMesaje (String [] s){
        String cad = "";
        //  Integer [] datos = new Integer[s.length];
        int [] val = new int[s.length];
        char [] dat = new char[val.length];
        for (int i = 0; i <s.length;i++){
            val[i] = Integer.valueOf(s[i],2);
            dat[i] = (char) val[i];
        }
        return dat;
    }
    public static void recorridoArr(Object [] obj){
        System.out.println("\nMensaje encriptado:");
        for (int i = 0; i < obj.length;i++){
            System.out.print(obj[i]);
        }
    }
}
