# bibliotecaCoBook
Contém o projeto biblioteca de livros programada em Java utilizando estrutura MCV com Java Swing pela IDE Apache Netbeans 19, e conectada ao Banco de dados MySQL Server através do MySQL Workbench 8.0.34. A mesma permite que um administrador possua um login e senha onde para cadastrar novos usuários e livros. Os usuários comuns podem cadastrar livros e avaliá-los.

Foram utilizados:
- OpenJDK 21 (Código Java).
- Driver mysql-connector-j-8.1.0 (Para conexão da aplicação Java com o banco de dados MySQL).
- MySQL Server 8.0.34

Primeiros passos:
1. Ao abrir o NetBeans IDE, no canto superior esquerdo da IDE seleciona-se File > Open Project > 'Selecionar' 'bibliotecaCobook' (localizado na pasta "BibliotecaCoBook"), conforme a figura abaixo.
![Passo 1 - Abrir projeto na IDE NetBeans](https://github.com/user-attachments/assets/7b33e15d-97c8-4509-bf99-6f8eb0ca21d2)
2. Adicionar arquivo mysql-connector ao NetBeans IDE clicando com o botão direito do mouse em Projects (canto esquedo da tela) > Properties > Libraries > Compile > Classpath > clicar no botão "+" > Add JAR/Folder > 'Selecione' "mysql-connector-j-8.1.0.jar" (localizado na pasta mysql-connector-j-8.1.0) > OK
![Passo 2 - Configurar arquivo mysql-connector](https://github.com/user-attachments/assets/70d632dc-da55-4241-84b5-33f01498384a)
3. Abrir o MySQL Workbench, clicar em MySQL Connections > 'Connection Name:' "root", e em 'password' > Store in vault > 'ditite uma senha "root"  > OK, conforme a figura abaixo.
![Passo 3 - Criar conexão MySQL](https://github.com/user-attachments/assets/52b76f55-c846-44f3-8db7-62e7e804cffa)
4. No canto superior esquerdo do MySQL Workbench selecione: File > Open SQL Script > 'Selecione' "Cobook.sql" (localizado na pasta QueryBancoDeDados), conforme a figura abaixo.
![Passo 4 - Abrir código SQL no MySQL Workbench](https://github.com/user-attachments/assets/b6dc500c-e372-4ad7-bbbf-54eda8ecff53)
