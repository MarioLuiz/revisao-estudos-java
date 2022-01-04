# revisao-estudos-java
Revisão e estudo da linguagem de programação Java em aplicações.

Uma classe é uma especificação de um tipo, definindo atributos e comportamentos.
Um objeto é uma instância de uma classe onde podemos definir valores para seus atributos.
Para criar uma instância precisamos usar a palavra chave new.

modificadores de visibilidade:
- private - apenas visível dentro da classe.

- protected - visível dentro da classe e também para as filhas, repare também que protected é relacionado com a herança de classes.

- public - visível em todo lugar.

Sobre classes abstratas:
Classes do tipo abstract, são classes que podem ser herdadas por outras classes, porém a classe do tipo abstract não podem ser instanciadas. Para instanciar, devemos criar primeiro uma classe filha não abstrata, os métodos abstratos não possuem corpo (implementação), apenas definem a assinatura.
- Classes abstratas são úteis quando queremos utilizar comportamentos e atributos base em classes com comportamentos em comum.
- Usamos métodos abstratos quando queremos "forçar" que um filho concreto (classe concreta) implemente um método.
- Classes abstratas: podem ter atributos, podem ter métodos concretos (com implementação), podem ter métodos abstratos (sem implementação) e não podem ser instanciadas.

Atributos do tipo static são atributos da classe da qual ele está sendo declarado, ou seja é como se fosse uma variavél de uso "global", métodos estaticos seguem a mesma linha, são métodos da classe.

Pilares da Programação Orientada a Objetos:

1) Abstração: Onde é definido um nome único do Objeto/Classe, define também as características do Objeto/classe propriedades, também se define as ações do que Objeto/Classe irá executar que são chamados de métodos.

2) Encapsulamento: É a técnica que adiciona segurança a aplicação, pois esconde as propriedades do objeto com declaração dos atributos como privados e podem sem acessados por meio de métodos públicos como Getter e Setter, para não acessar diretamente os atributos da classe/objeto.

3) Herança: Onde é possível herdar as características e métodos de uma classe onde, isso auxilia no reaproveitamento de código.
 O que é legal saber sobre:
- Construtores não são herdados.
- Um construtor da classe mãe pode ser chamado através do super().
- Não existe herança múltipla em Java.
- Interfaces são uma alternativa a herança referente ao polimorfismo

4) Polimorfismo: O polimorfismo permite herdar um método de classe pai e atribuir uma nova implementação para o método pré-definido, isso inclui a sobrecarga de método, onde pode ser definido um nome igual para mais de um método na classe, mas é necessário estarem com os argumentos do método diferentes.
 O que é legal saber sobre:
- Objetos não mudam de tipo.
- A referência pode mudar, e aí entra o polimorfismo.
- O polimorfismo permite usar referências mais genéricas para a comunicação com um objeto.
- O uso de referências mais genéricas permite desacoplar sistemas.
