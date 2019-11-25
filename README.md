# Desafio Java Spring.
- Descrição do Desafio
Criação de um sistema de vendas, com objetivo de registrar 10 (dez) vendas em TXT, possuindo campos como "Nome do Cliente", "Produto", "Quantidade" de produtos vendidos e o Valor total da venda.

# Detalhes da programação.
# Telas
Foram criadas telas para cadastro de clientes e produtos, como também o registro de vendas.
* Tela de Cadastro de Produtos
<img src="https://i.imgur.com/40d99Mf.png">

* Tela de Cadastro de Clientes
<img src="https://i.imgur.com/oqdTkeI.png">

* Tela de Registro de Vendas
<img src="https://i.imgur.com/XKk7AOc.png">

# Banco de Dados
O Banco de Dados utilizado foi o MySQL, conectado através do application.properties utilizando os comandos básicos do Spring Boot. Através das criações das classes Clientes, Vendas e Produtos, as tabelas foram geradas automaticamente no database "desafiojava". <br>
<img src="https://i.imgur.com/R7v1iGO.png">

# Entidades
Foram criadas entidades com campos solicitados pelo desafio, como "nome de produto", "CPF de cliente", e foram organizadas através de uma package com o final .entity <br>
<img src="https://i.imgur.com/D9dBmlM.png">

# Repository
Para enviar os dados para o Banco de Dados, foi criado um Repository para cada entidade e podem ser localizadas no package com o final .repository<br>
<img src="https://i.imgur.com/eyru07f.png">

# Controller
Para o HTML ter contato com o Back-end, foi necessário criar controllers utilizando técnicas de Thymeleaf para implantar nos códigos HTML e referenciar os dados. Porém, sua conclusão não foi bem sucedida na tentativa de fazer com o ClientesController, sendo implementado com RequestMapping e também com PostMapping, retornando o erro 405 = Method Not Allowed.

# Visão Geral
<img src="https://i.imgur.com/lkUrgjZ.png">

# Conclusão
O projeto não foi concluído de forma precisa, porém obtive grande aprendizado de Spring e Thymeleaf durante este processo que pode resultar grandes resultados futuros. Creio que o esforço estabelecido neste projeto deve ser visto como o ponto principal, e ser considerado para futuras oportunidades. 
