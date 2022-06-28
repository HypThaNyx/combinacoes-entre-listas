<h2 align="center"> Combinações entre Listas </h2>

<p align="center">
O objetivo desse projeto é fornecer métodos para facilitar o processo de prever e gerar a análise combinatória entre X elementos de Y listas (X podendo variar para cada lista).
</p>

<p align="center">
  <a href="https://github.com/HypThaNyx">
    <img alt="Made by Wesley Yago" src="https://img.shields.io/badge/made%20by-Wesley%20Yago-orange">
  </a>

  <img alt="Last Commit" src="https://img.shields.io/github/last-commit/HypThaNyx/combinacoes-entre-listas">

  <img alt="Contributors" src="https://img.shields.io/github/contributors/HypThaNyx/combinacoes-entre-listas">

  <img alt="License" src="https://img.shields.io/badge/license-MIT-orange">

  <a href="https://www.linkedin.com/in/wesley-yago-da-silva/">
    <img alt="Check out my LinkedIn!" src="https://img.shields.io/badge/-LinkedIn-black.svg?logo=linkedin&color=666">
  </a>
</p>

---

## 🗺 Tabela de conteúdos

<ul>
  <li><a href="#-como-funciona">Como funciona</a></li>
  <li><a href="#-exemplo-na-prática">Exemplo na prática</a></li>
  <li><a href="#-testando-na-sua-máquina">Testando na sua máquina</a></li>
  <li><a href="#-features">Features</a></li>
  <li><a href="#-apoio">Apoio</a></li>
  <li><a href="#-licença">Licença</a></li>
</ul>

---

## 🧪 Como funciona

### O que é análise combinatória? 🤓
(Se você já sabe o que é análise combinatória, combinação simples e fatorial, siga para o próximo tópico <a href="#o-problema-encontrado-nas-soluções-existentes-">clicando aqui</a>)

A analise combinatória consiste, entre outras funções,
em auxiliar no cálculo de possibilidades de combinação
entre 1 ou mais grupos de elementos. <br>

Temos como exemplo a clássica situação de definir quais
as combinações possíveis entre um conjunto de X calças e Y camisas.
<br> <b>Exemplo:</b> se tenho 3 calças (X = 3) e 5 camisas (Y = 5), quantas combinações de 1 calça e 1 camisa posso formar? A resposta seria 15, porque é o resultado da multiplicação entre 3 (número de calças) e 5 (número de camisas). <br>
<b>Equação: X * Y * *Z*... </b>

Outro exemplo que podemos citar é o de formar conjuntos de <b>P</b> elementos dentro de um grupo de <b>N</b> elementos,
como definir quantas combinações possíveis de <b>P</b> alunos podem ser formadas em uma sala com <b>N</b> alunos. <br>
<b>Exemplo</b>: Em uma sala com 20 alunos (N = 20), quantas combinações de 2 alunos (P = 2) podemos formar? <br>
*Vale lembrar que nesse caso tanto faz a ordem dos elementos (João e Maria é o mesmo que Maria e João) <br>
A resposta é <b>190</b> dado a equação abaixo de análise combinatória (combinação simples). <br> 
<b>Equação: N! / ( P! * (N - P)! )</b>

<img src="https://images.educamaisbrasil.com.br/content/banco_de_imagens/mb/d/analise-combinatoria-combinacao-simples.jpg" width="200">

Se você está se perguntando ou tentando se lembrar do que é esse sinal de exclamação, saiba que ele representa a operação
de fatorial (!) que basicamente representa a multiplicação daquele número por todos os números anteriores a ele, até chegar a 1. <br>
<b>Exemplo: 5! = 5 * 4 * 3 * 2 * 1</b>

### O problema encontrado nas soluções existentes 😩
Para trabalhar com casos isolados em programação que contemplem situações simples como as mencionadas anteriormente,
as fórmulas acima podem ser o suficiente para *prever* a quantidade de combinações (dado que as fórmulas retornam números
de possibilidades de combinações entre os elementos) e até é possível encontrar essas fórmulas em forma de trechos de código no
Stack Overflow para *executar* a combinação entre elementos (gerar as reais listas de combinações entre tais elementos).

Mas e se nós precisássemos de uma função que não só gerasse as combinações de <b>P</b> elementos dentro de um grupo com
<b>N</b> elementos, mas também permitisse montar conjuntos entre esse grupo e <b>X</b> outros grupos? <br>
E melhor ainda, que cada um desses grupos pudesse ter uma valor específico para <b>P</b> e <b>N</b>?

Ainda não entendeu a premissa desse projeto e como ele pode ser útil? Observe o tópico abaixo "Exemplo na prática" para entender melhor.

---

## 🔨 Exemplo na prática

---

## 🚀 Testando na sua máquina


---

### Documentation

Esse projeto segue as seguintes Commit Guidelines:

- build: Changes that affect the build system or external dependencies (example scopes: gulp, broccoli, npm)
- ci: Changes to our CI configuration files and scripts (example scopes: Travis, Circle, BrowserStack, SauceLabs)
- docs: Documentation only changes
- feat: A new feature
- fix: A bug fix
- perf: A code change that improves performance
- refactor: A code change that neither fixes a bug nor adds a feature
- style: Changes that do not affect the meaning of the code (white-space, formatting, missing semi-colons, etc)
- test: Adding missing tests or correcting existing tests
- chore: Misc content

---

## 📌 Apoio

Entre em contato e preste apoio através das seguintes redes:

- <a href="https://hypthanyx.itch.io/">
    <img alt="Check out my Itch.io!" src="https://img.shields.io/badge/Itch.io-HypThaNyx-fff?logo=itch.io&style=social">
  </a>
- <a href="https://twitter.com/hypthanyx">
    <img alt="Check out my Twitter!" src="https://img.shields.io/badge/Twitter-HypThaNyx-fff?logo=twitter&style=social">
  </a>
- <a href="https://www.instagram.com/hypthanyx/">
    <img alt="Check out my Instagram!" src="https://img.shields.io/badge/Instagram-HypThaNyx-fff?logo=instagram&style=social">
  </a>
- <a href="https://www.linkedin.com/in/wesley-yago-da-silva/">
    <img alt="Check out my LinkedIn!" src="https://img.shields.io/badge/LinkedIn-Wesley Yago-black.svg?logo=linkedin&color=666&style=social">
  </a>
- <a href="https://www.youtube.com/channel/UC_x5u0TqJWN4O3GMwZRWkrg">
    <img alt="Check out my YouTube!" src="https://img.shields.io/badge/YouTube-HypThaNyx-black.svg?logo=youtube&color=666&style=social">
  </a>

---

## 📝 Licença

<img alt="License" src="https://img.shields.io/badge/license-MIT-%2304D361">

Esse projeto está licenciado sob a licença do MIT - veja o arquivo de [LICENÇA](LICENSE) para mais detalhes.

---

🧰 Sendo desenvolvido por Wesley Yago!