package br.com.ljbm.fp.servico;

import java.util.List;

import br.com.ljbm.fp.modelo.ComparacaoInvestimentoVersusSELIC;
import br.com.ljbm.fp.modelo.PosicaoTituloPorAgente;


/**
 * @author luc
 * 
 */
public interface AvaliadorInvestimento {

//	/**
//	 * Obt�m um extrato comparativo das aplica��es financeiras do BB frente � 
//	 * taxa SELIC em "dataPosicao" a partir de arquivos de extrato de
//	 * investimento e cotao SELIC fornecidos.
//	 * 
//	 * @param dataPosicao
//	 * @param caminhaExtratoInvestimentos
//	 * @param caminhoSerieHistoricaSELIC
//	 * @return
//	 * 
//	 *         <p>
//	 *         Exemplo
//	 *         </p>
//	 * 
//	 *         <pre>
//	 * BB Aes Energia		51.3012000	29.6020000	 5837.083139264900820000	40700.037619751202000	34862.954480486301180000
//	 * BB Aes Petrobras	-14.2907000	65.3518000	 -21736.349999111651462459	23392.054872146888000	45128.404871258539462459
//	 * BB RF Pr LP Estilo	18.8112000	21.7156000	 -854.835680322365137185	34968.547467182940960	35823.383147505306097185
//	 * BB Aes Dividendos	33.5178000	55.5497000	-2269.968224207630123344	13756.491078222377824	16026.459302430007947344
//	 * BB Aes Exportao	06.4953000	59.4553000	-6348.316246627935857884	12765.622809933582936	19113.939056561518793884
//	 * BB Aes Vale		10.9785000	61.0614000	-13162.965418478197601007	29167.740761470932109	42330.706179949129710007
//	 * BB Aes PIBB		29.3762000	75.7287000	-11475.286387350234800006	32029.133347151047722	43504.419734501282522006
//	 * BB Aes Consumo		07.5072000	05.7271000	133.508560901614566000	8063.046683507369316	7929.538122605754750000
//	 * BB Aes Siderurgia	-48.0102000	45.1090000	-22605.078155256272172820	12620.716929153714071	35225.795084409986243820
//	 * BB Aes BB		-0.8945000	25.4343000	-2435.426589641422095000	9167.252298637410780	11602.678888278832875000
//	 * BB Aes Const Civil	-6.8741000	26.5305000	-3075.241616853524744600	8573.161427691432620	11648.403044544957364600
//	 * </pre>
//	 * 
//	 * 
//	 */
//	List<ComparativoFundoSELIC> comparativoInvestimentosFrenteSELICArquivos(String dataPosicao,
//			String caminhaExtratoInvestimentos,
//			String caminhoSerieHistoricaSELIC);

	/**
	 * Obtm um extrato comparativo das aplicaes financeiras do BB frente 
	 * taxa SELIC em "dataPosicao"
	 * 
	 * @param dataPosicao
	 * @return String
	 * 
	 *         <p>
	 *         Exemplo
	 *         </p>
	 * 
	 *         <pre> 
	 * BB Aes Energia		51.3012000	29.6020000	 5837.083139264900820000	40700.037619751202000	34862.954480486301180000
	 * BB Aes Petrobras	-14.2907000	65.3518000	 -21736.349999111651462459	23392.054872146888000	45128.404871258539462459
	 * BB RF Pr LP Estilo	18.8112000	21.7156000	 -854.835680322365137185	34968.547467182940960	35823.383147505306097185
	 * BB Aes Dividendos	33.5178000	55.5497000	-2269.968224207630123344	13756.491078222377824	16026.459302430007947344
	 * BB Aes Exportao	06.4953000	59.4553000	-6348.316246627935857884	12765.622809933582936	19113.939056561518793884
	 * BB Aes Vale		10.9785000	61.0614000	-13162.965418478197601007	29167.740761470932109	42330.706179949129710007
	 * BB Aes PIBB		29.3762000	75.7287000	-11475.286387350234800006	32029.133347151047722	43504.419734501282522006
	 * BB Aes Consumo		07.5072000	05.7271000	133.508560901614566000	8063.046683507369316	7929.538122605754750000
	 * BB Aes Siderurgia	-48.0102000	45.1090000	-22605.078155256272172820	12620.716929153714071	35225.795084409986243820
	 * BB Aes BB		-0.8945000	25.4343000	-2435.426589641422095000	9167.252298637410780	11602.678888278832875000
	 * BB Aes Const Civil	-6.8741000	26.5305000	-3075.241616853524744600	8573.161427691432620	11648.403044544957364600
	 * </pre>
	 * 
	 * 
	 */
	List<ComparacaoInvestimentoVersusSELIC> comparaInvestimentosComSELIC(List<PosicaoTituloPorAgente> extrato, String dataPosicao);

//	/**
//	 * Atualiza a base de dadosa a partir de um arquivo de extrato de
//	 * investimento do BB e de um arquivo de cotao SELIC do Banco Central.
//	 * 
//	 * @param caminhaExtratoInvestimentosBB
//	 * @param caminhoSerieHistoricaSELIC_BC
//	 */
//	void atualizaBaseInvestimentos_CotacaoSELIC(
//			String caminhaExtratoInvestimentosBB,
//			String caminhoSerieHistoricaSELIC_BC);

	String getMessage();

}