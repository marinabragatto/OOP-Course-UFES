public class Post
{
    private String nomeAutor;
    private String conteudo;
    int likes;
    int dislikes;

    public Post(String nomeAutor, String conteudo){
        this.nomeAutor = nomeAutor;
        this.conteudo = conteudo;
        this.likes = 0;
        this.dislikes = 0;
    }

    public void like(){
        this.likes++;
    }
    public void dislike(){
        this.dislikes++;
    }

    public String get_autor(){
        return this.nomeAutor;
    }

    public String get_conteudo(){
        return this.conteudo;
    }

    public int n_likes(){
        return likes;
    }

    public int n_dislikes(){
        return dislikes;
    }

    public int sentimento(){
        if(this.dislikes > this.likes){
            return 0;
        }

        return 1;
    }
}


// Descrição:
// Crie uma classe Post contendo atributos privados nome do autor (uma palavra com até 32 caracteres), 
//conteúdo (uma palavra com até 32 caracteres), número de likes, de dislikes. A classe deve possuir os métodos públicos:
// • construtor: recebe o nome e o título e deve inicializar o número de likes e dislikes com zero.
// • void like(): incrementa o número de likes.
// • void dislike(): incrementa o número de dislikes.
// • String get_autor(): retorna o nome.
// • String get_conteudo(): retorna o conteúdo.
// • int n_likes(): retorna o número de likes.
// • int n_dislikes(): retorna o número de dislikes.
// • int sentimento(): retorna 0 se o número de dislikes for maior que o de likes e 1, caso contrário.
// Na main, você deve ler o nome do autor e o conteúdo do post e usar estas informações para criar um objeto do tipo post. Em seguida, você deve ler um número inteiro representando o número de interações feitas com o post. Cada interação consiste de um inteiro que pode ser 1 para o caso de like ou 0 para o caso de dislike. Depois de processar todos as interações, mostre na tela o conteúdo, nome do autor, número de likes, número de dislikes e o sentimento geral das interações.  

// Envie o arquivo .cpp ou arquivo .zip como entrada.
