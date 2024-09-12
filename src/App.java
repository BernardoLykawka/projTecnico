
public class App {

    public App(){

    }
    public void executar(){

        //Exercicio 1
        lerFibonacci(12); //nao esta na lista
        lerFibonacci(34);  //está na lista

        System.out.println();

        //Exercicio 2
        numLetras("John");   //nao tem a
        numLetras("Ana");   //2 letras a

        System.out.println();

        //Exercicio 3
        exerc3();
    }

    public void lerFibonacci(int numero){

        if(!isFibonacci(numero,0)) {
            System.out.println("[1]: Este numero NAO pertence ao fibonacci");
            return;
        }

        System.out.println("[1]: Este numero pertence ao fibonacci");
    }

    public int fibonacci(int x){  //calcula fibonacci
        if (x == 0) {
            return 0;
        }
        else if (x == 1) {
            return 1;
        }
        else {
            return fibonacci(x - 1) + fibonacci(x - 2);
        }
    }

    public boolean isFibonacci(int n, int index){ //verifica se ta na lista
        int fib = fibonacci(index);

        if (fib == n) {
            return true;
        } else if (fib > n) {
            return false;
        } else {
            return isFibonacci(n, index + 1);
        }
    }

    public void numLetras(String s){
        char letra = 'a';
        int count=0;

        for(int i = 0; i < s.length(); i++){
            if(s.toLowerCase().charAt(i) == letra){
                count++;
            }
        }

        System.out.println("[2]: A palavra " + s + " tem "+count+" letras "+ letra);
    }

    public void exerc3(){
        int k = 1, index = 12, soma = 0;
        while(k < index){
            k += 1;
            soma += k;
        }
        System.out.println("[3]: Soma: " + soma);
    }
}


