# revisao-estudos-java
Revisão e estudo da linguagem de programação Java em aplicações.

Uma classe é uma especificação de um tipo, definindo atributos e comportamentos.
Um objeto é uma instância de uma classe onde podemos definir valores para seus atributos.
Para criar uma instância precisamos usar a palavra chave new.

modificadores de visibilidade:
- private - apenas visível dentro da classe.
- protected - visível dentro da classe e também para as filhas, repare também que protected é relacionado com a herança de classes.
- public - visível em todo lugar.
- static - Atributos do tipo static são atributos da classe da qual ele está sendo declarado, ou seja é como se fosse uma variavél de uso "global", métodos estaticos seguem a mesma linha, são métodos da classe.
- final - O modificador FINAL torna o atributo da classe uma constante e, só pode ser inicializado uma única vez, ou diretamente na declaração da classe ou no método construtor, muita atenção em usar a junção static final, pois ai você terá uma constante 'global'.
- Para saber mais acesse: https://pt.stackoverflow.com/questions/17015/qual-o-uso-de-uma-vari%C3%A1vel-est%C3%A1tica-ou-final-em-java
- Para saber mais acesse: https://www.devmedia.com.br/modificadores-de-acesso-do-java/27065

Sobre classes abstratas:
Classes do tipo abstract, são classes que podem ser herdadas por outras classes, porém a classe do tipo abstract não podem ser instanciadas. Para instanciar, devemos criar primeiro uma classe filha não abstrata, os métodos abstratos não possuem corpo (implementação), apenas definem a assinatura.
- Classes abstratas são úteis quando queremos utilizar comportamentos e atributos base em classes com comportamentos em comum.
- Usamos métodos abstratos quando queremos "forçar" que um filho concreto (classe concreta) implemente um método.
- Classes abstratas: podem ter atributos, podem ter métodos concretos (com implementação), podem ter métodos abstratos (sem implementação) e não podem ser instanciadas.

Sobre Interfaces:
- Ela é um contrato onde quem assina se responsabiliza por implementar esses métodos (cumprir o contrato).
- Todos os métodos de uma interface são abstratos.
- Garante que todos os métodos de classes que implementam uma interface possam ser chamados com segurança.
- Com composições e interfaces teremos mais flexibilidade com nosso código, já que não nos prenderemos ao acoplamento que a herança propõe.
- Através do uso de Interfaces podemos contornar a falta de herança multipla que não esta presente no Java.

Pilares da Programação Orientada a Objetos:

1) Abstração: Onde é definido um nome único do Objeto/Classe, define também as características do Objeto/classe propriedades, também se define as ações do que Objeto/Classe irá executar que são chamados de métodos.

2) Encapsulamento: É a técnica que adiciona segurança a aplicação, pois esconde as propriedades do objeto com declaração dos atributos como privados e podem sem acessados por meio de métodos públicos como Getter e Setter, para não acessar diretamente os atributos da classe/objeto, assim podemos garantir que a responsabilidade de gerenciar os atributos da classe é a própria classe e não deve ser delegado a terceiros.

3) Herança: Onde é possível herdar as características e métodos de uma classe onde, isso auxilia no reaproveitamento de código.
 O que é legal saber sobre:
- Construtores não são herdados.
- Um construtor da classe mãe pode ser chamado através do super().
- Não existe herança múltipla em Java.
- Interfaces são uma alternativa a herança referente ao polimorfismo.
- A herança captura o que é comum e isola aquilo que é diferente entre classes.

4) Polimorfismo: O polimorfismo permite herdar um método de classe pai e atribuir uma nova implementação para o método pré-definido, isso inclui a sobrecarga de método, onde pode ser definido um nome igual para mais de um método na classe, mas é necessário estarem com os argumentos do método diferentes.
 O que é legal saber sobre:
- Objetos não mudam de tipo.
- A referência pode mudar, e aí entra o polimorfismo.
- O polimorfismo permite usar referências mais genéricas para a comunicação com um objeto.
- O uso de referências mais genéricas permite desacoplar sistemas.


-Sobre Exceções (Exception)-
- Existe uma hierarquia grande de classes que representam exceções. Por exemplo, ArithmeticException é filha de RuntimeException, que herda de Exception, que por sua vez é filha da classe mais ancestral das exceções, Throwable. Conhecer bem essa hierarquia significa saber utilizar exceções em sua aplicação.
- Throwable é a classe que precisa ser extendida para que seja possível jogar um objeto na pilha (através da palavra reservada throw)
- É na classe Throwable que temos praticamente todo o código relacionado às exceções, inclusive getMessage() e printStackTrace(). Todo o resto da hierarquia apenas possui algumas sobrecargas de construtores para comunicar mensagens específicas
- A hierarquia iniciada com a classe Throwable é dividida em exceções e erros. Exceções são usadas em códigos de aplicação. Erros são usados exclusivamente pela máquina virtual.
- Classes que herdam de Error são usadas para comunicar erros na máquina virtual. Desenvolvedores de aplicação não devem criar erros que herdam de Error.
- StackOverflowError é um erro da máquina virtual para informar que a pilha de execução não tem mais memória.
- Exceções são separadas em duas grandes categorias: aquelas que são obrigatoriamente verificadas pelo compilador e as que não são verificadas.
- As primeiras são denominadas checked e são criadas através do pertencimento a uma hierarquia que não passe por RuntimeException.
- As segundas são as unchecked, e são criadas como descendentes de RuntimeException.
