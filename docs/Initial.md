# Projeto Hacker (Atividade da Faculdade)

## Comando utilizado para inicializar o projeto

```bash
mvn archetype:generate \
  -DgroupId=com.marcos.hacker \
  -DartifactId=hacker \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DinteractiveMode=false

```

> Este comando gera uma estrutura de diretórios padrão e bem organizada para um projeto Maven.

## Como compilar o projeto

```bash
mvn compile
```

> Este comando compila todo o código-fonte do projeto, localizado na pasta `src/main/java`.

---

## Como executar o projeto

Se você estiver usando o plugin `exec-maven-plugin`, use o seguinte comando para rodar a aplicação

```bash
mvn exec:java
```
 Esse comando executa a aplicação Java com base na classe principal especificada.
