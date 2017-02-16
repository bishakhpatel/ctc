/**
 *
 */
package com.ctc.essearch;

/**
 *
 *
 *
 */
public class Shards
{
	private int total;
	private int successful;
	private int failed;

	/**
	 * @return the total
	 */
	public int getTotal()
	{
		return total;
	}

	/**
	 * @param total
	 *           the total to set
	 */
	public void setTotal(final int total)
	{
		this.total = total;
	}

	/**
	 * @return the successful
	 */
	public int getSuccessful()
	{
		return successful;
	}

	/**
	 * @param successful
	 *           the successful to set
	 */
	public void setSuccessful(final int successful)
	{
		this.successful = successful;
	}

	/**
	 * @return the failed
	 */
	public int getFailed()
	{
		return failed;
	}

	/**
	 * @param failed
	 *           the failed to set
	 */
	public void setFailed(final int failed)
	{
		this.failed = failed;
	}

}
