class Strings {
    public static void main(String[] args) throws Exception {
        // char guna untuk menyimpan satu karakter
        char percentSign = '%';
        System.out.println(percentSign);
        // string guna untuk menyimpan lebih dari satu karakter
        String name = "Khasbullah Nukman Zakin";
        System.out.println(name);
        // cara lain menggunakan string guna untuk menyimpan lebih dari satu karakter
        String name1 = new String("Khasbullah Nukman Zakin");
        System.out.println(name1);
        String literalString1 = "abc";
        String literalString2 = "abc";
        String objectString1 =  new String("xyz");
        String objectString2 =  new String("xyz");
        System.out.println(literalString1 == literalString2);
        System.out.println(objectString1 == objectString2);
    }
}
