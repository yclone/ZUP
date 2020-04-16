$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featureFiles/acesso.feature");
formatter.feature({
  "name": "Acessar o sistema web do magazine Luiza, bucar produtos, adicionar ao carrinho e validar itens",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@AcessoMagazineLuiza"
    }
  ]
});
formatter.scenario({
  "name": "Acessar o o site e bucar um produto",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@AcessoMagazineLuiza"
    },
    {
      "name": "@Chrome"
    },
    {
      "name": "@adicionaProdutoCarrinho"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que o usuario acesse o site da magazine Luiza pela URL \"https://www.magazineluiza.com.br/\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "stepDefinitions.DemoFeatureStepDef.que_o_usuario_acesse_o_site_da_magazine_Luiza_pela_URL_https_www_magazineluiza_com_br(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "digitar no campo de busca o valor \"hd ssd\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "stepDefinitions.DemoFeatureStepDef.digitar_no_campo_de_busca_o_valor_hd_ssd(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no icone de busca",
  "keyword": "E "
});
formatter.match({
  "location": "stepDefinitions.DemoFeatureStepDef.clicar_no_icone_de_busca()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no produto retornado",
  "keyword": "E "
});
formatter.match({
  "location": "stepDefinitions.DemoFeatureStepDef.clicar_no_produto_retornado()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adicionar o produto ao carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "stepDefinitions.DemoFeatureStepDef.adicionar_o_produto_ao_carrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "voltar para a home do site",
  "keyword": "E "
});
formatter.match({
  "location": "stepDefinitions.DemoFeatureStepDef.voltar_para_a_home_do_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no icone do carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "stepDefinitions.DemoFeatureStepDef.clicar_no_icone_do_carrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em remover o item",
  "keyword": "E "
});
formatter.match({
  "location": "stepDefinitions.DemoFeatureStepDef.clicar_em_remover_o_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o produto deve ser removido do carrinho \"Sua sacola está vazia\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "stepDefinitions.DemoFeatureStepDef.o_produto_deve_ser_removido_do_carrinho(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.write("SUCESS_Acessar o o site e bucar um produto_PASSED");
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});