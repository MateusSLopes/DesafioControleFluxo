import java.util.Scanner;
public class Contador {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int parametroUm = scan.nextInt();
        int parametroDois = scan.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException e){
            System.out.print(e);
        }

    }
    public static class ParametrosInvalidosException extends Exception{
        public String getMessage(){
            return "O primeiro parametro eh maior que o segundo";
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        int contagem = parametroDois - parametroUm;
        boolean condicao = parametroDois > parametroUm;
        if (!condicao){
            throw new ParametrosInvalidosException();
        } else{
            for (int i = 1 ; i <= contagem ; i++){
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}
