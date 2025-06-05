public class exemploBreakContinue {

    public static void main(String[] args) {
        for (int numero = 1; numero <=10; numero ++){
            if(numero >3 ) 
                continue;
                if(numero == 5)
                    continue;
            
                System.out.println(numero);
        }
    }
}