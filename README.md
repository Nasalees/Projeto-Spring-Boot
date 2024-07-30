# Projeto JAVA e SpringBoot

### Através deste projeto, busco solidificar minha base em Java e Spring Boot. Pretendo explorar a fundo recursos como Spring Data Jpa, Mapeamento objeto - relacional, H2 DataBase, visando desenvolver aplicações web robustas e escaláveis.

## Visão geral do sistema

Criar uma API para gerenciar usuários e departamentos, com as seguintes funções:

- Buscar todos usuários
- Buscar um usuário pelo seu id
- Inserir um novo usuário

### 1. Inicei o projeto pelo Spring initializr, escolhendo o Gerenciador de Depências, versão do Java e as Dependências para o projeto.
![spring_initializr](https://github.com/user-attachments/assets/a195ebdd-8c50-4d9c-acfc-f12374027ed8 "Spring Initializr")

### 2. Criei o pacote com.projetoSpring.userdept.entities para armazenar as classes que representam as entidades do banco de dados. Criando os Getters e Setters da class e também um Construtor. Além disso, estabeleci uma associação com a class Department.
![classes_do_projeto](https://github.com/user-attachments/assets/c62a3777-abc9-4818-8256-28552c84656d)

### 3.Para realizar o mapeamento objeto-relacional, anotei as classes com @Entity, indicando ao JPA que os objetos dessas classes devem ser persistidos no banco de dados. Através da anotação @Table, especifiquei o nome das tabelas correspondentes a cada entidade. As relações entre as entidades foram modeladas utilizando a anotação @ManyToOne, estabelecendo relacionamentos do tipo "muitos para um". o @Id foi usado para definir a chave primária. A geração de chaves primárias foi configurada automaticamente com a anotação @GeneratedValue.
<img height="470em" src="https://github.com/user-attachments/assets/58928da7-bdc3-489c-9a3a-734aa1a5285d"/><br>

### 4.Configurei o banco de dados H2 no arquivo application.properties e realizei testes de inserção de dados através do script import.sql, verificando a criação das tabelas e a inserção dos dados.
<img height="330em" src="https://github.com/user-attachments/assets/25d6c297-79b9-4716-9beb-fc2851f1ffc3"/><br>
![tebelas_criadas](https://github.com/user-attachments/assets/304fb154-b9eb-4ad1-bbca-0f1d6626a877)
<img height="100em" src="https://github.com/user-attachments/assets/25a174fc-2c3e-4b68-848e-70067ec899c8"/><br>

### 5.Para criar os endpoints da minha aplicação, aproveitei as funcionalidades prontas do Spring Data JPA, utilizando a interface JpaRepository. Isso me permitiu herdar métodos como findAll(), findById() e save(), simplificando a implementação das operações CRUD (Create, Read, Update, Delete).

### Organizei meus controladores em um pacote específico (Controller) para manter a estrutura do projeto clara e facilitar a manutenção. Com a anotação @RestController, transformei essas classes em controladores REST, permitindo que elas respondam a requisições HTTP e retornem dados em formato JSON.

### Utilizei o Postman para testar as APIs que desenvolvi. Essa ferramenta me ajudou a verificar se cada endpoint estava funcionando corretamente, retornando os dados esperados e respondendo adequadamente aos diferentes tipos de requisições GET e POST.
#### Endpoints:
<img height="550em" src="https://github.com/user-attachments/assets/5f254265-34ec-4f9b-80a8-27c6b5ce2747"/><br>
#### Inserir Usuários:
<img height="816em" src="https://github.com/user-attachments/assets/eb7ca3ea-7c5e-405f-9536-bae661c88aff"/><br>
#### Lista de Usuários:
<img height="830em" src="https://github.com/user-attachments/assets/e348f182-e01f-4741-b089-4908cfddba43"/><br>
#### Buscar Usuário pelo ID:
<img height="853em" src="https://github.com/user-attachments/assets/f3fcf09d-6e82-4ab8-a837-2da579ea66e8"/><br>

