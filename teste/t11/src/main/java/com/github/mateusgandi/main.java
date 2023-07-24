import java.util.List;

//Uma pessoa possui pode possuir zero ou mais hábitos.
//Uma pessoa possui um nome, idade e hábitos. Um hábito possui uma descrição.
class Pessoa{
    public String nome;
    public int Idade;
    public List<Habito> habitos;
}
class Habito{
    public String Descrição;
    public Pessoa pessoaQuePratica;
}

//Um círculo é descrito por uma posição (x,y), correspondente ao centro e um valor para o raio,
// além da possibilidade de ser transladado de um deslocamento em x e outro em y.

class Ponto{
    public int coordX;
    public int coordY;
    public void Transladar(int X, int Y){
        coordX = X;
        coordY = Y;
    }
}

class Circulo{
    public int raio;
    public Ponto Centro;
    public void Transladar(int X, int Y){
        Centro.coordX = X;
        Centro.coordY = Y;
    }
}

//Um usuário de um sistema computacional é uma pessoa.

class _Pessoa{
    public String nome;
    public int Idade;
}

class Usuario extends _Pessoa{
    //caso seja sistema, é válido ressaltar susa credenciais de acesso.
    public String email;
    private String senha;

}

//Um elefante é um mamífero.

class Elefante extends Mamífero{
    public String especie;
}
class Mamífero{
    public List<String> animais;
}

//Um contêiner contém contêineres e objetos.
class Elemento{
    public String tipo;
}
class Conteiner extends Elemento{
    public List<Objeto> objetos;
}
class Objeto extends Elemento{

}

//Caixeiro-viajante.
//Caixeiro-viajante e lista de pedidos.

class CaixeiroViajante{
    public Viagem viagem;
}
class Viagem{
    public List<Cidade> cidades;
}
class Cidade{
    public Armazem[] pedidosArm;
}
class Armazem{
    public ListaPedidos listaPedidos;
}
class ListaPedidos{
    public Viagem viagem;
    public List<String> produtos;
}
//Cliente e fornecedor envolvem-se em transações econômicas.
class Cliente{
    public Transação[] transações;
}
class Transação{
    public Cliente cliente;
    public Fornecedor fornecedor;
}
class Fornecedor{
    public Transação[] transações;
}