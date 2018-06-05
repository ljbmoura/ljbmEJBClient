/**
 * 
 */
package br.com.ljbm.fp.servico;

/**
 * 
 * Remote interface for the FPDominio stateless session bean.
 *
 * Financas Pessoais Modelo
 * 
 * @author ljbm
 * @since 09/04/2012
 * 
 */
import java.util.List;

import br.com.ljbm.fp.modelo.Aplicacao;
import br.com.ljbm.fp.modelo.Corretora;
import br.com.ljbm.fp.modelo.FundoInvestimento;

public interface FPDominio 
{

	// FundoInvestimento segment state change methods
	/**
	 * Adds the FundoInvestimento to the FP (Financas Pessoais) model
	 */
	public FundoInvestimento addFundoInvestimento(FundoInvestimento fundoInvestimento);

	/**
	 * Deletes the fundoInvestimento from the FP (Financas Pessoais) model
	 */
	public void deleteFundoInvestimento(FundoInvestimento fundoInvestimento) throws FPException;

	/**
	 * Updates the fundoInvestimento in the FP (Financas Pessoais) model
	 */
	public void updateFundoInvestimento(FundoInvestimento fundoInvestimento) throws FPException;

	// FundoInvestimento segment state query methods
	/**
	 * Given an id, returns the FundoInvestimento from the model
	 */
	public FundoInvestimento getFundoInvestimento(Long ide) throws FPException;

	/**
	 * Given an CNPJ, returns the FundoInvestimento from the model
	 */
	public FundoInvestimento getFundoInvestimentoByCNPJ(String cnpj) throws FPException;

	/**
	 * Returns all FundoInvestimento in the FP (Financas Pessoais) model
	 */
	public List<FundoInvestimento> getAllFundoInvestimento();
	/**
	 * Dado um agente de custódia e um título, retorna os FundoInvestimento do modelo
	 */
	public List<FundoInvestimento> getFundoInvestimentoByAgenteCustodiaETitulo(String agente, String titulo);

	/**
	 * Returns all FundoInvestimento in the FP (Financas Pessoais) model ordered by
	 * name
	 */
	public List<FundoInvestimento> retrieveFundosInvestimentoOrderedByName();

	
	// Aplicacao segment state change methods
	public Aplicacao addAplicacao(Aplicacao aplicacao) throws FPException;

	public void updateAplicacao(Aplicacao aplicacao) throws FPException;

	public void deleteAplicacao(Aplicacao aplicacao) throws FPException;

	public Aplicacao getAplicacao(Long documento) throws FPException;

	public List<Aplicacao> getAllAplicacao() throws FPException;

	public Corretora getCorretora(Long ide) throws FPException;

	public Corretora addCorretora(Corretora fundoInvestimento) throws FPException;

	public Corretora getFundosCorretora(Long ide);

}
