#language: pt
#encoding: utf-8
#@run
Funcionalidade: Pesquisa

  Contexto:
    Dado que acesso o ecommerce

  @run
  Cenario: Pesquisar produto
    Quando pesquiso o produto "t-shirt"
    Entao a pesquisa deve retornar resultados

 