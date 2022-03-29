package practice; /*
      \n (or \r): starts from a new line : metni bir alt satirdan itibaren yazdirir.
              \t:  horizontal tab : metni yatayda 1 tab miktari kaydirir.
              \\: prints a back slash :\ (ters slash) yazdirir
              \': prints single quote :' tek tirnak yazdirir.
              \": prints double quote :"" cift tirnak yazdirir.
     \: backslash
     /:front slash
     */

public class day01_Practice5 {
    //  Soru-1 :   konsola      "Hello ", "World  \ /"        seklinde yazdiriniz

    public static void main(String[] args) {
        System.out.println("\t \"Hello \", \"World  \\ / \"");

    // Soru-2 : Pazartesi kelimesini her harfini ayri bir satira gelecek sekilde yazdırınız.
        System.out.println('P');
        System.out.println('A');
        System.out.println('Z');
        System.out.println('A');
        System.out.println('R');
        System.out.println('T');
        System.out.println('E');
        System.out.println('S');
        System.out.println('I');
        System.out.println("P\nA\nZ\nA\nR\nT\nE\nS\nI");
    //Soru-3 : "Java" ile hayat cok 'afilli'   yazdiriniz
        System.out.println("\"Java\" ile hayat cok \'afilli\'");
    //Soru-4 : "Zaruret" insani
    //         'kasif'  yapar   yazdiriniz
        System.out.println("\"Zaruret\" insani \n\'kasif\' yapar\n\n\n\t\"TechProed ile java cok kolay ...\"");

    // sonraki "TechProEd ile java cok kolay ..." ifadesi  3 satir sonra ve satir basindan 1 tab ileride yazilsin.

}
}
