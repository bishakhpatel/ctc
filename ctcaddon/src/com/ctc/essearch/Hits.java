/**
 *
 */
package com.ctc.essearch;

import java.util.List;


/**
 *
 *
 */
public class Hits
{
	private int total;
	private int max_score;
	private List<Hit> hits;

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
	 * @return the max_score
	 */
	public int getMax_score()
	{
		return max_score;
	}

	/**
	 * @param max_score
	 *           the max_score to set
	 */
	public void setMax_score(final int max_score)
	{
		this.max_score = max_score;
	}

	/**
	 * @return the hits
	 */
	public List<Hit> getHits()
	{
		return hits;
	}

	/**
	 * @param hits
	 *           the hits to set
	 */
	public void setHits(final List<Hit> hits)
	{
		this.hits = hits;
	}
}
