import java.util.Scanner;

class Programa{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String regex = ",";
        
        String nome_biblioteca;
        nome_biblioteca = sc.nextLine();
        System.out.printf("%s\n",nome_biblioteca); //REMOVER
        Biblioteca biblioteca = new Biblioteca(nome_biblioteca);

        int qtd_livros;
        int qtd_leitores;

        String[] partes;
        String linha_livro;

        String nome_livro, nome_autor;
        int quantidade;
        qtd_livros = Integer.parseInt(sc.nextLine());
        System.out.printf("Qtd livros %d\n",qtd_livros);
        for(int i = 0; i < qtd_livros; i++){
            linha_livro = sc.nextLine();
            System.out.printf("%s\n",linha_livro);
            partes = linha_livro.split(regex);
            nome_livro =  partes[0];
            nome_autor = partes[1];
            quantidade = Integer.parseInt(partes[2]);
            

            System.out.printf("nome livro: %s\nnome autor: %s\nquantidade: %s\n", nome_livro, nome_autor, quantidade);

            Livro livro = new Livro(nome_livro, nome_autor);
            biblioteca.adicionar_livro(livro, quantidade);
            
        }   

        String nome_leitor;
        qtd_leitores = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < qtd_leitores; i++){
            nome_leitor = sc.nextLine();
            System.out.printf("%s\n", nome_leitor);
            Leitor leitor = new Leitor(nome_leitor);
            biblioteca.adicionar_leitor(leitor);
        }   

        String linha_operacao;
        int qtd_operacoes;
        String operacao;
        qtd_operacoes = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < qtd_livros; i++){
            linha_operacao = sc.nextLine();
            System.out.printf("%s\n", linha_operacao);
            partes = linha_operacao.split(regex);
            operacao =  partes[0];
            nome_leitor = partes[1];
            nome_livro = partes[2];

            if(operacao.equals("EMPRESTIMO")){
                biblioteca.
            }
            if(operacao.equals("DEVOLVER")){

            }
        
        }   

        
    } 
}