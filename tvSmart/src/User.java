public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

            System.out.println("TV Ligada ?" + smartTv.ligada);
            System.out.println("Canal Atual : " + smartTv.ligada);
            System.out.println("Volume Atual : " + smartTv.ligada);

            smartTv.ligar ();
            System.out.println("Novo Status - TV Ligada ?" + smartTv.ligada);
    }
}
