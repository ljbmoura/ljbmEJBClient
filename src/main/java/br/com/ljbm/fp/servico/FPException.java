/**
 * 
 */
package br.com.ljbm.fp.servico;

/**
 * @author jose
 *
 */
public class FPException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = -8477806271696162136L;

	/**
     * Creates new <code>BrokerException</code> without detail message.
     */
    public FPException() {
        this("BrokerException");
    }
    
    /**
     * Constructs an <code>BrokerException</code> with the specified
     * detail message.
     * @param msg the detail message.
     */
	public FPException(String msg) {
        super(msg);
    }
}