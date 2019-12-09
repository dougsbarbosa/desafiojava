# Desafio Java Spring.
- Descrição do Desafio
Criação de um sistema de vendas, com objetivo de registrar 10 (dez) vendas em TXT, possuindo campos como "Nome do Cliente", "Produto", "Quantidade" de produtos vendidos e o Valor total da venda.

# Detalhes da programação.
# Telas
Foram criadas telas para cadastro de clientes e produtos e vendas, como também suas listagens.
* Tela de Cadastro de Produtos
<img src="https://i.imgur.com/OhjyT74.png">

* Tela de Cadastro de Clientes
<img src="https://i.imgur.com/GbuTG9A.png">

* Tela de Cadastro de Vendas
<img src="https://i.imgur.com/AnsYbCk.png">

* Tela de Listagem de Clientes
<img src="https://i.imgur.com/KbXBypA.png">

* Tela de Listagem de Produtos
<img src="https://i.imgur.com/ygEwVNI.png">

* Tela de Listagem de Vendas
<img src="https://i.imgur.com/lFw7AKM.png">

# Banco de Dados
O Banco de Dados utilizado foi o MySQL, conectado através do application.properties utilizando os comandos básicos do Spring Boot. Através das criações das classes Clientes, Vendas e Produtos, as tabelas foram geradas automaticamente no database "desafiojava". <br>
<img src="https://i.imgur.com/DqSdzTd.png">

# Entidades
Foram criadas entidades com campos solicitados pelo desafio, como "nome de produto", "CPF de cliente", e foram organizadas através de uma package com o final .entity <br>
<img src="https://i.imgur.com/D9dBmlM.png">

# Repository
Para enviar os dados para o Banco de Dados, foi criado um Repository para cada entidade e podem ser localizadas no package com o final .repository<br>
<img src="https://i.imgur.com/eyru07f.png">

# Controller
Para o HTML ter contato com o Back-end, foi necessário criar controllers utilizando técnicas de Thymeleaf para implantar nos códigos HTML e referenciar os dados, gerando também o método RequestMapping que organizou as páginas através da metodologia REST.
<img src="https://i.imgur.com/ZsFg2Gc.png">

# Visão Geral
<img src="https://i.imgur.com/L9Brjcw.png">

# Vendas
O sistema está funcionando e pode ser feita várias vendas conforme o cliente e o produto estiver cadastrado. Não há recursos de delete/alter no momento, porém poderá ser implementado futuramente. Confira abaixo as 10 vendas realizadas de produtos cadastrados, que no desafio era apenas para criar um produto, mas foi implementado o cadastro de produtos e foi possível criar diversos produtos ao mesmo tempo.
<img src="https://i.imgur.com/9ATpWob.png">

# Conclusão
O projeto foi concluído fazendo com que suas funcionalidades principais fossem exercidas com êxito, podendo cadastrar diversos clientes, produtos e efetuar diversas vendas sem nenhum problema. O desafio futuro seria implementar o botão de efetuar um relatório e também reunir o cadastro com a listagem para priorizar a melhor experiência para o usuário.
