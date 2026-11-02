import java.util.Scanner;
import java.util.HashMap;

class Programa{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n; 
        n = sc.nextInt();

        double x,y;
        String palavra;
        Point2D point;
        HashMap<Point2D, String> points = new HashMap<Point2D, String>();

        for(int i = 0; i < n; i++){
            x = sc.nextDouble();
            y = sc.nextDouble();
            point = new Point2D(x,y);
            palavra = sc.next();

            points.put(point, palavra);
            //System.out.printf("%s\n", palavra);

        }

        int m;
        m = sc.nextInt();

        String nome_final;
        for(int j = 0; j < m; j++){
            x = sc.nextDouble();
            y = sc.nextDouble();

            point = new Point2D(x,y);

            nome_final = points.get(point);

            if(nome_final != null){
                System.out.printf("%s\n", nome_final);
            }
            else{
                System.out.printf("NAO_EXISTE\n");
            }
        }
        sc.close();
    }
}

// -----------------------------

// Na main, leia um número inteiro n e depois n linhas contendo as coordenadas de um ponto e uma string associada. Crie objetos do tipo Point2D e armazene a respectiva string em um HashMap. Em seguida, leia um número inteiro m e uma sequência de m coordenadas. Mostre na tela as Strings associadas ou NAO_EXISTE, caso o ponto não tenha sido cadastrado.