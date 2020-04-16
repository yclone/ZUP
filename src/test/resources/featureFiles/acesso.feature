#language:pt
#Author: Vinicius Marra Santos
@AcessoMagazineLuiza
Funcionalidade: Acessar o sistema web do magazine Luiza, bucar produtos, adicionar ao carrinho e validar itens

  @Chrome @buscaProduto
 	Cenario: Acessar o o site e bucar um produto
    Dado que o usuario acesse o site da magazine Luiza pela URL "https://www.magazineluiza.com.br/"
    Quando digitar no campo de busca o valor "hd ssd"
    E clicar no icone de busca
    Entao deve ser retornado busca do produto
    

  @Chrome @adicionaProdutoCarrinho
 	Cenario: Acessar o o site e bucar um produto
    Dado que o usuario acesse o site da magazine Luiza pela URL "https://www.magazineluiza.com.br/"
    Quando digitar no campo de busca o valor "hd ssd"
    E clicar no icone de busca
    E clicar no produto retornado
    E adicionar o produto ao carrinho
    Entao o produto deve ser inserido no carrinho "Sacola"

  @Chrome @adicionaProdutoCarrinho
 	Cenario: Acessar o o site e bucar um produto
    Dado que o usuario acesse o site da magazine Luiza pela URL "https://www.magazineluiza.com.br/"
    Quando digitar no campo de busca o valor "hd ssd"
    E clicar no icone de busca
    E clicar no produto retornado
    E adicionar o produto ao carrinho
    E voltar para a home do site
    E clicar no icone do carrinho
    E clicar em remover o item
    Entao o produto deve ser removido do carrinho "Sua sacola está vazia"