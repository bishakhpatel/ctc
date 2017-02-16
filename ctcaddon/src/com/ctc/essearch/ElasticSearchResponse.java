/**
 *
 */
package com.ctc.essearch;


/**
 *
 *
 */
public class ElasticSearchResponse
{


	private int took;
	private boolean timed_out;
	private Shards _shards;
	private Hits hits;

	/**
	 * @return the took
	 */
	public int getTook()
	{
		return took;
	}

	/**
	 * @param took
	 *           the took to set
	 */
	public void setTook(final int took)
	{
		this.took = took;
	}

	/**
	 * @return the timed_out
	 */
	public boolean isTimed_out()
	{
		return timed_out;
	}

	/**
	 * @param timed_out
	 *           the timed_out to set
	 */
	public void setTimed_out(final boolean timed_out)
	{
		this.timed_out = timed_out;
	}

	/**
	 * @return the _shards
	 */
	public Shards get_shards()
	{
		return _shards;
	}

	/**
	 * @param _shards
	 *           the _shards to set
	 */
	public void set_shards(final Shards _shards)
	{
		this._shards = _shards;
	}

	/**
	 * @return the hits
	 */
	public Hits getHits()
	{
		return hits;
	}

	/**
	 * @param hits
	 *           the hits to set
	 */
	public void setHits(final Hits hits)
	{
		this.hits = hits;
	}

}
