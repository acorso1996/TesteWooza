package br.ce.lnares.test;

import org.junit.Test;

import br.ce.lnares.core.BaseTest;

public class buscaPorTexto extends BaseTest {
	
br.ce.lnares.page.buscaPorTexto buscaPorTexto = new br.ce.lnares.page.buscaPorTexto();

	@Test
	public void loginComSucesso() {
		buscaPorTexto.acessarTelaInicial();
		buscaPorTexto.menuSmartphone();
		buscaPorTexto.menuCategoria();
		buscaPorTexto.subMenuSmartphone();
		buscaPorTexto.menuSmartphone();
		buscaPorTexto.subMenuAcessorios();
		buscaPorTexto.subMenuAcesso();
		buscaPorTexto.acessibilidade();
		buscaPorTexto.Informe();
		buscaPorTexto.escreverDDD();
		buscaPorTexto.escreverNumeroClaro();
		buscaPorTexto.botaoConfirmar();
//		buscaPorTexto.libras();
//		buscaPorTexto.clicarCookie();
//		buscaPorTexto.fecharLibras();
		buscaPorTexto.Buscar();
		buscaPorTexto.selecionarModelo();
		buscaPorTexto.euQuero();
//		buscaPorTexto.especificacao();
//		buscaPorTexto.planos();
//		buscaPorTexto.smart();
//		buscaPorTexto.planosRodape();
//		buscaPorTexto.meuCarrinho();
//		buscaPorTexto.meusPedidos();
//		buscaPorTexto.procon();
//		buscaPorTexto.recargaOnline();
//		buscaPorTexto.trocasDevolucoes();
//		buscaPorTexto.mapaSite();
//		buscaPorTexto.consultaCobertura();
//		buscaPorTexto.logout();
	}
}

