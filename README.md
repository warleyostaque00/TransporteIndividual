## Atividade 1 - Terceiro Bimestre de P.O.O
Este repositório abriga o projeto da Atividade 1 do terceiro bimestre da disciplina de Programação Orientada a Objetos 2 (POO2), ministrada pelo professor Rogério. O objetivo da atividade foi desenvolver um sistema que emprega o padrão de projeto Abstract Factory para gerenciar o aluguel de meios de transporte individuais.

## Descrição do Projeto
O sistema foi projetado para criar e gerenciar meios de transporte individuais, classificados em duas categorias principais: propulsionados por bateria e propulsionados por esforço humano. Para isso, adotamos o padrão de projeto Abstract Factory, assegurando que a criação dos objetos seja estruturada e modular, o que facilita a extenção e a manutenção do código.

## Funcionalidades
Criação de transportes individuais conforme o tipo de propulsão:
Movidos a Bateria:

Patinetes elétricos.
Bicicletas elétricas.
Movidos a Esforço Humano:

Bicicletas convencionais.
Patins.
Skates.
Mensagens no console simulando o uso dos transportes.
Estrutura do Projeto
src/ └── com.example.transport ├── Transport.java (Interface) ├── ElectricScooter.java (Classe concreta) ├── ElectricBike.java (Classe concreta) ├── Bicycle.java (Classe concreta) ├── RollerSkates.java (Classe concreta) ├── Skateboard.java (Classe concreta) ├── TransportFactory.java (Fábrica abstrata) ├── ElectricTransportFactory.java (Fábrica concreta) ├── HumanPoweredTransportFactory.java (Fábrica concreta) └── Main.java (Classe principal)

## Tecnologias Utilizadas
Linguagem: Java 8
Ferramenta de Desenvolvimento: Visual Studio Code (pode utilizar outra ferramenta para fazer o projeto se preferir, como o IntelliJ IDEA ou o Eclipse por exemplo)
Controle de Versão: Git/GitHub
Como Executar o Projeto
Passos para Compilar e Executar:
Compile todas as classes: javac -d bin src/com/example/transport/*.java

Execute o programa principal: java -cp bin com.example.transport.Main

## Exemplo de Saída
Ao executar o programa, o sistema exibirá mensagens no console indicando o uso de cada tipo de transporte:

Andando de Patinete Elétrico. Andando de Bicicleta Elétrica. Andando de Bicicleta Convencional. Andando de Patins. Andando de Skate.

## Objetivo da Atividade
Demonstrar a aplicação do padrão de projeto Abstract Factory.
Dividir transportes em categorias, facilitando a criação e a gestão dos objetos.
Simular um sistema realista para aluguel de transportes individuais.
## Autor
Warley da Silveira Ostaque Filho
