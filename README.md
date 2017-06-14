# Aula 11 - PW
## Objetivos

* Usar o projeto 10 e implantar REST

--------

Neste projeto é usado o Maven para gerenciar as dependências e automatizar os builds. Neste diretório possui o arquivo pom.xml (arquivo de configuração do Maven) e uma Pagina de Calculo IMC.

Para que consiga acessa-la, basta seguir o passo a passo.

### Faça o Clone do projeto

Para fazer o clone do projeto, use o comando:

`git clone https://github.com/yrochaa/pw-aula11`


### Rode o TomCat

Para rodar o TomCat, use:

`mvnw org.apache.tomcat.maven:tomcat7-maven-plugin:run`

**ATENÇÃO!!**
Caso você esteja usando o linux, será necessário usar `./mvnw` invés de *mvnw*.
É necessário usar ao menos uma vez o comando `chmod +x mvnw` para que tenha permissão de execução ao arquivo de script **mvnw**.

### Para acessar a aplicação

Execute em qualquer navegador web: 

`http://localhost:9090/exercicio/calculoIMC`
