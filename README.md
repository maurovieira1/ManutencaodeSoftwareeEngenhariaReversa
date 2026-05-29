#  Atividade Prática — Engenharia de Software II

##  Manutenção de Software e Engenharia Reversa

**Curso:** Bacharelado em Ciência da Computação — IFPA Campus Tucuruí
**Professor:** Prof. Douglas Bechara
**Aluno:** Davi Lucas Alves Silva



#  Sobre o Projeto

Este repositório apresenta a resolução da atividade prática da disciplina de Engenharia de Software II, com foco em **manutenção corretiva**, **engenharia reversa** e **testes automatizados** em um sistema legado de controle acadêmico.

O objetivo da atividade foi simular um ambiente real de desenvolvimento de software, analisando defeitos existentes, aplicando correções e validando o comportamento do sistema através de testes automatizados utilizando JUnit 5.



#  Chamado Selecionado

##  Chamado 2 — Correção do cálculo da média

* **Método afetado:** `calcularMedia(double nota1, double nota2)`
* **Tipo de manutenção:** Manutenção Corretiva



#  Análise do Problema

O sistema apresentava um defeito lógico no cálculo da média das notas dos alunos.

O código original executava a operação matemática sem considerar corretamente a precedência de operadores da linguagem Java:

```java
public double calcularMedia(double nota1, double nota2) {
    return nota1 + nota2 / 2;
}
```

Nesse cenário, o Java realizava primeiro a divisão da `nota2` por `2`, somando o resultado apenas depois.

###  Exemplo do erro:

* Nota 1: `7.0`
* Nota 2: `9.0`

Resultado produzido pelo sistema:

```text
11.5
```

Resultado correto esperado:

```text
8.0
```

O comportamento identificado violava diretamente a regra de negócio do sistema acadêmico.

---

#  Solução Aplicada

A correção foi realizada utilizando parênteses para garantir que a soma das notas acontecesse antes da divisão.

##  Código corrigido

```java
public double calcularMedia(double nota1, double nota2) {
    return (nota1 + nota2) / 2;
}
```

Com essa alteração, o cálculo passou a funcionar corretamente em todos os cenários testados.



#  Testes Automatizados

A validação do sistema foi realizada utilizando **JUnit 5** com gerenciamento de dependências via **Maven**.

##  Testes executados

###  Testes de Regressão

* `testReprovadoPorFrequencia`
* `testProvaFinal`
* `testFrequenciaInvalidaNegativa`

###  Novo teste criado

* `testCalcularMediaCorreta`

O novo teste foi desenvolvido especificamente para validar o cenário do chamado selecionado.



#  Resultado Final

Após a aplicação da correção:

* Todos os testes passaram com sucesso;
* O defeito foi eliminado;
* O sistema voltou a respeitar corretamente as regras de negócio;
* O comportamento esperado foi validado pela suíte de testes automatizados.



#  Tecnologias Utilizadas

| Tecnologia    | Finalidade                    |
| ------------- | ----------------------------- |
| Java          | Linguagem principal           |
| IntelliJ IDEA | Ambiente de desenvolvimento   |
| Maven         | Gerenciamento de dependências |
| JUnit 5       | Testes automatizados          |



#  Considerações Finais

A atividade permitiu aplicar conceitos importantes de:

* Manutenção corretiva;
* Engenharia reversa;
* Análise de defeitos;
* Testes automatizados;
* Validação de regras de negócio;
* Qualidade de software.

Além disso, a prática demonstrou a importância dos testes na prevenção de falhas e na confiabilidade de sistemas legados.
