# SOLID Principles Demo

Um projeto educacional completo que demonstra a implementação dos **5 princípios SOLID** em Java através de exemplos práticos e integrados.

## 📋 Sobre o Projeto

Este projeto foi desenvolvido para fins educacionais e oferece:

- **Exemplos individuais** para cada princípio SOLID
- **Demonstração integrada** que combina todos os princípios em um sistema real
- **Código bem organizado** em pastas dedicadas para cada princípio
- **Interface interativa** em linha de comando para explorar cada exemplo

## 🏗️ Estrutura do Projeto

```
solid-principles-demo/
├── src/
│   ├── App.java                          # Menu principal
│   ├── palindrome/                       # Exemplo: Verificador de Palíndromos (SRP)
│   │   ├── VerificadorPalindromo.java
│   │   ├── ExibidorResultadoPalindromo.java
│   │   └── PalindromeRunner.java
│   ├── singleResponsibility/             # Princípio: Single Responsibility
│   │   ├── CalculadoraPedido.java
│   │   ├── RepositorioPedido.java
│   │   ├── ImpressoraNotaFiscal.java
│   │   └── SingleResponsabilityRunner.java
│   ├── openClosed/                       # Princípio: Open/Closed
│   │   ├── Forma.java (interface)
│   │   ├── Circulo.java
│   │   ├── Retangulo.java
│   │   ├── CalculadoraArea.java
│   │   └── OpenCloseRunner.java
│   ├── liskovSubstitution/               # Princípio: Liskov Substitution
│   │   ├── Passaro.java
│   │   ├── Voador.java (interface)
│   │   ├── Pardal.java
│   │   ├── Pinguim.java
│   │   └── LiskovSubstitutionRunner.java
│   ├── interfaceSegregation/             # Princípio: Interface Segregation
│   │   ├── Trabalhador.java (interface)
│   │   ├── Bebedor.java (interface)
│   │   ├── Funcionario.java
│   │   ├── Robo.java
│   │   └── InterfaceSegregationRunner.java
│   ├── dependencyInversion/              # Princípio: Dependency Inversion
│   │   ├── Dispositivo.java (interface)
│   │   ├── Lampada.java
│   │   ├── Ventilador.java
│   │   ├── Interruptor.java
│   │   └── DependencyInversionRunner.java
│   └── solidDemo/                        # Demo Integrada: Sistema de Compra de Livros
│       ├── Livro.java (interface)
│       ├── LivroFisico.java
│       ├── LivroDigital.java
│       ├── MetodoPagamento.java (interface)
│       ├── PagamentoCartao.java
│       ├── PagamentoDinheiro.java
│       ├── CalculadoraPreco.java
│       ├── GeradorRecibo.java
│       ├── ValidadorCompra.java (interface)
│       ├── ValidadorEstoque.java
│       ├── ProcessadorCompraLivro.java
│       └── SolidDemoRunner.java
├── bin/                                  # Arquivos compilados
├── lib/                                  # Dependências (vazio)
└── README.md
```

## 📚 Princípios SOLID

### 1. Single Responsibility Principle (SRP)
**Cada classe deve ter uma única responsabilidade**

Exemplos:
- Pasta: `singleResponsibility/`
- Caso de uso: `CalculadoraPedido`, `RepositorioPedido`, `ImpressoraNotaFiscal`

### 2. Open/Closed Principle (OCP)
**Aberto para extensão, fechado para modificação**

Exemplos:
- Pasta: `openClosed/`
- Caso de uso: Implementações `Circulo` e `Retangulo` implementam `Forma`

### 3. Liskov Substitution Principle (LSP)
**Subclasses devem ser substituíveis pela superclasse**

Exemplos:
- Pasta: `liskovSubstitution/`
- Caso de uso: `Pardal` e `Pinguim` substituem `Passaro` sem quebrar o contrato

### 4. Interface Segregation Principle (ISP)
**Clientes não devem depender de interfaces que não usam**

Exemplos:
- Pasta: `interfaceSegregation/`
- Caso de uso: `Funcionario` implementa `Trabalhador` e `Bebedor`, `Robo` apenas `Trabalhador`

### 5. Dependency Inversion Principle (DIP)
**Dependa de abstrações, não de implementações concretas**

Exemplos:
- Pasta: `dependencyInversion/`
- Caso de uso: `Interruptor` depende de `Dispositivo`, não de `Lampada` ou `Ventilador`

## 🚀 Como Executar

### Compilar
```bash
cd solid-principles-demo
javac -d bin src/**/*.java src/*.java
```

### Executar
```bash
java -cp bin App
```

## 📖 Menu Principal

Ao executar o programa, você terá acesso a:

1. **Palindrome Checker** - Verifica se uma string é um palíndromo
2. **Demo Integrada** - Sistema de compra de livros que combina todos os princípios
3-7. **Exemplos Individuais** - Um para cada princípio SOLID
0. **Sair**

## 💡 Demo Integrada: Sistema de Compra de Livros

A demonstração integrada implementa um sistema de e-commerce que combina todos os princípios SOLID:

- **SRP**: `CalculadoraPreco`, `GeradorRecibo`, `ValidadorEstoque` - cada uma com responsabilidade específica
- **OCP**: `Livro` e `MetodoPagamento` abertos para novas implementações
- **LSP**: `LivroFisico` e `LivroDigital` substituem `Livro`
- **ISP**: `ValidadorCompra` segregada para validações
- **DIP**: `ProcessadorCompraLivro` depende de abstrações

### Teste a Demo
```bash
# Executar o programa
java -cp bin App

# No menu, escolha a opção 2 (Demo Integrada)
# Escolha um livro (1 ou 2)
# Escolha um método de pagamento (1 ou 2)
```

## 🎯 Objetivo Educacional

Este projeto foi criado para:
- ✅ Demonstrar práticas de codificação profissional
- ✅ Ensinar princípios SOLID de forma prática
- ✅ Mostrar como organizar código em uma arquitetura escalável
- ✅ Ilustrar inversão de controle e injeção de dependências
- ✅ Servir como referência para projetos reais

## 📝 Requisitos

- Java 8+
- Compilador `javac`

## 👤 Autor

Projeto educacional criado para demonstração de princípios SOLID em Java.

## 📄 Licença

Este projeto é disponibilizado como material educacional.
