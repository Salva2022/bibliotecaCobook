# bibliotecaCoBook
Contém o projeto biblioteca de livros programada em *Java* utilizando estrutura MCV com Java Swing pela IDE Apache Netbeans 19, e conectada ao Banco de dados *MySQL Server* através do MySQL Workbench 8.0.34. A mesma permite que um administrador possua um login e senha onde para cadastrar novos usuários e livros. Os usuários comuns podem cadastrar livros e avaliá-los.

Foram utilizados:
- OpenJDK 21 (Código Java).
- Driver mysql-connector-j-8.1.0 (Para conexão da aplicação Java com o banco de dados MySQL).
- MySQL Server 8.0.34

#Primeiros passos:
1. Ao abrir o NetBeans IDE, no canto superior esquerdo da IDE seleciona-se File > Open Project > 'Selecionar' 'bibliotecaCobook' (localizado na pasta "BibliotecaCoBook"), conforme a figura abaixo.
![Passo 1 - Abrir projeto na IDE NetBeans](https://github.com/user-attachments/assets/7b33e15d-97c8-4509-bf99-6f8eb0ca21d2)

2. Adicionar arquivo mysql-connector ao NetBeans IDE clicando com o botão direito do mouse em Projects (canto esquedo da tela) > Properties > Libraries > Compile > Classpath > clicar no botão "+" > Add JAR/Folder > 'Selecione' "mysql-connector-j-8.1.0.jar" (localizado na pasta mysql-connector-j-8.1.0) > OK
![Passo 2 - Configurar arquivo mysql-connector](https://github.com/user-attachments/assets/70d632dc-da55-4241-84b5-33f01498384a)

3. Abrir o MySQL Workbench, clicar em MySQL Connections > 'Connection Name:' "root", e em 'password' > Store in vault > 'ditite uma senha "root"  > OK, conforme a figura abaixo.
![Passo 3 - Criar conexão MySQL](https://github.com/user-attachments/assets/52b76f55-c846-44f3-8db7-62e7e804cffa)

4. No canto superior esquerdo do MySQL Workbench selecione: File > Open SQL Script > 'Selecione' "Cobook.sql" (localizado na pasta QueryBancoDeDados), conforme a figura abaixo.
![Passo 4 - Abrir código SQL no MySQL Workbench](https://github.com/user-attachments/assets/b6dc500c-e372-4ad7-bbbf-54eda8ecff53)

5. Para rodar o SQL script, seleciona-se todo o script e aperta Ctrl+Enter.
   
6. Por fim, para rodar o programa, cm o NetBeans IDE aberto, aperte F6 ou selecione Run Project.

## Demonstração do funcionamento da aplicação:

1. Ao abrir a aplicação, ela apresenta a primeira interface de login da biblioteca Cobook. Faço o login inserindo o meu e-mail (neste caso: gdenadai98@gmail.com) e insiro uma senha de administrador (admin01).
![1 login admin](https://github.com/user-attachments/assets/07f434a0-f20f-4287-9be1-d94d623f62fc)

2. Caso a senha esteja incorreta, apresenta a mensagem de erro:
![2 login admin falho](https://github.com/user-attachments/assets/9072b7fe-2a01-46a1-af27-e947b2bb35e8)

3. Ao clicar no ícone "Sign In" entro na interface de administração, onde posso entrar na Livraria no primeiro ícone para "Visualizar Livros". No segundo ícone "Cadastrar", é possível realizar o cadastro de livros e de novos usuários. Também é possível sair para a tela de login apertando o terceiro ícone "Sair".
![3 Menu administrador](https://github.com/user-attachments/assets/268d64c9-c912-48fc-8e7f-157a1142a9cf)

4. Clicando no segundo ícone "Cadastrar > Usuários", onde posso preencher as informações de um novo usuário incluindo: Nome; e-mail; cpf; idade; sexo; dois livros preferidos; senha de acesso (neste caso, joao11).
![4 cadastrar usuário](https://github.com/user-attachments/assets/d765dbde-b193-497a-ab9b-757203c10d6f)

5. Ao clicar em "Salvar", o usuário é cadastrado apresentado a mensagem abaixo:
![5 usuario cadastrado](https://github.com/user-attachments/assets/6ccb5205-f290-448b-a473-001caa76138d)

6. Selecionar a opção "Limpar" vai deixar em branco os campos preenchidos. Para voltar ao meno, seleciona-se "Cancelar". Para logar com usuário "João" criado, apertamos no terceiro ícone "Sair" no menu do administrador, retornando a tela inicial.
![6 sair administrador](https://github.com/user-attachments/assets/2af5f470-7388-49e8-92bb-a5548e05015c)

7. Insere-se as informações do usuário criado nos campos e-mail e senha(joao11), e clica-se em Sign In.
![7 login usuario](https://github.com/user-attachments/assets/9db0d079-6cd2-4e3e-8b01-063a4a8a130e)

8. O Menu de Usuário tem os mesmo ícones que o de Administrador, con exceção do segundo ìcone de "Cadastrar" onde há somente o campo para "Livros".
![8 Cadastrar livros usuário](https://github.com/user-attachments/assets/e817f1d2-e63b-46f8-849e-3e6ffccb9594)

9. No campo de cadastro de livros, é possível preencher alguns campos, sendo estes: Título, Tipo, Autor e Nota do Livro. Clicando em "Salvar" o livro é cadastrado na aplicação. Neste caso, foi dada uma nota 10 para o livro "Percy Jackson e o ladrão de raios".
![9 cadastrando livro usuario](https://github.com/user-attachments/assets/50e24552-ff09-41e6-827a-d890539131d8)

10. Caso um dos campos não seja preenchido corretamente, será apresentada uma mensagem de erro de preenchimento, como no exemplo abaixo: O cadastro do livro de título "O Animal Social" do autor "Elliot Aronson" não teve seu campo "Tipo" de livro preenchido!
![10 Falha cadastro livro](https://github.com/user-attachments/assets/d3d851a8-efc0-43b1-b397-34c500b8da4c)

11. Após criado este usuário, foi deslogado para tela de login para logar como administrador novamente, para criar outro livro com sua avaliação. 
![11 Criação segundo livro admin](https://github.com/user-attachments/assets/b240b423-baee-4438-8da5-272a63c34f6a)

12. Para o livro "Percy Jackson e o ladrão de raios" foi dada uma nota sete.
![12 admin livro Percy nota 7](https://github.com/user-attachments/assets/57fa0648-9490-4892-a5e6-3c250b2f108a)

13. Ao clicar em "Cancelar" após criar as duas avaliações, retornamos ao Menu, onde temos o primeiro ícone "Livraria" > "Visualizar Livros".
![13 Clicar visualizar livros](https://github.com/user-attachments/assets/bd2f9d7e-6b13-4b57-9155-8c647dcf5686)

14. Clicando nela, temos acesso a biblioteca dos livros cadastrados, contendo seu "Título", "Autor" e sua "Nota", que é uma média das notas cadastradas por todos os usuários da aplicação, incluindo o administrador.
![14 Livraria](https://github.com/user-attachments/assets/a5a128db-c64a-4b9c-87a3-10103aae366f)


#No MySQL Workbench
15. Após realizar as criações acima, ao entrarmos no MySQL Workbench, podemos visualizar a base de dados, onde na seção de usuários, aparecem as informações: cod_usuario; nome; email; cpf; idade; sexo; tipo_livro_preferido 1; tipo_livro_preferido 2; senha; e administrador (onde '1' significa que o usuário é adminitrador e 'null' é um usuário comum, conforme demonstra a figura abaixo:
![15 MySQL usuarios](https://github.com/user-attachments/assets/92ab749b-e008-4d2f-889a-ea87968f1a35)

16. Também temos a seção livros, onde é possível visualizar o cod_livro, título, tipo_livro e autor. 
![16 MySQL livro](https://github.com/user-attachments/assets/79af0cc2-028a-4396-bc6a-f72444f39582)

17. E por fim, a seção avaliacoes, contendo: cod_livro, cod_usuarios e nota.
![17 MySQL avaliacoes](https://github.com/user-attachments/assets/75b159c8-8953-423c-beaa-4c6a5d65366e)
